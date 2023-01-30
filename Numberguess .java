import java.util.Scanner;
public class numberguess
{
public static void
gessing_num_game()
{
	Scanner s=new Scanner(System.in);
	int number;
	number=1+(int)(200*Math.random());
	System.out.println("Enter the number you have to gess");
	number=s.nextInt();
	int k=4;
	int i,guess;
 	System.out.println("Number is choosen:"+" Between 1 to 200"+" Guess the number" +" Within 4 trials");
	for(i=0;i<k;i++)
	{
	System.out.println(" gess the number");
	guess=s.nextInt();
	
	if(number==guess)
	{
	System.out.println("Congratulation...!!"+"You guessed the number");
	break;
	}
	else if(number>guess&&i!=k-i)
	{
	System.out.println("The number is:"+"Greater than:"+guess);
	}
	else if(number<guess&&i!=k-i)
	{
	System.out.println("The number is:"+"less than:"+guess);
	}
}
if(i==k)
{
System.out.println("you have Exhausted"+" k Trials");
System.out.println("The number was:"+number);
}
}
public static void main(String arg[])
  {
	try
	{
	gessing_num_game();
	}
	catch(Exception ex)
	{
	System.out.println("Enter the digit only");
	}
	finally
	{
	System.out.println("THANK YOU....!!");
	}
    }
}
