package tech.nanobyter.coronavirustracker.models;

/**
 * @author {nanobyter}
 * 			www.nanobyter.tech
 * 
 *         created: 2022-07-11
 */
public class LocationStats {

	private String state;
	private String country;
	private int latestTotalCases;
	private int diffFromPreviousDay;
	private int previousDayCases;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getLatestTotalCases() {
		return latestTotalCases;
	}

	public void setLatestTotalCases(int latestTotalCases) {
		this.latestTotalCases = latestTotalCases;
	}

	public int getDiffFromPreviousDay() {
		return diffFromPreviousDay;
	}

	public void setDiffFromPreviousDay(int diffFromPreviousDay) {
		this.diffFromPreviousDay = diffFromPreviousDay;
	}
	
	public int getPreviousDayCases() {
		return previousDayCases;
	}

	public void setPreviousDayCases(int previousDayCases) {
		this.previousDayCases = previousDayCases;
	}
	@Override
	public String toString() {
		return "LocationStats [state=" + state + ", country=" + country + ", latestTotalCases=" + latestTotalCases
				+ "]";
	}
}
