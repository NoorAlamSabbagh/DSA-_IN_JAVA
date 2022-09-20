package FunctionsAndArray;


//Code 1
/*public class ArrayMemory {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {33, 47, 59, 67, 98};
        swap(arr, 0, 4);

        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

 */

//Code 2

public class ArrayMemory {
    public static void main(String[] args) {
        int arr[] = {33, 47, 59, 67, 98};

        int two [] = arr;
        two[2] = 590;

//        for(int i=0; i< arr.length; i++){
//            System.out.print(arr[i] + " ");

        for(int i=0; i< two.length; i++){
            System.out.print(two[i] + " ");
        }
    }
}
