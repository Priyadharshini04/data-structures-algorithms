package com.myjava.strivers.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// https://leetcode.com/problems/pascals-triangle/description/
public class PascalTriangle_L118 {
	// less time complexity.
	public List<List<Integer>> generate(int numRows) {
        if(numRows<1)
        {
            return null;
        }
        List<List<Integer>> list=new ArrayList<>();
        list.add(Arrays.asList(1));
        for(int i=2;i<=numRows;i++)
        {
            list.add(generateColumns(i));
        }
        return list;
    }
    public List<Integer> generateColumns(int row)
    {
        List<Integer> list=new ArrayList<>();
        int ans=1;
        for(int i=1;i<=row;i++)
        {
            list.add(ans);
            ans=(ans*(row-i))/i;
        }
        return list;
    }
}
