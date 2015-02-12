package dataStructures;

public class BinarySearchTree<T extends Comparable<? super T>> {
	private Node root;
	
	public BinarySearchTree(){
		root = null;
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
		
		public Node(T element){
			data = element;
			left = null;
			right = null;
			parent = null;
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
	}

}
