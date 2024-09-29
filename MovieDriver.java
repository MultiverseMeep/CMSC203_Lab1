package movieDriver;
import java.util.Scanner;


public class MovieDriver {

	
	public static void main(String[] args){

		
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			
			
			Movie newMovie = new Movie();
		
			System.out.println("Enter the title of a movie: ");
			String movieTitle = input.nextLine();
			
			newMovie.setTitle(movieTitle);
			
			System.out.println("Enter the rating of the movie: ");
			String movieRating = input.nextLine();
			
			newMovie.setRating(movieRating);
			
			System.out.println("Enter the number of tickets sold at your nearest theatre: ");
			int soldTickets = input.nextInt();
			
			newMovie.setSoldTickets(soldTickets);
			
			System.out.println(newMovie.toString());
			
			
			System.out.println("Would you like to enter another? (y/n)");
			input.nextLine();
			String wantContinue = input.nextLine();
			
			if(wantContinue.equals("n"))
			{
				break;
			}
			
		}
		
		
			
		System.out.println("Goodbye");
		
	}
	
}
