package graph;

import java.util.*;

public class Graph<T> {
    Map<Node<T>, List<Node<T>>> graph = new HashMap<>();


    public Graph() {
    }


    public Node<T> addNode(T value) {
        Node<T> newNode = new Node<>(value);
        graph.put(newNode, new ArrayList<>());

        return newNode;
    }

    public void addEdge(Node<T> root, Node<T> neighbor, boolean undirected) {

        graph.get(root).add(neighbor);
        if (undirected) {
            graph.get(neighbor).add(root);
        }

    }

    public void addEdge(Node<T> root, Node<T> neighbor,int weight, boolean undirected) {
        Node<T> nodeWithWeight1 = new Node<>(root.value, weight);
        Node<T> nodeWithWeight2 = new Node<>(neighbor.value, weight);



        graph.get(root).add(nodeWithWeight2);
        if (undirected) {
            graph.get(neighbor).add(nodeWithWeight1);
        }

    }

    public boolean hasEdge(Node f, Node e){
        if (graph.get(f).contains(e)){
           return true;
        }else {
            return false;
        }
    }

    public Set<Node<T>> getNodes() {

        Set<Node<T>> visitedNodes = new HashSet<>();

        if (!graph.isEmpty()) {

            graph.forEach((key, value) -> {
                visitedNodes.add(key);
            });
            return visitedNodes;

        } else {
            return null;
        }


    }

    public List<Node<T>> getNeighbors(Node<T> neighbor) {
        return graph.get(neighbor);


    }

    public int getSize() {
        return graph.size();
    }

    @Override
    public String toString() {
        return "Graph{" +
                "graph=" + graph +
                '}';
    }

    public List<Node<T>> breadthF(Node<T> root) {
        List<Node<T>> list = new ArrayList<>();
        Set<Node<T>> visitedNode = new HashSet<>();
        List<Node<T>> queue = new ArrayList<>();

        queue.add(root);
        visitedNode.add(root);

        while (!queue.isEmpty()) {

            Node<T> front = queue.get(0);
            queue.remove(0);
            list.add(front);

            for (int i = 0; i < graph.get(front).size(); i++) {

                if (!visitedNode.contains(graph.get(front).get(i))) {

                    visitedNode.add(graph.get(front).get(i));
                    queue.add(graph.get(front).get(i));
                }
            }

        }
        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i).value);
        }
        return list;
    }

//    public String graphBusinessTrip(List<String> cities){
//        int cost = 0;
//        if (cities.size()<=1){
//            return "False, "+ cost + " $";
//        }
////        Node<String> newNode = new Node<>();
////        Node<String> newNode1 = new Node<>();
//
//
//        for (int i =0; i<cities.size(); i++){
//
//            Node<String> newNode = new Node<>(cities.get(i));
//            Node<String> newNode1 = new Node<>(cities.get(i+1));
//
//
//
//            if (graph.containsKey(newNode1)){
//                // if (getNeighbors((Node<T>) newNode).contains(newNode1)){
//                cost += newNode1.weight;
//
//
//            }else {
//                cost = 0;
//                break;
//            }
//        }
//        if (cost==0){
//            return "False, "+ cost + " $";
//        }else {
//            return "True, "+ cost + " $";
//        }


//    }
//      for (int i =0; i<cities.size(); i++){
//        Node<String> newNode = new Node<>();
//
//
//        newNode=graph.addNode(cities.get(i));
////            newNode1 =graph.addNode(cities.get(i+1));
//
//        if (newNode.weight ==0){
//            return "False, "+ cost + " $";
//
//
//        }else {
//            return "True, "+ cost + " $";
//        }


}
