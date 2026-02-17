import java.util.Arrays;

public class streams {
    public static void main(String[] args) {
        int ar[]={1,2,3,4};
        int a[]=Arrays.stream(ar).map(x->x*x).toArray();
    }
}