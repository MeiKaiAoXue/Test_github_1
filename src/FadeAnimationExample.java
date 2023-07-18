import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FadeAnimationExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Fade Animation Example");

        Rectangle rectangle = new Rectangle(100, 100, Color.BLUE);

        StackPane root = new StackPane(rectangle);
        Scene scene = new Scene(root, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();

        // 创建FadeTransition
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(2), rectangle);
        fadeTransition.setFromValue(1.0);
        fadeTransition.setToValue(0.2);
        fadeTransition.setCycleCount(4);
        fadeTransition.setAutoReverse(true);

        // 启动动画
        fadeTransition.play();
    }
}
