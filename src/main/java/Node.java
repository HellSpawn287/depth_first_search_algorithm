import java.util.ArrayList;
import java.util.List;

public class Node {

    private Object element;
    private boolean visited;
    private List<Node> neighbours;

    public Node(Object element) {
        this.element = element;
        this.neighbours = new ArrayList<>();
    }

    Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    boolean isVisited() {
        return this.visited;
    }

    void setVisited(boolean status) {
        this.visited = status;
    }

    List<Node> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<Node> neighbours) {
        this.neighbours = neighbours;
    }

    void addNeighbour(Node neighbour) {
        this.neighbours.add(neighbour);
    }
}
