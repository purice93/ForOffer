package top10.task03;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ListNode pNode = listNode;
        if (pNode != null) {
            if (pNode.next != null) {
                list = printListFromTailToHead(pNode.next);
            }
            list.add(pNode.val);
        }
        return list;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}