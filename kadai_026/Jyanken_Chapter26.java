package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	public static void main(String[] args) {
		Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();
		jyanken.playGame();
	}

	//自分のじゃんけんの手を入力する
	public String getMyChouce() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		//Scannerクラスの作成
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		//じゃんけんの手が正しいかどうかの判定
		if (input.equals("r") || input.equals("s") || input.equals("p")) {
			scanner.close();
		} else {
			System.out.println("これはじゃんけんの手じゃない");
		}
		//自分のじゃんけんの手を返す
		return input;
	}

	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		String[] ai = { "r", "s", "p" };
		String random = ai[(int) Math.floor(Math.random() * 3)];
		return random;

	}

	//じゃんけんを行う
	public void playGame() {
		HashMap<String, String> type = new HashMap<String, String>();

		//じゃんけんの手の種類
		type.put("r", "グー");
		type.put("s", "チョキ");
		type.put("p", "パー");

		//じゃんけんの手を取得
		String mychoice = getMyChouce();
		String enemy = getRandom();

		//自分と相手のじゃんけんの比較

		System.out.println("自分の手は" + mychoice + "、対戦相手の手は" + enemy);

		if (mychoice.equals(enemy)) {
			System.out.println("あいこです");
		} else if (mychoice.equals("r") && enemy.equals("s") || mychoice.equals("s") && enemy.equals("p")
				|| mychoice.equals("p") && enemy.equals("r")) {
			System.out.println("自分の勝ちです");
		} else if (mychoice.equals("r") && enemy.equals("p") || mychoice.equals("s") && enemy.equals("r")
				|| mychoice.equals("p") && enemy.equals("s")) {
			System.out.println("自分の負けです");
		}
	}

}
