package abstract_factory.custom;

import abstract_factory.custom.factory.MinPcFactoryImpl;
import abstract_factory.custom.factory.MindPcFactory;
import abstract_factory.custom.product.Computer;
import abstract_factory.custom.product.part.ProductPart20721;
import abstract_factory.custom.product.part.ProductPart20776;

public class Main {
    public static void main(String[] args) {
        MindPcFactory mindPcFactory = new MinPcFactoryImpl(new ProductPart20721());
        Computer computer = mindPcFactory.createComputer();
        System.out.println(computer);
    }
}
