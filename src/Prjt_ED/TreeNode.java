package Prjt_ED;

public class TreeNode {

private TreeNode leftNode;
	
	private TreeNode rightNode;
	
	private char data;
	
	public TreeNode(TreeNode leftNode, TreeNode rightNode, char data) {
		setLeftNode(leftNode);
		setRightNode(rightNode);
		setData(data );
	}
	
	public char getData() {
		return data;
	}

	public void setData(char data) {
		this.data = data;
	}

	public TreeNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}

	public TreeNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}
}
