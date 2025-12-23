public class ProductOfOddAlphabet {
    public static void main(String[] args) {
        long product = 1;
        for(int ch = 'A';ch <= 'Z' ;ch++){
            if(ch%2 != 0){
                product *= ch;
            }
        }
        System.out.println(product);

        long product1 = 1;
        for(int ch='a';ch <='z';ch++){
            if(ch%2 != 0){
                product1 *= ch;
            }
        }
        System.out.println(product1);

    }
}
