package leetcode.solutuion;

import java.util.*;

public class Solution66_¼ÓÒ» {
	public static int [] plusone(int []nums){
		if(nums.length == 0 || nums == null )
			return nums;
		for(int i =nums.length -1 ;i >= 0;i--){
			if(nums[i] < 9){
				nums[i]++;
				return nums;
			}
			else
				nums[i] = 0;
		}
		int res [] = new int [nums.length +1];
		res[0]  = 1;
		return res;
		
		
	}

	public static void main(String[] args) {
		int []nums = {1,9,9,9,9} ;
		int []mum = plusone(nums) ;
		System.out.println(Arrays.toString(mum));
		

	}

}
