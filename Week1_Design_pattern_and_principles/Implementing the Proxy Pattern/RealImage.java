
public class RealImage implements Image {
    private String imageUrl;

    public RealImage(String imageUrl) {
        this.imageUrl = imageUrl;
        loadImageFromServer();
    }

    private void loadImageFromServer() {
        System.out.println("Loading image from server: " + imageUrl);
        // Simulate loading time
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + imageUrl);
    }
}
