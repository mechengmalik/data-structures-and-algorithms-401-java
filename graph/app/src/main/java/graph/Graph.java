package graph;

import java.util.*;

public class Graph<T> {
    Map<graph.Node<T>, ArrayList<graph.Node<T>>> graph = new HashMap<>();
    List<graph.Node<T>> nodes = new ArrayList<>();


    public Graph() {
    }


    public graph.Node<T> addNode(T value) {
        graph.Node<T> newNode = new graph.Node(value);
        graph.put(newNode, new ArrayList<>());

        return newNode;
    }

    public Map<graph.Node<T>, ArrayList<graph.Node<T>>> getGraph() {
        return graph;
    }

    public void setGraph(Map<graph.Node<T>, ArrayList<graph.Node<T>>> graph) {
        this.graph = graph;
    }

    public void addEdge(graph.Node<T> root, graph.Node<T> neighbor, boolean undirected) {

        graph.get(root).add(neighbor);
        if (undirected) {
            graph.get(neighbor).add(root);
        }

    }

    public void addEdge(Node<T> root, Node<T> neighbor,int weight, boolean undirected) {
        graph.Node<T> nodeWithWeight1 = new graph.Node<>(root.getValue(), root.next);
        graph.Node<T> nodeWithWeight2 = new graph.Node<>(neighbor.getValue());



        graph.get(root).add(nodeWithWeight2);
        if (undirected) {
            graph.get(neighbor).add(nodeWithWeight1);
        }

    }

    public boolean hasEdge(Node f, Node e){
        return graph.get(f).contains(e);
    }

    public Set<graph.Node<T>> getNodes() {

        Set<graph.Node<T>> visitedNodes = new HashSet<>();

        if (!graph.isEmpty()) {

            graph.forEach((key, value) -> {
                visitedNodes.add(key);
            });
            return visitedNodes;

        } else {
            return null;
        }


    }

    public ArrayList<graph.Node<T>> getNeighbors(graph.Node<T> neighbor) {
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

            graph.Node<T> front = queue.get(0);
            queue.remove(0);
            list.add(front);

            for (int i = 0; i < graph.get(front).size(); i++) {

                if (!visitedNode.contains(graph.get(front).get(i))) {

                    visitedNode.add(graph.get(front).get(i));
                    queue.add(graph.get(front).get(i));
                }
            }

        }
        for (Node<T> tNode : list) {

            System.out.println(tNode.getValue());
        }
        return list;
    }


    public List<Node<T>> depthFirst(Node<T> root){
        this.nodes.add(root);

        if (!graph.get(root).isEmpty()){

            for(Node<T> node :getNeighbors(root) ) {
                if (!nodes.contains(node)){
                    depthFirst(node);
                }
            }
        }else {
            return null;
        }
        return nodes;
    }

//    public String graphBusinessTrip(Graph graph,List<String> cities){
//        Integer cost=0;
//        for (int i=0;i<cities.size()-1;i++){
//            Node<String> node=new Node<>(cities.get(i));
//            Node<String> nextNode=new Node<>(cities.get(i+1));
//            if (((Map)graph.getGraph().get(node)).get(nextNode)!=null){
//                cost+=((Integer)((Map)graph.getGraph().get(node)).get(nextNode));
//                System.out.println(cost);
//            }
//        }
//        return cost > 0 ? "True, $" + cost : "False, $" + cost;
//    }


}
