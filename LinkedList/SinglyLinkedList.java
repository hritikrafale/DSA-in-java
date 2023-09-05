// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Node{
    int data;
    Node next;
    
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

class SinglyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1,null);
        
        //Adding new Nodes
        insertNewNode(head,2);
        insertNewNode(head,3);
        insertNewNode(head,4);
        insertNewNode(head,5);
        insertNewNode(head,6);
        
        //delting nodes
        printLinkedList(head);
        head = deleteNode(head,3);
        printLinkedList(head);
        head = deleteNode(head,1);
        printLinkedList(head);
    }
    
    public static void insertNewNode(Node head, int data){
        Node temp = head;
        
        while(temp.next != null){
            temp = temp.next;
        }
        
        Node newNode = new Node(data,null);
        temp.next = newNode;
    }
    
    public static void printLinkedList(Node head){
        Node temp = head;
        System.out.print("\n");
        while(temp != null){
            System.out.print(temp.data + "---->");
            temp = temp.next;
        }
    }
    
    public static Node deleteNode(Node head, int data){
        Node temp = head;
        
        if(head.data == data){
            return head.next;
        }
        
        while(temp.next != null && temp.next.data != data){
            temp = temp.next;
        }
        
        temp.next = temp.next.next;
        
        return head;
    }
}