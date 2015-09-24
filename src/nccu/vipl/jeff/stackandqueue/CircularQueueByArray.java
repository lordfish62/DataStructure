package nccu.vipl.jeff.stackandqueue;
public class CircularQueueByArray extends Queue
{
	public CircularQueueByArray() { front = 0; rear = 0; }
	@Override
	public void enQueue(int item) {
		rear = (rear + 1) % queue.length;
		if (rear == front) {
			System.out.println("Queue is full");
			return;
		}
		else
			queue[rear] = item;
	}
	@Override
	public int deQueue() throws Exception {
		if (rear == front) {
			System.out.println("Queue is empty");
			throw new Exception();
		}
		else {
			front = (front + 1) % queue.length;
			return queue[front];
		}
	}
}