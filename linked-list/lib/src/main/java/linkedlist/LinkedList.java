package linkedlist;

public class LinkedList <T>{
    Node head;
    public void insert(T value){
        Node pointer = new Node(value);
        pointer.next = head;
        head= pointer;

    }

 public boolean includes(T value){
        Node pointer = head;

        while (pointer!=null) {
            if (pointer.value==value) {
                return true;

            }
            pointer = pointer.next;
        }
        return false;


    }

    public String toString(){
        Node pointer = this.head;
        String str = "";
        while (pointer!= null) {
            str = str + "{"+pointer.value+"}->";
            pointer =pointer.next;
        }
        str = str + "NUll";
        return str;
    }
    public  void append(T value){
        Node pointer = head;
        Node newNode =new Node(value);
//        node.next = null;


        if (this.head==null){
            this.head = newNode;
        }else {
            while (pointer.next != null) {
                pointer = pointer.next;
            }
        }
        pointer.next = newNode;
    }

    public  void insertBefore(T value,T newValue){
        if (head.value == value) {
            this.insert(newValue);

        }
        else{
            Node pointer = head;
            while (pointer.next!=null) {
                if (pointer.next.value==value) {
                    Node newNode = new Node((newValue));
                    newNode.next = pointer.next;
                    pointer.next = newNode;
                    return;
                }
                pointer= pointer.next;

        }

        }

    }
    public void insertAfter(Integer value,Integer newValue) {
        Node newNode = new Node(newValue);
        Node pointer = head;

        while (pointer!=null) {
            if (pointer.value==value) {
                newNode.next = pointer.next;
                pointer.next = newNode;
            }

            pointer = pointer.next;
        }

    }



}