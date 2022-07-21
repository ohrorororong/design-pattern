package creational_patterns.abstract_factory.custom.product.part;

import creational_patterns.abstract_factory.custom.product.cpu.CPU;
import creational_patterns.abstract_factory.custom.product.mainboard.MainBoard;
import creational_patterns.abstract_factory.custom.product.memory.Memory;

public interface ProductPart {
    CPU getCpu();
    MainBoard getMainBoard();
    Memory getMemory();
}
