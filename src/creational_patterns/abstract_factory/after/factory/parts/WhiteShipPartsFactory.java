package creational_patterns.abstract_factory.after.factory.parts;

import creational_patterns.abstract_factory.after.factory.ShipPartsFactory;
import creational_patterns.abstract_factory.after.product.engine.Engine;
import creational_patterns.abstract_factory.after.product.handle.Handle;
import creational_patterns.abstract_factory.after.product.engine.WhiteDefaultEngine;
import creational_patterns.abstract_factory.after.product.handle.WhiteDefaultHandle;

public class WhiteShipPartsFactory implements ShipPartsFactory {
    @Override
    public Engine getEngine() {
        return new WhiteDefaultEngine();
    }

    @Override
    public Handle getHandle() {
        return new WhiteDefaultHandle();
    }
}
