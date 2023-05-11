public class sum {
public static void main(String args[]) {
	        int payPerDay = 350;
	        int finePerDay = 30;
	        int daysWorked = 25;
	        int daysAbsent = 5;

	        int income = (daysWorked * payPerDay) - (daysAbsent * finePerDay);
	        System.out.println(income);
	    }
	}

