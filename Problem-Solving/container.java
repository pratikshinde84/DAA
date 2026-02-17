import java.util.Arrays;

public class container {
    public int shipWithinDays(int[] weights, int k) {
    int start = Arrays.stream(weights).max().getAsInt(); // minimum possible capacity
    int end = Arrays.stream(weights).sum();              // maximum possible capacity

    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (get(weights, mid) > k) {
            start = mid + 1;   // capacity too small
        } else {
            end = mid - 1;     // capacity works, try smaller
        }
    }
    return start;
}

int get(int[] ar, int cap) {
    int days = 1;
    int sum = 0;

    for (int w : ar) {
        if (sum + w > cap) {
            days++;
            sum = w;
        } else {
            sum += w;
        }
    }
    return days;
}

    public static void main(String[] args) {
        System.out.println(new container().shipWithinDays(new int[]{1,2,3,1,1},4));
    }
}
