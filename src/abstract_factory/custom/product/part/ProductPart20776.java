package abstract_factory.custom.product.part;

import abstract_factory.custom.product.cpu.CPU;
import abstract_factory.custom.product.cpu.IntelCorei7_12th12700KF;
import abstract_factory.custom.product.mainboard.MSIMAGB660MDDR4;
import abstract_factory.custom.product.mainboard.MainBoard;
import abstract_factory.custom.product.memory.DDR4_3600CL18TOUGHRAMRGB_Black;
import abstract_factory.custom.product.memory.Memory;

public class ProductPart20776 implements ProductPart {
    @Override
    public CPU getCpu() {
        return new IntelCorei7_12th12700KF();
    }

    @Override
    public MainBoard getMainBoard() {
        return new MSIMAGB660MDDR4();
    }

    @Override
    public Memory getMemory() {
        return new DDR4_3600CL18TOUGHRAMRGB_Black();
    }
}
