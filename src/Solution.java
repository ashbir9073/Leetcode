//Multiply each array element by 10
    static int[] MultiplyArray(int[] arr) {
        int size = arr.length;
        int newArray[] = new int[size];

        for (int i = 0; i < size; i++) {
            int Element = arr[i];
            int newElement = Element * 10;
            newArray[i] = newElement;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = MultiplyArray(arr);
        System.out.println("printing an Array: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

