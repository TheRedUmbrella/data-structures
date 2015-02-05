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
	
	
	
	public int getSize(){
		return listCount;
	}
	
}
