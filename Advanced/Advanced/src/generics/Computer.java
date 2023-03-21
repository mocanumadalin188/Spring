package generics;

public class Computer extends Device {

    private String videoGraphics;

    public Computer(String videoGraphics) {
        this.videoGraphics = videoGraphics;
    }

    public Computer(String manufacturer, String memory, String storingMemory, String videoGraphics) {
        super(manufacturer, memory, storingMemory);
        this.videoGraphics = videoGraphics;
    }

    public String getVideoGraphics() {
        return videoGraphics;
    }

    public void setVideoGraphics(String videoGraphics) {
        this.videoGraphics = videoGraphics;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "videoGraphics='" + videoGraphics + '\'' +
                '}';
    }
}
