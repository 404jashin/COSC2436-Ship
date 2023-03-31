/**
 *  ShipDemo.java
 *  Creates and displays Ship, CruiseShip, and CargoShip objects.
 *  COSC-2436.902
 *  02/08/2023
 *  @author Joshua Williams
 */

public class ShipDemo
{
    public static void main(String[] args) throws Exception
    {
        Ship ships[] = new Ship[3];
        Ship battleship = new Ship("USS Texas", "1912");
        CargoShip cargo = new CargoShip("Ever Ace", "2021", 24000);
        CruiseShip cruise = new CruiseShip("Titanic", "1911", 3300);
        ships[0] = battleship;
        ships[1] = cargo;
        ships[2] = cruise;

        for(int i = 0; i < 3; i++)
        {
            System.out.println(ships[i].toString());
        }
    }
}
