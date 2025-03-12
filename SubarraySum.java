import java.util.Arrays;

public class SubarraySum {
    public static int[] sumTarget(int[] A, int K) {
        int start = 0, sum = 0;

        for (int end = 0; end < A.length; end++) {
            sum += A[end];

            while (sum > K && start <= end) {
                sum -= A[start++];
            }

            if (sum == K) {
                return new int[] { start, end };
            }
        }

        return new int[] { -1, -1 };
    }

}
