package top10.task10;

public class Solution {
    public int RectCover(int target) {
        int n=target;
        if(n==0)
            return 1;
        if(n==1)
            return 1;
        int one=1;
        int two=1;
        int number=0;
        for(int i=2;i<=n;i++){
            number=one+two;
            one=two;
            two=number;
        }

        return number;
    }
}