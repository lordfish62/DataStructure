public class CircularQueue
{
	int rear = 0;
	int front = 0;
	int m;
	char[][] queue;
	CircularQueue(int m)
	{
		queue = new char[m][16];
		this.m = m;
	}
	public void Enqueue(char[] data)
	{
		rear = (rear + 1) % m;
		if (rear == front)
			System.out.println("Queue is full.");
		else
			queue[rear] = data; 
	}
	public char[] Dequeue()
	{
		if (front == rear)
			System.out.println("Queue is empty.");
		else
			front = (front + 1) % m;
		return queue[front];
	}
	public void PrintQueue()
	{
		for (int i=0; i<m; i++)
		{
			System.out.println(queue[i]);
		}
	}
	public static void main(String[] args)
	{
		CircularQueue cq = new CircularQueue(5);
		cq.Enqueue("s1".toCharArray());
		cq.Enqueue("s2".toCharArray());
		cq.Enqueue("s3".toCharArray());
		char[] temp = cq.Dequeue();
		System.out.println(temp);
		cq.PrintQueue();
	}
}