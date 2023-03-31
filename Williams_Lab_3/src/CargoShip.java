/**
 *  CargoShip.java
 *  COSC-2436.902
 *  02/08/2023
 *  @author Joshua Williams
 */

public class CargoShip extends Ship
{
    private int tonnage;    // the tonnage of the CargoShip.

    /**
     * Constructor.
     * @param n the name of the CargoShip.
     * @param y the year the CargoShip was built.
     * @param t the tonnage of the CargoShip.
     */
    public CargoShip(String n, String y, int t)
    {
        super(n, y);
        tonnage = t;
    }

    /**
     * Updates the tonnage of the CargoShip.
     * @param t the updated tonnage of the CargoShip.
     */
    public void setTonnage(int t)
    {
        tonnage = t;
    }

    /**
     * Accessor method to return the tonnage of the CargoShip.
     * @return the tonnage of the CargoShip.
     */
    public int getTonnage()
    {
        return tonnage;
    }

    /**
     * Creates a String that displays the CargoShip's details.
     * @return a String containing the details of the CargoShip.
     */
    public String toString()
    {
        return "Cargo Ship:\nShip Name:\t" + this.getName() + "\nCapacity:\t" + this.tonnage + " containers\n";
    }
}
