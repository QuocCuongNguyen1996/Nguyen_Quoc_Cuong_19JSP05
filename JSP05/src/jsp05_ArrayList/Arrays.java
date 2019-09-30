package jsp05_ArrayList;

public class Arrays {
	public static void main(String[] args) {
		String[] cars;
		String[] car = { "BMW", "Volvo", "Ford", "Mazda" };
		int[] myNum = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(car[0]);
		double[] myList = new double[10];
		myList[0] = 99.0;
		myList[1] = 100.5;
		myList[2] = 101.5;
		myList[3] = 102.5;
		myList[4] = 103.5;
		myList[5] = 104.5;
		myList[6] = 105.5;
		myList[7] = 106.5;
		myList[8] = 107.5;
		myList[9] = 108.5;
//		myList[10]=109.5;
//		myList[11]=110.5;
		System.out.println("value of myList 0 is: " + myList[0]);
		double[] myListOfMe = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Value of myListOfMe is: " + myListOfMe[8]);
		/* Change an Array Element */
		myNum[0] = 100;
		System.out.println("value of myNum 1 is: " + myNum[0]);
		/* array length */
		System.out.println("Lenght of car is: " + car.length);
		/* Loop Through an Array */
		/*for (int i = 0; i <= car.length; i++) {
//			System.out.println(car[i]);
//			System.out.println(car[1]);
		}*/
		for(int i=0; i<car.length; i++) {
			System.out.println(car[i]);
		}
		int sample[];
		sample = new int[10];
		sample[0]=1;
		sample[1]=2;
		sample[2]=3;
		sample[3]=4;
		sample[4]=5;
		sample[5]=6;
		sample[6]=7;
		sample[7]=8;
		sample[8]=9;
		sample[9]=10;
		System.out.println("print of sample[2]= "+sample[2]);
	}

}
