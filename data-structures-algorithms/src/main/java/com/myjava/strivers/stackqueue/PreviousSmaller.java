package com.myjava.strivers.stackqueue;

import java.util.Stack;

public class PreviousSmaller {

	public static int[] prevSmaller(int[] A) {
		int[] a=new int[A.length];
		Stack<Integer> s=new Stack<Integer>();
		int i=0;
		while(i<A.length){
            if(s.empty()){
                a[i] = -1;
                s.push(A[i]);
                i++;
            }
            else if(!s.empty()&&s.peek()<A[i]){
                a[i] = s.peek();
                s.push(A[i]);
                i++;
            
            }
            else if(!s.empty()&&s.peek()>=A[i]){
                s.pop();
            }
        }
		return a;
	}
	
	public static int[] prevSmallers(int[] A) {
		int[] ans=new int[A.length];
		Stack<Integer> stk=new Stack<Integer>();
		for(int i=0;i<ans.length;i++)
		{
			while(!stk.isEmpty() && stk.peek()>=A[i])
			{
				stk.pop();
			}
			ans[i]=!stk.isEmpty()?stk.peek():-1;
			stk.push(A[i]);
		}
		return ans;
	}
	
}
