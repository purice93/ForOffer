package top10.task08;

public class Solution {
    public int JumpFloor(int target) {
        int n=target;
        if(n==0)
            return 0;
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
