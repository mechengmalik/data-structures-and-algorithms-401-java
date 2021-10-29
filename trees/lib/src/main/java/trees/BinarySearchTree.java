package trees;

public class BinarySearchTree<T> extends BinaryTree<T>{

    public BinarySearchTree(T value){
        root = new Node<>(value);
    }

    public BinarySearchTree() {

    }

    public void add(int value) {
        Node<T> newNode = new Node(value);
        Node<T> temp = root;
        if (root == null) {
            root = newNode;

        } else {
            while (true) {
                if (temp.leftRoot != null && (int) newNode.value < (int) temp.value) {
                    temp = temp.leftRoot;
                } else if (temp.rightRoot != null && (int) newNode.value < (int) temp.value) {
                    temp = temp.rightRoot;
                } else {
                    break;

                }
            }
            if ((int) temp.value >= (int) newNode.value) {
                newNode.leftRoot = temp.leftRoot;
                temp.leftRoot = newNode;
            } else {
                newNode.rightRoot = temp.rightRoot;
                temp.rightRoot = newNode;

            }
        }
    }

    public boolean contains( T value, Node<T> rootNode){
        Node<T> current = rootNode;
        if (rootNode != null){
            if ((int) value == (int) current.value){
                return  true;
            }else if ((int)value < (int) current.value){
                current= current.leftRoot;
                return  contains(value,current);
            }else {
                current = current.rightRoot;
                return  contains(value,current);
            }
        }
        return false;
    }


}
