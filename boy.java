/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// This is boy class
package ppl;

/**
 *
 * @author Shivani
 */
public class boy {
    public String name;
    public int status;
    public String girlname;
    public int budget;
    private int inteligence;
    private int attractivness;
    private int min_val;
    




// This is details of boys
    public void details(String name,int attractivness,int budget,int intelligence){
        
        System.out.println(name+attractivness+budget+intelligence); 
        status = 0;
        
    }
    public boolean eligiblity(int attractivness,int maintenance){
        if(maintenance > budget || attractivness < min_val)  //false means he is not eligible
        {
            return false;
        }
        return true;
    }
    public String name(){
        return name;
    }
}