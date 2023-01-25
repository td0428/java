package zzz_brackjack;

import java.util.ArrayList;
import java.util.Collections;

public class Card {
	ArrayList<Integer> cards = new ArrayList<>();
	int MyTotal;
	int YouTotal;
	int AfterCard;

	//	カードのシャッフル
	public void card() {
		for (int i = 1; i < 14; i++) {
			for (int j = 1; j < 5; j++) {
				cards.add(i);
			}
		}
		Collections.shuffle(cards);
	}
	
//	スタートで自分の手札２枚、相手の手札２枚（うち１枚は伏せた状態:AfterCardに追加）が配られる
	public void start() {
		for (int i = 0; i < 2; i++) {
			myhand();
		}
		youhand();
		if (cards.get(0) > 10) {
			AfterCard += 10;
			cards.remove(0);
		} else {
			AfterCard += cards.get(0);
			cards.remove(0);
		}
	}

//	自分の手札を追加
	public void myhand() {
		if (cards.get(0) > 10) {
			MyTotal += 10;
			cards.remove(0);
		} else {
			MyTotal += cards.get(0);
			cards.remove(0);
		}
	}
	
//	相手の手札を追加
	public void youhand() {
		if (cards.get(0) > 10) {
			YouTotal += 10;
			cards.remove(0);
		} else {
			YouTotal += cards.get(0);
			cards.remove(0);
		}
	}
	public void battle() {
		if(MyTotal>YouTotal) {
			System.out.println("あなた："+MyTotal+"  あいて:"+YouTotal);
			System.out.println("あなたの勝ち");
		}else if(MyTotal<YouTotal) {
			System.out.println("あなた："+MyTotal+"  あいて:"+YouTotal);
			System.out.println("あいての勝ち");
		}else {
			System.out.println("あなた："+MyTotal+"  あいて:"+YouTotal);
			System.out.println("引き分け");
		}
	}
}
