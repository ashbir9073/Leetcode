static int[] array(int[] array1,int[] array2 ){
    int[] result = new int[array1.length+array2.length];
    int k=0;
    for(int i=0;i<array1.length;i++){
        for(int j=0;j<array2.length;j++){
            if(array1[i]==array2[j]){
                result[k]=array1[i];
                k++;
                break;
            }
        }
    }
    return result;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array-01: ");
    int n = sc.nextInt();
    int[] arr1 = new int[n];

    System.out.println("ARRAY-1");
    for (int i = 0; i < n; i++) {
        System.out.print("Enter " + (i+1) + " number : ");
        arr1[i] = sc.nextInt();
    }

    System.out.print("Enter the number of elements in the array-02: ");
    int p = sc.nextInt();
    int[] arr2 = new int[p];
    System.out.println("ARRAY-2");
    for (int i = 0; i < p; i++) {
        System.out.print("Enter " + (i+1) + " number : ");
        arr2[i] = sc.nextInt();
    }
    int[] result = array(arr1,arr2);
    int count = 0;
    System.out.print("Same Elements are:");
    for (int i = 0; i < result.length; i++) {

        if(result[i] != 0){
            System.out.print("   " + result[i]);
        }
    }
//    System.out.println("Same Elements are: " + (Arrays.toString(array(arr1, arr2))));
}