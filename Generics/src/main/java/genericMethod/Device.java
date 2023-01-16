package genericMethod;

public class Device {
    private String manufacturer;
    private String memory;
    private String capacity;

    public Device() {
    }

    public Device(String manufacturer, String memory, String capacity) {
        this.manufacturer = manufacturer;
        this.memory = memory;
        this.capacity = capacity;
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

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Device{" +
                "manufacturer='" + manufacturer + '\'' +
                ", memory='" + memory + '\'' +
                ", capacity='" + capacity + '\'' +
                '}';
    }
}
