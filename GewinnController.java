
public class GewinnController {
    GewinnView view;
    GewinnModel model;

    public GewinnController() {
        view = new GewinnView();
        model = new GewinnModel();
    }

    public static void main(String[] args) {
        new GewinnController();
    }
}