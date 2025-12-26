class Q11 {
    public static void main(String[] args) {
        char ch = 'i';
        boolean UC = ch >= 'A' && ch <= 'Z';
        boolean LC = ch >= 'a' && ch <= 'z';
        boolean alp = UC || LC;
        boolean dig = ch >= '0' && ch <= '9';
        boolean UCV = ch == 'A' || ch == 'E' || ch == 'I' ||  ch == 'O' || ch == 'U';
        boolean LCV = ch == 'a' || ch == 'e' || ch == 'i' ||  ch == 'o' || ch == 'u';

        System.out.println(alp ? "Alphabet: "+(UC ? "Uppercase : "+(UCV ? "Vowel":"Consonant") :
            "Lowercase: "+(LCV ? "Vowel" : "Consonant")) : (dig ? "Number" : "Special Character"));
    }
}
