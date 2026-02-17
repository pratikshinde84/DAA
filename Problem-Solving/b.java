public class b {
    public int mySqrt(int x) {
        int start=0,end=x,ans=0;
        while(start<end){
            int mid=start+(end-start)/2;
            int square=mid*mid;
            if(square==x)return mid;
            if(square<x){
                ans=mid;
                end=mid-1;
            }
            else start=mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(new b().mySqrt(8));
    }
}
