package stack.queue;

class Queue<T> {
    Node front;
    Node rear;
    int size;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.size =0;

    }

    public boolean isEmpty() {
        if (front == null || rear == null) {
            return true;
        }

        return false;
    }


    public void enqueue(T value) throws Exception {
        Node newNode = new Node(value);
        size++;
        if (isEmpty()) {
            front = newNode;
        } else {

            rear.next = newNode;

        }
        rear = newNode;

    }

    public String dequeue() throws Exception {
        size--;
        Node temp = front;
        if (isEmpty()) {
            throw new Exception("can`t delete cause the queue is empty");
        }
        front = front.next;
        temp.next = null;
        return (String) temp.getValue();


    }
    public String peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        } else {
            return (String) rear.getValue();
        }
    }

    @Override
    public String toString(){
        Node pointer = this.front;
        if (pointer==null){
            return "the queue is empty";
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
