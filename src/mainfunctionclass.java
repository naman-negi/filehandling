import java.io.File;
import java.util.Scanner;

//Class Containing main function
class mainfunctionclass {
		public static void main(String[] args) {
		String path,str,str2;
		String[] str3;
		Scanner firstinput = new Scanner(System.in);
	    File check;
	    school calling = new school();
		int choice;
		do {
			path="C:/Users/Naman/Desktop/eclipse-workspace/filehandling/src/student/";
			calling.listdirectoryorfiles(path);
			System.out.println("Which directory you want to see(enter the appropriate name):");
			str2=firstinput.nextLine();
			path=path+str2+"/"; 
			calling.listdirectoryorfiles(path);
			do {
				System.out.println("1.You want to add a file");
				System.out.println("2.You want to delete a file");
				System.out.println("3.You want to search a file");
				choice=firstinput.nextInt(); 
					   if (choice==1) {//to add a file in a directory
						    check = new File(path);
						    str3=check.list();
						   if (str3==null) {
							   System.out.println("No files in the current dierctory add new file name:");
							   System.out.println("Name the file you wan to add:");
							   str=firstinput.nextLine();
							   calling.addstudents(str,path);
						   }
						   else {
							   System.out.println("Name the file you want to add:");
							   str=firstinput.nextLine();
							   calling.addstudents(str,path);
						   }
					   }
					   if (choice==2 ) {//to delete a file
						   calling.listdirectoryorfiles(path);//this will list file in sorted before a particular is deleted
						   System.out.println("Please enter name of the file you wwant to delete:");
						   str2=firstinput.nextLine();
					       calling.filedeleted(str2);
						   System.out.println("Updated list file after deletion:");
					       calling.listdirectoryorfiles(path);
					       }
					   if (choice==3) {//to search a file
						   calling.listdirectoryorfiles(path);//display in  file sorted manner before some file is searched
						   System.out.println("Please enter name of the file you wwant to search:");
						   str2=firstinput.nextLine();
					       str2=calling.searchfile(str2);
						   System.out.println(str2);
					   }
					   System.out.println("Type exit if you want to exit this execution  context or type no:");
					   str2=firstinput.nextLine();
					   }while(str2!="exit");
			System.out.println("Type exit if you want to exit or type no:");
			str2=firstinput.nextLine();
			}while(str2!="exit");
		firstinput.close();
		}
}
		

