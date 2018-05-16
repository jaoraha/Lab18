public class MainApp {

	public static void main(String[] args) {
	
	LinkedList list2 = new LinkedList();
	list2.addAtStart("Vicki");
	list2.addAtStart("Test");
	list2.addAtStart("Tim");
	list2.addAtStart("Test");
	list2.addAtStart("Jonah");
	list2.addAtStart("Test");
	
	System.out.println("Before removeAll method:");
	list2.printAllNodes();
	System.out.println();
	
	System.out.println("After removeAll method (removing Test)");
	list2.removeAll("Test");
	list2.printAllNodes();

	System.out.println();
	System.out.println("After printReverse method:");
	list2.printReverse();
	
	}
}
