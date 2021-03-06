package creational_patterns.abstract_factory.custom.product;

import creational_patterns.abstract_factory.custom.product.cpu.CPU;
import creational_patterns.abstract_factory.custom.product.mainboard.MainBoard;
import creational_patterns.abstract_factory.custom.product.memory.Memory;

public class Computer {
    private CPU cpu;
    private Memory memory;
    private MainBoard mainBoard;

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setMainBoard(MainBoard mainBoard) {
        this.mainBoard = mainBoard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", memory=" + memory +
                ", mainBoard=" + mainBoard +
                '}';
    }
}
