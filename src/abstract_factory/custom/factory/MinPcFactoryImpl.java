package abstract_factory.custom.factory;

import abstract_factory.custom.product.Computer;
import abstract_factory.custom.product.part.ProductPart;

public class MinPcFactoryImpl implements MindPcFactory {

    private final ProductPart productPart;

    public MinPcFactoryImpl(ProductPart productPart) {
        this.productPart = productPart;
    }

    @Override
    public Computer createComputer() {
        Computer computer = new Computer();
        computer.setCpu(productPart.getCpu());
        computer.setMainBoard(productPart.getMainBoard());
        computer.setMemory(productPart.getMemory());
        return computer;
    }
}
