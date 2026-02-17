import java.util.Arrays;

public class koko_eating_banana {
    public int minEatingSpeed(int[] piles, int h) {
        int start=1,end=Arrays.stream(piles).max().getAsInt(),ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(get(piles,mid)>h){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start;
        //correct the code of the above function
    }
    int get(int []piles,int mid){
        int count=0;
        for(int i:piles){
            count+=Math.ceil((double)i/mid);
        }
        return count;
    }
    public static void main(String[] args) {
        new koko_eating_banana().minEatingSpeed(new int[]{3,6,7,11},8);
    }
}
