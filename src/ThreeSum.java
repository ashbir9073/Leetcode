public static int[] ThreeSum(int[] arr, int target) {
    int n = arr.length;
    for(int i = 0; i < n ; i++){
        for(int j = i+1; j < n ; j++){
            for(int k = j+1; k < n ;k++){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == target){
                    return new int [] {i,j,k};
                }
            }
        }
    }
    return arr;
}

public static void main(String[] args){
    int [] arr = {1,2,3,4,5,6,7,8,9,10};
    int target = 9;
    int[] result = ThreeSum(arr,target);
    System.out.println(Arrays.toString(result));
}

