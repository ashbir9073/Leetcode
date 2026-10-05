
static int Smallest(int[] arr) {
    int smallest = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (smallest > arr[i]) {
            smallest = arr[i];
        }
    }
    return smallest;
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
    int result = Smallest(arr);
    System.out.println("The Smallest number is : " + result);
}