public class Main {
    public static int countElementsWithGreater(int[] A) {
        int count = 0;
        int n = A.length;

        for (int i = 0; i < n; i++) {
            int x = A[i];
            boolean foundGreater = false;

            for (int j = 0; j < n; j++) {
                if (A[j] > x) {
                    foundGreater = true;
                    break;
                }
            }

            if (foundGreater) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] A1 = {3, 1, 2};
        int[] A2 = {5, 5, 3};

        int output1 = countElementsWithGreater(A1);
        int output2 = countElementsWithGreater(A2);

        System.out.println(output1); // Output: 2
        System.out.println(output2); // Output: 1
    }
}
