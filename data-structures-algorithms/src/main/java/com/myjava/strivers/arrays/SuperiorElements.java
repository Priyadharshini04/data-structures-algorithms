package com.myjava.strivers.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SuperiorElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		superiorElements(new int[] {5,4,3}).forEach(i->System.out.println(i));
//		superiorElements(new int[] {1,2,2,1}).forEach(i->System.out.println(i));
		superiorElements(new int[] {148,162,85,18,107,32 }).forEach(i->System.out.println(i));
		superiorElement(new int[] {148,162,85,18,107,32 }).forEach(i->System.out.println(i));

	}
    public static List< Integer > superiorElements(int []a) {
        // Write your code here.
    	Set<Integer> set=new TreeSet<Integer>();
    	int high=0;
    	int p1=1;
    	while(p1<a.length)
    	{
    		if(a[high]<a[p1])
    		{
    			high+=1;
    			p1=high;
    		}
    		if(p1==a.length-1)
    		{
    			set.add(a[high]);
    			high+=1;
    			p1=high;
    		}
			p1+=1;
    	}
    	set.add(a[a.length-1]);
    	return new ArrayList<Integer>(set);
    }
    public static List< Integer > superiorElement(int []a) {
        // Write your code here.
    	Set<Integer> set=new TreeSet<Integer>();
    	int maxElement=0;
    	for(int i=a.length-1;i>=0;i--)
    	{
    		if(a[i]>maxElement)
    		{
    			maxElement=a[i];
    			set.add(maxElement);
    		}
    	}
    	return new ArrayList<Integer>(set);
    }
}