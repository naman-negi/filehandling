import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class school{
	String name;
	String rollno;
	//This Function will add new txt files in a new directory and will also display files
	public void addstudents(String str,String path) {
		str=path+str+".txt";
		Scanner input1= new Scanner (System.in);
		try { 
			FileWriter fw1=new FileWriter(str);
			System.out.println("Please enter the name of the student:");		
			name=input1.nextLine();
			fw1.write("Name: "+name);
			System.out.println("Please enter the roll no:");
			rollno=input1.nextLine();
			fw1.write("Roll No: "+rollno);
			fw1.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		    System.out.println("The Updated List");
		    listdirectoryorfiles(path);//will display sorted files 
			System.out.println("Want to add more files in this direcotry(Yes/no):");
			str=input1.nextLine();
			if (str.equals("yes")) {
				System.out.println("Please enter the name of the file needs to be added:");		
				//Scanner student1 = new Scanner(System.in);
				String str2=input1.nextLine();
				str=str2;
				addstudents(str,path);	
			}
			
		}
	//list directories or files in sorted manner
	public void listdirectoryorfiles(String path) {
		   File directorypath = new File(path);
		   File listFiles[] = directorypath.listFiles();
		   List<String> files = new ArrayList<String>();
		   for (int i = 0; i < listFiles.length; i++) {
					   files.add(listFiles[i].getName()); 
				}
				Collections.sort(files);
				System.out.println(files);
	}
	//search a particular file in all directories
	public String searchfile(String str) {
		str=str+".txt";
		File folder = new File("C:/Users/Naman/Desktop/eclipse-workspace/filehandling/src/student/class1/");
		File[] listOfFiles = folder.listFiles();
		for (int i = 0; i < listOfFiles.length; i++) {
			     if (str.equals(listOfFiles[i].getName())) {
			    	 str="Item found In the directory class1";
			    	 }
    }
		folder = new File("C:/Users/Naman/Desktop/eclipse-workspace/filehandling/src/student/class2/");
		listOfFiles = folder.listFiles();
		for (int i = 0; i < listOfFiles.length; i++) {
			if (str.equals(listOfFiles[i].getName())) {
		    	 str="Item found In the directory class2";   	 
		}
		}
		 return str;
	}
	//Delete a particular file
	public void filedeleted(String str){
   
    	String path="C:/Users/Naman/Desktop/eclipse-workspace/filehandling/src/student/class1/"+str+".txt";
    	File file=new File(path);
    	if (file.isFile()) {
    		file.delete();
    		}
    	else {
    		path="C:/Users/Naman/Desktop/eclipse-workspace/filehandling/src/student/class2/"+str+".txt";
    	    file = new File(path);
    	    file.delete();
    	}
    }
}

