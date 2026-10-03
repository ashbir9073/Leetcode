void main(){
    System.out.println("Enter numbers:");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a:");
    int a = sc.nextInt();
    System.out.print("Enter b:");
    int b = sc.nextInt();
    System.out.print("Enter c:");
    int c = sc.nextInt();

    int largest = numbers(a,b,c);
    System.out.println("The largest number is "+largest);
}

static int numbers(int a, int b, int c){
    if(a>b && a>c){
        return a;
    }
    else if(b>a && b>c){
        return b;
    }
    else
        return c;
}