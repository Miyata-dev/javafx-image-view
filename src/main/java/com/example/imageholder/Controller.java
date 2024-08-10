package com.example.imageholder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;

//ImageView is a node for painting images loaded  with images.
//Image = photograph
//ImageView = picture frame.

public class Controller {
    @FXML
    ImageView imageView;
    Button button;

    Image catImageOne = new Image(getClass().getResource("cute-cat-an.jpg").toExternalForm());
    Image catImageTwo = new Image(getClass().getResource("cute-cat.jpg").toExternalForm());
    //para hacer el toggle de imagenes.
    Image[] images = new Image[]{
        catImageOne,
        catImageTwo
    };

    int selectedImageIndex = 0;
    boolean isOpacityChanged = false;

    public void displayImage() {
        if (selectedImageIndex == 0) {
            imageView.setImage(images[selectedImageIndex]);
            selectedImageIndex = 1;
        } else {
            imageView.setImage(images[selectedImageIndex]);
            selectedImageIndex = 0;
        }
    }

    public void changeOpacity() {
        if (!isOpacityChanged) {
            imageView.setOpacity(0.8);
            isOpacityChanged = true;
        } else {
            imageView.setOpacity(1);
            isOpacityChanged = false;
        }
    }
}