//CreateFile
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
public class CreateFile {
	 public static void main(String[] args) throws IOException
	    {
	        FileClass();
	        FileOutputStreamClass();
	        createFileIn_NIO();
	    }
	 
	    private static void FileClass() throws IOException
	    {
	          File file = new File("c://temp//testFile3.txt");
	  
	          //Creating file
	          if (file.createNewFile()) {
	            System.out.println("File is created!");
	          }else{
	            System.out.println("File already exists.");
	          }
	       FileWriter writer = new FileWriter(file);
	          writer.write("Test data");
	          writer.close();
	    }
	 
	    private static void FileOutputStreamClass() throws IOException
	    {
	        String data = "Test data";
	        FileOutputStream out = new FileOutputStream("c://temp//testFile2.txt");
	        out.write(data.getBytes());
	        out.close();
	    }
	 
	    private static void createFileIn_NIO()  throws IOException
	    {
	        String data = "Test data";
	        Files.write(Paths.get("c://temp//testFile3.txt"), data.getBytes());
	        List<String> lines = Arrays.asList("1st line", "2nd line");
	       Files.write(Paths.get("file6.txt"),
	                    lines,
	                    StandardCharsets.UTF_8,
	                    StandardOpenOption.CREATE,
	                    StandardOpenOption.APPEND);
	    }
	}
//ReadFile
import java.util.*; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.*; 
import java.io.*;
public class ReadFile {
	public static List<String> readFileInList(String fileName) 
	  { 
	  
	    List<String> lines = Collections.emptyList(); 
	    try
	    { 
	      lines = 
	       Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
	    } 
	  
	    catch (IOException e) 
	    { 
	      e.printStackTrace(); 
	    } 
	    return lines; 
	  } 
	  public static void main(String[] args) 
	  { 
	    List l = readFileInList("c://temp//testFile2.txt"); 
	  
	    Iterator<String> itr = l.iterator(); 
	    while (itr.hasNext()) 
	      System.out.println(itr.next()); 
	  } 
	}
//UpdateFile
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class UpdateFile {
	static void updateFile(String filePath, String oldString, String newString)
    {
        File fileupdate = new File(filePath);
        String oldContent = "";
        BufferedReader reader = null;
        FileWriter writer = null;
        try
        {
            reader = new BufferedReader(new FileReader(fileupdate));
            String line = reader.readLine();
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                line = reader.readLine();
            }
            String newContent = oldContent.replaceAll(oldString, newString);
            writer = new FileWriter(fileupdate);
            writer.write(newContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args)
    {
    	updateFile("c://temp//testFile2.txt", "85", "95");
        System.out.println("done");
    }
}
//DeleteFile
import java.io.IOException; 
import java.nio.file.*; 
public class DeleteFile {
	 public static void main(String[] args) 
	    { 
	        try
	        { 
	            Files.deleteIfExists(Paths.get("c://temp//testFile2.txt")); 
	        } 
	        catch(NoSuchFileException e) 
	        { 
	            System.out.println("No such file/directory exists"); 
	        } 
	        catch(DirectoryNotEmptyException e) 
	        { 
	            System.out.println("Directory is not empty."); 
	        } 
	        catch(IOException e) 
	        { 
	            System.out.println("Invalid permissions."); 
	        } 
	          
	        System.out.println("Deletion successful."); 
	    } 
	}
