public class inorder {
    public static void printInOrder(Node node){
        if(node == null){
            return;
        }
        printInOrder(node.left);
        System.out.print("In Order data = "+node.data + " ");
        printInOrder(node.right);
    }

}
