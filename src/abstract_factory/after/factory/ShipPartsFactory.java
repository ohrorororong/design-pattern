package abstract_factory.after.factory;

import abstract_factory.after.product.engine.Engine;
import abstract_factory.after.product.handle.Handle;

public interface ShipPartsFactory {

    Engine getEngine();
    Handle getHandle();
}
