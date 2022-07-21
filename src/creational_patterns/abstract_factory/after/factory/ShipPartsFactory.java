package creational_patterns.abstract_factory.after.factory;

import creational_patterns.abstract_factory.after.product.engine.Engine;
import creational_patterns.abstract_factory.after.product.handle.Handle;

public interface ShipPartsFactory {

    Engine getEngine();
    Handle getHandle();
}
