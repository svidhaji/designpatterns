package proxypattern;

public class RealImage implements Image {
    private final String filename;

    public RealImage(final String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading " + filename);
    }

    @Override
    public void displayImage() {
        System.out.println("Opening " + filename);
    }

    @Override
    public void showData() {
        System.out.println("Displaying photo: " + filename);
    }
}