static int Linearsearch(int[] arr, int k){
    for(int i = 0; i < arr.length; i++){
        if(arr[i] == k){
            return i;
        }
    }
    return -1;
}

public static void main(String[] args){
    System.out.println("Enter the number of elements: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < arr.length; i++){
        System.out.print("Enter the number " + (i+1) + " : ");
        arr[i] = sc.nextInt();
    }
    System.out.print("Enter the Key: ");
    int key = sc.nextInt();
    if(Linearsearch(arr,key) == -1){
        System.out.println("Key not found");
    }
    else {
        int found = Linearsearch(arr, key);
        System.out.println("Key found in position: " + (found + 1));
    }
}
