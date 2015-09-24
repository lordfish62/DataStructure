import nccu.vipl.jeff.stackandqueue.CircularQueueByArray;
import nccu.vipl.jeff.stackandqueue.Queue;
import nccu.vipl.jeff.stackandqueue.QueueByArray;
import nccu.vipl.jeff.stackandqueue.QueueByLinkList;

public class Test {
	public static void main(String[] args) {
		Queue qa = new CircularQueueByArray();
		try {
			qa.enQueue(10);
			qa.enQueue(20);
			qa.enQueue(30);
			qa.enQueue(40);
			qa.enQueue(50);
			qa.enQueue(60);
			qa.enQueue(70);
			qa.enQueue(80);
			qa.enQueue(90);
			System.out.println(qa.deQueue());
			System.out.println(qa.deQueue());
			qa.enQueue(100);

			qa.enQueue(110);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}