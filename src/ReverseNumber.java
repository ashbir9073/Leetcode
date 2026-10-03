static int ReverseNumber(int a) {
    int rev = 0;
    while(a!=0){
        rev = rev*10 + a%10;
        a = a/10;
    }
    return rev;
}
void main() {
    System.out.println("Enter a number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int rev = (ReverseNumber(n));
    System.out.println(rev);
}
