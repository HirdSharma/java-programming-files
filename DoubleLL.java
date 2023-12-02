public class DoubleLL {
    public class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //add
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void removeLast(){
        if(tail==null){
            head=tail;
            System.out.println("this is empty linked list");
            return;
        }
        if(size==1){
            head=tail=null;
            size--;
            return;
        }
        tail=tail.prev;
        tail.next=null;
        size--;
        return;
    }
    public int removeFirst(){
        if(head==null){
            System.out.println("dll is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(tail==null){
            tail=head=newNode;
            size++;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        newNode.next=null;
        tail=newNode;
        size++;
        return;
    }
    
    public void print(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"<-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoubleLL dll=new DoubleLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.print();
        System.out.println(dll.size);
        dll.removeFirst();
        dll.print();
        System.out.println(dll.size);
        dll.removeLast();
        dll.print();
        System.out.println(dll.size);
        dll.removeLast();
        dll.print();
        System.out.println(dll.size);
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);
        dll.addLast(6);

        dll.print();
        System.out.println(dll.size);

    }
}

