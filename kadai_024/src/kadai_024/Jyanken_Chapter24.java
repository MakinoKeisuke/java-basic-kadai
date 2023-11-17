package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	 
	public String getMyChoice() {
		//入力メソッド
		Scanner scanner =  new Scanner(System.in);
		String choice;
		
		while(true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpをを入力しましょう");
			choice = scanner.next();
			if(choice.equals("r") || choice.equals("s") || choice.equals("p")) {
				break;
			}else {
				System.out.println("エラーです。再度入力してください");
			}
			
		}
		scanner.close();
		return choice;
		
			
	}
		//乱数メソッド
	public String getRandom() {
		String[] janken = {"r","s","p"};
		String j = janken[(int)Math.floor(Math.random() * 3)];
		return j;
	}
		//じゃんけんをする
	
	public void playGame() {
		String b = getMyChoice();
		String d = getRandom();
		HashMap<String, String> game = new HashMap<String,String>();
		game.put("r", "グー");
		game.put("s", "チョキ");
		game.put("p", "パー");
		
		System.out.println("自分の手は" + game.get(b) + "、対戦相手の手は" + game.get(d));
		
		if(b.equals(d)) {
			System.out.println("あいこです");
		}else if((b.equals("r") && d.equals("s")) || (b.equals("s") && d.equals("p")) || (b.equals("p") && d.equals("r"))){
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
	}
	
	
	
}
