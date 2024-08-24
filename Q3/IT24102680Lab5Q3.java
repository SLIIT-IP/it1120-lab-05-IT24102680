import java.util.Scanner;

public class IT24102680Lab5Q3
{
  public static void main(String[] args)
  {
	Scanner input=new Scanner(System.in);

	final double CHARGES_PER_DAY=48000.0;
	final double DISCOUNT_3_OR_4_DAYS = 0.1;
	final double DISCOUNT_5_OR_MORE_DAYS = 0.2;

	int startDate , endDate , daysReserved;
	double discountRate = 0;
	double totalAmount , discount , amountToBePaid;

	System.out.print("Enter the start date(1-31): ");
	startDate = input.nextInt();

	System.out.print("Enter the end date(1-31): ");
	endDate = input.nextInt();
	
	if(startDate < 1 || startDate > 31)
	  {
		System.out.print("Error: Days must be between 1 and 31");
	   return;
	  }

	if(endDate < 1 || endDate > 31)
	  {
		System.out.print("Error: Days must be between 1 and 31");
	   return;
	  }
	

	if(startDate > endDate)
	  {
		System.out.print("Error: Start Date must be less than End Date");
	   return;
	  }
	

	daysReserved = endDate - startDate;

	if(daysReserved >= 3 && daysReserved <= 4)
	  {
		discountRate = DISCOUNT_3_OR_4_DAYS;
	  }
	else if(daysReserved >= 5)
	  {
		discountRate = DISCOUNT_5_OR_MORE_DAYS;
	  }
	
	totalAmount = CHARGES_PER_DAY * daysReserved;
	discount = totalAmount * discountRate;
	amountToBePaid = totalAmount - discount;

	System.out.println("Room Charges Per Day: " +CHARGES_PER_DAY +"/=");
	System.out.println("Number Of Days Reserved: " +daysReserved);
	System.out.println("Total Amount To Be Paid: " +amountToBePaid);

  }
}








