package zzz_brackjack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Card card = new Card();

		card.card();

		//		ゲームスタート時の自分と相手の手札
		System.out.println("-------------------------------------------");
		card.start();
		System.out.println("自分の場：" + card.MyTotal);
		System.out.println("相手の場：" + card.YouTotal + " ＋ 伏せたカード1枚");

		//		ゲームの進行
		end: while (true) {
			System.out.println("-------------------------------------------");
			System.out.println("続ける場合は「p」,終わる場合は「e」");
			String play = scan.next();

			//			ifで「p」または「e」のみを通す
			if (!(play.equals("p") || play.equals("e"))) {
				System.out.println("エラー：「p」または「e」のみ");
				continue end;

				//			eを選択するとゲーム終了
			} else if (play.equals("e")) {
				break end;
				//				pを選択するとカードを１枚引く
			} else {
				card.myhand();
				System.out.println("自分の場：" + card.MyTotal);
				//				自分のカードが22以上になると負け
				if (card.MyTotal > 21) {
					System.out.println("バースト、あなたの負け");
					System.exit(0);
				}
			}
		}

		//		自分が21以下の場合はここから下に移る

		//		相手の伏せていたカードが開く
		System.out.println("-------------------------------------------");
		System.out.println("伏せているカードオープン");
		card.YouTotal += card.AfterCard;
		System.out.println("相手の場：" + card.YouTotal);

		//		相手のカードが18以上になるまでカードを引く
		while (card.YouTotal < 17) {
			System.out.println("-------------------------------------------");
			System.out.println("相手がカードを引く「キーボードから何か入力してください」");
			String youTarn = scan.next();
			card.youhand();
			System.out.println("相手の場：" + card.YouTotal);
		}

		//		相手のカードが22以上になると相手の負け
		System.out.println("-------------------------------------------");
		if (card.YouTotal > 21) {
			System.out.println("相手がバーストした。あなたの勝ち");
		}
		card.battle();
	}
}
