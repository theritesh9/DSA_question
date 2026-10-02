package arrays;

public class Largest_number {
    public static void main(String[] args){
        int arr[] = {2,4,6,7,3,2};
        int Largest = arr[0];
        for(int i = 0; i< arr.length; i++){
            if (arr[i] > Largest ){
                Largest = arr[i];

            }

        }
        System.out.println("this is the largest number " + Largest);
        System.out.println("ritesh kumar ki jai ho ");

    }
}




