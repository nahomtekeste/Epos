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
class Products_DATA_Handler {
     public ArrayList<String> getAllProductsName(){
        
            // Create as ArrayList object
            ArrayList<String> allTheProductName = new ArrayList<String>();
          
            
        try 
            {
                Connection con=DB_Utils.getConnection();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Products");

                while (rs.next())
                {
                    String ProductName = rs.getString("Product_name");
                    allTheProductName.add(ProductName);
                }


            }
        catch(SQLException e)
            {
                System.out.println("getAllProductsName : Error");
                System.out.println("SQL exception occured" + e);
            }
     
    //==========================================================='
    
        return allTheProductName;
               
    }
    
    public ArrayList<Double> getAllPrice(){
        
            // Create as ArrayList object
            ArrayList<Double> allThePrice = new ArrayList<Double>();
          
            
        try 
            {
                Connection con=DB_Utils.getConnection();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Products");

                while (rs.next())
                {
                    double bName = Double.parseDouble(rs.getString("Price"));
                    allThePrice.add(bName);
                }


            }
        catch(SQLException e)
            {
                System.out.println("allThePrice : Error");
                System.out.println("SQL exception occured" + e);
            }
     
    //==========================================================='
    
        return allThePrice;
               
    }        
    
    
    public void insertProduct(Product pProduct)
    {

         try 
            {
                Connection con=DB_Utils.getConnection();
                Statement stmt = con.createStatement();
                pProduct.getProduct_Name();
               
                String mySql = "INSERT INTO Products";
                mySql = mySql +  ("(Product_name , Description, Price, Image_filename)");
                mySql = mySql +  ("VALUES (") ;
              
                mySql = mySql +  ("'" +  pProduct.getDescription() + "',") ;
                mySql = mySql +  ( ""  +   pProduct.getPrice() + ",") ;
                mySql = mySql +  ( "'"  +   pProduct.getImage_Name() + "'") ;
                mySql = mySql +  (")") ;     
                System.out.println("the sql  - " + mySql);
                stmt.executeUpdate(mySql);
              

            }
         catch(SQLException ex)
            {
                System.out.println("insertProduct problem : Error");
            }

    //==========================================================='  
   
    }
    
    
    public ArrayList<String> getAllProductsNameForComboBox(){
        
            // Create as ArrayList object
            ArrayList<String> allTheProductName = new ArrayList<String>();
          
            
        try 
            {
                Connection con=DB_Utils.getConnection();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Products");

                while (rs.next())
                {
                    String Product_nameCombo =(rs.getString("ID") + " " + rs.getString("Product_name"));
                    allTheProductName.add(Product_nameCombo);
                }


            }
        catch(SQLException e)
            {
                System.out.println("getAllProductsName : Error");
                System.out.println("SQL exception occured" + e);
            }
     
    //==========================================================='
    
        return allTheProductName;
               
    }
    
    public ArrayList<String> getAllImageFileName(){
        
            // Create as ArrayList object
            ArrayList<String> allTheImageFileName = new ArrayList<String>();
          
            
        try 
            {
                Connection con=DB_Utils.getConnection();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Products");

                while (rs.next())
                {
                    String Image_File_Name =(rs.getString("Image_filename"));
                    allTheImageFileName.add(Image_File_Name);
                }


            }
        catch(SQLException e)
            {
                System.out.println("getAllImageFileName : Error");
                System.out.println("SQL exception occured" + e);
            }
     
    //==========================================================='
    
        return allTheImageFileName;
               
    }

    void insertProduct(epos.system.Product myProduct) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Product {

        public Product() {
        }

        private void getProduct_Name() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getDescription() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getPrice() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getImage_Name() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}


