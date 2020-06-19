package LeetCodeProblems;

public class PivoteIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution sc = new Solution();
		int[] nums= new int[] {1,7,3,6,5,6};
		sc.pivotIndex(nums);
	}
}
class Solution {
    public int pivotIndex(int[] nums) {
        int left_sum =0;
        int total_sum=0;
        for( int i=0 ; i < nums.length ; i++){
            total_sum +=nums[i];
        }
        System.out.println(total_sum);
        for( int j=0 ; j < nums.length ; j++){
            if(j!=0) left_sum +=nums[j-1];
            if(total_sum-left_sum-nums[j]==left_sum)
                return j;
        }
        return -1;
    }
}