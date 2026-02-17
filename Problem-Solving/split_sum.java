import java.util.Arrays;

class split_sum{
    public int splitArray(int[] nums, int k) {
        if(k>nums.length)return -1;
        int low=Arrays.stream(nums).max().getAsInt();
        int high=Arrays.stream(nums).sum();
        while(low<=high){
            int mid=(low+high)/2;
            if(getSum(nums,mid)>k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
    public int getSum(int nums[],int mid){
        int count=1,sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]>mid){
                count++;
                sum=nums[i];
            }else{
                sum+=nums[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(new split_sum().splitArray(new int[]{7,2,5,10,8}, 2));
    }
}