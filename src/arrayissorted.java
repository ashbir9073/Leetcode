static boolean issorted(int[] arr) {
    for(int i = 0; i < arr.length-1; i++){
        if(arr[i] > arr[i+1]){
            return false;
        }
    }
    return true;
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
    if(issorted(arr)){
        System.out.println("This is a Sorted array");
    }
    else
        System.out.println("NOT Sorted array");
}