package linklist;

public class LinkedList {
	
	Node node;
	
	
	public static void main(String[] args) {
		
		Node node=new Node(10);
		
		Node node2=new Node(12);
		
		Node node3=new Node(15);
		
		node.next=node2;
		
		node2.next=node3;
		
		Node node4=node;
		while(node4!=null) {
			System.out.println("datta"+node4.element);
			node4=node4.next;
		}
		
	}

}
