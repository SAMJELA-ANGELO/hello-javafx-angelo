package application;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {

        Label label = new Label();
        label.setText("Hello World");

        VBox MyPane = new VBox();
        MyPane.getChildren().add(label);

        Scene MyScene = new Scene(MyPane);


        stage.setTitle("My First JFX Project");
        stage.setWidth(600);
        stage.setHeight(400);
        stage.setScene(MyScene);
        stage.show();





    }
}