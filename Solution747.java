package leetcode.solutuion;

public class Solution747 {
	public static int dominantIndex(int []nums){
		if(nums.length == 1)
			return 0;
		int max = 0;
		for(int i =0;i<nums.length ; i++){
			if(nums[i] > nums[max])
				max = i;
		}
		/*for (int i =0; i< nums.length ;i++){
			if(nums[max] < 2*nums[i] && nums[max] != nums[i]){
				return -1;
			}
		}*/
		
		for(int i: nums){
			if(nums[max] < 2*i && nums[max] != i)
				return -1;
		}
		return max;
	}

	public static void main(String[] args) {
		int [] nums ={1,2,6,3};
		int result = dominantIndex(nums);
		if(result < 0 )
			System.out.println("���������");
		else if (result == 0)
			System.out.println("����ֻ��һ����");
		else 
			System.out.println("���������λ��Ϊ��"+ result);

	}

}
