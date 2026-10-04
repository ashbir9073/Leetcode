static int GCD(int a, int b) {
    if (b == 0) {
        return a;
    }
    return GCD(b, a % b);
}

static int LCM(int a, int b) {
    return (a * b) / GCD(a, b);
}

void main(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number1: ");
    int a = sc.nextInt();
    System.out.println("Enter the number2: ");
    int b = sc.nextInt();

    System.out.println(LCM(a, b));
}