package linkedlist;

public class LinkedList {
    Node head;
    public void insert(int value){
        Node node = new Node(value);
        node.next = head;
        head= node; 
        
    } 

    public Boolean includes(int value){
        Node pointer = this.head;
       
        while (pointer!=null) {
            if (pointer.value == value) {
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
            str = str+"{"+pointer.value+"}->";
            pointer =pointer.next;
        }
        str = str + "NUll";
        return str;
    }
 
}
