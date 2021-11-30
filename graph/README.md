# Graphs

A graph is a non-linear data structure that can be looked at as a collection of vertices  potentially connected by edges.

## Challenge 35

Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:

1. add node
   Arguments: value
   Returns: The added node
   Add a node to the graph

2. add edge
   Arguments: 2 nodes to be connected by the edge, weight (optional)
   Returns: nothing
   Adds a new edge between two nodes in the graph
   If specified, assign a weight to the edge
   Both nodes should already be in the Graph

3. get nodes
   Arguments: none
   Returns all of the nodes in the graph as a collection (set, list, or similar)

4. get neighbors
   Arguments: node
   Returns a collection of edges connected to the given node
   Include the weight of the connection in the returned collection

5. size
   Arguments: none
   Returns the total number of nodes in the graph


## Approach & Efficiency

### the big O notation for each method

1. add node
 time = O(1)
space = O(n) 

2. add edge
time = O(1)  
space = O(1) 

3. get nodes 
time = O(n) 
space = O(n) because  declaring a HashSet.

4. get neighbors :
time = O(1)
space = O(1)

5. size
time = O(1)
space = O(1)

## API

1. add node : this method is to add a new node to the graph.

2. add edge : this method is to add a new edge between two Nodes in the graph.

3. get nodes : this method returns a HashSet which contains all the Nodes in the graph.

4. get neighbors : this method return a list of all the Nodes that are connected to the Node we pass.

5. size : this method returns the size of the graph HashSet.


# Challenge 36


write a function which traverse a graph by breadth first concept , and return a list of all the nodes traversed.

## Whiteboard Process

![board](breadth%20first.png)

## Approach & Efficiency

### the big O notation

time = O(n^2)   because we use a nested loop
space = O(n)  

## Solution

sample of the code :

```
       Graph<String> graph2 = new Graph<>();


        Node<String> a = graph2.addNode("M");
        Node<String> b =  graph2.addNode("A");
        Node<String> c = graph2.addNode("L");
        Node<String> d = graph2.addNode("I");
        Node<String> e = graph2.addNode("K");

        graph2.addEdge(a,b,true);
        graph2.addEdge(b,c,true);
        graph2.addEdge(c,d,true);
        graph2.addEdge(b,e,true);
        graph2.addEdge(e,e,true);

        graph2.breadthF(a);
```

this is its output:
```
M
A
L
I
K
```

# challenge 37

* Check if given nodes can be traversed(connected) or not and return boolean and total weight.

## Whiteboard Process

![Whiteboard Process](busnis%20trip.png)

## Approach & Efficiency

### the big O notation

time = O(n)   
space = O(n)
## Solution

Add edges between specific nodes and call the method and after that print the result.


# Challenge 38

write a function which traverse a graph by depth first concept , and return a list of all the nodes traversed.

## Whiteboard Process

![board](CC38.png)

## Approach & Efficiency

### the big O notation is:
time = O(n)   
space = O(1)
## Solution

##### this is a sample of the code:

```
Graph<String> graph = new Graph<>();

        Node a = graph.addNode("A");
        Node b =  graph.addNode("B");
        Node c = graph.addNode("C");
        Node d = graph.addNode("D");
        Node e = graph.addNode("E");
        Node f = graph.addNode("F");
        Node g = graph.addNode("G");
        Node h = graph.addNode("H");

        graph.addEdge(a,b,true);
        graph.addEdge(a,d,true);
        graph.addEdge(b,c,true);
        graph.addEdge(b,d,true);
        graph.addEdge(c,g,true);
        graph.addEdge(d,e,true);
        graph.addEdge(d,h,true);
        graph.addEdge(d,f,true);
        graph.addEdge(h,f,true);



        graph.depthFirst(a);
```

##### the output of it:

```
[Node{value=A}, Node{value=B}, Node{value=C}, Node{value=G}, Node{value=D}, Node{value=E}, Node{value=H}, Node{value=F}]
```
