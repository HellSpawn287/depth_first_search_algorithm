import java.util.List;
import java.util.Stack;

class DepthFirstSearch {

    private Stack<Node> myStack;

    DepthFirstSearch() {
        this.myStack = new Stack<>();
    }

    void dfs(Graph graph) {
        List<Node> nodeList = graph.getAllNodes();

        for (Node n : nodeList) {
            if (!n.isVisited()) {
                n.setVisited(true);
                dfsStackManipulator(n);
            }
        }
    }

    private void dfsStackManipulator(Node root) {
        this.myStack.push(root);

        root.setVisited(true);
        while (!this.myStack.isEmpty()) {
            Node currentNode = this.myStack.pop();
            System.out.println("Current node: " + currentNode.getElement().toString());

            for (int i = currentNode.getNeighbours().size() -1 ; i >= 0; i--) {
                Node rightNode = currentNode.getNeighbours().get(i);

                if (!rightNode.isVisited()) {
                    rightNode.setVisited(true);

                    this.myStack.push(rightNode);
                }
            }
        }
    }
}
