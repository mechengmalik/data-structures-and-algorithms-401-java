package linkedlist;


import java.util.ArrayList;

public class LinkedList <T>{
    Node head;
    int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }


    public void insert(T value){
        size++;
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
        size++;
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
        size++;
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
        size++;
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
    public Object kth(int k){

        if(k<=0){
            return "chose number positive";
        }else if(k>=this.size){
            return "the number you insret bigger than the length oh linkedlist";
        }else{
            ArrayList<Object> array = new ArrayList<>();
            Node pointer =head;
            while (pointer !=null){
                array.add(pointer.value);
                pointer=pointer.next;

            }
            return  array.get(array.size()-k);
        }






    }



}





