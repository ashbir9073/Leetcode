static int[] Reversearray( int n, int[] arr){
    int i=0; int j=n-1;
    while(i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        i++;
        j--;
    }
    return arr;
}
void main(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        System.out.print("Enter " + (i+1) + " number : ");
        arr[i] = sc.nextInt();
    }
    arr = Reversearray(n,arr);
    System.out.println(Arrays.toString(arr));
}
