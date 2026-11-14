
public class EvenOdd1 {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 2, 4, 6, 7, 9, 8};

        int even = 0;
        int odd = 0;

        System.out.println("Even Numbers:");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                even++;
            }
        }

        System.out.println("\nOdd Numbers:");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
                odd++;
            }
        }

        System.out.println("\nEven Count: " + even);
        System.out.println("Odd Count: " + odd);
    }
}
