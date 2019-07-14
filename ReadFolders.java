
package readfolders;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class ReadFolders {

    public static void main(String[] args) 
    {
        
        File file=new File("F:\\Java Files");  // Create the Directory 'Java Files' in Any Drive (D,E,F) and add some text files in it. 
        File[] list=new File[10];
        if(file.exists()){               // Check if specified Directory Exists or not
            list=file.listFiles();        // Create the list of files.
        }
        else {
            System.out.println("Files Not Present");
        }
        int c=0;
        for(int i=0;i<list.length;i++)
        {
            c++;
            System.out.println(list[i].getName());
            System.out.println("-------------------------------------------------------------------");
            try
            {
                 String x;
                 // READ THE DATA OF EACH FILE. BufferedReader class to Read the Data Line by Line.
                 BufferedReader br=new BufferedReader(new FileReader("F:\\Java Files\\"+list[i].getName()));
                 
                 while((x=br.readLine())!=null)
                 {
                     System.out.println(x);
                 }
                System.out.println("-------------------------------------------------------------------"); 
            }
            
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        System.out.println("Total Number of files = "+c);
        
    }
    
}
