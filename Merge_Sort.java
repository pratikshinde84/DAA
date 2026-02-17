import java.util.Arrays;

public class Merge_Sort {
    static int count=0;
    void mergeSort(int ar[],int l,int r){
        if(r>l){
            int mid=(r+l)/2;
            mergeSort(ar, l, mid);
            mergeSort(ar, mid+1, r);
            merge(ar,l,r,mid);   
        }
        count++;
    }
    void merge(int ar[],int l,int r,int mid){
        int i=0,j=0,k=l;
        int left[]=Arrays.copyOfRange(ar,l,mid+1);
        int right[]=Arrays.copyOfRange(ar, mid+1, r+1);

        while(i<left.length&&j<right.length){
            if(left[i]<right[j]){
                ar[k++]=left[i++];
            }else{
                ar[k++]=right[j++];
            }
        }
        while(i<left.length){
            ar[k++]=left[i++];
        }
        while (j<right.length) {
            ar[k++]=right[j++];
        }
    }
    public static void main(String[] args) {
        int arr[]={6,5,4,3,2,1,1,0,0};
        System.out.println(Arrays.toString(arr));
        new Merge_Sort().mergeSort(arr,0,8);
        System.out.println(Arrays.toString(arr));
        System.out.println(new Merge_Sort().count);
    }
}
