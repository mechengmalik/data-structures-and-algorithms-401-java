package hashtable;

public class Hashtable <T>{
    Node<T>[] nodesArray;
    int nodesArraySize;

    public Hashtable(int arraySize){
        this.nodesArraySize = arraySize;
        this.nodesArray = new Node[this.nodesArraySize];
        for (Node node : nodesArray) {
            node = new Node();
        }
    }

    public int hash(T key){
        int asciiCode = 0;

        if (key instanceof String){
            for (char letter : ((String) key).toCharArray()){
                asciiCode+= (int) letter;
            }

        }else {
            asciiCode= (Integer)key;

        }
        return asciiCode % nodesArraySize;
    }




    public void add(T key, T value){
        int index = hash(key);

        Node<T> newNode = new Node<T>(key,value);
        if (nodesArray[index]==null){
            nodesArray[index]= newNode;

        }else if (nodesArray[index].next ==null){
            nodesArray[index].next = newNode;
        }else {
            newNode.next = nodesArray[index].next;
            nodesArray[index].next = newNode;
        }


    }

    public String get(T key){
        int index = hash(key);
        String value = null;
        if (nodesArray[index] ==null){
            value = "requested key is not exist";

        }else {
            Node<T> current = nodesArray[index];
            while (current != null){
                if (current.key == key){
                    value = (String) current.value;
                    break;
                }else {
                    current= current.next;
                }
            }
        }


        return value;
    }


    public boolean contains (T key){
        int index = hash(key);
        boolean state = false;

        if (nodesArray[index] != null){
            Node<T> current = nodesArray[index];

            while (current != null){
                if (current.key == key){
                    state = true;
                    break;
                }else {
                    current= current.next;
                }
            }
        }
        return state;

    }


}
