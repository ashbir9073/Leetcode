static boolean CheckPrime(int n) {

    if (n <= 1) return false;
    for (int i = 2; i <= n / 2; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

void main(){
    System.out.println("Enter Number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(CheckPrime(n)){
        System.out.println("Prime Number");
    }
    else{
        System.out.println("Not Prime Number");
    }
}
