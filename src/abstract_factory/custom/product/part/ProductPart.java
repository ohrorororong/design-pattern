package abstract_factory.custom.product.part;

import abstract_factory.custom.product.cpu.CPU;
import abstract_factory.custom.product.mainboard.MainBoard;
import abstract_factory.custom.product.memory.Memory;

public interface ProductPart {
    CPU getCpu();
    MainBoard getMainBoard();
    Memory getMemory();
}
