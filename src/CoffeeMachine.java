/* A fancy coffee maker.  Makes coffee of varying strengths. */
/**
 *
 * @author RDCOMP
 */
public class CoffeeMachine {

        // The current strength of the coffee.
    private String strength = "Killer Intense";


    /**
     * Set the strength of the Coffee to s; affects the fineness of the
     * grind.
     * "Weak", "Regular", "Strong" are the usual options for s, but you can
     * try others.
     * @param s Text Description of Strength
     */
    public void setStrength(String s) {
        strength = s;
    }
    
    /**
     * Grind the beans for the coffee
     */
    public void grindBeans() {
        System.out.println("Grinding beans for " +
            strength + " coffee.");
    }
    

    /**
     * Brew the coffee into given cup c
     * @param c The cup of coffee to be filled
     */
    public void brew(CoffeeCup c) {
        System.out.println("Brewing coffee.");
        c.fill();
    }
    

    /**
     * Add water to the machine reservoir
     */
    public void addWater() {
        System.out.println("Adding Water");
    }


    /**
     * Add Beans to the Machine
     */
    public void addBeans() {
        System.out.println("Adding Beans");
    }
    

    
}
