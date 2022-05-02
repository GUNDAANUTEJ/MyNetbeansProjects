/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersales;

import java.util.ArrayList;

/**
 *
 * @author GUNDA SAI NAGA ANU TEJA
 */
public class Retailer {
   
    /**
     * Declared all the private variables
     */
    private String retailerName;
    private String address;
    private ArrayList<Beer> beerList;

    /**
     * constructor with retailerName and address
     * @param retailerName
     * @param address
     */
    public Retailer(String retailerName, String address) {
        this.retailerName = retailerName;
        this.address = address;
        beerList = new ArrayList<Beer>();
    }

    /**
     * Gets the retailer name
     * @return
     */
    public String getRetailerName() {
        return retailerName;
    }

    /**
     * Sets the retailer name
     * @param retailerName
     */
    public void setRetailerName(String retailerName) {
        this.retailerName = retailerName;
    }

    /**
     * gets the address
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the Address from driver class
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * returns list of Beers
     * @return
     */
    public ArrayList<Beer> getBeerList() {
        return beerList;
    }

    /**
     * Returns a boolean when the given bear name is present in the Beer object
     * @param beerName
     * @return
     */
    public boolean isAvailable(String beerName) {
        boolean valid = false;
        for (int i = 0; i <= beerList.size(); i++) {
            if (beerList.get(i).getBeerName().equalsIgnoreCase(beerName)) {
                return valid = true;
            } else {
                return valid = false;
            }
        }
        return valid;
    }

    /**
     * Adds the beer obj
     * @param newBeer
     */
    public void addNewBeer(Beer newBeer) {
        int flg = 0;
        for (Beer beer : beerList) {
            if (beer.equals(newBeer)) {
                flg = 1;
            }
        }
        if (flg == 0) {
            beerList.add(newBeer);
        }
    }

    /**
     * removes the beer name when the given name present in Beer object
     * @param beerName
     * @return
     */
    public Beer removeBeer(String beerName) {
        Beer rem = null;
        for (int i = 0; i < beerList.size(); i++) {
            if (beerList.get(i).getBeerName().equalsIgnoreCase(beerName)) {
                rem = beerList.get(i);
                beerList.remove(i);
            }
        }
        return rem;
    }

    /**
     * Returns the list of beers for which Abv is greater than 4
     * @return
     */
    public ArrayList<Beer> getStrongBeers() {
        ArrayList<Beer> brList = new ArrayList<Beer>();
        for (Beer beer : beerList) {
            if (beer.getAbv() > 4) {
                brList.add(beer);
            }
        }
        return brList;
    }

    /**
     * Returns the list of beers for Abv value is less than or equal to 4
     * @return
     */
    public ArrayList<Beer> getLightBeers() {
        ArrayList<Beer> light = new ArrayList<Beer>();
        for (Beer b : beerList) {
            if (b.getAbv() <= 4) {
                light.add(b);
            }
        }
        return light;
    }

    /**
     * returns the index value which is int
     * @param beerName
     * @return
     */
    public int getIndexinList(String beerName) {
        int num = -1;
        for (Beer beer : beerList) {
            if (beer.getBeerName().equalsIgnoreCase(beerName)) {
                num = beerList.indexOf(beer);
            }
        }
        return num;
    }

    /**
     * Returns all the variables required
     * @return
     */
    @Override
    public String toString() {
        String finalDtl ="";
        for(Beer beer : beerList){
            finalDtl = finalDtl +beer.toString();
        }
        return finalDtl;
    }
   
   
}
