public class arrayTObst {
    public static Node sortedArrayToBST(int[] nums) {
        return convertArrayToBST(nums, 0, nums.length -1);
    }

    public static Node convertArrayToBST(int[] arr, int start, int end){
        if(start > end){
            return null;
        }

        int mid = (start + end) /2;

        Node node = new Node(arr[mid]);

        node.left = convertArrayToBST(arr, start, mid-1);
        node.right = convertArrayToBST(arr, mid+1, end);

        return node;
    }
}
