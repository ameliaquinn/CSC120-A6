/**
 * A Cafe with inventory of different ingredients
 */
public class Cafe extends Building {

    /**
     * Number of ounces of coffee
     */
    private int nCoffeeOunces;
    /**
     * Number of sugar packets
     */
    private int nSugarPackets;
    /**
     * Number of creams
     */
    private int nCreams;
    /** 
     * Number of cups
     */
    private int nCups;

    /**
     * Constructor for the Cafe class
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     */
    public Cafe(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super("name", "address", 1);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }

    /**
     * First checks that the inventory is sufficient to create a coffee with these ingredients (if not, it restocks the inventory)
     * Sells a coffee by removing the ingredients from the cafe's inventory
     * @param size # of coffee ounces in cofee sold
     * @param nSugarPackets # of sugar packets
     * @param nCreams # of creams
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        if (this.nCoffeeOunces >= size && this.nSugarPackets >= nSugarPackets && this.nCreams >=nCreams && this.nCups >= 1) {
            nCoffeeOunces -= size;
            this.nSugarPackets -= nSugarPackets;
            this.nCreams -= nCreams;
            nCups -= 1;
            System.out.println("Coffee successfully sold!");
        } else {
            restock(size, nSugarPackets, nCreams, 1);
            System.out.println("Restocked! Please try again.");
        }
        
    }

    /**
     * Restocks inventory by adding the given numbers for each variable to the current inventory
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
    }
    
    public static void main(String[] args) {
        Cafe myCafe = new Cafe(10,5,10,5);
        myCafe.sellCoffee(2,3,4);
        myCafe.sellCoffee(100,100,100);
    }
    
}
