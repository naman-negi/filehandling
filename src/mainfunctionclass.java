
import java.io.File;
//import java.io.IOException;
import java.util.Scanner;

//Class Containing main function
class mainfunctionclass {
		public static void main(String[] args) {
		String path,str,str2;
		Scanner firstinput=new Scanner(System.in);
		Scanner secondinput=new Scanner(System.in);
		Scanner thirdinput=new Scanner(System.in);
		Scanner fourthinput=new Scanner(System.in);
		Scanner fifthinput=new Scanner(System.in);
		Scanner sixthinput=new Scanner(System.in);
		Scanner seventhinput=new Scanner(System.in);
	    school calling = new school();
		int choice;
		try {
		do {
			path="C:/Users/Naman/Desktop/eclipse-workspace/filehandling/src/student/";
			calling.listdirectoryorfiles(path);
			System.out.println("Which directory you want to see(enter the appropriate name):");
		
			str=firstinput.nextLine();
			path=path+str; 
			File file = new File(path);
			do {
				System.out.println("1.You want to add a file");
				System.out.println("2.You want to delete a file");
				System.out.println("3.You want to search a file");
				System.out.println("Type anything else if you dont want to do any of the above:");
				System.out.println("Please enter with appropriate serial number:");
				choice=seventhinput.nextInt(); 
					   if (choice==1) {//to add a file in a directory
						   System.out.println("This is the following list of files");
						   calling.listdirectoryorfiles(path);
						   if (file.list().length>0) {
							   System.out.println("Name the file you want to add:");
						
							   str2=secondinput.nextLine();
							   calling.addstudents(str2,path+"/");  
						   }
						  else {
							  System.out.println("No files in the current dierctory add new file name:");
							   System.out.println("Name the file you wan to add:");
						
							   str2=secondinput.nextLine();
							   calling.addstudents(str2,path+"/");
						   }
					   }
					   else if (choice==2 ) {//to delete a file
						   calling.listdirectoryorfiles(path);//this will list file in sorted before a particular is deleted
						   System.out.println("Please enter name of the file you wwant to delete:");
					
						   str=thirdinput.nextLine();
					       calling.filedeleted(str);
						   System.out.println("Updated list file after deletion:");
					       calling.listdirectoryorfiles(path);
					       }
					   else   if (choice==3) {//to search a file
						   calling.listdirectoryorfiles(path);//display in  file sorted manner before some file is searched
						   System.out.println("Please enter name of the file you wwant to search:");
						
						   str=fourthinput.nextLine();
					       str=calling.searchfile(str,path+"/");
						   System.out.println(str);
					   }
					   else { 
					   System.out.println("Do you want to exit this directory:");
					   str=fifthinput.nextLine();
					   }
					   }while(str.equals("no"));
			
			System.out.println("To exit the application type exit or if you want to keep browsing other directories type no:");
			str=sixthinput.nextLine();
			}while(str.equals("no"));
		    }finally {
				firstinput.close();
				secondinput.close();
				thirdinput.close();
				fourthinput.close();
				fifthinput.close();
				sixthinput.close();
				seventhinput.close();
			}
	
		
		}
		
		
}
		

