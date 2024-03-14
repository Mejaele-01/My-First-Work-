package com.example.work1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

//        STAGE SETTING
        BorderPane root = new BorderPane();
        root.setBackground(new Background(new BackgroundFill(Color.web("#808080"), CornerRadii.EMPTY, Insets.EMPTY)));

//        SCENE SETTING
        Scene scene = new Scene(root, 1100, 700);
        stage.setScene(scene);

//        HORIZONTAL BOXES
        HBox hBox1 = new HBox();
        HBox hBox2 = new HBox();
        HBox hBox3 = new HBox();

//        HOUSE NAME
        Label Heading = new Label();
        String txt1 = "@HOUSE 1";
        String txt2 = "@HOUSE 2";
        String txt3 = "@HOUSE 3";
        String txt4 = "@HOUSE 4";
        String txt5 = "@HOUSE 5";
        String txt6 = "@HOUSE 6";
        Font font = Font.font("Cambria ", FontWeight.BOLD, FontPosture.ITALIC, 25);
        Heading.setFont(font);
        Heading.setTextFill(Color.web("#00FF00"));


//      BRIEF INFORMATION
        Label info = new Label();
        String infoDetails = "THIS IS A PRIVATE CONTENT \n\n" +
                "IT SHOW THUMBNAILS\n" +
                "IT DISPLAY A BIGGER PICTURE ON THUBMNAIL CLICK \n\n" +
                "©copyright content\n" +
                "@ITFx cop.co.gov\n" +
                "follow us on:\nFacebook: @ITFx-gov,  Twiter: @ITFx-gov , Instagram: @ITFx-gov ";

        info.setStyle("-fx-padding: 20;");
        Font infoFont = Font.font("Franklin Gothic Book", FontWeight.EXTRA_LIGHT, FontPosture.REGULAR, 15);
        info.setFont(infoFont);
        info.setTextFill(Color.web("#00FF00"));
        info.setLineSpacing(10);
        info.setWrapText(true);
        info.setText(infoDetails);


//        IMAGES
        Image House1 = new Image("House1.jpg");
        Image House2 = new Image("House2.jpg");
        Image House3 = new Image("House3.jpg");
        Image House4 = new Image("House4.jpg");
        Image House5 = new Image("House5.jpg");
        Image House6 = new Image("House6.jpg");

//        IMAGE DETAILS 1
        ImageView imageView1 = new ImageView(House1);
        Label label1 = new Label();
        imageView1.setFitWidth(110);
        imageView1.setPreserveRatio(true);
        label1.setMaxWidth(110);
        label1.setGraphic(imageView1);

//        IMAGE DETAILS 2
        ImageView imageView2 = new ImageView(House2);
        Label label2 = new Label();
        imageView2.setFitWidth(100);
        imageView2.setPreserveRatio(true);
        label2.setMaxWidth(100);
        label2.setGraphic(imageView2);

//        IMAGE DETAILS 3
        ImageView imageView3 = new ImageView(House3);
        Label label3 = new Label();
        imageView3.setFitWidth(100);
        imageView3.setPreserveRatio(true);
        label3.setMaxWidth(100);
        label3.setGraphic(imageView3);

//        IMAGE DETAILS 4
        ImageView imageView4 = new ImageView(House4);
        Label label4 = new Label();
        imageView4.setFitWidth(100);
        imageView4.setPreserveRatio(true);
        label4.setMaxWidth(100);
        label4.setGraphic(imageView4);

//        IMAGE DETAILS 5
        ImageView imageView5 = new ImageView(House5);
        Label label5 = new Label();
        imageView5.setFitWidth(100);
        imageView5.setPreserveRatio(true);
        label5.setMaxWidth(100);
        label5.setGraphic(imageView5);

//        IMAGE DETAILS 6
        ImageView imageView6 = new ImageView(House6);
        Label label6 = new Label();
        imageView6.setFitWidth(100);
        imageView6.setPreserveRatio(true);
        label6.setMaxWidth(100);
        label6.setGraphic(imageView6);


//        TOP HORIZONTAL BOX
        hBox1.setAlignment(Pos.CENTER);
        hBox1.setPrefHeight(90);
        root.setTop(hBox1);
        hBox1.getChildren().addAll(label1, label2, label3, label4, label5, label6);
        hBox1.setSpacing(10);
        hBox1.setStyle("-fx-padding: 10;" +
                "-fx-background-radius: 0 0 10 10;" +
                "-fx-background-color: #606060;" );

//       MIDDLE HORIZONTAL BOX
        hBox2.setAlignment(Pos.CENTER);
        hBox2.setPrefHeight(120);
        root.setCenter(hBox2);
        hBox2.getChildren().addAll(info);
        hBox2.setStyle("-fx-padding: 10; " +
                "-fx-border-insets: 5;" +
                " -fx-border-radius: 5;");

//       BOTTOM HORIZONTAL BOX
        hBox3.setAlignment(Pos.CENTER);
        hBox3.setPrefHeight(40);
        root.setBottom(hBox3);
        hBox3.getChildren().addAll(Heading);
        hBox3.setStyle("-fx-background-radius: 0 0 10 10;" +
                "-fx-background-color: #161F6D;");

//       IMAGE DISPLAY
        ImageView view = new ImageView();
        view.setPreserveRatio(true);
        root.setCenter(view);
        root.setCenter(info);

//        FUNCTIONS  RESPOND TO THUMBNAIL CLICK OF IMAGE 1
        label1.setOnMouseClicked((event) -> {
            try {
                URL resourceUrl = getClass().getResource("/House1.jpg");

                if (resourceUrl != null) {
                    String file = resourceUrl.toExternalForm();

                    view.setFitWidth(1000);
                    root.setCenter(view);
                    view.setImage(new Image(file));
                    Heading.setText(txt1);

                } else {
                    System.err.println("Resource 'House1.jpg' not found!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

//        FUNCTIONS  RESPOND TO THUMBNAIL CLICK OF IMAGE 2
        label2.setOnMouseClicked((event) -> {
            try {
                URL resourceUrl = getClass().getResource("/House2.jpg");

                if (resourceUrl != null) {
                    String file = resourceUrl.toExternalForm();

                    view.setFitWidth(1000);
                    root.setCenter(view);
                    view.setImage(new Image(file));
                    Heading.setText(txt2);

                } else {
                    System.err.println("Resource 'House2.jpg' not found!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

//      FUNCTIONS  RESPOND TO THUMBNAIL CLICK OF IMAGE 3
        label3.setOnMouseClicked((event) -> {
            try {
                URL resourceUrl = getClass().getResource("/House3.jpg");

                if (resourceUrl != null) {
                    String file = resourceUrl.toExternalForm();

                    view.setFitWidth(1000);
                    root.setCenter(view);
                    view.setImage(new Image(file));
                    Heading.setText(txt3);

                } else {
                    System.err.println("Resource 'House3.jpg' not found!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

//      FUNCTIONS  RESPOND TO THUMBNAIL CLICK OF IMAGE 4
        label4.setOnMouseClicked((event) -> {
            try {
                URL resourceUrl = getClass().getResource("/House4.jpg");

                if (resourceUrl != null) {
                    String file = resourceUrl.toExternalForm();

                    view.setFitWidth(1000);
                    root.setCenter(view);
                    view.setImage(new Image(file));
                    Heading.setText(txt4);

                } else {
                    System.err.println("Resource 'House4.jpg' not found!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });


//        FUNCTIONS  RESPOND TO THUMBNAIL CLICK OF IMAGE 5
        label5.setOnMouseClicked((event) -> {
            try {
                URL resourceUrl = getClass().getResource("/House5.jpg");

                if (resourceUrl != null) {
                    String file = resourceUrl.toExternalForm();

                    view.setFitWidth(1000);
                    root.setCenter(view);
                    view.setImage(new Image(file));
                    Heading.setText(txt5);

                } else {
                    System.err.println("Resource 'House5.jpg' not found!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });


//      FUNCTIONS  RESPOND TO THUMBNAIL CLICK OF IMAGE 6
        label6.setOnMouseClicked((event) -> {
            try {
                URL resourceUrl = getClass().getResource("/House6.jpg");

                if (resourceUrl != null) {
                    String file = resourceUrl.toExternalForm();

                    view.setFitWidth(1000);
                    root.setCenter(view);
                    view.setImage(new Image(file));
                    Heading.setText(txt6);

                } else {
                    System.err.println("Resource 'House6.jpg' not found!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        stage.show();
    }

//    MAIN METHOD
    public static void main(String[] args) {
        launch();
    }
}
