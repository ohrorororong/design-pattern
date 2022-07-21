package creational_patterns.abstract_factory.after;

import creational_patterns.abstract_factory.after.factory.ShipFactory;
import creational_patterns.abstract_factory.after.factory.WhiteShipFactory;
import creational_patterns.abstract_factory.after.factory.parts.WhiteShipProFactory;
import creational_patterns.abstract_factory.after.product.ship.Ship;

public class ShipInventory {
    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getEngine().getClass());
        System.out.println(ship.getHandle().getClass());
    }
}