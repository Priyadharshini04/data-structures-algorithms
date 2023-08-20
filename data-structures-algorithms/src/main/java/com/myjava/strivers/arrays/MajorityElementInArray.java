package com.myjava.strivers.arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.Iterator;
import java.util.LinkedHashMap;
public class MajorityElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(majorityElement(new int[] {6,5,5}));
	}
	public static int majorityElement(int[] v)
	{
		Map<Integer,Integer> mp=new LinkedHashMap<Integer, Integer>();
		for(int i=0;i<v.length;i++)
		{
			if(mp.containsKey(v[i]))
			{
				mp.put(v[i], mp.get(v[i])+1);
			}
			else {
				mp.put(v[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry:mp.entrySet())
		{
			if(entry.getValue()>(v.length/2))
			{
				return entry.getKey();
			}
		}
		return 0;
	}
}
