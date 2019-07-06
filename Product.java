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
class Product {
     
    //attributes====================
    private String product_Name;
    private String description;
    private double price;
    private String image_Name;
    //======constructor===============
    
    public Product(){
    //default constructor   
    //if you indlude an overloaded consructor then you must include a default
    }
    
    public Product (String pProduct_Name, String pDescription, double pPrice, String pImage_Name) 
    {
    //overloaded constructor    
    // these need guards !! - I have not added these but you should be adding these if you intend 
    // to use this overloaded constructor
        this.product_Name = pProduct_Name;
        this.description = pDescription;
        this.price = pPrice;
        this.image_Name = pImage_Name;

    }
    
    //============setters========================
        //p is telling me that this is a parameter variable
        public void setProduct_Name(String pProduct_Name){
            // Accessor method- these guard aginst false data being use for state.
            if (!pProduct_Name.equals("")){
                this.product_Name = pProduct_Name;
            }
        }   

    
        public void setDescription(String pDescription){
            // Accessor method- these guard aginst false data being use for state.
            if (!pDescription.equals("")){
                this.description=pDescription;
            }
        
        }

        public void setPrice(double pPrice){
            // Accessor method- these guard aginst false data being use for state.
            if (pPrice > 0){
                this.price=pPrice;
            }
        }
        
        public void setImage_Name(String pImage_Name){
            // Accessor method- these guard aginst false data being use for state.
            if (!pImage_Name.equals("")){
                this.image_Name=pImage_Name;
            }
        
        }
    
      //===========getters========================     
        
       public String getProduct_Name(){
            // Accessor method- these guard aginst false being use for state.
            return this.product_Name;
        }
        public String getDescription(){
            // Accessor method- these guard aginst false being use for state.
            return this.description;
        }

        public double getPrice(){
            // Accessor method- these guard aginst false being used for state.
            return this.price;
        }
        
        public String getImage_Name(){
            // Accessor method- these guard aginst false being use for state.
            return this.image_Name;
        }
                     
       
       
    @Override
       public String toString(){

           StringBuilder theStringVersionOfTheUser= new StringBuilder();
           
           theStringVersionOfTheUser.append(this.price).append(" , ");
           theStringVersionOfTheUser.append(this.description ).append(" , ");
           theStringVersionOfTheUser.append( this.product_Name ).append(" , ");
           theStringVersionOfTheUser.append(this.image_Name );
           
           return theStringVersionOfTheUser.toString();
       }
}
