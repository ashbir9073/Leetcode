public static void merge(int[] nums1, int m, int[] nums2, int n) {
    for(int i=0; i<n;i++){
        nums1[m] = nums2[i];
        m++;
    }
    Arrays.sort(nums1);
}

//class Solution {
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int i = m - 1;
//        int j = n - 1;
//        int k = m + n - 1;
//
//        for (; j >= 0; k--) {
//            if (i >= 0 && nums1[i] > nums2[j]) {
//                nums1[k] = nums1[i];
//                i--;
//            } else {
//                nums1[k] = nums2[j];
//                j--;
//            }
//        }
//    }
//}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in Array 1: ");
        int p = sc.nextInt();
        System.out.print("Enter the number of elements in Array 2: ");
        int q = sc.nextInt();
        int[] nums1 = new int[p+q];
        int[] nums2 = new int[q];
        for (int i = 0; i < p; i++) {
            System.out.print("Enter Number " + (i+1) + ": ");
            nums1[i] = sc.nextInt();
        }
        System.out.println("Next Array");
        for (int i = 0; i < q; i++) {
            System.out.print("Enter Number " + (i+1) +": ");
            nums2[i] = sc.nextInt();
        }
        merge(nums1,p,nums2,q);
        System.out.println("Merged and Sorted - Array Successfully!");
        System.out.println(Arrays.toString(nums1));
    }