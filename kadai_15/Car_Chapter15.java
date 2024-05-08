package kadai_15;

public class Car_Chapter15 {

	//【フィールド】
	private int gear = 1; //1～5側のギアを表す
	private int speed = 10;//ギアチェンジごの速度を表す

	//【メソッド】
	//ギアの値により速度を変える
	public void gearChange(int afterGear) {
		int beforeGear = this.gear ;
		
		this.gear = afterGear;

		switch (gear) {
		case 1:
			speed = 10;
			break;
		case 2:
			speed = 20;
			break;
		case 3:
			speed = 30;
			break;
		case 4:
			speed = 40;
			break;
		case 5:
			speed = 50;
			break;
		default:
			speed = 10;
			break;
		}

		System.out.println(beforeGear  + "から" + gear + "に切り替えました");
	}

	//ギアチェンジ後の速度を表示する
	public void run() {
		System.out.println("速度は" + speed + "です");
	}

}
