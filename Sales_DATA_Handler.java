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
 * @author user
 */
class Sales_DATA_Handler {
    
   
    public ArrayList<Double> getAllSalesByEmployeeNumber(int employeeNumber){
        
            // Create as ArrayList object
            ArrayList<Double> allTheSaleValues = new ArrayList<Double>();
          
         try 
            {
                Connection con=DB_Utils.getConnection();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery ("SELECT * FROM sales WHERE Employee_number =" + employeeNumber );
               
                while(rs.next())
                {
                    
                    //add to the arraylist- each record
                    double eachRecordOfSaleValue = Double.parseDouble(rs.getString("sale_value"));
                    allTheSaleValues.add(eachRecordOfSaleValue);
                    
                    
                    //no_of_rows++;
                }
//                txtDisplay.append("You served "+ count + " customers");

            }
         catch(SQLException e)
            {
                System.out.println("getAllSalesByEmployeeNumber : Error");
                System.out.println("SQL exception occured" + e);
            }
     
    //==========================================================='
    
        return allTheSaleValues;
        
        
    }  
    
    public void addSale(Sale pSale)
    {
        //using try-with-resources in Java means the connection object is automatically closed at the end
        try
        {             
            //create an SQL statement to execute against the database
            Connection con=DB_Utils.getConnection();
            Statement stmt = con.createStatement();
            
            //build the sql query we want to run in a string variable
            String sql = "INSERT INTO Sales (Employee_number, sale_value) " +
                    "VALUES " +
                    "(" + 
                    "" + pSale.getEmployee_Number() + "," + 
                    pSale.getSale_Value() +  //number so no 's needed
                    ")";
             System.out.println("the sql for checkout:" + sql);
            //call executeUpdate which either INSERTS UPDATES or DELETES depending on SQL command
            stmt.executeUpdate(sql);
        }
        catch(Exception ex)
        {
            //print the error to the console so we can analyse it
            System.out.println("addSales error: " + ex.getMessage());
        }
    }
    
    
    public void deleteSales()
    {
        //using try-with-resources in Java means the connection object is automatically closed at the end
        try (Connection con=DB_Utils.getConnection())
        {             
            //create an SQL statement to execute against the database
            Statement stmt = con.createStatement();
            
            //build the sql query we want to run in a string variable
            String sql = "DELETE FROM Sales";
             
            //call executeUpdate which either INSERTS UPDATES or DELETES depending on SQL command
            stmt.executeUpdate(sql);
        }
        catch(Exception ex)
        {
            //print the error to the console so we can analyse it
            System.out.println("deleteSales error: " + ex.getMessage());
        }
    }
        
    
}
