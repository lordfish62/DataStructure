package nccu.vipl.jeff.stackandqueue;

public class QueueByArray extends Queue {

	@Override
	public void enQueue(int item) {
		if (rear == queue.length-1) {
			System.out.println("Queue is full");
			return;
		}
		else {
			rear = rear + 1;
			queue[rear] = item;
		}
	}

	@Override
	public int deQueue() throws Exception {
		if (front == rear) {
			System.out.println("Queue is empty");
			throw new Exception();
		}
		else {
			front = front + 1;
			return queue[front];
		}
	}

}
