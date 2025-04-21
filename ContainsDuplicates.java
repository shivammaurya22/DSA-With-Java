
import java.util.HashSet;

public class ContainsDuplicates {

    public boolean containDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
    public static void main(String[] args) {
        // main method
        int[] nums = {1,2,3,4};
        ContainsDuplicates obj = new ContainsDuplicates();
        boolean result = obj.containDuplicate(nums);
        System.out.println(result);
    }
}
