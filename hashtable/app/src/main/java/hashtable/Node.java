package hashtable;

public class Node <T>{
    public T key;
    public T value;
    Node<T> next;


    public Node() {
    }

    public Node(T key, T value) {
        this.key = key;
        this.value = value;
    }

//    public T getValue() {
//        return value;
//    }
}
