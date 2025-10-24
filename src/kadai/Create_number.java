package kadai;

import java.util.Random;

public class Create_number {
    public int[] create() {
        int count = 0;
        Random rand = new Random();
        int[] num = new int[4];
        while (count != 4) {
            count = 0;
            for (int i = 0; i < num.length; i++) {
                num[i] = rand.nextInt(10);
            }
            if (num[0] != num[1] && num[0] != num[2] && num[0] != num[3]) {
                count++;
            }
            if (num[1] != num[0] && num[1] != num[2] && num[1] != num[3]) {
                count++;
            }
            if (num[2] != num[0] && num[2] != num[1] && num[2] != num[3]) {
                count++;
            }
            if (num[3] != num[0] && num[3] != num[1] && num[3] != num[2]) {
                count++;
            }
        }
        return num;
    }
}
