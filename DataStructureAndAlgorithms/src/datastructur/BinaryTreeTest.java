package datastructur;

public class BinaryTreeTest {

	Node root=null;
	int x=0;
	class Node
	{
		Node left;
		int data;
		Node right;
		public Node(int data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	public void insert(int x)
	{
		Node p = root;
		Node par = null;
		while(p != null)
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
		Node node =  new Node(x);
		if(par == null)
		{
			root=node;
		}
		else if(x < par.data)
		{
			par.left = node;
		}
		else{
			par.right =node;
		}
	}
	public void inorder(int[] a)
	{
		inorder(root,a);
	}
	public void inorder(Node node,int[] a)
	{
		if(node==null)
		{
			return;
		}
		inorder(node.left,a);
		a[x++]=node.data;
		inorder(node.right,a);
	}
	public static void main(String[] args) {
		BinaryTreeTest binaryTree= new BinaryTreeTest();
		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			arr[i] =  (int)(Math.random() * 13) + 1;
		}
		
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
