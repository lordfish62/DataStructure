package nccu.vipl.jeff.stackandqueue;

public class StackByLinkList extends Stack {

	@Override
	void push(int item) {
		Node t = new Node();
		t.data = item;
		t.next = Top;
		Top = t;

	}

	@Override
	int pop() throws Exception {
		if (Top == null)
		{
			throw new Exception();
		}
		else
		{
			Node t = Top;
			Top = t.next;
			return t.data;
		}
	}

}
