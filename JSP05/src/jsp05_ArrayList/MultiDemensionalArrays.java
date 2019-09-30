package jsp05_ArrayList;


import java.util.Scanner;

public class MultiDemensionalArrays {

	static NhanVien[] dsNhanVien;
	static int sk;
	static Scanner scan = new Scanner(System.in);
	static boolean coNhanVien = false; 

	public static void main(String[] args) {
		do {
			menu();
			System.out.println("Nhap tac vu: ");
			int sk = scan.nextInt();
			switch (sk) {
			case 1:
				nhapNhanVien();
				break;
			case 2:
				inNhanVien();
				break;
			case 3:
				System.exit(0);
			}
		} while (sk == 0);
	}

	static void nhapNhanVien() {
		System.out.println("Nhap so luong nhan vien: ");
		int soNhanVien = scan.nextInt();
		dsNhanVien = new NhanVien[soNhanVien];
		for (int i = 0; i < dsNhanVien.length; i++) {
			System.out.println("Nhap nhan vien " + (i+1) + " :");
			System.out.println("Nhap ma nhan vien: ");
			int ma = scan.nextInt();
			System.out.println("Nhap ten nhan vien: ");
			String ten = scan.next();
			System.out.println("Nhap bo phan nhan vien: ");
			String boPhan = scan.next();
			dsNhanVien[i] = new NhanVien(ten, ma, boPhan);
		}
		coNhanVien = true;
	}

	static void inNhanVien() {
		if(coNhanVien) {
			System.out.println("Danh sach nhan vien: ");
			for (int i = 0; i < dsNhanVien.length; i++) {
				System.out.println(dsNhanVien[i].ma + " | " + dsNhanVien[i].ten + " | " + dsNhanVien[i].boPhan);
			}
//			for(NhanVien nv : dsNhanVien) {
//				System.out.println(nv.ma + " | " + nv.ten + " | " + nv.boPhan);
//			}
		} else {
			System.out.println("Chua co nhan vien nao2");
		}
		
	}

	static void menu() {
		System.out.println("Menu");
		System.out.println("1. Tao nhan vien");
		System.out.println("2. Hien thi danh sach nhan vien");
		System.out.println("3. Exit");
	}

}
