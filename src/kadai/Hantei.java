package kadai;

public class Hantei {
    Hit hit = new Hit();
    Brow brow = new Brow();
    int hitCount;

    public Hantei() {
        hitCount = 0;
    }

    public void print(Player player,int[] num) {
        System.out.println(player.name + "さんの予想結果");
        System.out.print("HIT :" + hit.hantei(num,player.choice) + "\t"); //browを表示する
        hitCount = hit.hantei(num,player.choice); //hitを保持する
        System.out.println("BROW :" + brow.hantei(num,player.choice) + "\t");
        System.out.println();
    }

    public int getHitCount() {
        return hitCount;
    }
}
