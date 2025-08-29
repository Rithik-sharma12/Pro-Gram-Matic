package com.example.music;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class DigitalPaintingApp extends Application {
    private double brushSize = 10.0;
    private Color brushColor = Color.BLACK;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Digital Painting Application");

        // Root layout
        BorderPane root = new BorderPane();
        root.setStyle("-fx-background-color: #282c34;");

        // Canvas setup
        Canvas canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setLineWidth(brushSize);
        clearCanvas(gc);

        // Brush settings panel
        HBox brushSettings = createBrushSettingsPanel(gc);

        // Event handlers for painting
        canvas.setOnMousePressed(e -> {
            gc.beginPath();
            gc.moveTo(e.getX(), e.getY());
            gc.stroke();
        });

        canvas.setOnMouseDragged(e -> {
            gc.lineTo(e.getX(), e.getY());
            gc.stroke();
        });

        // Layout setup
        root.setCenter(canvas);
        root.setTop(brushSettings);
        BorderPane.setMargin(brushSettings, new Insets(10));

        // Scene setup
        Scene scene = new Scene(root, 800, 700);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private HBox createBrushSettingsPanel(GraphicsContext gc) {
        // Color Picker
        ColorPicker colorPicker = new ColorPicker(brushColor);
        colorPicker.setOnAction(e -> {
            brushColor = colorPicker.getValue();
            gc.setStroke(brushColor);
        });

        // Brush Size Slider
        Slider brushSizeSlider = new Slider(1, 50, brushSize);
        brushSizeSlider.setShowTickLabels(true);
        brushSizeSlider.setShowTickMarks(true);
        brushSizeSlider.setMajorTickUnit(10);
        brushSizeSlider.setOnMouseDragged(e -> {
            brushSize = brushSizeSlider.getValue();
            gc.setLineWidth(brushSize);
        });

        // Quick Color Buttons
        HBox quickColors = createQuickColorButtons(gc);

        // Clear Canvas Button
        Button clearButton = new Button("Clear Canvas");
        clearButton.setStyle("-fx-background-color: #ff5555; -fx-text-fill: white; -fx-font-weight: bold;");
        clearButton.setOnAction(e -> clearCanvas(gc));

        // Brush Settings Layout
        HBox brushSettings = new HBox(10, new Label("Brush Color:"), colorPicker, new Label("Brush Size:"), brushSizeSlider, quickColors, clearButton);
        brushSettings.setAlignment(Pos.CENTER);
        brushSettings.setPadding(new Insets(10));
        brushSettings.setStyle("-fx-background-color: #44475a; -fx-border-color: #6272a4; -fx-border-width: 2px;");
        return brushSettings;
    }

    private HBox createQuickColorButtons(GraphicsContext gc) {
        Color[] colors = {Color.BLACK, Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE};
        HBox quickColors = new HBox(5);
        for (Color color : colors) {
            Button colorButton = new Button();
            colorButton.setStyle("-fx-background-color: #" + color.toString().substring(2, 8) + "; -fx-border-color: white; -fx-border-radius: 50%;");
            colorButton.setMinSize(30, 30);
            colorButton.setOnAction(e -> {
                brushColor = color;
                gc.setStroke(brushColor);
            });
            quickColors.getChildren().add(colorButton);
        }
        return quickColors;
    }

    private void clearCanvas(GraphicsContext gc) {
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
        gc.setStroke(brushColor);
        gc.setLineWidth(brushSize);
    }
}
