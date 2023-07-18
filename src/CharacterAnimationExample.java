import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class CharacterAnimationExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Character Animation Example");

        // Load the character image
        Image characterImage = new Image("C:\\Users\\meisiyu\\Desktop\\session\\diamond_01.jpg");
        ImageView characterImageView = new ImageView(characterImage);

        StackPane root = new StackPane(characterImageView);
        Scene scene = new Scene(root, 400, 400);

        primaryStage.setScene(scene);
        primaryStage.show();

        // Create TranslateTransition to make the character walk
        TranslateTransition walkTransition = new TranslateTransition(Duration.seconds(2), characterImageView);
        walkTransition.setByX(200);
        walkTransition.setCycleCount(4);
        walkTransition.setAutoReverse(true);

        // Create RotateTransition to make the character wave hand
        RotateTransition waveTransition = new RotateTransition(Duration.seconds(1), characterImageView);
        waveTransition.setFromAngle(0);
        waveTransition.setToAngle(20);
        waveTransition.setCycleCount(4);
        waveTransition.setAutoReverse(true);

        // Run the animations in parallel
        ParallelTransition parallelTransition = new ParallelTransition(walkTransition, waveTransition);
        parallelTransition.play();
    }
}

