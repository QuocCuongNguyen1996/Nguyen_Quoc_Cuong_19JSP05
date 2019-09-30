package jsp05_ArrayList;

import java.util.ArrayList;

public class TestArrayList2 {
	public static void main(String[] args) {
		ArrayList cars= new ArrayList();
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("Rand Rover");
		cars.add("Lexus");
		cars.add("Nissan");
		cars.set(0, "Volvo");
		System.out.println(cars);
	}
}
