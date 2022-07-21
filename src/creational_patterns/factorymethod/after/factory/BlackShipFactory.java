package creational_patterns.factorymethod.after.factory;

import creational_patterns.factorymethod.after.product.BlackShip;
import creational_patterns.factorymethod.after.product.Ship;

/**
 * 팩토리 안에서 구체적인 제품을 만드는게 포인트다.
 */
public class BlackShipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
