//27. Remove Element
class Solution{
    public int removeElement(int[] nums, int val) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]== val){
                continue;
            }
            nums[a] = nums[i];
            a=a+1;
        }
        return a;
    }

public static void main(String[] args) {
    int[] nums={3,2,2,3};
    Solution array = new Solution();
    int k = array.removeElement(nums,3);
    System.out.println("k :" + k);
    for (int i = 0; i < k; i++) {
        System.out.print(nums[i] + " ");
        }
    }
}
