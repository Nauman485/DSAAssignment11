package geekster;

public class Reverse_linkedlist {
	
	 Node head; 
	    class Node {
	        int data;
	        Node prev;
	        Node next;
	
	        Node(int d) {
	        	data = d;
	        	}
	    }
	    public void push(int new_data)
	    {
	        Node new_Node = new Node(new_data);
	        new_Node.next = head;
	        new_Node.prev = null;
	        if (head != null)
	            head.prev = new_Node;
	        head = new_Node;
	    }
	    public void printlist(Node node)
	    {
	        Node last = null;
	 
	        while (node != null) {
	            System.out.print(node.data + " ");
	            last = node;
	            node = node.next;
	        }
	 
	        System.out.println();
	    }
	public Node reverseList(Node head) {
        if (head == null || head.next == null)
            return head;
        Node temp = null, p1 = head, p2 = head.next;
        while (p2 != null) {
            p1.next = temp;
            temp = p1;
            p1 = p2;
            p2 = p2.next;
        }
        p1.next = temp;
        return p1;
    }
	 public static void main(String[] args)
	    {
		 Reverse_linkedlist dll = new Reverse_linkedlist();
	        dll.push(2);
	        dll.push(4);
	        dll.push(8);
	        dll.push(10);
	        dll.printlist(dll.head);
	       System.out.print(dll.reverseList(dll.head)+" ");
	 

	    }


}
