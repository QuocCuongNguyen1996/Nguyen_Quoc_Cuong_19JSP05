package jsp05_ArrayList;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sample[];
		sample=new int[10];
		for(int i=0; i<10; i++) {
			sample[i]=i;
			System.out.println("this is elements of sample["+i+"]:"+sample[i]);
		}
//		for(int i=0;i<10;i++) {
//			System.out.println("this is elements of sample["+i+"]:"+sample[i]);
//		}
		/*find the value of Min and Max in the arrays */
		int nums[]=new int[10];
		int min , max;
		nums[0]=100;
		nums[1]=-100;
		nums[2]=54;
		nums[3]=10;
		nums[4]=115154;
		nums[5]=187;
		nums[6]=-21454;
		nums[7]=11545;
		nums[8]=121;
		nums[9]=1;
		min=max=nums[0];
		for(int i=0; i<nums.length; i++) {
			if(nums[i]<min) {
				min=nums[i];
			}
			if(nums[i]>max) {
				max=nums[i];
			}
		}
		System.out.println("value of Max is: "+max+" and value of Min is: "+min);
		
	}

}
