public class Queue
{
	Node Front = null;
	Node Rear = null;
	class Node
	{
		int data;
		Node next;
	}
	public void enQueue(int item)
	{
		Node t = new Node();
		t.data = item;
		t.next = null;
		if (Front == null)
			Front = t;
		else
			Rear.next = t;
		Rear = t;
	}
	public int deQueue() throws Exception
	{
		if (Front == null)
			throw new Exception();
		else
		{
			Node t = Front;
			Front = t.next;
			return t.data;
		}
	}
	public static void main(String[] args)
	{
		Queue q = new Queue();
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		try
		{
			System.out.println(q.deQueue());
			System.out.println(q.deQueue());
			System.out.println(q.deQueue());
			System.out.println(q.deQueue());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}