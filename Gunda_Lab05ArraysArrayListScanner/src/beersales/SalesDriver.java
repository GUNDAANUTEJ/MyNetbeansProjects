/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersales;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author GUNDA SAI NAGA ANU TEJA
 */
public class SalesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("inputFile1.txt"));
        PrintWriter printer = new PrintWriter(new File("outputFileText1.txt"));
        ArrayList<Retailer> retailers = new ArrayList<>();
        String r = sc.nextLine();
        int fg = 0;
        String retname;
        String retAddress;

        while (sc.hasNext()) {

            retname = sc.nextLine();

            retAddress = sc.nextLine();

            Retailer retailer = new Retailer(retname, retAddress);

            do {

                String beerName = sc.nextLine();
                if ("Retailer".equalsIgnoreCase(beerName)) {
                    fg = 1;
                }
                if (fg == 0) {

                    String beerStyle = sc.nextLine();

                    String beerType = sc.next();

                    double abv = sc.nextDouble();

                    sc.nextLine();
                    String[] packages = sc.nextLine().split(" ");
                    int[] availablePackages = new int[packages.length];
                    for (int i = 0; i < availablePackages.length; i++) {
                        availablePackages[i] = Integer.parseInt(packages[i]);

                    }

                    Beer beer = new Beer(beerName, beerType, beerStyle, abv, availablePackages);
                    retailer.addNewBeer(beer);

                }
            } while (fg == 0 && sc.hasNext());

            retailers.add(retailer);

            fg = 0;
        }
        System.out.println("*********************************");
        printer.println("*********************************");
        System.out.println("***Walmart Inventory for Beer's**");
        printer.println("***Walmart Inventory for Beer's**");
        System.out.println("*********************************");
        printer.println("*********************************");
        for(Retailer retailer : retailers) {
            if (retailer.getRetailerName().equalsIgnoreCase("Walmart")) {
                System.out.println(retailer.getRetailerName());
                printer.println(retailer.getRetailerName());
                System.out.println(retailer.getAddress());
                printer.println(retailer.getAddress());
            }
        }
        System.out.println("*******Beers List*******");
        printer.println("*******Beers List*******");
        System.out.println("********************");
        printer.println("************************");

        for(Retailer retailer : retailers) {
            if (retailer.getRetailerName().equalsIgnoreCase("Walmart")) {
                System.out.print(retailer);
                printer.print(retailer);
            }
        }

        System.out.println("********");
        printer.println("********");
        System.out.println();
        printer.println();

        System.out.println("**************************************");
        printer.println("**************************************");
        System.out.println("*******Remove Wells IPA from Walmart*******");
        printer.println("*******Remove Wells IPA from Walmart*******");
        System.out.println("**************************************");
        printer.println("**************************************");

        for(Retailer retailer : retailers) {

            if (retailer.getRetailerName().equalsIgnoreCase("Walmart")) {

                Beer removed = retailer.removeBeer("Wells IPA");

                System.out.print(removed);
                printer.print(removed);
            }
        }

        System.out.println("***************************");
        printer.println("***************************");
        System.out.println("*******List of strong beer from Hy-Vee*******");
        printer.println("*******List of strong beer from Hy-Vee*******");
        System.out.println("***************************");
        printer.println("***************************");

        ArrayList<Beer> strong = null;
        for(Retailer retailer : retailers) {
            if (retailer.getRetailerName().equalsIgnoreCase("Hy-Vee")) {
                strong = retailer.getStrongBeers();
            }

        }
        for(Beer beer : strong) {
            System.out.print(beer);
            printer.print(beer);
        }
        System.out.println("*************************************");
        System.out.println("*******List of light beer from Sam's Club*******");
        System.out.println("*************************************");
        printer.println("*************************************");
        printer.println("*******List of light beer from Sam's Club*******");
        printer.println("*************************************");

        ArrayList<Beer> light = null;
        for(Retailer retailer : retailers) {
            if (retailer.getRetailerName().equals("Sam's Club")) {
                light = retailer.getLightBeers();
            }

        }
        for(Beer beer : light) {
            System.out.print(beer);
            printer.print(beer);
        }

        System.out.println("****************************************");
        printer.println("****************************************");
        System.out.println("*******Count of different beers available from each retailer*******");
        printer.println("*******Count of different beers available from each retailer*******");
        System.out.println("****************************************");
        printer.println("****************************************");

        String opt = "";

        for(Retailer retailer : retailers) {
            opt = opt + retailer.getRetailerName() + ": " + retailer.getBeerList().size() + "\n";
        }
        System.out.println(opt);
        printer.println(opt);

        System.out.println("******************************************");
        printer.println("******************************************");
        System.out.println("*******All different beers available from all retailers*******");
        printer.println("*******All different beers available from all retailers*******");
        System.out.println("******************************************");
        printer.println("******************************************");
        ArrayList<String> allBeerNames = new ArrayList<String>();

        for(int i = 0; i < retailers.size(); i++) {
            for(int j = 0; j < retailers.get(i).getBeerList().size(); j++) {

                if(allBeerNames.contains((retailers.get(i).getBeerList().get(j).getBeerName()))) {
                    fg = 0;
                } else {
                    fg = 1;
                }
                if(fg == 1) {
                    allBeerNames.add(retailers.get(i).getBeerList().get(j).getBeerName());
                }
            }
        }
        for(String allBeers : allBeerNames) {
            System.out.println(allBeers);
                printer.println(allBeers);
        }
        printer.close();     
    
    }
    
}
