package stack.queue;

public class Stack <T> {
    Node top;

    public Stack() {
        this.top = null;

    }

    public void push(T value) {
        Node newNode = new Node(value);
        if (!isEmpty()) {
            newNode.next = top;
        }
        top = newNode;
    }


    public boolean isEmpty() {
        if (top == null ) {
            return true;
        }

        return false;
    }

    public Object pop () throws Exception{
        if(isEmpty()){
            throw new Exception("can`t be deleted from empty stack") ;
        }

        Node temp = top;
        top = top.next;
        temp.next=null;
        return temp.value;
    }

    public String peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("can`t be located the data is empty");
        } else {
           return (String) top.getValue();
        }
    }

    @Override
    public String toString(){
        Node pointer = this.top;
        if (pointer==null){
            return "the stack is empty";
        }
        String str = "";
        while (pointer!= null) {
            str = str + "{"+pointer.value+"}->";
            pointer =pointer.next;
        }
        str = str + "NUll";
        return str;
    }
}
