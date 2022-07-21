package creational_patterns.abstract_factory.custom;

import creational_patterns.abstract_factory.custom.factory.MinPcFactoryImpl;
import creational_patterns.abstract_factory.custom.factory.MindPcFactory;
import creational_patterns.abstract_factory.custom.product.Computer;
import creational_patterns.abstract_factory.custom.product.part.ProductPart20721;

public class Main {
    public static void main(String[] args) {
        MindPcFactory mindPcFactory = new MinPcFactoryImpl(new ProductPart20721());
        Computer computer = mindPcFactory.createComputer();
        System.out.println(computer);
    }
}
