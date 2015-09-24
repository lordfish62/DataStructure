package nccu.vipl.jeff.stackandqueue;
public abstract class Stack
{
	static final int size = 10;
	int top = -1;
	int[] stack = new int[size];
	Node Top = null;
	class Node
	{
		int data;
		Node next;
	}
	abstract void push(int item);
	abstract int pop() throws Exception;
}