
public class CountNumbers {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 0, 0, 0, -1, -2, -3, -4};

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                positive++;
            } 
            else if (arr[i] < 0) {
                negative++;
            } 
            else {
                zero++;
            }
        }

        System.out.println("Positive Numbers: " + positive);
        System.out.println("Negative Numbers: " + negative);
        System.out.println("Zero Numbers: " + zero);
    }
}
