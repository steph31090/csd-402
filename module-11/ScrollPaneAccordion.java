/*
 * Stephanie Ramos
 * October 5, 2025
 * Module 11: Programming Assignment
 *
 * Purpose: Demonstrate the use of JavaFX ScrollPane and Accordion.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ScrollPaneAccordion extends Application {

    @Override
    public void start(Stage primaryStage) {
        // ScrollPane Example
        String termsText = "Terms and Conditions:\n"
                + "1. Use this application responsibly.\n"
                + "2. Content may change without notice.\n"
                + "3. Respect other users and follow guidelines.\n"
                + "4. This is sample text to demonstrate scrolling.\n\n"
                + "Additional details...\n".repeat(20); // repeating to make it seem longer

        Label termsLabel = new Label(termsText);
        termsLabel.setWrapText(true); 

        ScrollPane scrollPane = new ScrollPane(termsLabel);
        scrollPane.setFitToWidth(true); 
        scrollPane.setPannable(true);  

        // Accordion Example
        TitledPane pane1 = new TitledPane("Account Help", new Label("Information about account setup and support."));
        TitledPane pane2 = new TitledPane("Payment Options", new Label("Details on accepted payments and billing."));
        TitledPane pane3 = new TitledPane("Privacy Details", new Label("Explanation of privacy settings and data use."));
        TitledPane pane4 = new TitledPane("Contact Support", new Label("Ways to reach our support team for help."));

        Accordion accordion = new Accordion();
        accordion.getPanes().addAll(pane1, pane2, pane3, pane4);

        // Layout
        VBox layout = new VBox(10); // 10 px spacing
        layout.getChildren().addAll(new Label("Terms and Conditions:"), scrollPane,
                                    new Label("Help & Information:"), accordion);

        Scene scene = new Scene(layout, 400, 400);
        primaryStage.setTitle("ScrollPane & Accordion Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
