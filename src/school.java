import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.*;

class school{
	
	String name;
	String rollno;
	
	//This Function will add new txt files in a new directory and will also display files
	void addstudents(String str,String path){
		str=path+str;
		FileWriter fw1=null;;  
		try { 
			fw1=new FileWriter(str);
			BufferedWriter bf= new BufferedWriter(fw1);
			System.out.println("Please enter the name of the student:");		
			Scanner input1= new Scanner (System.in);
			name=input1.nextLine();
			bf.write("Name: "+name);
			System.out.println("Please enter the roll no:");
			Scanner input2=new Scanner(System.in);
			rollno=input2.nextLine();
			bf.write("Roll No: "+rollno);
			bf.close();
			input1.close();
			input2.close();
		}catch(IOException e){
			e.printStackTrace();
		}finally {if (fw1 != null) {
	        try {
	            fw1.close();
	           
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        }
		    listdirectoryorfiles(str);//will display sorted files 
			System.out.println("Want to add more files in this direcotry(Yes/no):");
			Scanner adding = new Scanner(System.in);
			str=adding.nextLine();
			Scanner student1=null;
			if (str=="yes") {
				System.out.println("Please enter the name of the file needs to be added:");		
				student1 = new Scanner(System.in);
				str=student1.nextLine();
				addstudents(str,path);
			}
			adding.close();
			student1.close();
		}
	}
	
	//list directories or files in sorted manner
	void listdirectoryorfiles(String path) {
		
	    File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		List<String> files = new ArrayList<String>();
		for (int i = 0; i < listOfFiles.length; i++) {
			   if (listOfFiles[i].isFile()) {
			     files.add(listOfFiles[i].getName());
			   }
			   }
		Collections.sort(files);
		System.out.println(files);//This will display sorted directory or files
	}
	
	//search a particular file in all directories
	String searchfile(String str) {
		File folder = new File("C:/Users/Naman/Desktop/eclipse-workspace/filehandling/src/class1/");
		File[] listOfFiles = folder.listFiles();
		for (int i = 0; i < listOfFiles.length; i++) {
			   if (listOfFiles[i].isFile()) {
			     if (str==listOfFiles[i].getName()) {
			    	 return "Item found at position: "+i+1+"In the directory class1";
    }
    }			     
	}
 
		folder = new File("C:/Users/Naman/Desktop/eclipse-workspace/filehandling/src/class2/");
		listOfFiles = folder.listFiles();
		for (int i = 0; i < listOfFiles.length; i++) {
			   if (listOfFiles[i].isFile()) {
			     if (str==listOfFiles[i].getName()) {
			    	return "Item found at position: "+i+1+" In the directory class2";
			     }
	}
	}
		return null;
	}
    
	//Delete a particular file
	void filedeleted(String str){
   
    	String path="C:/Users/Naman/Desktop/eclipse-workspace/filehandling/src/student/class1/"+str;
    	File file=new File(path);
    	if (file.isFile()) {
    		file.delete();
    		}
    	else {
    		path="C:/Users/Naman/Desktop/eclipse-workspace/filehandling/src/student/class2/"+str;
    	    file = new File(path);
    	    file.delete();
    	}
    }
}

