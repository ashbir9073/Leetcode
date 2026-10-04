static int GCD(int a, int b) {
    if (b == 0) {
        return a;
    }
    return GCD(b, a % b);
}

void main(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number1: ");
    int a = sc.nextInt();
    System.out.println("Enter the number2: ");
    int b = sc.nextInt();

    System.out.println(GCD(a, b));
}