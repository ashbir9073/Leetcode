int[] moveZeroes(int[] arr){
    for(int i = 0; i < arr.length; i++){
        for(int j = i+1; j < arr.length; j++){
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    return arr;
}

void main(){Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array: ");
    int n = sc.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
        System.out.print("Enter " + (i+1) + " number : ");
        array[i] = sc.nextInt();
    }
    System.out.println(Arrays.toString(moveZeroes(array)));

}