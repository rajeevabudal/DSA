public class preOrder {
    public static void preorder(Node node){
        if(node == null){
            System.out.print("Null");
            return;
        }

        System.out.println(node.data);
        preorder(node.left);
        preorder(node.right);
    }

}
