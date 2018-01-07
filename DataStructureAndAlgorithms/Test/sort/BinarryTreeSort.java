package sort;

public class BinarryTreeSort {

	Node root=null;
	int x=0;
	class Node
	{
		Node left;
		int data;
		Node right;
		public Node(int data) {
			super();
			this.left = null;
			this.data = data;
			this.right = null;
		}
	}
	public void insert(int data)
	{
		Node p = root;
		Node par = null;
		while(p!=null)
		{
			par=p;
			if(x<p.data)
			{
				p=p.left;
			}
			else if(x>=p.data)
			{
				p=p.right;
			}
		}
		Node node=new Node(data);
		if(par==null)
		{
			root=node;
		}
		else if(x<par.data)
		{
			par.left=node;
		}
		else
		{
			par.right=node;
		}
	}
	
	public void inOrder(int[] arr)
	{
		inOrder(root,arr);
	}
	
	public void inOrder(Node node,int[] arr)
	{
		if(node==null)
		{
			return;
		}
		inOrder(node.left, arr);
		arr[x++]=node.data;
		inOrder(node.right, arr);
	}
}
