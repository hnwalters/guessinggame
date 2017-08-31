//Hayden N. Walters
import java.util.Scanner;

public class guessinggame
{
	static String insult()
	{
		String insult="";
			
		int random = (int)(1 + 4*Math.random());
		//System.out.println(random);
			
		if(random==1)
		{
			insult=("It isn't that hard you cretin!");
		}
		if(random==2)
		{
			insult=("You can't actually be this stupid!");
		}
		if(random==3)
		{
			insult=("Jesus Christ that was your guess, really!");
		}
		if(random==4)
		{
			insult=("I mean holy guacomole it really isn't that difficult!");
		}
		if(random==5)
		{
			insult=("Good Lord, are you even trying!?");
		}
		return insult;
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
		
		Scanner cin = new Scanner(System.in);
		
		int guess; 
		int random = (int)(1 + 100*Math.random());
		
		
		while(true)
		{
			guess=cin.nextInt();
			
			
			
			if(guess<random || guess>random)
			{	
				if(guess<random)
				{
					System.out.println("Sorry but the number I'm thinking of isn't " + guess + ", try something higher."+ insult());
				}
				if(guess>random)
				{
					System.out.println("Sorry but the number I'm thinking of isn't " + guess + ", try something smaller." + insult());
				}
			}	
			if(guess==random)
			{
				System.out.println("You Win!");
				break;
			}
			
		}	
		cin.close();
	}
}    
		

