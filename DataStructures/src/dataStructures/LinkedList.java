package dataStructures;

public class LinkedList {
	private Node head;
	private int listCount;
	
	public LinkedList(){
		head = null;
		listCount = 0;
	}
	
	public void add(Object data){
		Node newNode = new Node(data);
		newNode.setNext(head);
		head = newNode;
		listCount++;
	}
	
	public boolean remove(Object data){
		boolean success = false;
		if(head != null){
			if(head.getData().equals(data)){
				head = head.getNext();
				listCount--;
				success = true;
			}
			else{
				Node pred = getPredecessor(data);
				if(pred != null){
					pred.setNext(pred.getNext().getNext());
					success = true;
					listCount--;
				}
			}
		}
		return success;
	}
	
	private Node getPredecessor(Object data){
		Node pred = null;
		if(head != null){
			Node toCheck = head;
			boolean success = false;
			Node next = toCheck.getNext();
			while(next!=null && !success){
				if(next.getData().equals(data)){
					pred = toCheck;
					success = true;
				}
				else{
					toCheck = next;
					next = toCheck.getNext();
				}
			}
		}
		return pred;
	}
	
	public int getSize(){
		return listCount;
	}
	
	private class Node {
		private Node next;
		private Object data;
		
		public Node(Object dataValue){
			next = null;
			data = dataValue;
		}
		
		public Object getData(){
			return data;
		}
		public void setData(Object dataValue){
			data = dataValue;
		}
		
		public Node getNext(){
			return next;
		}
		
		public void setNext(Node nextValue){
			next = nextValue;
		}
	}
	
}
