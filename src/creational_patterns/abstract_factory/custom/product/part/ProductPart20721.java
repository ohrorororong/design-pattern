package creational_patterns.abstract_factory.custom.product.part;

import creational_patterns.abstract_factory.custom.product.cpu.AMD5800X;
import creational_patterns.abstract_factory.custom.product.cpu.CPU;
import creational_patterns.abstract_factory.custom.product.mainboard.ASUSTUFGamingB550_PLUS;
import creational_patterns.abstract_factory.custom.product.mainboard.MainBoard;
import creational_patterns.abstract_factory.custom.product.memory.DDR4_3600CL18TOUGHRAMRGB_White;
import creational_patterns.abstract_factory.custom.product.memory.Memory;

public class ProductPart20721 implements ProductPart {
    @Override
    public CPU getCpu() {
        return new AMD5800X();
    }

    @Override
    public MainBoard getMainBoard() {
        return new ASUSTUFGamingB550_PLUS();
    }

    @Override
    public Memory getMemory() {
        return new DDR4_3600CL18TOUGHRAMRGB_White();
    }
}
