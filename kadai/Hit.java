package kadai_version2.kadai;

public class Hit {
    int hantei(int[] nums, int[] choicenum) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == choicenum[i]) {
                count++;
            }
        }
        return count;
    }
}
