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
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
        System.out.print("Enter " + i + " element : ");
        arr[i] = sc.nextInt();
    }
    System.out.print("Enter the Target: ");
    int sum = sc.nextInt();
    System.out.println(Arrays.toString(ThreeSum(arr, sum)));


}

