import java.io.*;
import java.util.*;

public class main {

	public static void main(String[] args) {

		Chaining chainTable = new Chaining(10, 5, (int) Math.pow(2, 10) - 32);
		Open_Addressing openTable = new Open_Addressing(10, 5, (int) Math.pow(2, 10) - 32);
		
		System.out.println("Test Chaining collisions.");
		for (int i = 0; i < 30; i++) {
			System.out.println(chainTable.insertKey((int) (Math.random() * 100)));
		}

		System.out.println("\nTest Open_Addressing collisions.");
		for (int i = 0; i < 30; i++) {
			System.out.println(openTable.insertKey((int) (Math.random() * 100)));
		}

		System.out.println("\nTest Chaining insertion.");
		for (ArrayList<Integer> aList : chainTable.Table) {
			System.out.println(aList.toString());
		}

		System.out.println("\nTest Open_Addressing insertion.");
		System.out.println(Arrays.toString(openTable.Table));

		System.out.println("\nTest Open_Addressing removal.");
		int[] nums = new int[10];
		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 100);
			nums[i] = num;
			System.out.println(openTable.removeKey(num));
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(openTable.Table));
		
	}
}
