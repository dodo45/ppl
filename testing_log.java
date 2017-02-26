// This is logger file To write print output in text file
package ppl;

/**
 *
 * @author Shivani
 */



import java.io.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
public class testing_log{
public static void logger(String[] s, int cnt){  
	    try {  
    	Logger logger = Logger.getLogger("My log"); 
    	FileHandler fh = new FileHandler("C:\\Users\\Shivani\\Documents\\couple.txt",true);          
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();  
        fh.setFormatter(formatter); 
        logger.setUseParentHandlers(true);
        int ln=0;
        for(ln=0;ln<cnt;ln++){
        	logger.info(s[ln]);
        }
        

    
    } catch (IOException e) {  
        e.printStackTrace();  
    }  

    

}
}