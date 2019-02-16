

public class Reservation {

	private int stid;
	private int bkid;
	private String doi;
	private boolean checkout;
	
	
	
	public Reservation(int stid , int bkid, String d , boolean ch) {
		
		this.setStid(stid); 
		this.setBkid(bkid);
		this.setDoi(d) ;
		this.setCheckout(ch) ;
		
	}



	public int getStid() {
		return stid;
	}



	public void setStid(int stid) {
		this.stid = stid;
	}



	public int getBkid() {
		return bkid;
	}



	public void setBkid(int bkid) {
		this.bkid = bkid;
	}



	public String getDoi() {
		return doi;
	}



	public void setDoi(String doi) {
		this.doi = doi;
	}



	public boolean isCheckout() {
		return checkout;
	}



	public void setCheckout(boolean checkout) {
		this.checkout = checkout;
	}
	
}
