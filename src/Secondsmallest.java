static int SecMin(int[] arr){
    int min = arr[0];
    int min2 = arr[1];
    for(int i = 0; i < arr.length; i++){
        if(arr[i] < min){
            min2 = min;
            min = arr[i];
        }
    }
    return min2;
}
void main(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of Elements: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
        System.out.print("Enter number "+(i+1)+" : ");
        arr[i] = sc.nextInt();
    }
    System.out.println("The Second Minimum Element is: " + SecMin(arr));
}
