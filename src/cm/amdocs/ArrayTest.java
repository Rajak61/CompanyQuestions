package cm.amdocs;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[5];
		for (int i = 5; i > 0; i--) {
			array[5 - i] = i;
		}
			Arrays.fill(array, 1, 4, 8);
			for (int j = 0; j < 5; j++) {
				System.out.println(array[j]);
			}

	}

}
