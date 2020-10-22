package DecisionTree;

public interface LeafNode extends TreeNode {
    @Override
    default boolean IsLeaf() { return true; }
    void Execute();
}
