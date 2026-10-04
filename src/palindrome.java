static boolean palindrome(int a) {
    int r = a;
    int rev = 0;
    while (a != 0) {
        rev = rev *10 + a%10;
        a = a/10;
    }
    if (rev == r) {
        return true;
    }
    else
        return false;
}
void main() {
    System.out.println("Enter a number:");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if (palindrome(a)) {
        System.out.println("The given number is palindrome");
    }
    else {
        System.out.println("The given number is not palindrome");
    }

}
