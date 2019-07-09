package lecture_6;

public class Practice {
    public static void main(String[] args) {
       // pdiskip(5);
      //  triangledown(3,0);
        triangleup(3,0);
    }
    public static void pd(int n){
        if(n==1){
            return;
        }
        System.out.println(n);
        pd(n-1);
    }
    public static void pi(int n){
        if(n==0){
            return;
        }
        pi(n-1);
        System.out.println(n);

    }
    public static void pdi(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        pi(n-1);
        System.out.println(n);
    }
    public static void pdiskip(int n){
        if(n==0){
            return;
        }
        if(n%2==1){
            System.out.println(n);
        }
        pdiskip(n-1);
        if(n%2==0){
            System.out.println(n);
        }
    }
    public static int factorial_1(int n){
        if(n==1) {
            return 1;
        }
        return n*factorial_1(n-1);
    }
    public static int factorial_2(int n){
        if(n==1){
            return 1;
        }
        int x=factorial_2(n-1);
        int f=n*x;
        return f;
    }
    public static boolean isSorted(int[] nums ,int index){
        if(index==0){
            return true;
        }
        if(nums[index]<nums[index-1]){
            return false;
        }
        return isSorted( nums,index-1);

    }
    public static boolean isSorted_1(int[] nums,int index){
        if(index==0){
            return true;
        }
        return nums[index]>=nums[index-1]&&isSorted(nums,index-1);
    }
    public static  boolean find(int[]nums,int index,int target){
        if(nums[index]==target){
            return false;

        }
        return target==nums[index]||find( nums,index+1,target);
    }
    public static void triangledown(int row,int col){
        if(row==0){
            return;
        }
        if(row==col){
            System.out.println();
            triangledown(row-1,0);
            return;
        }
        System.out.print("*");
        triangledown(row,col+1);
    }
    public static void triangleup(int row,int col){
        if(row==0){
            return;
        }
        if(row==col){
            System.out.println();
            triangledown(row-1,0);
            return;
        }
        triangledown(row,col+1);
        System.out.print("*");
    }


}



