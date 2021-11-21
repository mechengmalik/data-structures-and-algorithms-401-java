package trees;

public class Node<T> {
    T value;
    Node<T> leftRoot;
    Node<T> rightRoot;

    public Node(T value) {
        this.value = value;
    }
}
