import dataStructures.*;

public class TesterClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList a = new LinkedList();
		a.add(34);
		a.add(false);
		a.add(5);
		a.remove(false);
		System.out.println("Hey there.  It's been so long: "+a.getSize());
		
		System.out.println(((Integer)5).compareTo((Integer)4));

	}

}
