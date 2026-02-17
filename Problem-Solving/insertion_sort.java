import java.util.Random;

public class insertion_sort {
    void sort(int arr[]){
        long start=System.nanoTime();
        int n=arr.length;
        int shift=0;
        for(int i=1;i<n;i++){
            int j=i-1,key=arr[i];
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                shift++;
                j--;
            }
            arr[j+1]=key;
        }
        long end=System.nanoTime();
        System.out.println("Total shifts are=>"+shift);
        System.out.println("TIME TAKEN FOR THIS IS:"+((end-start)));
    }
    public static void main(String[] args) {
        Random random=new Random();
        int arr[]=new int[1000];
        int ar[]=new int[1000];
        int a[]=new int[1000];
        int j=0;
        for(int i=999;i>=0;i--){
            ar[j++]=i;
        }
        for(int i=0;i<1000;i++){
            a[i]=i;
        }
        for(int i=0;i<1000;i++){
            arr[i]=random.nextInt(1000-1+1)+1;
        }
        System.out.println("1000 random elements->");
        new insertion_sort().sort(arr);
        // System.out.println(Arrays.toString(arr));
        System.out.println("\n\n1000 unsorted elements->");
        new insertion_sort().sort(ar);
        // System.out.println(Arrays.toString(ar));
        System.out.println("\n\n1000 sorted elements->");
        new insertion_sort().sort(a);
        // System.out.println(Arrays.toString(a));
    }
}