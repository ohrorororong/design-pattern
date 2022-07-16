package factorymethod.after.factory;

import factorymethod.after.product.Ship;
import factorymethod.after.product.WhiteShip;

/**
 * 일반 팩토리 패턴인데
 * 문제점은 배가 추가될때 마다 밑에 코드에 추가 해야하고
 * Ship이 변경될 경우 24행 ~ 39행 문제다.
 * 점점 복잡해지고 유지보수가 어려워진다. (OCP 위반)
 *
 * 추상화 시켜 분리시키자.
 */

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
