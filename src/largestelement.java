static int largest(int[] arr) {
    int largest = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (largest < arr[i]) {
            largest = arr[i];
        }
    }
    return largest;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        System.out.print("Enter " + (i+1) + " number : ");
         arr[i] = sc.nextInt();
    }
    int result = largest(arr);
    System.out.println("The largest number is : " + result);
}