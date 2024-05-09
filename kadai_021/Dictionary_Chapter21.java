package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	public void Words(String word) {
		// 英単語の辞書として機能
		HashMap<String, String> jisyo = new HashMap<>();
		jisyo.put("apple", "りんご");
		jisyo.put("peach", "桃");
		jisyo.put("banana", "バナナ");
		jisyo.put("lemon", "レモン");
		jisyo.put("pear", "梨");
		jisyo.put("kiwi", "キウィ");
		jisyo.put("strawberry", "イチゴ");
		jisyo.put("grape", "ぶどう");
		jisyo.put("muscat", "マスカット");
		jisyo.put("cherry", "さくらんぼ");

		// 英単語が辞書に追加されているかを判定
		if (jisyo.containsKey(word)) {
			System.out.println(word + "の意味は" + jisyo.get(word));
		} else {
			System.out.println(word + "は辞書に含まれていません");
		}
	}
}
