package leetcode.solutuion;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) {
	            val = x;
	            }
	 }
public class Solution2 {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dynamic = new ListNode( 0) ;
        int sum =0 ;
        ListNode cur = dynamic ;
        ListNode p1= l1,p2 = l2;
        while(p1!= null || p2!= null ){
            if(p1 != null){
                sum += p1.val;
                p1 = p1.next ;
            }
            if(p2 != null ){
                sum += p2.val ;
                p2= p2.next ;
            }
            cur.next = new ListNode(sum %10);
            sum /= 10 ;
            cur =cur.next ;
        }
        return dynamic.next;
    }

	public static void main(String[] args) {
		ListNode  node1 = new ListNode(243) ;
		ListNode  node2 = new ListNode(564) ;
		ListNode node = addTwoNumbers(node1, node2);
     	while (node != null){
     		 System.out.println(node.val);
     		 node = node.next;
     	}
		
	} 

}
