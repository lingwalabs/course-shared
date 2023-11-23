package es.cursonoruego.model.enums;

public enum PaymentPlan {

	MONTHS1(0, 1),
	MONTHS1_SESSIONS1(0, 1),
	MONTHS1_SESSIONS4(0, 1),

	MONTHLY_12(0, 1),
	MONTHLY_17(0, 1),
	MONTHLY_19(0, 1),

    MONTHLY_23(23, 7), // A1 in 5 months or more
    MONTHLY_37(37, 11), // A1 in 3 months or more
	MONTHLY_65(65, 17), // A1 in 2 months or more

	MONTHLY_28(0, 1),
	MONTHLY_33(0, 1),
	MONTHLY_34(0, 1),
	MONTHLY_49(0, 1),
	MONTHLY_56(0, 1),
	MONTHLY_98(0, 1);
	
	private int price;
	private int dailyWordsGoal;

	private PaymentPlan(int price, int dailyWordsGoal) {
		this.price = price;
		this.dailyWordsGoal = dailyWordsGoal;
	}

	public int getPrice() {
		return price;
	}

	public int getDailyWordsGoal() {
		return dailyWordsGoal;
	}
}
