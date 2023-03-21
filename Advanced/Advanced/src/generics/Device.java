package generics;

public class Device extends Gadget {

    private String manufacturer;
    private String memory;
    private String storingMemory;

    public Device() {

    }

    public Device(String manufacturer, String memory, String storingMemory) {
        this.manufacturer = manufacturer;
        this.memory = memory;
        this.storingMemory = storingMemory;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getStoringMemory() {
        return storingMemory;
    }

    public void setStoringMemory(String storingMemory) {
        this.storingMemory = storingMemory;
    }

    @Override
    public String toString() {
        return "Device{" +
                "manufacturer='" + manufacturer + '\'' +
                ", memory='" + memory + '\'' +
                ", storingMemory='" + storingMemory + '\'' +
                '}';
    }
}
