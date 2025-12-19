package operators;

public class checkVowelConsonants {
    public static void main(String[] args) {
        char ch = 'a';
        String res = ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ? "Vowel" : "Consonant";
        System.out.println(res) ;
    }
}
