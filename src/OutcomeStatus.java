import java.sql.Time;

public class OutcomeStatus {

	private String category;
	private String date;
	
	public OutcomeStatus(String category, String date) {
		this.category = category;
		this.date = date;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCategory() {
		return category;
	}
	public String getDate() {
		return date;
	}
	
	public String toString(){
		return "category: " + category +"\n"+ "date: " + date;
	}

}