package kadai_017;

public class KatoExec_Chapter17 {

	public static void main(String[] args) {
		//インスタンス化
		Kato_Chapter17 taro = new KatoTaro_Chapter17();
		Kato_Chapter17 ichiro = new KatoIchiro_Chapter17();
		Kato_Chapter17 hanako = new KatoHanako_Chapter17();
		
		//setGivenNameメソッドを実行
		taro.setGivenName("太郎");
		ichiro.setGivenName("一郎");
		hanako.setGivenName("花子");
		
		//exeIntroduceメソッドを実行
		taro.execIntroduce();
		System.out.println();
		ichiro.execIntroduce();
		System.out.println();
		hanako.execIntroduce();
		
	}

}
