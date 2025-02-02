package BuilderDesignPattern;

public class BuilderDesignPattern {
    public static void main(String[] args) {
        Computer computer = new ComputerBuilder()
                                .setGPU(GPUType.NVIDIA)
                                .setDiskSize(512)
                                .setCPU(CPUType.INTEL)
                                .setRAM(16)
                                .setDiskType(DiskType.SSD).build();

        computer.print();

        computer = new ComputerBuilder()
                .setDiskSize(512)
                .setCPU(CPUType.INTEL)
                .setRAM(16)
                .setDiskType(DiskType.SSD).build();
        computer.print();
    }
}
