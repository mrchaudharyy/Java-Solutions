package competitive;
public class MaxSubArray {

	public static void main(String[] args) {

		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		MaxSubArray obj = new MaxSubArray();
		System.out.println(obj.maxSubArray(arr));
	}

	public int maxSubArray(int[] nums) {

		int max = nums[0], sum = 0;

		for (int i = 0; i < nums.length; i++) {

			sum = sum + nums[i];
			if (max < sum)
				max = sum;
			if (sum < 0)
				sum = 0;
		}
		return max;
	}

	public int maxSubArray2(int[] nums) {

		int result = nums[0];
		int[] sum = new int[nums.length];
		sum[0] = nums[0];

		for (int i = 1; i < nums.length; i++) {
			sum[i] = Math.max(nums[i], sum[i - 1] + nums[i]);
			result = Math.max(result, sum[i]);
		}

		return result;
	}

}
