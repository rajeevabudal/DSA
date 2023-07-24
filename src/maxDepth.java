public class maxDepth {
    public static int maxDepthNode(Node root){
        if(root == null){
            return 0;
        }else{
            int leftRoot = maxDepthNode(root.left);
            int rightRoot = maxDepthNode(root.right);

            if(leftRoot>rightRoot)
                return leftRoot + 1;
            else
                return rightRoot + 1;
        }
    }

}
