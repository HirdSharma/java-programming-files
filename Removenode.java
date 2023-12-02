public class Removenode {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        return;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if (head==null) {
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.next=null;
        tail=newNode;
        return;
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        if(size==1){
            head=tail=null;
            size=0;
            return;
        }
        head=head.next;
        size--;
        return;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        if(size==1){
            head=tail=null;
            size=0;
            return;
        }

        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        prev.next=null;
        tail=prev;
        size--;
        return;
    }
    public void removenthnode(int n){
        if(n==size){
            head=head.next;
            size--;
            return;
        }
        int i=1;
        int itofind=size-n;
        Node prev=head;
        while (i<itofind) {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        size--;
        return;
    }
    public int findmid(){//tc=o(n)+o(n/2)where o(n)is tc of finding size and o(n/2)is tc of finding mid
        int N=size;
        Node temp=head;
        int i=1;
        int n=(N/2)+1;
        while(i<n){
            i++;
            temp=temp.next;
        }
        int val=temp.data;
        return val;
    }
    public int findmiddle(){
        Node slow=head;
        Node fast=head;
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        int val=slow.data;
        return val;
    }
    public void print(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Removenode ll=new Removenode();//creating object ll of class Removenode
        ll.addFirst(10);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println(ll.size);
        ll.removenthnode(2);
        ll.print();
        System.out.println(ll.size);
        ll.addFirst(6);
        ll.addLast(5);
        ll.addLast(9);
        ll.print();
        System.out.println(ll.findmiddle());
    }
}
