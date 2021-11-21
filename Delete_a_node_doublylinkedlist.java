package geekster;

public class Delete_a_node_doublylinkedlist {
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
	    void deleteNode(Node del)
	    {
	        if (head == null || del == null) {
	            return;
	        }
	        if (head == del) {
	            head = del.next;
	        }
	        if (del.next != null) {
	            del.next.prev = del.prev;
	        }
	        if (del.prev != null) {
	            del.prev.next = del.next;
	        }
	        return;
	    }
	    
	    public static void main(String[] args)
	    {
	    	Delete_a_node_doublylinkedlist dll = new Delete_a_node_doublylinkedlist();
	        dll.push(2);
	        dll.push(4);
	        dll.push(8);
	        dll.push(10);
	        dll.printlist(dll.head);
	        dll.deleteNode(dll.head);
	 
	        // List after deleting first node
	        // 8->4->2
	        System.out.print("List after deleting first node: ");
	        dll.printlist(dll.head);

	    }

}
