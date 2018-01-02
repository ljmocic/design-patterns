package behavioral.observer;

public class MainObserver {

    public static void main(String[] args) {

        // Create model and view
        Model model = new Model("default");
        View view = new View("View 1");

        // Tell view to update when model changes
        model.addObserver(view);

        // Now view should say that it has been notified by model
        model.setString("Model update 1");
        model.setString("Model update 2");
        model.setString("Model update 3");

        // We can add more views to be updated on model change
        View additionalView = new View("View 2");
        model.addObserver(additionalView);

        // Both views should be updated on this model change
        model.setString("Model update 4");
    }

}
