package kadai_017;

public class KatoExec_Chapter17 {

	public static void main(String[] args) {
		//インスタンス化
		KatoTaro_Chapter17 taro = new KatoTaro_Chapter17();
		KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17();
		KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17();
		
		//setGivenNameメソッドを実行
		
		taro.setGivenName();
		ichiro.setGivenName();
		hanako.setGivenName();
		
		//exeIntroduceメソッドを実行
		taro.execIntroduce();
		System.out.println();
		ichiro.execIntroduce();
		System.out.println();
		hanako.execIntroduce();
		
	}

}
