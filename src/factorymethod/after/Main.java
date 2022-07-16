package factorymethod.after;


import factorymethod.after.factory.BlackShipFactory;
import factorymethod.after.factory.ShipFactory;
import factorymethod.after.factory.WhiteShipFactory;
import factorymethod.after.product.Ship;

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