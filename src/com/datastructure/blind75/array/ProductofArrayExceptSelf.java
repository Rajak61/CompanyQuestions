package com.datastructure.blind75.array;

public class ProductofArrayExceptSelf {

	public static void main(String[] args) { //https://www.youtube.com/watch?v=tSRFtR3pv74
		int []nums = {1,2,3,4};
		
		int a[]=getProductOfArrayExceptSelf(nums);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
		
//		int a[]=findNewArray(nums);///not recomended 
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]+" ");
//		}
	}
	
	
	
	
	public static int [] getProductOfArrayExceptSelf(int[] nums){
		int N=nums.length; //1 2 3 4
		int[] output_arr=new int[N];
		output_arr[0]=1;
		
		for(int i=1;i<N;i++){
			output_arr[i]=nums[i-1]*output_arr[i-1];//1 1 2 6
		}
		
		int R=1;
		for(int i=N-1;i>=0;i--){
			output_arr[i]=output_arr[i]*R;
			R=R*nums[i];
		}
		return output_arr;
		
	}
	
	public static  int[] getProductArrayExceptitself(int[] nums){
		int N=nums.length;//1 2 3 4
		int out_arr[]=new int[N];
		out_arr[0]=1;
		
		for(int i=1;i<N;i++){
			out_arr[i]=out_arr[i-1]*nums[i-1]; //1 1 2 6 
		}
		int R=1;
		for(int i=N-1;i>=0;i--){
			out_arr[i]=out_arr[i]*R;
			R=nums[i]*R;
			
		}
		
		return out_arr;
		
	}
	

//	private static int[] findNewArray(int[] nums) { //not recomended 
//		int a[]=new int[nums.length];
//		for (int i = 0; i < nums.length; i++) {
//			int temp=1;
//			for (int j = 0; j < nums.length; j++) {
//				if(i!=j){
//					System.out.println(nums[j]);
//					temp=nums[j]*temp;
//				}
//			}
//			a[i]=temp;
//			System.out.println();
//		}
//		return a;
//	}

}
