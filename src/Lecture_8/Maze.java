package Lecture_8;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
      //  mazepath(" ",3,3);
        System.out.println( mazepath_arraylist("",3,3,new ArrayList<>()  ));

    }
    public static int maze(int row,int col){
        if(row==1||col==1){
            return 1;
        }
    return maze(row-1,col)+maze(row,col+1);
    }
    public static void mazepath(String path,int row,int col ){
        if(row==1&&col==1){
            System.out.println(path);
            return;
        }
        if(row>1){

            mazepath( path+'v', row-1, col);
        }
        if(col>1){

            mazepath(path+'h',row,col-1);
        }

    }
    public static ArrayList<String> mazepath_arraylist(String path, int row, int col, ArrayList<String> list){
        if(row==1&&col==1){
            list.add(path);
            return list;
        }
        if(row>1){
            mazepath_arraylist( path+'v', row-1, col, list);
        }
        if(col>1){

         mazepath_arraylist(path+'h',row,col-1,list);
        }
     return  list;
    }


}
