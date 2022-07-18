package Que13;

public class Movie {
	String movieName;
	String showTime;
	int priceOfTicket;
	String value;
	public Movie() {
		super();
	}
	public Movie(String movieName, String showTime, int priceOfTicket, String value) {
		super();
		this.movieName = movieName;
		this.showTime = showTime;
		this.priceOfTicket = priceOfTicket;
		this.value = value;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getShowTime() {
		return showTime;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	public int getPriceOfTicket() {
		return priceOfTicket;
	}
	public void setPriceOfTicket(int priceOfTicket) {
		this.priceOfTicket = priceOfTicket;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
