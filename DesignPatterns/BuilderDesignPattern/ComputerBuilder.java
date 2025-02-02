package BuilderDesignPattern;

public class ComputerBuilder{

    private GPUType GPU;
    private CPUType CPU;
    private int RAM;
    private DiskType diskType;
    private int diskSize;


    public GPUType getGPU() {
        return GPU;
    }

    public ComputerBuilder setGPU(GPUType GPU) {
        this.GPU = GPU;
        return this;
    }

    public CPUType getCPU() {
        return CPU;
    }

    public ComputerBuilder setCPU(CPUType CPU) {
        this.CPU = CPU;
        return this;
    }

    public int getRAM() {
        return RAM;
    }

    public ComputerBuilder setRAM(int RAM) {
        this.RAM = RAM;
        return this;
    }

    public int getDiskSize() {
        return diskSize;
    }

    public ComputerBuilder setDiskSize(int diskSize) {
        this.diskSize = diskSize;
        return this;
    }

    public DiskType getDiskType() {
        return diskType;
    }

    public ComputerBuilder setDiskType(DiskType diskType) {
        this.diskType = diskType;
        return this;
    }

    public Computer build(){
        return new Computer(this);
    }
}
