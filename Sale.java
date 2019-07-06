/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epos.system;

import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
class Sale {
    
 //private properties
        private int employee_Number;
        private double sale_Value;
        //private ArrayList<Integer> numberOfCheckout = new ArrayList<>();
        private ArrayList<Double> allProductSales = new ArrayList<Double>();
        

       
       //getter functions
    public int getEmployee_Number()
    {
        return employee_Number;
    }
    
    public double getSale_Value()
    {
        return sale_Value;
    }
    
//    public ArrayList<Integer> getNumberOfCheckout()
//    {
//        return numberOfCheckout;
//    }
 
    //setter methods
    public void setEmployee_Number(int Employee_NumberIn)
    {
        employee_Number = Employee_NumberIn;
    }
    
    public void setSale_Value(double Sale_ValueIn)
    {
        sale_Value = Sale_ValueIn;
    }
    
    
//    public int getIndexOfMax(ArrayList<Double> allProductSales){
//    Double MaxVal = allProductSales.get(0); // take first as MaxVal
//    int indexOfMax = -1; //returns -1 if all elements are equal
//    for (int i = 0; i < allProductSales.size(); i++) {
//        //if current is less then MaxVal
//        if(allProductSales.get(i) < MaxVal ){
//            MaxVal = allProductSales.get(i); // put it in MaxVal
//            indexOfMax = i; // put index of current Max
//        }
//    }
//    return indexOfMax;  
//}
    
    

//public int getMax(ArrayList list){
//    int max = Integer.MIN_VALUE;
//    for(int i=0; i<list.size(); i++){
//        if(list.get(i) > max){
//            max = list.get(i);
//        }
//    }
//    return max;
//}
    
    
//    public static double getMaxValue(double[] numbers){
//        double maxValue = numbers[0];
//        for(int i=1;i < numbers.length;i++){
//          if(numbers[i] > maxValue){
//                maxValue = numbers[i];
//              }
//        }
//        return maxValue;
//    }
//
//    public static double getMinValue(double[] numbers){
//        double minValue = numbers[0];
//        for(int i=1;i<numbers.length;i++){
//          if(numbers[i] < minValue){
//                minValue = numbers[i];
//              }
//        }
//        return minValue;
//    }
    
    
    
    
//    public void setNumberOfCheckout(ArrayList<Integer> NumberOfPayIn)
//    {
//        numberOfCheckout = NumberOfPayIn;
//    }
    
//        public void addCheckout(int Checkout)
//    {
//        //add the cityname to the arraylist by calling .add
//        numberOfCheckout.add(Checkout);
//    }
    
    
//        public int addDiceRoll()
//    {
//        //use random class for this with a range of 6 
//        //(and add 1 to that number to ensure its 1-6 not 0-5)
//        int pay = rdm.nextInt(6) + 1;
//        
//        //add the dice roll passed in as a parameter to the ArrayList
//        numberOfPay.add(pay);
//        
//        //return the dice roll generated
//        return roll;
//    }
    
    
//    public int NumberOfCheckout()
//    {
//        //return the size of the ArrayList - i.e. how many product sales have been added to it
//        int size = numberOfCheckout.size();
//        return size;
//    }
    
        //sum together all the dice rolls made and return the answer
//    public int sumProductSales()
//    {
//        //variable to hold the total
//        int total = 0;
//        //lbl_EmployeeNumber.setText("" + theUser.getEmployee_Number());
//        
//        //loop total sale for each product sale in the arraylist and add it to the total
//        for (int sale : allProductSales)
//        {
//            //add to the total
//            total = total + sale;
//        }
//        
//        //return the total
//        return total;
//    }

    void setSale_Value(JTextField txtTotal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   }
