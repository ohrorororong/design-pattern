package creational_patterns.abstract_factory.after.factory.parts;

import creational_patterns.abstract_factory.after.factory.ShipPartsFactory;
import creational_patterns.abstract_factory.after.product.engine.Engine;
import creational_patterns.abstract_factory.after.product.engine.WhiteProEngine;
import creational_patterns.abstract_factory.after.product.handle.Handle;
import creational_patterns.abstract_factory.after.product.handle.WhiteProHandle;

public class WhiteShipProFactory implements ShipPartsFactory {
    @Override
    public Engine getEngine() {
        return new WhiteProEngine();
    }

    @Override
    public Handle getHandle() {
        return new WhiteProHandle();
    }
}
