package top10.task06;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array == null || array.length ==0){
            return 0;
        }
        int index1 = 0;
        int index2 = array.length -1;
        int indexMid = index1;
        while(array[index1] >=array[index2]){
            if(index2 -index1 == 1){
                return array[index2];
            }
            indexMid = index1 +(index2 -index1)/2;
            if(array[indexMid] == array[index1] || array[index2] == array[indexMid]){
                return midOrder(array,index1,index2);
            }
            if(array[indexMid] >= array[index1]){
                index1 = indexMid;
            }
            else if(array[indexMid] <= array[index2]){
                index2 = indexMid;
            }
        }
        return array[indexMid];
    }
    private int midOrder(int[] array, int index1, int index2) {
        int result = array[index1];
        int i = index1 +1;
        for(;i<= index2;i++){
            if(result >array[i]){
                result =array[i];
            }
        }
        return result;

    }
}