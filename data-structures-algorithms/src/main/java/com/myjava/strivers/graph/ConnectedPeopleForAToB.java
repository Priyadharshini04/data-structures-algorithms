package com.myjava.strivers.graph;

import java.util.*;

public class ConnectedPeopleForAToB {
	public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner s = new Scanner(System.in);
        int totalMembers=s.nextInt();
        Map<Integer,List<Integer>> connection=new TreeMap<>();
        Map<Integer,Boolean> visited=new TreeMap<>();
        Queue<Integer> queue=new ArrayDeque<>();
        Set<Integer> result=new TreeSet<>();
        // Member user inputs.
        for(int i=0;i<totalMembers;i++)
        {
            int user=s.nextInt();
            connection.put(user,new ArrayList<Integer>());
            visited.put(user, false);
        }
        // Member users connections.
        int totalFollowerEdges=s.nextInt();
        for(int i=0;i<totalFollowerEdges;i++)
        {
            int follower=s.nextInt();
            int following=s.nextInt();
            if(connection.containsKey(follower))
            connection.get(follower).add(following);
        }
        int reactExpert=s.nextInt();
        int naggingUser=s.nextInt();
        queue.offer(reactExpert);
        if(reactExpert==naggingUser)
        {
            result.add(reactExpert);
        }
        // DFS to reach nagging user B.
        while(!queue.isEmpty())
        {
            int user=queue.poll();
            if(!visited.getOrDefault(user,false))
            {
                visited.put(user, true);
                List<Integer> list=connection.get(user);
                for(int i=0;i<list.size();i++)
                {
                    if(!visited.getOrDefault(list.get(i), false))
                    {
                        if(list.get(i)==naggingUser)
                        {
                            result.add(list.get(i));
                        }
                        else{
                            queue.offer(list.get(i));
                        }
                    }
                    else if(list.get(i)==naggingUser)
                    {
                       result.add(list.get(i));
                    }
                }
            }
        }
        // Output
        for(Integer users:result)
        {
            System.out.print(users+" ");
        }
    }
}
