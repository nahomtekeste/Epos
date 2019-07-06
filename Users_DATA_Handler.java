/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epos.system;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 30310250
 */
class Users_DATA_Handler {
    
public User getValidUser(User pUser){
        //  boolean userExistsInDatabase = false;
        
        DB_Utils.isDatabaseDriversExist(); // check that ucanaccess drivers exist
    
         try 
            {
                Connection con=DB_Utils.getConnection();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery ("SELECT * FROM users WHERE Password='" + pUser.getPassword()+ "' AND " + " employee_Number=" + pUser.getEmployee_Number() );
               
                rs.next();//move to first record
                

                pUser.setFirst_Name(rs.getString("first_name"));
                pUser.setLast_Name(rs.getString("last_name"));
                pUser.setEmployee_Number(Integer.parseInt(rs.getString("employee_Number")));
                pUser.setPassword(rs.getString("password"));
                pUser.setRole(rs.getString("role"));

            }
         catch(SQLException e)
            {
                System.out.println("getValidUser : Error");
                System.out.println("SQL exception occured" + e);
            }
     
    //==========================================================='  
        return pUser;
    }
   
    public boolean checkUserIsValid(User pUser){
        boolean userExistsInDatabase = false;
      
         try 
            {
                Connection con=DB_Utils.getConnection();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery ("SELECT * FROM users WHERE password='" + pUser.getPassword()+ "' AND " + " employee_Number=" + pUser.getEmployee_Number() );
                while (rs.next()) 
                {        
                  userExistsInDatabase=true; // set if at least one record is found
                }
                
            }
         catch(SQLException ex)
            {
                System.out.println("checkUserIsValid : Error");
                System.out.println("SQL exception occured\n" + ex);
            }

    //==========================================================='  
    return (userExistsInDatabase);
    }
    
    public void updateUser(User pUser ){
           
        
    }
    
    public void insertUser(User pUser)
    {

         try 
            {
                Connection con=DB_Utils.getConnection();
                Statement stmt = con.createStatement();
                pUser.getPassword();
               
                String mySql = "INSERT INTO Users";
                mySql = mySql +  ("(First_Name , Last_Name, Employee_Number, Role ,Password)");
                mySql = mySql +  ("VALUES (") ;
                mySql = mySql +  ("'" +    pUser.getFirst_Name()    + "',") ;
                mySql = mySql +  ("'" +    pUser.getLast_Name()   + "',") ;
                mySql = mySql +  ( ""  +   pUser.getEmployee_Number() + "," ) ;  // no apostrophe pinnumber is an integer
                mySql = mySql +  ("'" +   pUser.getRole()   + "',") ;   
                mySql = mySql +  ("'" +  pUser.getPassword()   + "'") ;  
                mySql = mySql +  (")") ;     
                System.out.println("the sql  - " + mySql);
                stmt.executeUpdate(mySql);
              

            }
         catch(SQLException ex)
            {
                System.out.println("checkUserIsValid : Error");
                System.out.println("SQL exception occured\n" + ex);
            }

    //==========================================================='  
   
    }
    
    public ArrayList<String> getAllTheUsersNames(){
        ArrayList<String> allTheUsersName = new ArrayList<String>();  // Create as ArrayList object
        
        try
            {
                Connection con=DB_Utils.getConnection();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM users");

                while (rs.next())
                {
                    String User_nameCombo =(rs.getString("ID") + " " + rs.getString("First_name"));
                    allTheUsersName.add(User_nameCombo);
                    
                }

            }
        catch(SQLException e)
            {
                System.out.println("getValidUser : Error");
                System.out.println("SQL exception occured" + e);
            }
        
        return allTheUsersName;// return back the arraylist
    }

}
