package leetcode.solutuion;

public class Solution27 {
	public static int remove_element (int []nums ,int val){
		int i = 0,j = 0;
		for(i =0 ; i<nums.length ; i++ ){
			if(nums[i] != val){
				nums[j] = nums[i];
				j++;
			}
		}
		return j;
	}

	public static void main(String[] args) {
		int []nums ={1,1,3,3,5,6,8,8,7,7,7,3,3};
		int val =3;
		
		int j = remove_element (nums ,val);
		for(int i=0 ;i< j ;i++){
			System.out.print(nums[i]+" ");
		}
		}

}






// ·½·¨¶þ
public static int remove_element(int []nums ,int val){
	int i =0;
	int n = nums.length;
	while(i < n){
		if(nums[i] == val){
			nums[i] = nums[n-1];
			n--;
		}
		else
			i++;
		
	}
	return n;
	
	
}







