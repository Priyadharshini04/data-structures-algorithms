package com.myjava.strivers.graph;
import java.util.*;
public class TimeTakenToReachAToB {
	public static void main(String args[] ) throws Exception {
	Scanner s = new Scanner(System.in);
    int totalMembers=s.nextInt();
    Map<Integer,List<UserWithTime>> connection=new TreeMap<>();
    Map<Integer,Boolean> visited=new TreeMap<>();
    Queue<UserWithTime> queue=new ArrayDeque<>();
    Set<Integer> result=new TreeSet<>();
    int totalTimeTaken=Integer.MAX_VALUE;
    // Store members in a Map.
    for(int i=0;i<totalMembers;i++)
    {
        int user=s.nextInt();
        connection.put(user,new ArrayList<UserWithTime>());
        visited.put(user, false);
    }
    int totalFollowerEdges=s.nextInt();
    // Store edges as a value for the key.
    for(int i=0;i<totalFollowerEdges;i++)
    {
        int follower=s.nextInt();
        int following=s.nextInt();
        int timeTaken=s.nextInt();
        if(connection.containsKey(follower))
        connection.get(follower).add(new UserWithTime(following,timeTaken));
    }
    int userA=s.nextInt();
    int userB=s.nextInt();
    boolean reached=false;
    if(userA==userB)
    {
        System.out.print("0");
    }
    else{
        // DFS traversal to reach userB
        queue.offer(new UserWithTime(userA, 0));
        while(!queue.isEmpty())
        {
            UserWithTime userWithTime=queue.poll();
            if(!visited.getOrDefault(userWithTime.user,false))
            {
                visited.put(userWithTime.user, true);
                List<UserWithTime> list=connection.get(userWithTime.user);
                for(int i=0;i<list.size();i++)
                {
                    UserWithTime userCon=list.get(i);
                    if(!visited.getOrDefault(userCon.user, false))
                    {
                        if(userCon.user==userB)
                        {
                            int time=userCon.timeTaken+userWithTime.timeTaken;
                            if(totalTimeTaken>time)
                            totalTimeTaken = time;
                            reached=true;
                        }
                        else{
                            userCon.timeTaken+=userWithTime.timeTaken;
                            queue.offer(userCon);
                        }
                    }
                    else if(userCon.user==userB)
                    {
                        int time=userCon.timeTaken+userWithTime.timeTaken;
                        if(totalTimeTaken>time)
                            totalTimeTaken = time;
                        reached=true;
                    }
                }
            }
        }
        // If able to reach then output respective output else -1
        if(reached)
         System.out.print(totalTimeTaken);
        else
        System.out.print(-1);
    }
    
}
}
class UserWithTime
{
int user;
int timeTaken;
UserWithTime(int user,int timeTaken)
{
    this.user=user;
    this.timeTaken=timeTaken;
}
}
