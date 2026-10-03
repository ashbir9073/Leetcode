void main(){
    System.out.print("Enter a number: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int sum = sumofdigit(n);
    System.out.println(sum);
}

static int  sumofdigit(int n){
    int sum =0, digit=0;
    while(n>0){
        digit = n%10;
        n = n/10;
        sum = sum + digit;
    }
    return sum;
}