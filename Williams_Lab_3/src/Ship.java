/**
 *  Ship.java
 *  COSC-2436.902
 *  02/08/2023
 *  @author Joshua Williams
 */

public class Ship
{
    private String name;        // the name of the ship.
    private String yearBuilt;   // the year the ship was built.

    /**
     * Constructor.
     * @param n the name of the ship.
     * @param y the year the ship was built.
     */
    public Ship(String n, String y)
    {
        name = n;
        yearBuilt = y;
    }

    /**
     * Mutator method to assign a new name to the ship.
     * @param n the updated name of the ship.
     */
    public void setName(String n)
    {
        name = n;
    }

    /**
     * Mutator method to change the year that the ship was built.
     * @param y the updated year that the ship was built.
     */
    public void setYearBuilt(String y)
    {
        yearBuilt = y;
    }

    /**
     * Accessor method to return the name of the ship.
     * @return the name of the ship.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Accessor method to return the year that the ship was built.
     * @return the year that the ship was built.
     */
    public String getYearBuilt()
    {
        return yearBuilt;
    }

    /**
     * Creates a String that displays the ship's details.
     * @return a String containing the details of the ship.
     */
    public String toString()
    {
        return "Ship:\nShip Name:\t" + this.name + "\nYear Built:\t" + this.yearBuilt + "\n";
    }
}
