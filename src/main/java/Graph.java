import java.util.ArrayList;
import java.util.List;

class Graph {

    private List<Node> allNodes;

    Graph() {
        this.allNodes = new ArrayList<>();
    }

    List<Node> getAllNodes() {
        return allNodes;
    }

    void setAllNodes(List<Node> allNodes) {
        this.allNodes = allNodes;
    }
}
