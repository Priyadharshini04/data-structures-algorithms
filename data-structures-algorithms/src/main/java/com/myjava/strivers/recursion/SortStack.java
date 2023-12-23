package com.myjava.strivers.recursion;

import java.util.Stack;

public class SortStack {
	public Stack<Integer> sort(Stack<Integer> s)
	{
		Stack<Integer> stk=new Stack<>();
		sortStack(s,stk);
		return stk;
		
	}
	public void sortStack(Stack<Integer> s1,Stack<Integer> s2)
	{
	    if(!s1.isEmpty())
	    {
	        int pop=s1.pop();
	        if(!s2.isEmpty())
	        {
	            if(s2.peek()<=pop)
	            {
	                s2.push(pop);
	            }
	            else{
	                s1.push(s2.pop());
	                s1.push(pop);
	            }
	        }
	        else{
	            s2.push(pop);
	        }
	        sortStack(s1,s2);
	    }
	}
}
