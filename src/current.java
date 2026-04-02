public class current {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1};
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j < arr.length; j++) {
                int current = arr[i];
                while (j >= 0 && arr[j] > current) {
                    arr[j + 1] = arr[j];
                    j--;
                    arr[j + 1] = current;
                }
            }

        }
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

