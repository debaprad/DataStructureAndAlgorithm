package datastructur;

public class BinaryTree {

	Node root;
	private int x;
	
	class Node
	{
		private int data;
		private Node left;
		private Node right;
		public Node(int data) {
			this.data = data;
		}
	}
	
	public void insert(int x)
	{
		Node p = root;
		Node par = null;
		while(p!=null)
		{
			par = p;
			if(x < p.data)
			{
				p = p.left;
			}
			else if(x >= p.data)
			{
				p = p.right;
			}
		}
		
		Node node= new Node(x);
		if(par == null)
		{
			root = node;
		}
		else if(x < par.data)
		{
			par.left = node;
		}
		else
			par.right = node;
	}
	
	public void inorder(int[] a)
	{
		x=0;
		inorder(root,a);
	}
	private void inorder(Node p, int[] a) {
		if(p==null)
		{
			return;
		}
		inorder(p.left, a);
		a[x++]=p.data;
		inorder(p.right, a);
	}

	public static void main(String[] args) {
		BinaryTree binaryTree= new BinaryTree();
		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			arr[i] =  (int)(Math.random() * 13) + 1;
		}
		/*for(int value : arr)
		{
			System.out.print(value+",");
		}*/
		for(int x:arr)
		{
			binaryTree.insert(x);
		}
		binaryTree.inorder(arr);
		//System.out.println();
		for(int value : arr)
		{
			System.out.print(value+",");
		}
	}
}
