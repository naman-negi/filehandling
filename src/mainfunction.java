import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;//Note Required
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;//Note Required

class school{

	//This Function will add new txt files in a new directory
	String addstudents(String str){
		str=str+"C:/Users/Naman/Desktop/eclipse-workspace/filehandling/src/";
		FileWriter fw1=null;;  
		try { 
			fw1=new FileWriter(str);
			BufferedWriter bf= new BufferedWriter(fw1);
			bf.write("Name: Naman");
			bf.write("Roll No: 1");
		}finally {if (fw1 != null) {
	        try {
	            fw1.close();
	        } catch (IOException e) {
	            // This is unrecoverable. Just report it and move on
	            e.printStackTrace();
	        }
	        }
		
			System.out.println("want to add more files(Yes/no):");
			Scanner adding = new Scanner(System.in);
			String str2=adding.nextLine();
			

		}
	//This Function will list all possible files in a directory
	}

public class mainfunction {
	public static void main(String[] args) {
		String str,path,dirName,str3,str2;
		Scanner firstinput = new Scanner(System.in);
		Scanner secondinput = new Scanner(System.in);
	    File folder = new File("C:/Users/Naman/Desktop/eclipse-workspace/filehandling/src/");
	    school calling = new school();
		int choice,choice2;
		do {
			System.out.println("1. To Browse over student directory:");
			System.out.println("2. To exit the program");
			choice=firstinput.nextInt();
			if (choice==1) {
				File[] listOfFiles = folder.listFiles();
				 for (int i = 0; i < listOfFiles.length; i++) {
					   if (listOfFiles[i].isFile()) {
					     System.out.println(i+1+".Directory " + listOfFiles[i].getName());
					   }
					   System.out.println("In which directory you want to add file(please enter appropriate serial No):");
					   if (choice2==1) {
						    File folder2 = new File("C:/Users/Naman/Desktop/eclipse-workspace/filehandling/src/class1/");
						    str2=folder2.listFiles();
						   if (str2==null) {
							   System.out.println("No files in the current dierctory:");
							   Scanner student1 = new Scanner(System.in);
							   str2=student1.nextLine();
							   calling.addstudents(str2);
						   }
					   }
				 }
			}
			}	while(choice!=2);
	}
		
}
