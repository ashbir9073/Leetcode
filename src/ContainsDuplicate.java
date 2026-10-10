public static boolean Duplicate(int[] arr){
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                return true;
            }
        }
    }
    return false;
}
public static void main(String[] args) {
    System.out.println("Enter the Number of elements: ");
    Scanner Sc = new Scanner(System.in);
    int n = Sc.nextInt();
    int [] array = new int[n];
    for(int i = 0;i < n; i++){
        System.out.print("Enter the Element " + (i+1) + ": ");
        int m = Sc.nextInt();
        array[i] = m;
    }
    if(Duplicate(array)){
        System.out.println("Duplicate Element Found!");
    }
    else{
        System.out.println("All Elements are Unique.");
    }

}