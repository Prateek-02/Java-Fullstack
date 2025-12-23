public class EvenAlphabet {
    public static void main(String[] args) {

        //uppercase
        System.out.print("Uppercase: ");
        for(int ch='A';ch<='Z';ch++){
            if(ch%2==0){
                System.out.print((char)ch +" ");
            }
        }
        System.out.println();
        //lowercase
        System.out.print("Lowercase: ");
        for(int ch='a';ch <= 'z';ch++){
            if(ch%2==0){
                System.out.print((char)ch +" ");
            }
        }

        
    }
}
