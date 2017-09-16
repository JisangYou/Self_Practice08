package c.enums;

//public enum OverTimeValues {
//
//	THREE_HOUR, FIVE_HOUR, WEEKEND_FOUR_HOUR, WEEKEND_EIGHT_HOUR;
//}

public enum OverTimeValues2 {

	THREE_HOUR(18000), FIVE_HOUR(30000), WEEKEND_FOUR_HOUR(18000), WEEKEND_EIGHT_HOUR(18000);
	private final int amount;

	OverTimeValues2(int amount) {
		this.amount = amount;
	}

	public int getAmount() {

		return amount;

	}
}
