package kadai;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    ArrayList<Player> players;
    Hantei hantei;
    Create_number create_number = new Create_number();
    int[] num ;
    public Game() {
        players = new ArrayList<>();
        hantei = new Hantei();
        num = create_number.create();
    }

    public void play() {
        Scanner in = new Scanner(System.in);
        while (true) {
            String input = in.nextLine();
            if(input.equals("exit")) {
                break;
            }
            players.add(new Player(input));
        }
        while(true) {
            ArrayList<Integer> hitCounts = new ArrayList<>();
            for (Player player : players) { //全員が予想する
                player.yosou();
            }
            for(Player player : players) { //判定結果を出力し、hitの数をリストに入れる
                player.print(num);
                hitCounts.add(player.getHitCount());
            }
            if(hitCounts.contains(4)) {
                int count = 0;
                for(int i = 0; i < players.size(); i++) {
                    if(count == players.size()){
                        System.out.println("引き分け");
                    }
                    else if(hitCounts.get(i) == 4){
                        System.out.println(players.get(i).name + "さんがクリアしました");
                        count++;
                    }
                }
                break;
            }
        }
    }
}