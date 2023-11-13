package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {
	
		HashMap<String,String>  humanMap = new HashMap<String,String>();
		
		public void hash1(String[] cool) {
			humanMap.put("apple","りんご");
			humanMap.put("peach", "桃");
			humanMap.put("banana", "バナナ");
			humanMap.put("lemon", "レモン");
			humanMap.put("pear", "梨");
			humanMap.put("kiwi", "キウィ");
			humanMap.put("strawberry", "いちご");
			humanMap.put("grape","ぶどう");
			humanMap.put("muscat", "マスカット");
			humanMap.put("chery", "さくらんぼ");
			
			
			
			//指定したキーが存在するか確認
			//containsKeyメソッドを使用し、指定したキーが存在するか確認
			for(String fruit: cool) {
				if(humanMap.containsKey(fruit)) {
					System.out.println(fruit + "の意味は" + humanMap.get(fruit));
				}else {
					System.out.println(fruit + "は辞書に存在しません");
				}
			}
		}

		

		
		
}
