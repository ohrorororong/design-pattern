package creational_patterns.factorymethod.after;


import creational_patterns.factorymethod.after.factory.BlackShipFactory;
import creational_patterns.factorymethod.after.factory.ShipFactory;
import creational_patterns.factorymethod.after.factory.WhiteShipFactory;
import creational_patterns.factorymethod.after.product.Ship;

public class Main {
    public static void main(String[] args) {
        Ship whiteship = create(new WhiteShipFactory(), "Blackship", "hasfw@naver.com");
        System.out.println(whiteship);

        Ship blackship = create(new BlackShipFactory(), "Blackship", "hasfw@naver.com");
        System.out.println(blackship);
    }

    private static Ship create(ShipFactory shipFactory, String name, String email) {
        return shipFactory.orderShip(name, email);
    }
}