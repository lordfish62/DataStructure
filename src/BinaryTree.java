public class BinaryTree
{
	class Node
	{
		char data;
		Node lChild;
		Node rChild;
	}
	public void inOrder(Node t)
	{
		if (t != null)
		{
			inOrder(t.lChild);
			System.out.println(t.data);
			inOrder(t.rChild);
		}
	}
	public void preOrder(Node t)
	{
		if (t != null)
		{
			System.out.println(t.data);
			preOrder(t.lChild);
			preOrder(t.rChild);
		}
	}
	public void postOrder(Node t)
	{
		if (t != null)
		{
			postOrder(t.lChild);
			postOrder(t.rChild);
			System.out.println(t.data);
		}
	}
	public Node buildTree()
	{
		Node t = new Node();
		t.data = 'A';
		t.lChild = new Node();
		t.lChild.data = 'B';
		t.lChild.rChild = new Node();
		t.lChild.rChild.data = 'C';
		t.lChild.rChild.lChild = new Node();
		t.lChild.rChild.lChild.data = 'D';
		t.rChild = new Node();
		t.rChild.data = 'E';
		t.rChild.lChild = new Node();
		t.rChild.lChild.data = 'F';
		t.rChild.lChild.rChild = new Node();
		t.rChild.lChild.rChild.data = 'G';
		t.rChild.rChild = new Node();
		t.rChild.rChild.data = 'H';
		return t;
	}
	public static void main(String[] args)
	{
		BinaryTree bt = new BinaryTree();
		Node t = bt.buildTree();
		System.out.println("inOder:");
		bt.inOrder(t);
		System.out.println("preOder:");
		bt.preOrder(t);
		System.out.println("postOder:");
		bt.postOrder(t);
	}
}