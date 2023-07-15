public class inorder {

    static class Node{
        int data;
        Node left, right;

        Node(int v){
            data = v;
            left = right = null;
        }
    }

    public static void printInOrder(Node node){
        if(node == null){
            return;
        }
        printInOrder(node.left);
        System.out.print("In Order data = "+node.data + " ");
        printInOrder(node.right);
    }

}
