package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		int userAge = 30;
		int serviceCost;
		
		
		switch(userAge) {
			case 10: serviceCost = 1000;
			break;
			case 20: serviceCost = 2000;
			break;
			case 30: serviceCost = 3000;
			break;
			case 40: serviceCost = 4000;
			break;
			case 50: serviceCost = 5000;
			break;
			case 60: serviceCost = 6000;
			break;
			case 70: serviceCost = 7000;
			break;
			case 80: serviceCost = 8000;
			break;
			case 90: serviceCost = 9000;
			break;
			default: serviceCost = 500;	
			break;
		}
		System.out.println(userAge + "代の料金は" + serviceCost + "円");
		
	}

}
