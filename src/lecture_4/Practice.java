package lecture_4;

public class Practice {
    public static void main(String[] args) {
        int[] nums={2,4,1,3,6,0};


    }

    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static int maxIndexRange(int[] nums, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (nums[i] > nums[max]) {
                max = i;
            }

        }
        return max;

    }

    public static void selection(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int maxIndex = maxIndexRange(nums, 0, nums.length - i - 1);
            swap(nums, maxIndex, nums.length - i - 1);

        }
    }
}