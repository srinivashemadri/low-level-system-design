package BuilderDesignPattern;

import java.lang.management.MemoryType;

public class Computer {
    private GPUType GPU;
    private CPUType CPU;
    private int RAM;
    private DiskType diskType;
    private int diskSize;

    public Computer(ComputerBuilder builder) {
        this.GPU = builder.getGPU();
        this.CPU = builder.getCPU();
        this.RAM = builder.getRAM();
        this.diskType = builder.getDiskType();
        this.diskSize = builder.getDiskSize();
    }

    public void print() {
        System.out.println("GPU: " + GPU);
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM);
        System.out.println("DiskType: " + diskType);
        System.out.println("DiskSize: " + diskSize);
        System.out.println("------");
    }
}
