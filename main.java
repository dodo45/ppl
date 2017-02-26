package ppl;

import java.io.*;
import ppl.boy;
import ppl.girl;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.NumberFormatException;
import java.lang.Integer;


        

/**
 *
 * @author Shivani
 */
public class main {

    /**
     *
     * @param args
     */
    public static void main(String args[])
    {   
         int intelligence=0;
         int i=0;
        int attractivness=0;
        int maintenance=0;
        int budget=0;
        int L;
        girl g[] = new girl[50];
        boy b[] = new boy[50];
        String name = null;
        String csvfile = "C:\\Users\\Shivani\\Documents\\girl.csv";
        String line="";
        String cvsSplitBy=",";
        
       
        //for read file from girl.csv
         try (BufferedReader br = new BufferedReader(new FileReader(csvfile))) {

            while ((line = br.readLine()) != null) {

                String[] girl = line.split(cvsSplitBy);
                name = girl[0];
                attractivness = Integer.parseInt(girl[1]);
                maintenance = Integer.parseInt(girl[2]);
                intelligence = Integer.parseInt(girl[3]);
                g[i++].details(name, attractivness, maintenance, intelligence);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        L = i;
        i = 0;
        csvfile = "C:\\Users\\Shivani\\Documents\\boy.csv";
        
        //to read from file boy.csv
        try (BufferedReader br = new BufferedReader(new FileReader(csvfile))) {

            while ((line = br.readLine()) != null) {

                String[] boy = line.split(cvsSplitBy);
                name = boy[0];
                attractivness = Integer.parseInt(boy[1]);
                budget = Integer.parseInt(boy[2]);
                intelligence = Integer.parseInt(boy[3]);
                b[i++].details(name, attractivness, budget, intelligence);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        
       
        
        int j,k;
        String s[] = new String[50]; 
        int cnt=0;
        
        for(j=0;j<i;j++)
            
        {
            for(k=0;k<L;k++)
            {
                if(b[j].eligiblity(g[k].maintenance(),g[k].attrativness()) && g[k].eligiblity(b[j].budget)&&
                        b[j].status == 0 && g[k].status == 0) 
                {
                    b[j].girlname = g[k].name();
                    g[k].boyname = b[j].name;
                    b[j].status = 1;
                    g[k].status = 1;
                 
                    
                   
		
			if(b[j].status == 1){
			s[cnt] = "Boy: "+ b[j].name +" is dating with "+"Girl: "+ b[j].girlname ;
			}
                        System.out.println("b[j] is dating with g[k]");
		cnt++;
                  
                }
            }
        }
        testing_log.logger(s,cnt); 
        
    }
    
    
}
