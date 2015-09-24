package nccu.vipl.jeff.stackandqueue;
public abstract class Queue
{
	static final int size = 10;
	int rear = -1;
	int front = -1;
	int[] queue = new int[size];
	Node Front = null;
	Node Rear = null;
	class Node
	{
		int data;
		Node next;
	}
	public abstract void enQueue(int item);
	public abstract int deQueue() throws Exception;
}