package lecture_4;

public class Main {
    public static void main(String[] args) {

    }
    public static void  swap(int[] nums,int first, int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;

    }
    // displaying an array
    public static void display(int[] nums){
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);

            if (i < nums.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
     // linear search
    public static int linear(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                return i;
            }
        }

        return -1;
    }
    // binary search
    public static int binary(int[] nums, int target){

        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;

        while (start <= end){


            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
    //compare Array
    public static boolean compareArray(int[] first, int[] second){
        if (first.length != second.length){
            return false;
        }

        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]){
                return false;
            }
        }

        return true;
    }
    //Inverse
    public  static void  inverse(int[] nums){
        int[] result=new int[nums.length];
        for(int p=0;p<nums.length;p++){
            int v=nums[p];
            result[v]=p;
        }
    }
    // reversing a array
    public   static  void reverse(int[] nums){

        for ( int i=0; i <nums.length/2 ; i++) {
            int temp=nums[i];
            nums[i]=nums[nums.length-i - 1];
            nums[nums.length-i - 1]=temp;


        }
    }
    // max Index
    public static int maxIndex(int[] nums){
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[max]){
                max = i;
            }
        }

        return max;
    }
    public static int maxIndexInRange(int[] nums, int start, int end){
        int max = start;

        for (int i = start; i <= end; i++) {
            if (nums[i] > nums[max]){
                max = i;
            }
        }

        return max;
    }





}
