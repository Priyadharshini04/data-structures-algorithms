package com.myjava.strivers.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MergeUniqueElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortedArray(new int[] {1,2,3,3},new int[] {2,2,4}).forEach(i->System.out.println(i));
		//1,2,3,4
		}
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
    	int i=0;
    	int j=0;
    	Set<Integer> list=new LinkedHashSet<Integer>();
    	while(i<a.length && j<b.length)
    	{
    		if(a[i]<b[j])
    		{
    			list.add(a[i]);
    			i++;
    		}
    		else if(a[i]==b[j])
    		{
    			list.add(a[i]);
    			i++;
    			j++;
    		}
    		else {
    			list.add(b[j]);
    			j++;
    		}
    	}
    	while(i<a.length)
    	{
    		list.add(a[i]);
    		i++;
    	}
    	while(j<b.length)
    	{
    		list.add(b[j]);
    		j++;
    	}
    	return list.stream().collect(Collectors.toList());
    }
}
