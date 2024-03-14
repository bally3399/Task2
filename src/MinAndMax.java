public class MinAndMax {

    public static int[] getMinAndMax(int... array) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int index : array) {
            for (int idx : array) {
                if(idx == index) continue;
                sum += idx;
            }
            if(sum < min) min = sum;
            if(sum > max) max = sum;


            sum = 0;

        }
        return new int[]{min, max};

    }
}
