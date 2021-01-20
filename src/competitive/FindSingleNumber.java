package competitive;
import java.util.ArrayList;
import java.util.List;

public class FindSingleNumber {

	public static void main(String[] args) {

		int[] nums = { 4, 1, 2, 1, 2 };
		FindSingleNumber obj = new FindSingleNumber();
		System.out.println(obj.singleNumber(nums));
	}

	public int singleNumber(int[] nums) {

		List<Integer> find_singular_entry = new ArrayList<>();

		for (int i : nums) {
			if (!find_singular_entry.contains(i)) {
				find_singular_entry.add(i);
			} else {
				find_singular_entry.remove(new Integer(i));
			}
		}
		return find_singular_entry.get(0);
	}
}
