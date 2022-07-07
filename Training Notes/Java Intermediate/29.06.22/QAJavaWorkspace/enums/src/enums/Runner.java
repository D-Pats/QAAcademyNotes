package enums;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ukAreaM2 = Double.parseDouble("1000");
		double ukAreaCM2 = ukAreaM2*Country.UK.areaSmallerIncrement(100);
		System.out.println(ukAreaM2);
		System.out.println(ukAreaCM2);
		
		System.out.println(Country.GERMANY.getLanguage());
		
//		Iterator		
        for(Country c : Country.values()) {
            System.out.print(c + "\n");
        }
		
		for(Country c : Country.values()) {
            System.out.printf("Your area for %s is %f in cm^2\n", c, c.areaSmallerIncrement(100));
        }
	}

}
