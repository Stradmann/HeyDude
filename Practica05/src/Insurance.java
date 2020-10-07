
public class Insurance {
	
	private String owner;
	private Date startDate;
	private Date endDate;
	
	public Insurance (Person owner, int year, int month, int day) {
		
		this.owner = owner.getName();
		this.startDate = new Date(year, month, day);
		this.endDate = new Date(year + 3, month, day);
	}
	
	public Date getEndDate() {
		
		return this.endDate;
	}
	
	public boolean isValid(Date date) {
		
		if (date.isEarlier(endDate, date) && date.isLater(startDate, date)) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString () {
		
		return owner + ": Valid from " + startDate + " to " + endDate;
	}
}
