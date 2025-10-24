package kadai;

import java.util.ArrayList;

public class Blow extends Hit {

    @Override
    int hantei(int[] nums, int[] choicenum) {
        int count = 0;
        ArrayList<Integer> brownumber = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == choicenum[j] && !brownumber.contains(choicenum[j])) {
                    brownumber.add(choicenum[j]);
                    count++;
                }
            }
        }
        count = count - super.hantei(nums, choicenum); //BrowからHitを引いている
        return count;
    }
}
