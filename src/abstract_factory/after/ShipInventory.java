package abstract_factory.after;


import abstract_factory.after.factory.ShipFactory;
import abstract_factory.after.factory.WhiteShipFactory;
import abstract_factory.after.factory.parts.WhiteShipPartsFactory;
import abstract_factory.after.factory.parts.WhiteShipProFactory;
import abstract_factory.after.product.ship.Ship;

public class ShipInventory {
    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getEngine().getClass());
        System.out.println(ship.getHandle().getClass());

    }
}
