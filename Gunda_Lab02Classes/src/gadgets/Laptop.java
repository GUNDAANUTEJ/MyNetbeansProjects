/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gadgets;

/**
 *
 * @author GUNDA SAI NAGA ANU TEJA
 */
public class Laptop {
    
    private String laptopBrand;
    private String processor;
    private double display;
    private int hardDrive;
    private String operatingSystem;
    private boolean touch;
    
    public Laptop(String laptopBrand, String processor, String operatingSystem, int hardDrive, double display, boolean touch)
    {
        this.laptopBrand = laptopBrand;
        this.processor = processor;
        this.operatingSystem = operatingSystem;
        this.hardDrive = hardDrive;
        this.display = display;
        this.touch = touch;
    }
    
    public Laptop(){}
    
    public String getLaptopBrand() {
        return laptopBrand;
    }
    public void setLaptopBrand(String laptopBrand) {
        this.laptopBrand = laptopBrand;
    }

    public String getProcessor() {
        return processor;
    }
       public void setProcessor(String processor) {
        this.processor = processor;
    }

    public double getDisplay() {
        return display;
    }
    public void setDisplay(double display) {
        this.display = display;
    }

    public int getHardDrive() {
        return hardDrive;
    }
     public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }
     public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }


    public boolean isTouch() {
        return touch;
    }
      public void setTouch(boolean touch) {
        this.touch = touch;
    }

     
   public String toString()
    {
        return "Laptop Brand: "+laptopBrand+"\n"+"Laptop Processor: "+processor+"\n"+"Laptop Operating System: "+operatingSystem+"\n"+"Laptop Hard Drive: "+hardDrive+"\n"+"Laptop Display: "+display+"\n"+"Laptop Is Touch: "+touch;
    }
    
       
}
    
    

 

    

   

   
  
    
 

    
