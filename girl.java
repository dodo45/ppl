/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//This is girl class

package ppl;

/**
 *
 * @author Shivani
 */
public class girl {
    String name;

    /**
     *
     */
    public int status;

    /**
     *
     */
    public String boyname;
    int maintenance;
    int intelligence;
    int attractivness;
    int happy;
 


    // This is details of girls

   
     
       
     
        public void details(String name,int attractivness,int maintenance,int intelligence){
        
        status = 0;
        System.out.println(name+attractivness+ maintenance +intelligence); 
      }

    
    public boolean eligiblity(int budget){
        if(budget < maintenance)
        {
            return false;
        } else {
        }
        return true;
    }
    
    /**
     *
     * @return
     */
    public int maintenance(){
        return maintenance;
    }

    /**
     *
     * @return
     */
    public int attractivness(){
        return attractivness;
    }

    /**
     *
     * @return
     */
    public String name(){
        return name;
    }

    /**
     *
     * @return
     */
    public int attrativness() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}