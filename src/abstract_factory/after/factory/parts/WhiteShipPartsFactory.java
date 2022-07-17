package abstract_factory.after.factory.parts;

import abstract_factory.after.factory.ShipPartsFactory;
import abstract_factory.after.product.engine.Engine;
import abstract_factory.after.product.handle.Handle;
import abstract_factory.after.product.engine.WhiteDefaultEngine;
import abstract_factory.after.product.handle.WhiteDefaultHandle;

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
