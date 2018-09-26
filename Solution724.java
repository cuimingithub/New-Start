package leetcode.solutuion;

public class Solution724 {
	public static int pivotIndex(int []nums){
		int sum = 0;
		
		int l =0;
		for (int j =0;j< nums.length ; j++)
			sum += nums[j];
		int r= sum;
		for( int i =0 ;i< nums.length;i++){
			r -=nums[i];
			if( l == r)
				return i;
			l = l+nums[i];
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int []nums = {1,7,3,6,5,6};
		int result =pivotIndex(nums) ;
		if(result< 0)
			System.out.println("不存在");
		else 
			System.out.println("中心位置位于："+result);

	}

}
