package practise;

import java.util.ArrayList;
import java.util.List;

public class Sol {

	public static void main(String[] args) {
		int size = 3;

		int[] arr = { -11, -2, 19, 37, 64, -18 };

		List<Integer> listArr = new ArrayList<Integer>();
		for (int i = 0; i < arr.length - size + 1; i++) {
			int listSize = listArr.size();
			for (int j = i; j <= i + size - 1; j++) {
				if (arr[j] < 0) {
					listArr.add(arr[j]);
					break;
				}
			}
			if (listSize == listArr.size()) {
				listArr.add(0);
			}
		}

		System.out.println(listArr);
	}

}