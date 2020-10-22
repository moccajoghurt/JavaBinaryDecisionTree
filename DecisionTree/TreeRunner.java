package DecisionTree;

public class TreeRunner {
    public void ExecuteRootNode(TreeNode node) {
        String treeRoute = "";
        while (!node.IsLeaf()) {
            BranchNode branchNode = (BranchNode)node;
            treeRoute += node.getClass().getSimpleName() + " -> ";
            if (branchNode.Success()) {
                node = branchNode.SuccessNode();
            } else {
                node = branchNode.FailureNode();
            }
        }
        LeafNode leafNode = (LeafNode)node;
        leafNode.Execute();

        treeRoute += node.getClass().getSimpleName();
    }
}
