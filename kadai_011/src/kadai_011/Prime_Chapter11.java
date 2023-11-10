package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		boolean[] sosu = new boolean[101];
		
		for(int i = 0; i < sosu.length; i++) {
			sosu[i] = true;
		}
		
		int number = 2;
		while(number < sosu.length) {
			for(int i = number + 1; i < sosu.length; i++) {
				if(i % number == 0) {
					sosu[i] = false;
					continue;
				}
			}
			number += 1;
		}
		for(int i = 2; i < sosu.length; i++) {
			if(sosu[i]) {
				System.out.println(i);
			}
		}

	}

}
