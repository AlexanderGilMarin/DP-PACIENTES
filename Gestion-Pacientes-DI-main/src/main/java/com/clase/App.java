package com.clase;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos; // Importante
import javafx.scene.Parent;  // Importante
import javafx.scene.Scene;
import javafx.scene.layout.StackPane; // Importante
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(
            getClass().getResource("/com/clase/ventana.fxml")
        );
        
        // 1. Cargar el FXML en un nodo raíz
        Parent root = loader.load();

        // 2. Envolver el FXML cargado dentro de un StackPane
        StackPane contenedorCentrado = new StackPane(root);
        
        // 3. Forzar el centrado absoluto del contenido
        StackPane.setAlignment(root, Pos.CENTER);

        // 4. Crear la escena con el contenedor centrado
        Scene scene = new Scene(contenedorCentrado, 1280, 720);
        
        stage.setTitle("Controles Basicos");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}