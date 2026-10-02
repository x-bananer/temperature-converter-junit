package com.inclass1;

import com.inclass1.view.TemperatureRecordsSection;
import com.inclass1.view.TimeRecordsSection;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        VBox layout = new VBox(16, new TemperatureRecordsSection(), new TimeRecordsSection());
        layout.setPadding(new Insets(20));

        stage.setScene(new Scene(layout, 500, 600));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
