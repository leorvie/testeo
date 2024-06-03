package org.example.demo2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {/**
        // Crear los nodos (cuadrados)
        Rectangle cuadradoGrande = new Rectangle(100, 100, Color.BLUE);
        Rectangle cuadradoPequeno = new Rectangle(50, 50, Color.RED);

        // Crear un StackPane y agregar los nodos
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(cuadradoGrande, cuadradoPequeno);

        // Mostrar la escena
        Scene scene = new Scene(stackPane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Superposición de Cuadrados");
        primaryStage.show();**/

        StackPane stackPane = new StackPane(); // Crea un único StackPane

        int type = 2; // Cambia esto según tus necesidades
        boolean vertical = true; // Cambia esto según tus necesidades

        for (int i = 0; i < type; i++) {
            Polygon triangle = new Polygon(0.0, 0.0, 0.0, 30.0, 30.0, 15.0);
            triangle.setFill(Color.BLACK);

            Polygon triangle1 = new Polygon(0.0, 0.0, 0.0, 15.0, 15.0, 7.5);
            triangle1.setFill(Color.GRAY);

            if (vertical) {
                Rotate rotate = new Rotate(90, 0, 0); // Ángulo de 90 grados, centro en (0, 0)
                triangle.getTransforms().add(rotate);
                Rotate rotate1 = new Rotate(90, -6, -10); // Ángulo de 90 grados, centro en (0, 0)
                triangle1.getTransforms().add(rotate1);

            }


            stackPane.getChildren().addAll(triangle, triangle1);
        }

        Scene scene = new Scene(stackPane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Superposición de Triángulos");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}