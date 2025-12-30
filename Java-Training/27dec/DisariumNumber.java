public class DisariumNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            int cnt = 0;
            int sum = 0;
            int temp = i;

            while (temp != 0) {
                cnt++;
                temp = temp / 10;
            }
            temp = i;
            while (temp != 0) {
                int dig = temp % 10;
                int prod = 1;
                for (int j = 0; j < cnt; j++) {
                    prod = prod * dig;
                }
                sum += prod;
                cnt--;
                temp /= 10;
            }

            if (sum == i) {
                System.out.println(i+" is a disarium number");
            }
        }
    }
}
