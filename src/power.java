void main(String[] args) {
        int base = 3;
        int exponent = 4;
        long result = 1;

        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }
        System.out.println("Answer = " + result);
}

