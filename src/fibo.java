static int fibo(int i) {
    if (i == 0) return 0;
    if (i == 1) return 1;
    return fibo(i - 1) + fibo(i - 2);
}
void main(){
    System.out.println("Enter the number of fibonacci series: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
        System.out.print(fibo(i) + " ");
    }
}
