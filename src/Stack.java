public abstract class Stack
{
	abstract void push(int item);
	abstract int pop() throws Exception;
}

class Stack_LinkList extends Stack
{
	Node Top = null;
	class Node
	{
		int data;
		Node next;
	}
	public void push(int item)
	{
		Node t = new Node();
		t.data = item;
		t.next = Top;
		Top = t;
	}
	public int pop() throws Exception
	{
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
	public static void main(String[] args)
	{
		Stack s1 = new Stack_LinkList();
		Stack s2 = new Stack_Array();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s2.push(10);
		s2.push(20);
		s2.push(30);
		s2.push(40);
		try
		{
			System.out.println(s1.pop());
			System.out.println(s1.pop());
			System.out.println(s1.pop());
			System.out.println(s1.pop());
			System.out.println("===========================");
			System.out.println(s2.pop());
			System.out.println(s2.pop());
			System.out.println(s2.pop());
			System.out.println(s2.pop());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class Stack_Array extends Stack
{
	static final int size = 10;
	int top = -1;
	int[] stack = new int[size];
	@Override
	void push(int item) {
		if (top == (size-1)){
			System.out.println("Stack full");
		}
		else{
			top += 1;
			stack[top] = item;
		}
	}

	@Override
	int pop() throws Exception {
		if (top == -1) {
			System.out.println("Stack empty");
			throw new Exception();
		}
		else {
			int item = stack[top];
			top -= 1;
			return item;
		}
	}
	
}