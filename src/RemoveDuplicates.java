int removedup(int[] arr){
    int i=0;
    for(int j=1;j<arr.length;j++){
        if(arr[j] != arr[i]){
            i = i+1;
            arr[i] = arr[j];
        }
    }
    return i+1;
}

void main(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array: ");
    int n = sc.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
        System.out.print("Enter " + (i+1) + " number : ");
        array[i] = sc.nextInt();
    }
    int k = removedup(array);
    for(int i=0;i<k;i++) {
        System.out.println(array[i]);
    }

}