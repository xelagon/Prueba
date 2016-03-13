//import java.io.File;
import java.util.Map;

/**
 *  Uso de la clase System.java
 *  Clase Prueba_01 donde pruebo recorrer la estructura de directorios del sistema y tambien ver la variables.
 *  Para mas informacion consultar este link: http://www.roseindia.net/java/beginners/OSInformation.shtml
 */

/**
 * @author xelagon
 *
 */
public class Prueba_01 {
	
	
	public static final String nameOS = "os.name";  										   // The name of OS name
	public static final String versionOS = "os.version";  									   // The version of OS
	public static final String architectureOS = "os.arch";									   // The OS architecture
	public static final String javaVersion = "java.version"; 	                               // The version of Java Runtime Environment.
	public static final String javaHome = "java.home";          							   // The directory of Java installation 
	public static final String javaVMspecificationVersion = "java.vm.specification.version";   // The version of Java Virtual Machine
	public static final String userName = "user.name"; 									       // The name of account name user
	public static final String userHome= "user.home"; 										   // The home directory of user 
	public static final String userDir= "user.dir";    										   // The current working directory of the user


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		  // find root directories in your system
		  /*
		  File[] roots = File.listRoots();
		  System.out.println("Root directories in your system are:");
		  for (int i=0; i < roots.length; i++) {
		     System.out.println(roots[i].toString());
		  }
		  */
		
		  // find the Operating System Information
		  System.out.println("\n  The information about OS");
		  System.out.println("\nName of the OS: " + 
		  System.getProperty(nameOS));
		  System.out.println("Version of the OS: " + 
		  System.getProperty(versionOS));
		  System.out.println("Architecture of the OS: " + 
		  System.getProperty(architectureOS));
		  
		  System.out.println("The version of Java Runtime Environment: " + 
		  System.getProperty(javaVersion));
		  
		  System.out.println("The directory of Java installation: " + 
		  System.getProperty(javaHome));
		  
		  System.out.println("The version of Java Virtual Machine: " + 
		  System.getProperty(javaVMspecificationVersion));
		  
		  System.out.println("The name of account name user: " + 
		  System.getProperty(userName));
		  
		  System.out.println("The home directory of user : " + 
		  System.getProperty(userHome));
		  
		  System.out.println("The current working directory of the user: " + 
		  System.getProperty(userDir));
		  
		  
		  // Returns an unmodifiable string map view of the current system environment.
		  Map <String,String> map = System.getenv();
	}

}
