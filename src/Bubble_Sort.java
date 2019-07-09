import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] nums=new int[n];
        for (int i = 0; i <n ; i++) {
            nums[i]=s.nextInt();
        }
        int[] ni=bubblessort(nums,nums.length);
        for (int i = 0; i <n ; i++) {
            System.out.println(ni[i]);

        }

    }
    public static int[] bubblessort(int[] nums,int len){
        for (int i = 0; i <len-1 ; i++) {{
            for (int j = 0; j <len-1-i ; j++) {
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }

            }
        }

        }
        return nums;
    }

}
