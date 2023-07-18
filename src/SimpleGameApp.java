import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class SimpleGameApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Simple Game");

        Pane root = new Pane();
        Scene scene = new Scene(root, 800, 600);

        // Create a rectangle as the player character
        Rectangle player = new Rectangle(50, 50, Color.BLUE);
        player.setX(375);
        player.setY(275);

        // Add the player to the root pane
        root.getChildren().add(player);

        // Handle keyboard input for player movement
        scene.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP:
                    player.setY(player.getY() - 100);
                    break;
                case DOWN:
                    player.setY(player.getY() + 10);
                    break;
                case LEFT:
                    player.setX(player.getX() - 10);
                    break;
                case RIGHT:
                    player.setX(player.getX() + 100);
                    break;
            }
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
