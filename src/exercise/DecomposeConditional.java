package exercise;
import java.util.Date;


public class DecomposeConditional {

	class Stadium {
		  private final Date SUMMER_START = new Date(1500);
		  private final Date SUMMER_END = new Date(2500);
		  public double summerRate;
		  public double winterRate;
		  public double winterServiceCharge;
		  public Stadium(double summer, double winter, double service) {
			  this.summerRate = summer;
			  this.winterRate = winter;
			  this.winterServiceCharge = service;
		  }
		  
		  // TODO: change the conditional logic in this method using
		  //       decompose conditional
		  public double getTicketPrice(Date date, int quantity) {
		    if (notSummer(date)) {
		      return winterRate(quantity);
		    }
		    else {
		      return summerRate(quantity);
		    }
		  }

		  public boolean notSummer(Date date) {
			  return date.compareTo(SUMMER_START) < 0 && date.compareTo(SUMMER_END) > 0;
		  }

		  public double summerRate(double quantity) {
			  return quantity * summerRate;
		  }

		  public double winterRate(double quantity) {
			  return quantity * winterRate + winterServiceCharge;
		  }

	}
	public void test() {
		Stadium s = new Stadium(100, 90, 25);
		System.out.println(s.getTicketPrice(new Date(1000), 10));
		System.out.println(s.getTicketPrice(new Date(2000), 10));
		System.out.println(s.getTicketPrice(new Date(3000), 10));
	}
	public static void main(String[] args) {
		new DecomposeConditional().test();
	}

}
