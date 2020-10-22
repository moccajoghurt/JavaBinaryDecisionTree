package DecisionTree.TreeVisualizer;

import DecisionTree.BranchNode;
import DecisionTree.TreeNode;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TreeToXMLPrinter {
    public void PrintTreeToXML(TreeNode rootNode) {
        try {
            System.out.println("Printing tree in: " + System.getProperty("user.dir"));
            PrintWriter writer = new PrintWriter("tree.xml");
            writer.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            PrintNode(rootNode, writer);
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    private void PrintNode(TreeNode node, PrintWriter writer) {
        writer.println("<" + node.getClass().getSimpleName() + ">");

        if (!node.IsLeaf()) {
            BranchNode branchNode = (BranchNode)node;
            PrintNode(branchNode.FailureNode(), writer);
            PrintNode(branchNode.SuccessNode(), writer);
        }
        writer.println("</" + node.getClass().getSimpleName() + ">");
    }
}
