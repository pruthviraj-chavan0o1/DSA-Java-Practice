
public class SearchElement {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int search = 3;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == search) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
