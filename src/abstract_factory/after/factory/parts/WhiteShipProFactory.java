package abstract_factory.after.factory.parts;

import abstract_factory.after.factory.ShipPartsFactory;
import abstract_factory.after.product.engine.Engine;
import abstract_factory.after.product.engine.WhiteProEngine;
import abstract_factory.after.product.handle.Handle;
import abstract_factory.after.product.handle.WhiteProHandle;

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
