import java.util.Scanner;
public class IT24102680Lab5Q2
{
  public static void main(String[] args)
  {
	Scanner input=new Scanner(System.in);
	int noOfmembers;
	System.out.print("Enter the number of new members introduced: ");
	noOfmembers=input.nextInt();

	if(noOfmembers<0)
	{
	System.out.print("Input must be a number 0 or greater");
	}

	else
	{
	switch(noOfmembers)
	 {
	  case 0:System.out.print("No prize");
	 	 break;
	  case 1:System.out.print("Prize is a : Bag");
	 	 break;
	  case 2:System.out.print("Prize is a : Pen");
	  	 break;
	  case 3:System.out.print("Prize is a : Umbrella");
	  	 break;
	  case 4:System.out.print("Prize is a : Travelling Chair");
	 	 break;
	  default:System.out.print("Prize is a : Headphone");	
	 }

	}
  }
}