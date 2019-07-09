package lecture_6;

public class RecArrayExamples {
    public static void main(String[] args) {
      //  pattern(4,0);
        int [] list={1,2,2};
        System.out.println(isSorted(list,2));

    }

    public static boolean isSorted(int[] nums, int index) {
        if (index == 0) {
            return true;
        }
        boolean present=nums[index]>=nums[index-1];
        if(!present){
            return false;
        }
     return isSorted(nums,index-1);

      //  return nums[index] >= nums[index - 1] && isSorted(nums, index - 1);

    }

    public static boolean find(int[] nums, int index, int target) {
        if (index == nums.length) {
            return false;
        }
//        boolean present=nums[index]>=nums[index-1];
//        if(!present){
//            return false;
//        }
//        boolean sub=isSorted(nums,index-1);
//        if(target==nums[index]){
//            return true;
//        }
        return target == nums[index] || find(nums, index + 1, target);

    }

    public static int find_index(int[] nums, int index, int target) {
        if (index == nums.length) {
            return -1;
        }
//        boolean present=nums[index]>=nums[index-1];
//        if(!present){
//            return false;
//        }
//        boolean sub=isSorted(nums,index-1);
//        if(target==nums[index]){
//            return true;
        if (nums[index] == target) {
            return index;
        }
//        }
        return find_index(nums, index + 1, target);

    }
    //to do
    //
    // public static int[]//

    public static void pattern(int row, int col) {

        if (row == 0) {
            return;
        }

        if (row == col) {
            System.out.println();
            pattern(row-1, 0);
            return;
        }

        System.out.print("*");

        pattern(row, col + 1);
    }
    public static void bubble_sort(int[] nums,int row, int col) {

        if (row == 0) {
            return;
        }

        if (row == col) {
            System.out.println();
            bubble_sort(nums,row-1, 0);
            return;
        }
        if(nums[col]>nums[col+1]){
            int temp=nums[col];
            nums[col]=nums[col+1];
            nums[col+1]=temp;
        }



        bubble_sort(nums,row, col + 1);
    }

}
