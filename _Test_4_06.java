package cn.it.jindian;


public class _Test_4_06 {

	public TreeNode inorderSucc(TreeNode n){
		if (n == null) {
			return null;
		}
		//找到右子节点，则返回右子树里
		//最左边的节点
		if (n.right != null) {
			return leftMostChild(n.right);
		}
		else{
			TreeNode qNode= n;
			TreeNode xNode= qNode.parent;
			//向上直至位于左边而不是右边
			while(xNode != null && xNode.left != qNode){
				qNode = xNode;
				xNode = xNode.parent;
			}
			return xNode;
		}
	}

	private TreeNode leftMostChild(TreeNode node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return null;
		}
		while(node.left !=null){
			node = node.left;
		}
		return node;
	}
}
