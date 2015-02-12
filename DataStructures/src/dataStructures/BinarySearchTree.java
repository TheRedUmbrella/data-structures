package dataStructures;

public class BinarySearchTree<T extends Comparable<? super T>> {
	private Node root;
	
	public BinarySearchTree(){
		root = null;
	}
	
	public boolean add(T item){
		if(root==null){
			root = new Node(item);
			return true;
		}
		else{
			return add(item, root);
		}
	}
	
	private boolean add(T item, Node parent){
		T parentItem = parent.getData();
		if(item.compareTo(parentItem)<0){
			Node leftNode = parent.getLeft();
			if(leftNode==null){
				parent.setLeft(new Node(item, parent));
				return true;
			}
			else{
				return add(item, leftNode);
			}
		}
		else if(item.compareTo(parentItem)>0){
			Node rightNode = parent.getRight();
			if(rightNode==null){
				parent.setRight(new Node(item, parent));
				return true;
			}
			else{
				return add(item, rightNode);
			}
		}
		else{
			return false;
		}
	}
	
	public T searchTree(T item){
		Node itemNode = find(root, item);
		if(itemNode == null){
			return null;
		}
		else{
			return itemNode.getData();
		}
	}
	
	private Node find(Node top, T item){
		if(top == null){
			return null;
		}
		else{
			T topItem = top.getData();
			if(topItem.equals(item)){
				return top;
			}
			else if(topItem.compareTo(item)<0){
				return find(top.getLeft(), item);
			}
			else{
				return find(top.getRight(), item);
			}
		}
	}
	
	private class Node{
		private T data;
		private Node left;
		private Node right;
		private Node parent;
		
		public Node(T data){
			this.data = data;
			left = null;
			right = null;
			parent = null;
		}
		
		public Node(T data, Node parent){
			this.data = data;
			left = null;
			right = null;
			this.parent = parent;
		}
		
		
		public T getData(){
			return data;
		}
		
		public Node getLeft(){
			return left;
		}
		
		public Node getRight(){
			return right;
		}
		
		public void setLeft(Node left){
			this.left = left;
		}
		
		public void setRight(Node right){
			this.right = right;
		}
		
		public void setParent(Node parent){
			this.parent = parent;
		}
		
	}

}
