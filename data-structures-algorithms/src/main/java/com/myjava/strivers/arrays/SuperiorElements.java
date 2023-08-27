package com.myjava.strivers.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
// https://www.codingninjas.com/studio/problems/superior-elements_6783446
public class SuperiorElements {

    public static List< Integer > superiorElements(int []a) {
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