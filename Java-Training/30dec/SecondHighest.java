public class SecondHighest {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6};
        int maxi = 0;
        int secMaxi = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > maxi){
                maxi = arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] > secMaxi && arr[i] != maxi){
                secMaxi = arr[i];
            }
        }

        System.out.println("Second Maixmum Element is: "+secMaxi);
    }
}
