package com.example.exercise9;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SimpleCalculator extends Application {

    private TextField display;

    private double num1 = 0;
    private String operator = "";
    private boolean start = true;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Simple Calculator");

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10));

        display = new TextField();
        display.setEditable(false);
        display.setPrefColumnCount(4);
        gridPane.add(display, 0, 0, 4, 1);

        String[][] buttons = {
                {"7", "8", "9", "/"},
                {"4", "5", "6", "*"},
                {"1", "2", "3", "-"},
                {"0", "C", "=", "+"}
        };

        for (int row = 0; row < buttons.length; row++) {
            for (int col = 0; col < buttons[row].length; col++) {
                Button button = new Button(buttons[row][col]);
                button.setPrefSize(50, 50);
                button.setOnAction(e -> handleButtonClick(button.getText()));
                gridPane.add(button, col, row + 1);
            }
        }

        Scene scene = new Scene(gridPane, 220, 260);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleButtonClick(String value) {
        if (value.matches("[0-9]")) {
            if (start) {
                display.setText(value);
                start = false;
            } else {
                display.appendText(value);
            }
        } else if (value.equals("C")) {
            display.clear();
            num1 = 0;
            operator = "";
            start = true;
        } else if (value.equals("=")) {
            if (!operator.isEmpty()) {
                double num2 = Double.parseDouble(display.getText());
                double result = calculate(num1, num2, operator);
                display.setText(String.valueOf(result));
                num1 = result;
                operator = "";
                start = true;
            }
        } else {
            if (!start) {
                num1 = Double.parseDouble(display.getText());
                operator = value;
                start = true;
            }
        }
    }

    private double calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    // Handle division by zero
                    return Double.POSITIVE_INFINITY;
                }
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
