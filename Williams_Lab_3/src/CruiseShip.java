/**
 *  CruiseShip.java
 *  COSC-2436.902
 *  02/08/2023
 *  @author Joshua Williams
 */

public class CruiseShip extends Ship
{
    private int passengers; // max occupancy of the CruiseShip.

    /**
     * Constructor.
     * @param n the name of the CruiseShip.
     * @param y the year the CruiseShip was built.
     * @param p the maximum number of passengers the CruiseShip can hold.
     */
    public CruiseShip(String n, String y, int p)
    {
        super(n, y);
        passengers = p;
    }

    /**
     * Updates the maximum occupancy of the CruiseShip.
     * @param p the updated maximum occupancy of the CruiseShip.
     */
    public void setPassengers(int p)
    {
        passengers = p;
    }

    /**
     * Accessor method to return the maximum occupancy of the CruiseShip.
     * @return the maximum occupancy of the CruiseShip.
     */
    public int getPassengers()
    {
        return passengers;
    }

    /**
     * Creates a String that displays the CruiseShip's details.
     * @return a String containing the details of the CruiseShip.
     */
    public String toString()
    {
        return "Cruise Ship:\nShip Name:\t" + this.getName() + "\nMax Occupancy:\t" + this.passengers + " passengers\n";
    }
}
