import java.util.Arrays;
import java.util.Scanner;
public static int[] RotateArr(int[] arr, int k){
    int temp;
    int start = 0, end = arr.length-1;
    while(start < end){
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
    int i = 0, j = k-1;
    while(i<j){
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
    int a = k;
    int l = arr.length-1;
    while(a<l){
        temp = arr[a];
        arr[a] = arr[l];
        arr[l] = temp;
        a++;
        l--;
    }

    return arr;
}
public static void main(String[] args) {
    System.out.println("Enter the Number of elements: ");
    Scanner Sc = new Scanner(System.in);
    int n = Sc.nextInt();
    int [] array = new int[n];
    for(int i = 0;i < n; i++){
        System.out.println("Enter the Element " + i+ ": ");
        int m = Sc.nextInt();
        array[i] = m;
    }
    System.out.println("Enter the Number of Rotations: ");
    int r = Sc.nextInt();
    r = r % n;

    RotateArr(array,r);
    System.out.println(Arrays.toString(array));
}

