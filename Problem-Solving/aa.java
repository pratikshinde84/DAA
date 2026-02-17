import java.util.Arrays;
class aa{
    public int aggressiveCows(int[] st, int k) {
        Arrays.sort(st);
        int start=1,n=st.length-1;
        int end=st[n]-st[0];
        int ans=0;
        while(start<=end){
            int mid=(start+end)/2;
            if(canPlace(st,mid,k)){
                ans=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }

    boolean canPlace(int []st,int mid,int k){
        int count=1,last=st[0];
        for(int i=1;i<st.length;i++){
            if(st[i]-last>=mid){
                count++;
                last=st[i];
            }
            if(count>=k)return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(new aa().aggressiveCows(new int[]{1,2,4,8,9},3));
    }
}