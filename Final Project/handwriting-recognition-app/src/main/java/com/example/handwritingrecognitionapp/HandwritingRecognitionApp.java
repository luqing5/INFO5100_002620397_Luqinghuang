package com.example.handwritingrecognitionapp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class HandwritingRecognitionApp extends Application {

    private Canvas canvas;

    private Label recognitionLabel;

    private static String tfDir;

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("No python script dir");
            System.exit(1);
        }
        tfDir = args[0];
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Handwriting Recognition");

        canvas = new Canvas(400, 400);

        Button recognizeButton = new Button("Recognize");
        recognizeButton.setOnAction(e -> CompletableFuture.runAsync(this::recognizeDigit));

        Button clearButton = new Button("Clear");
        clearButton.setOnAction(e -> clearCanvas());

        recognitionLabel = new Label();
        recognitionLabel.setText("Recognition Result: ");

        VBox root = new VBox(10);
        root.getChildren().addAll(canvas, recognizeButton, clearButton, recognitionLabel);

        Scene scene = new Scene(root, 400, 520);
        setupCanvas();

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void setupCanvas() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setLineWidth(44);
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.setStroke(Color.WHITE);
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        canvas.setOnMousePressed(e -> {
            gc.beginPath();
            gc.lineTo(e.getSceneX(), e.getSceneY());
            gc.stroke();
        });

        canvas.setOnMouseDragged(e -> {
            gc.lineTo(e.getSceneX(), e.getSceneY());
            gc.stroke();
        });

        canvas.setOnMouseReleased(e -> {
            gc.closePath();
        });
    }

    private void recognizeDigit() {
        String imagePath = saveCanvasToImage();
        String result = callPython(imagePath);
        Platform.runLater(() -> {
            if (result == null) {
                recognitionLabel.setText("Recognize failed.");
            } else {
                recognitionLabel.setText("Recognition Result: " + result);
            }
        });
    }

    private String saveCanvasToImage() {
        String filePath = System.getProperty("java.io.tmpdir") + "output.png";
        Platform.runLater(() -> {
            WritableImage writableImage = new WritableImage((int) canvas.getWidth(), (int) canvas.getHeight());
            canvas.snapshot(null, writableImage);
            BufferedImage image = SwingFXUtils.fromFXImage(writableImage, null);
            try {
                ImageIO.write(image, "png", new File(filePath));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
//        Image tmp = image.getScaledInstance(28, 28, Image.SCALE_SMOOTH);
//        BufferedImage dimg = new BufferedImage(28, 28, BufferedImage.TYPE_INT_ARGB);
//        Graphics2D g2d = dimg.createGraphics();
//        g2d.drawImage(tmp, 0, 0, null);
//        g2d.dispose();
        return filePath;
    }

    private String callPython(String imagePath) {
        System.out.println(imagePath);
        String resultFile = System.getProperty("java.io.tmpdir") + "output.txt";
        System.out.println(resultFile);
        String[] cmds = {"/bin/sh", "-c", "cd " + tfDir + ";python predict.py " + imagePath + " " + resultFile};
        System.out.println(Arrays.toString(cmds));
        try {
            Process process = Runtime.getRuntime().exec(cmds);
            int exitCode = process.waitFor();
            if (exitCode != 0) {
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()))) {
                    System.err.println("Error: " + reader.lines().collect(Collectors.joining()));
                }
                return null;
            }
            String output = new String(Files.readAllBytes(Paths.get(resultFile)));
            System.out.println("Result: " + output);
            return output;
        } catch (IOException | InterruptedException e) {
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
            return null;
        }
    }

    private void clearCanvas() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        recognitionLabel.setText("Recognition Result: ");
    }

}