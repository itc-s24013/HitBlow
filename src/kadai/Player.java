package kadai;

import java.util.Scanner;

public class Player {
    String  name;
    int[] choice;
    Scanner scan = new Scanner(System.in);
    int hitCount;
    public Player(String name) {
        this.name = name;
        this.choice = new int[4];
        this.hitCount = 0;
    }

    public void yosou() {
        for(int i = 0; i < choice.length; i++) {
            System.out.print(name + "さん" + (i+1) + "つ目の数字を予想してください :");
            choice[i] = scan.nextInt();
        }
        System.out.println();
    }

    public int[] getChoice() {
        return choice;
    }

    public void print(int[] num) {
        Hit hit = new Hit();
        Blow blow = new Blow();
        System.out.println(name + "さんの予想結果");
        System.out.print("HIT :" + hit.hantei(num,choice) + "\t"); //browを表示する
        hitCount = hit.hantei(num,choice); //hitを保持する
        System.out.println("BROW :" + blow.hantei(num,choice) + "\t");
        System.out.println();
    }

    public int getHitCount() {
        return hitCount;
    }
}
