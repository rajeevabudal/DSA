public class minDepth {
    public int minDepth(Node root) {
        if(root == null){
            return 0;
        }

        int leftNode =minDepth(root.left);
        int rightNode =minDepth(root.right);

        if(root.left == null){
            return Math.min(Integer.MAX_VALUE, rightNode) + 1;
        }
        else if(root.right == null){
            return Math.min(leftNode, Integer.MAX_VALUE) + 1;
        }
        else return Math.min(leftNode, rightNode)+1;
    }
}
