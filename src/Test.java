import nccu.vipl.jeff.stackandqueue.CircularQueueByArray;
import nccu.vipl.jeff.stackandqueue.Queue;
import nccu.vipl.jeff.stackandqueue.QueueByArray;
import nccu.vipl.jeff.stackandqueue.QueueByLinkList;

class Node {
	int data;
	Node next;
}
public class Test {
	
	public static void main(String[] args) {
		int count = 0;
		Node head;
		Node sec = new Node();
		Node trd = new Node();
		Node four = new Node();
		head = sec;
		sec.data = 10;
		sec.next = trd;
		trd.data = 20;
		trd.next = four;
		four.data = 30;
		four.next = head;
		
		Node p = head;
		do {
			count++;
			p = p.next;
		}while(p != head);
		System.out.println(count);
	}
}