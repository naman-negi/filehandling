
import java.io.File;
import java.util.*;
public class test {

 public static void main(String[] args)
 { 
/*	 File folder = new File("C:/Users/Naman/Desktop/eclipse-workspace/filehandling/src/folder/");
	 File[] listOfFiles = folder.listFiles();

	 for (int i = 0; i < listOfFiles.length; i++) {
	   if (listOfFiles[i].isFile()) {
	     System.out.println("File " + listOfFiles[i].getName());
	   } */ 
	 File mainFolder = new File("F:\\personal");

         ListFiles lf = new ListFiles();
         lf.getFiles(lf.mainFolder);
    
	 }
 
}

