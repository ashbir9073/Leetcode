static int factorial(int n) {
    if (n == 1) {
        return 1;
    }
    else{
        return n * factorial(n-1);
    }
}
void main(){
    System.out.println("Enter the number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(factorial(n));
}