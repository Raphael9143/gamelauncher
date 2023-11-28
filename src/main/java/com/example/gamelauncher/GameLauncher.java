package com.example.gamelauncher;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public abstract class GameLauncher {
    @FXML protected ImageView playButton;
    @FXML protected ImageView exitButton;
    public abstract void getWordList();
}
