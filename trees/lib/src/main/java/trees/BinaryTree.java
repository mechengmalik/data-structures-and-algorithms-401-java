package trees;

import java.util.ArrayList;

public class BinaryTree<T> {
    Node<T> root;
    ArrayList <T> preOrderList = new ArrayList<>();
    ArrayList <T> inOrderList = new ArrayList<>();
    ArrayList <T> postOrderList = new ArrayList<>();

    public BinaryTree(){

    }

    public BinaryTree(T value) {
        this.root = new Node<>(value);

    }
    public ArrayList<T> preOrder(Node<T> root){
        if (root!= null) {
            this.preOrderList.add(root.value);


            if (root.leftRoot != null) {
                preOrder(root.leftRoot);
            }
            if (root.rightRoot != null) {
                preOrder(root.rightRoot);
            }
        }
        return preOrderList;

    }

    public ArrayList<T> inOrder(Node<T> root){
        if (root!= null){
            if (root.leftRoot !=null){
                inOrder(root.leftRoot);

            }

            this.inOrderList.add(root.value);

            if (root.rightRoot !=null){
                inOrder(root.rightRoot);
            }

        }
        return inOrderList;
    }

    public  ArrayList<T> postOrder(Node<T> root){
        if (root!=null){
            if (root.leftRoot != null){
                postOrder(root.leftRoot);

            }
//            this.postOrderList.add(root.value);

            if (root.rightRoot != null){
                postOrder(root.rightRoot);

            }
            this.postOrderList.add(root.value);
        }
        return postOrderList;
    }

    public int Max(){
        Integer max = 0;
        ArrayList<T> list = preOrder(root);
        for(T t : list){
            if (max<(Integer) t){
                max = (Integer) t;
            }
        }

        return max;
    }

}
