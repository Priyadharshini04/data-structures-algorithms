package com.myjava.strivers.graph;
import java.util.*;

public class CheckAcanReachB {
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

        // Proceeding with the assumption that all the constraints are applied in the input.
        Scanner s = new Scanner(System.in);
        int totalMembers=s.nextInt();
        Map<Integer,List<Integer>> connection=new TreeMap<>();
        Map<Integer,Boolean> visited=new TreeMap<>();
        Queue<Integer> queue=new ArrayDeque<>();
        // Store member users in a map
        for(int i=0;i<totalMembers;i++)
        {
            int user=s.nextInt();
            connection.put(user,new ArrayList<Integer>());
            visited.put(user, false);
        }
        int totalFollowerEdges=s.nextInt();
        // connect member users with follow
        for(int i=0;i<totalFollowerEdges;i++)
        {
            int follower=s.nextInt();
            int following=s.nextInt();
            if(connection.containsKey(follower))
            connection.get(follower).add(following);
        }
        int userA=s.nextInt();
        int userB=s.nextInt();
        queue.offer(userA);
        boolean isReached=false;
        if(userA==userB)
        {
            isReached=true;
        }
        // DFS to reach user A to user A
        while(!queue.isEmpty() && !isReached)
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
                        if(list.get(i)==userB)
                        {
                            isReached=true;
                            break;
                        }
                        else{
                            queue.offer(list.get(i));
                        }
                    }
                    else if(list.get(i)==userB)
                    {
                        isReached=true;
                        break;
                    }
                }
            }
        }
        if(isReached)
        {
           System.out.print(1); 
        }
        else{
            System.out.print(0); 
        }
    }
}
