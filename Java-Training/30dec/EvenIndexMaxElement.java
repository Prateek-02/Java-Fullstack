public class EvenIndexMaxElement {
    public static void main(String[] args) {
        int arr[] = new int[]{12,21,33,46,58,67};
        int maxi = 0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                if(arr[i] > maxi){
                    maxi = arr[i];
                }
            }
        }
        System.out.println("Maximum element from even indexes is: "+maxi);
    }
}
