import java.util.Scanner;

class TicTacToe
 {
	static char[] board = new char[10];
	static char playerOption,computerOption;
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args)
        {
		getBoard();
		getPlayerChoice();
		currentBoard();
	}

	 static void getBoard() //method for board
         {
		 for (int i = 0; i < 10; i++) 
                 {
			 board[i] = ' ';
		 }
	 }

	 static void getPlayerChoice() //Method to choose the option
         {
		 System.out.print("Choose an Option x or o : ");
		 playerOption = scanner.next().charAt(0);
		 if (playerOption == 'x')
			 computerOption='o';
		 else
			 computerOption ='x';
		 System.out.println("You Selected : " +playerOption);
	 }
	 static void showBoard()//Method for print the board
         {
	        System.out.println("  " + board[1] + "  |  " + board[2]  + "   | " + board[3] + "  ");
	        System.out.println(".....|......|.....");
	        System.out.println("  " + board[4] + "  |  " + board[5]  + "   | " + board[6] + "  ");
	        System.out.println(".....|......|.....");
	        System.out.println("  " + board[7] + "  |  " + board[8]  + "   | " + board[9] + "  ");
	 }
	 private static void currentBoard()
         {
	        int RADIX = 10;
	        System.out.println("\n");
	        for( int i=1; i<10; i++)
                {
	            if (board[i] !='x'&&board[i] !='o')
	                board[i] = Character.forDigit(i, RADIX);
	        }

	        showBoard(); //call showboard method
	  }
}

	
