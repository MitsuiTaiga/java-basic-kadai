package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {

		Kato_Chapter18 katoT = new KatoTaro_Chapter18();
		Kato_Chapter18 katoI = new KatoIchiro_Chapter18();
		Kato_Chapter18 katoH = new KatoHanako_Chapter18();

		// 太郎の紹介
		katoT.setGivenName();
		katoT.execItroduce();

		// 一郎の紹介
		katoI.setGivenName();
		katoI.execItroduce();

		// 花子の紹介
		katoH.setGivenName();
		katoH.execItroduce();

	}

}
