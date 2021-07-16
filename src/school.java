import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;//Note Required
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;//Note Required
import java.util.*;

class school{
	
	String name;
	String rollno;
	//This Function will add new txt files in a new directory and will also display files
	//files will be displayed in sorted manner
	void addstudents(String str){

        String path;
        path="C:/Users/Naman/Desktop/eclipse-workspace/filehandling/src/student/class1/";
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
			System.out.println("want to add more files in this direcotry(Yes/no):");
			Scanner adding = new Scanner(System.in);
			String str2=adding.nextLine();
			Scanner student1=null;
			if (str2=="yes") {
				System.out.println("Please enter the name of the file needs to be added:");		
				student1 = new Scanner(System.in);
				addstudents(str2);
			}else {
				System.out.println("List of directories");
				listdirectoryorfiles();
			}
			adding.close();
			student1.close();
		}
	
	}
	//list directories or files
	void listdirectoryorfiles() {
	    File folder = new File("C:/Users/Naman/Desktop/eclipse-workspace/filehandling/src/");
		File[] listOfFiles = folder.listFiles();
		List<String> files = new ArrayList<String>();
		for (int i = 0; i < listOfFiles.length; i++) {
			   if (listOfFiles[i].isFile()) {
			     files.add("i"+listOfFiles[i].getName());
			   }
			   }
		Collections.sort(files);
		System.out.println(files);//This will display sorted directory
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
   
    	String path=str+"C:/Users/Naman/Desktop/eclipse-workspace/filehandling/src/student/class1/";
    	File file = new File(path);
    	file.delete();
    	path=str+"C:/Users/Naman/Desktop/eclipse-workspace/filehandling/src/student/class2/";
    	file = new File(path);
    	file.delete();

    }
  
}
class mainfunction {
		public static void main(String[] args) {
	
		String str,path,dirName,str3,str2,str4,str5;
		Scanner firstinput = new Scanner(System.in);
		Scanner secondinput = new Scanner(System.in);
		Scanner thirdinput = new Scanner(System.in);
	    File folder1,folder2;
	    school calling = new school();
		int choice,choice2;
		do {
			System.out.println("1. To Browse over student directory as listed above:");
			System.out.println("2. To search a file in all directories");
			System.out.println("3. To exit the program");
			choice=firstinput.nextInt();
			if (choice==1) {
					   System.out.println("In which directory you want to add file(please enter appropriate serial No):");
					   if (choice2==1) {//for the first directory
						    folder1 = new File("C:/Users/Naman/Desktop/eclipse-workspace/filehandling/src/student/class1/");
						    str2=folder1.listFiles();
						   if (str2==null) {
							   System.out.println("No files in the current dierctory:");
							   Scanner student1 = new Scanner(System.in);
							   str2=student1.nextLine();
							   calling.addstudents(str2);
						   }
					   }
					   else {//for the second directory
						    folder2 = new File("C:/Users/Naman/Desktop/eclipse-workspace/filehandling/src/student/class2/");
						    str2=folder2.listFiles();
						   if (str2==null) {
							   System.out.println("No files in the current dierctory:");
							   Scanner student1 = new Scanner(System.in);
							   str2=student1.nextLine();
							   calling.addstudents(str2);
						   }
					   }
				 } else if (choice==2) {
					   System.out.println("Write the name of the file you want to search:");
                       str4=thirdinput.nextLine();		
                       str5=calling.searchfile(str4); 
                       System.out.print(str5);
				   }
			}while(choice!=2);
	}
}
		

