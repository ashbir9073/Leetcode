static int Countevenodd(int[] arr){
    int even=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
            even++;
        }
    }
    return even;
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
    System.out.println("Even numbers are: "+Countevenodd(arr));
    System.out.println("Odd numbers are: " + (arr.length - (Countevenodd(arr))));
}
