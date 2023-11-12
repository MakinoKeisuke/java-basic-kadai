package kadai_017;

abstract public class Kato_Chapter17 {
	public String familyName = "加藤";
	public String givenName = "";
	public String address = "東京都中野区〇×";
	
	
	//共通紹介
	public void commonlntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName +"です");
		System.out.println("住所は" + this.address + "です");
	}
	//抽象メソッド
	abstract void eachIntroduce();
	//紹介実行
	public void execIntroduce() {
		commonlntroduce();
		eachIntroduce();
	}
	 
	
}
