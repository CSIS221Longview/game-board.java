<code> testing
import java.security.SecureRandom;

public class gameboard
{
	
	//The five different ships and their lengths.
	private static final int AIRCRAFT_CARRIER = 5;
	private static final int BATTLESHIP = 4;
	private static final int DESTROYER = 3;
	private static final int SUBMARINE = 3;
	private static final int PATROL = 2;
	
	//Array of ships
	private static final int[] SHIPS = {AIRCRAFT_CARRIER, BATTLESHIP, DESTROYER, SUBMARINE, PATROL};
	
	//variables
	private static String[][] beginner = new String[6][6]; //6x6 (beginner)
	private static String[][] standard = new String[9][9]; //9x9 (standard)
	private static String[][] advanced = new String[12][12]; //12x12 (advanced)
	private static SecureRandom rand = new SecureRandom();
	
	//constructor
	public gameboard(int[] SHIPS, String[][] beginner, String[][] standard, String[][] advanced)
	{
		this.beginner = beginner;
		this.standard = standard;
		this.advanced = advanced;
	}
	
	//ship names
	private String shipName()
	{
		
	}
	
	//create Beginner board
	public static void setBeginnerBoard()
	{
 	 for (int r = 0; r < board1.length; r++)
		{
			for (int c = 0; c < board1[0].length; c++)
			{	
				board1[r][c] = "~ ";
				System.out.print(board1[r][c]);
			}
			System.out.println();
		}
	}
	
	//get Beginner board 
	public getBeginnerBoard()
	{
	}
	
	//create Standard board
	public static void setStandardBoard()
	{
	}
	
	
	//get Standard board
	public getStandardBoard()
	{
	}
	
	//create Advanced board
	public static void setAdvancedBoard()
	{
	}
	
	//get Advanced board
	public getAdvancedBoard()
	{
	}

	//select difficulty level (beginner, standard, or advanced)
	public boolean difficultyLevel()
	{
	}
	
	//Randomly place ships on grid
	public placeShips()
	{
	}
}</code>
