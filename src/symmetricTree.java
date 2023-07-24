import java.util.LinkedList;
import java.util.Queue;

public class symmetricTree {

    public static boolean isSymmetric(Node node) {
        boolean result;
        if(node == null){
            return false;
        }
        else {
            result = isMirror(node.left, node.right);
        }
    return result;
    }

    public static boolean isMirror(Node root1, Node root2){
        if(root1== null && root2 == null){
            return true;
        }else if(root1 == null || root2 == null){
            return false;
        }else{
            return (root1 !=null && root2 !=null)  && isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
        }
    }


}
