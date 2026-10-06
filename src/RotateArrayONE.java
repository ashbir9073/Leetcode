public static int[] LeftRotateArray(int[] array) {
    int Roatate = array[0];
    for(int i = 1; i < array.length; i++){
        array[i-1] = array[i];
    }
    array[array.length-1] = Roatate;
    return array;
}
public static int[] RightRotateArray(int[] array) {
    int last = array[array.length-1];
    for(int i = array.length-1; i >= 1; i--){
        array[i] = array[i-1];
    }
    array[0] = last;
    return array;
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
    System.out.print("Enter 1 for Left Rotate Or 2 for Right Rotate: ");
    int l = sc.nextInt();
    if(l==1){
        System.out.println(Arrays.toString(LeftRotateArray(arr)));
    }
    else if(l==2){
        System.out.println(Arrays.toString(RightRotateArray(arr)));
    }

}
