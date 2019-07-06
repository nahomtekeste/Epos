/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epos.system;

/**
 *
 * @author user
 */
class User {
    
    
      
    //attributes====================
    private String first_Name;
    private String last_Name;
    private int employee_Number;
    private String password;
    private String role;
    private int ID;
    //======constructor===============
    
    public User(){
        //default constructor   
        //if you indlude an overloaded consructor then you must include a default
    }
    
    public User (String pFirst_Name, String pLast_Name, String pPassword, int pEmployee_Number , String pRole, int pID) 
    {
        //overloaded constructor    
        // these need guards !! - I have not added these but you should be adding these if you intend 
        // to use this overloaded constructor
        this.employee_Number=pEmployee_Number;
        this.first_Name=pFirst_Name; 
        this.last_Name=pLast_Name;
        this.password=pPassword;
        this.role=pRole;
        this.ID=pID;

    }
    
    //setters========================
    //p is telling me that this is a parameter variable
    public void setRole(String pRole){
        // Accessor method- these guard aginst false data being use for state.
        if (!pRole.equals("")){
            this.role=pRole;
        }
    }   
        
        
    public void setEmployee_Number(int pEmployee_Number){
        // Accessor method- these guard aginst false data being use for state.
        if (pEmployee_Number > 0){
         this.employee_Number=pEmployee_Number;
        }
        
    }
    
    public void setFirst_Name(String pFirst_Name){
        // Accessor method- these guard aginst false data being use for state.
        if (!pFirst_Name.equals("")){
            this.first_Name=pFirst_Name;
        }
        
    }
    public void setLast_Name(String pLast_Name){
        // Accessor method- these guard aginst false data being use for state.
                                                                               // boolean flag=false;
        if (!pLast_Name.equals("")){
           this.last_Name=pLast_Name;
                                                                               //    flag=true;
        }
                                                                            //  return flag;
    }

    public void setPassword(String pPassword){
        // Accessor method- these guard against false data being use for state.
       if (!pPassword.equals("")){
           this.password=pPassword;
        }
    }
    public void setID(int pID){
        // Accessor method- these guard aginst false data being use for state.
        if (pID > 0){
            this.ID=pID;
        }
    }
    
      //===========getters========================
    
    public String getFirst_Name(){
        // Accessor method- these guard aginst false being use for state.
        return this.first_Name;
    }
    public String getLast_Name(){
        // Accessor method- these guard aginst false being use for state.
        return this.last_Name;
    }
     public String getPassword(){
    // Accessor method- these guard aginst false being use for state.
        return this.password;
    }
    public int getEmployee_Number(){
    // Accessor method- these guard aginst false being used for state.
        return this.employee_Number;
    }
              
    public String getRole(){
     // Accessor method- these guard aginst false being used for state.
         return this.role;
    }
    
    public int getID(){
    // Accessor method- these guard aginst false being used for state.
        return this.ID;
    }
    
              
    @Override
    public String toString(){

        StringBuilder theStringVersionOfTheUser= new StringBuilder();

        theStringVersionOfTheUser.append(this.employee_Number).append(" , ");
        theStringVersionOfTheUser.append(this.first_Name ).append(" , ");
        theStringVersionOfTheUser.append( this.last_Name ).append(" , ");
        theStringVersionOfTheUser.append( this.role ).append(" , ");
        theStringVersionOfTheUser.append(this.password );

        return theStringVersionOfTheUser.toString();
       }
           
    
}
