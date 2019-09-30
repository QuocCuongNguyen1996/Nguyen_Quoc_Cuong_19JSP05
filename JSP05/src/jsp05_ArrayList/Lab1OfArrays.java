package jsp05_ArrayList;

public class Lab1OfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 99, 100, 110, 84, 54, 200, 40 };
		int t ;
		for (int i = 0; i < nums.length; i++) {
//			nums[i]=nums[0];
			System.out.println("The Arrays when do not sort is: " + nums[i]);
		}
		for (int a = 1; a < nums.length; a++) {
			for (int b = nums.length - 1; b >= a; b--) {
				if (nums[b - 1] > nums[b]) {
					t = nums[b - 1];
					nums[b - 1] = nums[b];
					nums[b] = t;
				}
			}
		}
//		System.out.println("The Arrays when sort is: ");
		for (int i = 0; i < nums.length; i++) {
//			nums[i]=nums[0];
			System.out.println("The Arrays when sort is: "+nums[i]);
//			System.out.println(" "+nums[i]);
		}
		System.out.println(nums[6]);
		System.out.println(nums[0]);
	}

}
