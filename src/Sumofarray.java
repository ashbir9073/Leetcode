static int Sumofarray(int[] arr){
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
        sum += arr[i];
    }
    return sum;
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
    System.out.println("Sum of array elements is : " + Sumofarray(arr));
}
