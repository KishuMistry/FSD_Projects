import java.util.Scanner;
public class File_Locker_1 {

/**
 * @param args
 * Author:- Kishan Mistry
 * Intern @ Trivium E-Solutions Pvt Ltd
 */
public static void main(String[] args) {
		
		//Author
		for(int design=0;design<100;design++)
		{
			System.out.print("-");
		}
		System.out.println();
		for(int design=0;design<30;design++)
		{
			System.out.print(" ");
		}
		System.out.println("Kishan Mistry");
		
		for(int design=0;design<20;design++)
		{
			System.out.print(" ");
		}
		System.out.print("Intern @ Trivium E-Solutions Pvt Ltd.\n");
		for(int design=0;design<100;design++)
		{
			System.out.print("-");
		}
		//input for user choice
		int choice;
		
		//creating object of scanner class to get the input from user.
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			//Choices for user for file operations.
			System.out.println("\nUser Mannully for File Operations.!");
			for(int design=0;design<100;design++)
			{
				System.out.print("-");
			}
			System.out.println("\nPress 1 to Display List files in Asc order ");
			System.out.println("Press 2 to Delete a file");
			System.out.println("Press 3 to Search a file");
			System.out.println("Press 4 to create a file");
			System.out.println("Press 5 Exit from system");
			for(int design=0;design<100;design++)
			{
				System.out.print("-");
			}
			System.out.print("\nPlease enter your choice : ");
			
			//Choice Input for calculation
			choice = scan.nextInt();
			
			switch(choice) {
				
				case 1:
					
					//List function feature to list all files in ascending order.
					File_Lock_Funtions.get_List_of_Files();
					break;
				
				case 2:
					
					//Input for filename to be deleted
					System.out.print("Enter filename to be deleted: ");
					String fileToBeDeleted = scan.next();
					
					//Function to delete a specific file given by user
					File_Lock_Funtions.to_Delete_file(fileToBeDeleted);
					break;
				
				case 3:
					
					//Input for filename to be searched
					System.out.println("Please enter filename to be searched: ");
					String fileToBeSearched = scan.next();
					
					//Function to search a specific file given by user
					File_Lock_Funtions.to_Search_File(fileToBeSearched);
					break;
				
				case 4:
					
					//Input for filename to be created
					System.out.println("Please enter filename to be created: ");
					String fileToBeCreated = scan.next();
					
					//Function to create a specific file given by user
					File_Lock_Funtions.to_Create_File(fileToBeCreated);
					break;
					
				case 5:
					
					//Releasing scanner resource
					scan.close();
					for(int design=0;design<100;design++)
					{
						System.out.print("*");
					}
					System.out.println("\n Logged Out of System.\n");
					for(int design=0;design<100;design++)
					{
						System.out.print("*");
					}
					System.exit(1);
					break;
				
				default:
					//to handle invalid or default input from user
					for(int design=0;design<100;design++)
					{
						System.out.print("*");
					}
					System.out.println("\nOpps..Incorrect Input..!! Please choose from 1 to 5.\n");
					for(int design=0;design<100;design++)
					{
						System.out.print("*");
					}
					break;			
				
			}		
			
		}
	}

}
