package graph;

public class Edges <T> {
    private graph.Node node;
   private int Weight;

    public Edges(graph.Node node, int Weight) {
        this.node = node;
        this.Weight = Weight;
    }

    public graph.Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    @Override
    public String toString() {
        return "Edges{" +
                "vertex=" + node +
                ", weight=" + Weight +
                '}';
    }
}
