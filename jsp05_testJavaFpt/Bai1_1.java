package jsp05_testJavaFpt;

import java.util.Scanner;

//Nhập vào 2 số có 3 chữ số nếu là đảo ngược nhau thì in là đảo ngược nhau VD 124 và 421 là 2 số đảo ngược nhau

public class Bai1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a,b,c,m;
		
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("Nhap vao mot so tu nhien co 3 chu so thu nhat: ");
			n=sc.nextInt();
			System.out.println("Nhap vao mot so tu nhien co 3 chu so thu nhi: ");
			m=sc.nextInt();
			a=n/100;
			c=n%10;
			b=(n-100*a-c)/10;
			if(m == 100*c+10*b+a) {
				System.out.println("So do la so dao nguoc: "+c+b+a);
			}else {
				System.out.println("So khong phai dao nguoc!!!!");
			}
			
		}while((n<100)||(n>999)||(m<100)||(m>999));
		
		
		
//		printf("Nhap mot so tu nhien 3 chu so = ");
//		scanf("%3d",&n);
//		a=n/100;
//		b=n/10-a*10;
//		c=n%10;
//		printf("So dao nguoc la:%d%d%d",c,b,a);
//		return 0;
		
//		Scanner s=new Scanner(System.in);
//        int n,i=0;
//        int m[]=new int[50];
//        System.out.println("Nhap so nguyen:");
//        n=s.nextInt();
//        System.out.println("Day nhi phan la:");
//        while(n!=0){
//            m[i]=n%2;
//            n=n/2;
//           i++;
//        }
//        System.out.println();
//        for(int j=i-1;j>=0;j--)
//            System.out.println(m[j]);
	}

}
