import java.io.File;
import java.util.Scanner;
class school{
	String addclass;
	
	String allstudentclasses() {
		
	}
	school(String addclass){
		
	}
	
	void classadd(){
		
	}
	
	sortstudentfile(){
		
	}
	
	deletestudentfile({){
		
	}
}
public class mainfunction {
	public static void main(String[] args) {
		
		
		String str,path,dirName;
		Scanner firstinput = new Scanner(System.in);
		Scanner secondinput = new Scanner(System.in);
		int choice;
		
		
		System.out.println("1. There is no student class directory please provide a name for a new dirctory:");
		path="C:/Users/Naman/Desktop/eclipse-workspace/filehandling/src/";
		Scanner adding= new Scanner(System.in);
		path = path+ adding.next();
		File sc2 = new File(path);
		sc2.mkdir();
		
		 dirName = "C:/Users/Naman/Desktop/eclipse-workspace/filehandling/src/";
		 
		do {
			

			Files.list(new File(dirName).toPath())
			.limit(10)
			.forEach(path -> { System.out.println(path); });
			
			System.out.println("1. Add a new directory:");
			System.out.println("2. To acess a particular student directory out of the given list of dircetory:");
			System.out.println("3. To exit the program");
			choice=firstinput.nextInt();
			
			if (choice==1) {
				path="C:/Users/Naman/Desktop/eclipse-workspace/filehandling/src/";
				Scanner adding= new Scanner(System.in);
				path = path+ adding.next();
				File sc2 = new File(path);
				sc2.mkdir();
			}
			else if (choice==2) {
				
				
			}
			}
			else {
				System.out.println("Wrong ");
			}
		
		}
		while(choice!=3);
	}
}
