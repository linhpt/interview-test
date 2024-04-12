package vn.test.interview;

public class Problem3 {

    public static void main(String[] args) {
        int[] A = {1, 3, 2, 4, 5};

        int count = countTriplet(A);
        System.out.println("total: " + count);
    }

    public static int countTriplet(int[] givenArray) {
        int n = givenArray.length;
        if (n < 3) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (givenArray[i] < givenArray[j]
                            && givenArray[j] < givenArray[k]) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
