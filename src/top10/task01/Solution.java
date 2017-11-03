package top10.task01;

/**
 * Created by zoutai on 2017/11/3.
 */
public class Solution {
    public boolean Find(int [][] array,int target) {
        int rows=array.length;
        int columns=array[0].length;
        boolean f=false;
        if(array!=null&&rows>0&&columns>0){
            int row=0;
            int column=columns-1;
            while(row<rows&&column>=0){
                if(array[row][column]==target){
                    f=true;
                    break;
                }
                else if(array[row][column]>target)
                    --column;
                else
                    ++row;
            }
        }
        return f;
    }
}
