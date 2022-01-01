import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class File_Lock_Funtions {
	
	
	//Method to List files
	protected static void get_List_of_Files() {
		
		int fileCount = 0;
	    ArrayList<String> filenames = new ArrayList<String>();
	
		File directoryPath = new File(System.getProperty("user.dir"));
		File[] listOfFiles = directoryPath.listFiles();
		fileCount = listOfFiles.length;
		
		
		System.out.println("All files: ");
		for (int i = 0; i < fileCount; i++) {
		  if (listOfFiles[i].isFile()) {
		    filenames.add(listOfFiles[i].getName());
		  } 
		}
		
		String[] str = new String[filenames.size()];
		 
	    for (int i = 0; i < filenames.size(); i++) {
	        str[i] = filenames.get(i);
	    }
		
	    String[] sorted_filenames = sort_sub(str, str.length);
		
		for(String currentFile: sorted_filenames) {
			System.out.println(currentFile);
		}

	}
	

	//Using insertion sort method to sort files in asc order.
	protected static String[] sort_sub(String array[], int size){
		String temp = "";
		for(int i=0; i<size; i++){
			for(int j=i+1; j<size; j++){
				if(array[i].compareToIgnoreCase(array[j])>0){
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}
	
	//Method to delete a file
	protected static void to_Delete_file(String fileToBeDeleted) {
		
		File file = new File( (System.getProperty("user.dir") ) + "\\" + fileToBeDeleted );
		
		if(file.exists()) {
			if ( file.delete() ) {
				System.out.println("File deleted successfully!");
			}
		} else {
			System.out.println("Error 404 (Not Found)");
		}
	}
	
	//Method to Search a File
	protected static void to_Search_File(String fileToBeSearched) {
		File file = new File( (System.getProperty("user.dir") ) + "\\" + fileToBeSearched );
		
		// here we will check if the file exists or not.
		//So if the file is there then display a message for it.
		if(file.exists()) {
			System.out.println(" TheFile exits!");
		} else {
			System.out.println("Opps..!!!Error 404 (Not Found)..!!");
		}
	}

	//File creation function
	protected static void to_Create_File (String fileToBeCreated) {
		File file = new File( (System.getProperty("user.dir") ) + "\\" + fileToBeCreated );
		
		try {
			if (file.createNewFile() ) {
				System.out.println(" The File Created!");
			} else {
				System.out.println(" The File already exists :(");
			}
		} catch (IOException ex) {
			
			ex.printStackTrace();
		}
	}

}
