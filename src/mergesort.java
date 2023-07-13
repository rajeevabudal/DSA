public class mergesort {
    public static void print(int [] array){
        for(int element: array){
            System.out.print(element + " ");
        }

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m + n - 1;
        while(k>=0){
            if(i>=0 && j>=0){
                if(nums1[i] >=nums2[j]){
                    nums1[k--] = nums1[i--];
                }else{
                    nums1[k--] = nums2[j--];
                }
            }
            else if(j>=0){
                nums1[k--] = nums2[j--];
            }else{
                break;
            }
        }
        print(nums1);
    }

}
