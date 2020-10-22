package DecisionTree;

public interface BranchNode extends TreeNode {
    @Override
    default boolean IsLeaf() { return false; }
    boolean Success();
    TreeNode SuccessNode();
    TreeNode FailureNode();
}
