package ro.ase.csie.cts.week2.profit;

public interface Profitable {
	public static final float MAX_INTEREST_PERCENT = 5;
	public abstract void addInterest(float interestPercent);
}
