public class HappyNumber {
    public static void main(String[] args) {
        int cnt = 0;
        for(int i=1;i<=500;i++){
            int num = solve(i);
            if(num == 1){
                cnt++;
                System.out.println(i+" is a happy number");
            }
        }
        System.out.println("Total count is: "+cnt);
    }

    public static int solve(int n) {
       
        while(n!=1 && n!=4){
            int sum = 0;
            while(n != 0){
                int digit = n%10;
                sum += digit * digit;
                n = n/10;
            } 
            n = sum;
        }
        return n;
    }   


}
