/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersales;

/**
 *
 * @author GUNDA SAI NAGA ANU TEJA
 */
public class Beer {
    
     private String beerName;
    private String beerType;
    private String beerStyle;
    private double abv;
    private int[] availablePackages;

    /**
     * constructor will all the variables
     * @param beerName
     * @param beerType
     * @param beerStyle
     * @param abv
     * @param availablePackages
     */
    public Beer(String beerName, String beerType, String beerStyle, double abv, int[] availablePackages) {
        this.beerName = beerName;
        this.beerType = beerType;
        this.beerStyle = beerStyle;
        this.abv = abv;
        this.availablePackages = availablePackages;
    }

    /**
     * Gets beerName 
     * @return
     */
    public String getBeerName() {
        return beerName;
    }

    /**
     * used to set the beer name
     * @param beerName
     */
    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }

    /**
     * gets the beerType
     * @return
     */
    public String getBeerType() {
        return beerType;
    }

    /**
     * Sets the beerType which is a string value from driver if required
     * @param beerType
     */
    public void setBeerType(String beerType) {
        this.beerType = beerType;
    }

    /**
     * Gets beerStyle
     * @return
     */
    public String getBeerStyle() {
        return beerStyle;
    }

    /**
     * Sets BeerStyle element from driver class if required
     * @param beerStyle
     */
    public void setBeerStyle(String beerStyle) {
        this.beerStyle = beerStyle;
    }

    /**
     * Gets ABV value
     * @return
     */
    public double getAbv() {
        return abv;
    }

    /**
     * Sets the ABV value from driver method if required
     * @param abv
     */
    public void setAbv(double abv) {
        this.abv = abv;
    }

    /**
     * gets Available packages
     * @return
     */
    public int[] getAvailablePackages() {
        return availablePackages;
    }

    /**
     * Returns the boolean values 
     * @return
     */
    public boolean isLightBeer() {
        if (getAbv() <= 4) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * returns all the required variables
     * @return
     */
    @Override
    public String toString() {
        String statement = "";
        for (int i = 0; i < availablePackages.length; i++) {
            if (i == availablePackages.length - 1) {
                statement = statement + availablePackages[i] + ".";
            } else {
                statement = statement + availablePackages[i] + ", ";
            }
        }
        return "Beer Name: " + beerName + "\n"
                + "Beer Type: " + beerType + ", " + "Beer Style: " + beerStyle + "\n"
                + "abv: " + getAbv()+"%" + "\n" + "Available in packs of: " + statement + "\n--------------------\n";
    }
    
}
