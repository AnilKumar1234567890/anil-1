public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 4, 9,4, 8};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
                System.out.println("sorted array");
        for(int num:arr){
            System.out.print(num+" ");
            }
        }
    }



