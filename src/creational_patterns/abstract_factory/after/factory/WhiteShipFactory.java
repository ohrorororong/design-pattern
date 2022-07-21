package creational_patterns.abstract_factory.after.factory;

import creational_patterns.abstract_factory.after.product.ship.Ship;
import creational_patterns.abstract_factory.after.product.ship.WhiteShip;

public class WhiteShipFactory implements ShipFactory {

    private final ShipPartsFactory partsFactory;

    public WhiteShipFactory(ShipPartsFactory partsFactory) {
        this.partsFactory = partsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setEngine(partsFactory.getEngine());
        ship.setHandle(partsFactory.getHandle());
        return ship;
    }
}
