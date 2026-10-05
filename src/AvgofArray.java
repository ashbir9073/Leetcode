static int AvgofArray(int[] arr) {
    int sum = 0;
    for(int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    int avg = sum / arr.length;
    return avg;
}

void main(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
        System.out.print("Enter " + (i+1) + " element : ");
        arr[i] = sc.nextInt();
    }
    System.out.println("Average of array is : " + AvgofArray(arr));
}
