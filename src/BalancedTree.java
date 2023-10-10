public class BalancedTree {
    public int getHeight(Node root){
        if(root == null){
            return 0;
        }

        return Math.max(getHeight(root.left), getHeight(root.right))+1;
    }
    public boolean isBalanced(Node root) {
        if(root == null){
            return true;
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return Math.abs(leftHeight - rightHeight) <=1 && isBalanced(root.left) && isBalanced(root.right);
    }
}
