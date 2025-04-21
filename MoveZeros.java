public class MoveZeros {

    public static void MoveZero(int[] nums){
        // two pointers approach
        int lastNonZero = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[lastNonZero];
                nums[lastNonZero] = temp;
                lastNonZero++;
            }
        }
        
    }
    public static void main(String[] args) {
        int[] nums = {0,0,2,4,6,8,9};
        MoveZero(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}
