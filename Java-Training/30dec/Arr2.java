public class Arr2 {
    public static void main(String[] args) {
        double arr[] = {1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("----------------------------");

        int arr2[] = {'A','B','C','D'};   //implicit conversion, it accepted the ascii value
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }


    }
}
