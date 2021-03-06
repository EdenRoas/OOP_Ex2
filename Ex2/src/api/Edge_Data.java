package api;

public class Edge_Data implements api.EdgeData{
    private int src, dest, tag;
    private double weight;
    private String info;
    public static final int WHITE = 0, GRAY = 1, BLACK = 2;

    /**
     * for the Node tag: white = 0,   gray = 1,   black = 2,
     * So that white symbolizes the node hasn't been visited,
     * gray symbolizes we already visit this node
     * and black symbolizes we've done with this node, as a default all nodes are Initialized to white.
     */
    public Edge_Data(int src, int dest, double weight)
    {
        this.src = src;
        this.dest = dest;
        this.tag = WHITE;
        this.weight = weight;
        this.info = "src: " + this.src + ", w: " + this.weight + ", dest: " + this.dest;
    }

    public Edge_Data(int src, int dest, double weight, String info, int tag)
    {
        this.src = src;
        this.dest = dest;
        this.tag = tag;
        this.weight = weight;
        this.info = info;
    }

    @Override
    public int getSrc() {
        return this.src;
    }

    @Override
    public int getDest() {
        return this.dest;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public String getInfo() {
        return this.info;
    }

    @Override
    public void setInfo(String s) {
        this.info = s;
    }

    @Override
    public int getTag() {
        return this.tag;
    }

    @Override
    public void setTag(int t) {
        this.tag = t;
    }
}
