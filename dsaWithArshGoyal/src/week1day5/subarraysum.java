class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[Math.abs(nums[i])-1]<0){
                ans.add(nums[i]);
            }
            else nums[nums[i]-1]*=-1;
        }
        return ans;
    }

    public static void main(String[] args) {
        for(int i:findDuplicates(new int[]{4,3,2,7,8,2,3,1})){
            System.out.println(i);
        }
    }
}