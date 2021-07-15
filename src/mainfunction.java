import java.io.File;
import java.util.Scanner;
class school{
	String addclass;
	String studentfilename;
	void addstudents(String str){	
		
	}
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
							   Scanner student1 = new Scanner();
							   str3=student1.nextLine();
							   calling.addstudents(str3);
						   }
					   }
				 }
		while(choice!=2);
	}
}
