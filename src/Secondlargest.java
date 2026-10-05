static int SecLargest(int[] arr){
    int max = arr[0];
    int max2 = arr[0];
    for(int i = 0; i < arr.length; i++){
        if(arr[i] > max){
            max2 = max;
            max = arr[i];
        }
    }
    return max2;
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
    System.out.println("The Second largest Element is: " +SecLargest(arr));
}