package jsp05_testJavaFpt;

//đếm số lượng số chẳn trong 1 mảng
public class Bai1_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dem=0;
		int[] Mang=new int[]{1,2,3,4,5,6,7,8,9,10,12,14,16,18};
		for(int i=0;i<Mang.length;i++) {
			if(Mang[i]%2==0) {
				dem ++;
			}
		}
		System.out.println("So lan lap lai cua so chan la: "+dem);
	}

}
