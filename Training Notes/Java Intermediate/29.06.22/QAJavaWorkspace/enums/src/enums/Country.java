package enums;

public enum Country {
	UK("English", 40284.64, 243610),
	SPAIN("Spanish", 27057.16, 505990),
	FRANCE("France", 38625.07, 543940),
	USA("English", 63543.58, 9834000),
	GERMANY("German", 45723.64, 357588);
	
	private final String language;
	private final double gdpcapita;
	private final double areakm2;
	
	private Country(String language, double gdpcapitausd, double areakm2) {
		this.language = language;
		this.gdpcapita = gdpcapitausd;
		this.areakm2 = areakm2;
	}
	
    public static final double AREA_CONVERSION = 1000;

    public double areaMeters() {
        return AREA_CONVERSION * areakm2;
    }

    public double areaSmallerIncrement(double conversionNumber) {
        return conversionNumber * areaMeters();
    }

	public String getLanguage() {
		return language;
	}

	public double getGdpcapita() {
		return gdpcapita;
	}

	public double getAreakm2() {
		return areakm2;
	}
	
}
