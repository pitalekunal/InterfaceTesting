package Reader;
import java.io.*;

public class FileReader {

	public static void main(String args[])
  {
		try{
			
		  // Open the file that is the first 
		  // command line parameter
		  FileInputStream fstream = new FileInputStream("C:/Users/kpitale/workspace/InterfaceTest/Files/Prizma_GSDB_074.txt");
		  FileInputStream ffstream = new FileInputStream("C:/Users/kpitale/workspace/InterfaceTest/Files/Prizma_GSDB_074.txt");
			 
		  // Get the object of DataInputStream
		  DataInputStream in = new DataInputStream(fstream);
		  DataInputStream inn = new DataInputStream(ffstream);
		  BufferedReader brr = new BufferedReader(new InputStreamReader(inn));
		  BufferedReader br = new BufferedReader(new InputStreamReader(in));
		  String strLine;
		  String[] read_values;
   		  int r = 0, row_counter = 0;
   		  
   		 while ((brr.readLine()) != null)   {
   			 row_counter++;
   		 }
   		 inn.close();
   		 System.out.println(row_counter);
   		
   		  String[][] values = new String [row_counter][28];
   		
		  //Read File Line By Line
		  while ((strLine = br.readLine()) != null)   {

   			  	// Print the content on the console			  
		  		read_values = strLine.split("\\|");

		  		System.out.println(strLine);
		  		 
		  		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

			  		for(int i = 0; i < read_values.length; i++){			  			
			  			System.out.println(read_values[i]);
			  				values[r][i] = read_values[i];
			   			}
	  					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");	
	  					r++;	
	   				  }
		  			
		  	System.out.println("Number of Rows = " + (row_counter-2));
		  	
		  	
			for(int i = 1; i < (r-1); i++){
				for(int j = 0; j < 28; j++){
					System.out.print(values[i][j]);
				}
				System.out.println();
				System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
			}
			
		  	//Close the input stream
		  	in.close();
			
			}catch (Exception e){//Catch exception if any
		
		System.err.println("Error: " + e.getMessage());
		}
  }
}


