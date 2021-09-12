package queuee;

/**
 * @author farazshabbir
 *
 */
public class Queue {
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	/**
	 * @param data
	 * this method adds a element to the rear end of the queue
	 */
	public void enqueue(int data) {
		Node newNode= new Node(data);
		if(head==null) {
			head=newNode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
		
			}
	
	/**
	 * this method prints the elements of the queue
	 */
	public void display() {
		if(head==null) {
			System.out.println("Queue is empty");
		}
		else {
			System.out.println("Queue contains:");
			Node temp=head;
			while(temp.next!=null) {
				System.out.print(temp.data+"--->");
				temp=temp.next;
			}
			System.out.println(temp.data);
		}
	}
	
	/**
	 * this method removes the element from the front of the queue
	 */
	public void dequeue() {
		if(head==null) {
			System.out.println("Queue is empty");
		}
		else {
			head=head.next;
		}
	}

}