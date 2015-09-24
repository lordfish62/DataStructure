package nccu.vipl.jeff.stackandqueue;

public class QueueByLinkList extends Queue {

	@Override
	public void enQueue(int item) {
		Node t = new Node();
		t.data = item;
		t.next = null;
		if (Front == null)
			Front = t;
		else
			Rear.next = t;
		Rear = t;

	}

	@Override
	public int deQueue() throws Exception {
		if (Front == null)
			throw new Exception();
		else
		{
			Node t = Front;
			Front = t.next;
			return t.data;
		}
	}

}
