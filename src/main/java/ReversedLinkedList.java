public class ReversedLinkedList {

     // Definition for singly-linked list.
     public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode temp=head;
            int count=0;
            while(temp!=null)
            {
                count++;
                temp=temp.next;
            }
            int ar[]=new int[count];
            temp=head;
            int i=0;
            while(temp!=null)
            {
                ar[i++]=temp.val;
                temp=temp.next;
            }
            int n=count;
            int k=0;
            int end=n-1;
            while(k<=end)
            {
                int t;
                t=ar[k];
                ar[k]=ar[end];
                ar[end]=t;
                k++;
                end--;
            }
            ListNode abc=new ListNode(-1);
            ListNode tail=abc;
            for(int j=0;j<n;j++)
            {
                ListNode tem=new ListNode(ar[j]);
                tail.next=tem;
                tail=tail.next;
            }
            return abc.next;

        }
    }
}
