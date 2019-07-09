package lecture_5;

import java.util.Scanner;

public class Spiral_Matrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int[][] a=new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                a[i][j]=s.nextInt();

            }

        }

        spiralmatrix(a,m,n);

    }
    public static void spiralmatrix(int[][] a,int row,int col){
        int k=0; //starting row index
        int l=0;//starting col index
        int i;
        while(k<row&&l<col){
            //printing first row
            if(k<row&&l<col){
                for (i = l; i < col; i++) {
                    System.out.print(a[k][i]+", ");

                }
                k++;
            }

            //printing last column
            if(k<row&&l<col){
                for ( i = k; i <row ; i++) {
                    System.out.print(a[i][col-1]+", ");

                }
                col--;
            }

            //printing last column
            if(k<row&&l<col){
                for ( i = col-1; i >=l ; i--) {
                    System.out.print(a[row-1][i]+", ");

                }
                row--;
            }


            //printing upper column
            if(k<row&&l<col){
                for ( i =row-1 ; i >=k ; i--) {
                    System.out.print(a[i][l]+", ");

                }
                l++;
            }
            for ( i =row-1 ; i >=k ; i--) {
                System.out.print(a[i][l]+", ");

            }
            l++;

        }
        System.out.println("END");
    }
}
