package top10.task02;

/**
 * Created by zoutai on 2017/11/3.
 */
public class Solution {
    public String replaceSpace(StringBuffer str) {
        if(str==null)
            return null;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' ')
                str.replace(i, i+1, "%20");
        }
        String s=new String(str);
        return s;
    }
}
