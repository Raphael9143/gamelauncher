package com.example.gamelauncher;

import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

public class HangManController extends GameLauncher implements Initializable, UIGame {
    @FXML private ImageView hangImageView;
    @FXML private ImageView exitButton;
    @FXML private ImageView playButton;
    @FXML private Label wordLabel;
    @FXML private Label messageLabel;
    @FXML private Button AButton, BButton, CButton, DButton, EButton, FButton, GButton, HButton, IButton, JButton, KButton, LButton, MButton, NButton, OButton, PButton, QButton, RButton, SButton, TButton, UButton, VButton, WButton, XButton, YButton, ZButton;
    @FXML private List<Button> keyboard = new ArrayList<>();

    private final int MAX_WRONG_GUESSES = 7;

    public static List<String> wordList = new ArrayList<>();
    private int wrongGuess = 0;
    private String answer = "";
    private String hiddenWord = "";

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setHover();
    }

    public void setHiddenWord() {
        int length = answer.length();
        String s = "";
        for (int i = 0; i < length; i++) {
            if (answer.charAt(i) == ' ') {
                s += " ";
            } else {
                s += "_";
            }
        }
        hiddenWord = s;
    }

    public void setWordLabel() {
        wordLabel.setText(hiddenWord);
    }

    public void setHangManImageView(boolean next) {
        if (next) {
            wrongGuess = 0;
        }
        String path = "C:\\INT 2204 (OOP)\\java\\HangManJavaFx\\src\\main\\resources\\com\\example\\hangman\\";
        Image image = new Image(path + wrongGuess + ".png");
        hangImageView.setImage(image);
    }

    public void getNewWord() {
        shuffle();
        answer = wordList.get(0);
        setHiddenWord();
        setWordLabel();
        setHangManImageView(true);
    }

    public void getWordList() {
        // lay tu database favDict
        wordList.add("hello");
        wordList.add("bye");
        wordList.add("apple");
        wordList.add("orange");
    }

    public void shuffle() {
        Collections.shuffle(wordList);
    }


    public void updateHiddenWord(char guess) {
        int index = answer.indexOf(guess);
        if (index < 0) {
            if (wrongGuess < MAX_WRONG_GUESSES) {
                wrongGuess++;
            }
            setHangManImageView(false);
            if (wrongGuess == MAX_WRONG_GUESSES) {
                setAllButton(true);
                messageLabel.setText("You lose :(");
                messageLabel.setTextFill(Color.rgb(255, 0, 0));
                wordLabel.setText(answer);
                return;
            }
            messageLabel.setText("Bad guess :(");
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        } else {
            messageLabel.setText("Nice guess!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            for (int i = 0; i < answer.length(); i++) {
                if (guess == answer.charAt(i)) {
                    hiddenWord = hiddenWord.substring(0, i) + guess + hiddenWord.substring(i + 1);
                }
            }
            setWordLabel();
            if (hiddenWord.equals(answer)) {
                messageLabel.setText("You win!");
                messageLabel.setTextFill(Color.rgb(0, 255, 0));
            }
        }
    }

    public void start() {
        setButtonList();
        setAllButton(false);
        getWordList();
        getNewWord();
    }

    public void setButtonList() {
        keyboard.add(AButton);
        keyboard.add(BButton);
        keyboard.add(CButton);
        keyboard.add(DButton);
        keyboard.add(EButton);
        keyboard.add(FButton);
        keyboard.add(GButton);
        keyboard.add(HButton);
        keyboard.add(IButton);
        keyboard.add(JButton);
        keyboard.add(KButton);
        keyboard.add(LButton);
        keyboard.add(MButton);
        keyboard.add(NButton);
        keyboard.add(OButton);
        keyboard.add(PButton);
        keyboard.add(QButton);
        keyboard.add(RButton);
        keyboard.add(SButton);
        keyboard.add(TButton);
        keyboard.add(UButton);
        keyboard.add(VButton);
        keyboard.add(WButton);
        keyboard.add(XButton);
        keyboard.add(YButton);
        keyboard.add(ZButton);
    }

    @Override
    public void setHover() {
        List<ImageView> bt = new ArrayList<>();
        bt.add(playButton);
        bt.add(exitButton);
        for (ImageView btn : bt) {
            btn.setOnMouseEntered(event -> {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), btn);

                scaleTransition.setFromX(1);
                scaleTransition.setFromY(1);

                scaleTransition.setToX(1.2);
                scaleTransition.setToY(1.2);

                scaleTransition.play();
            });
            btn.setOnMouseExited(event -> {
                ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(200), btn);

                scaleTransition.setFromX(1.2);
                scaleTransition.setFromY(1.2);

                scaleTransition.setToX(1);
                scaleTransition.setToY(1);

                scaleTransition.play();
            });
        }
    }

    public void setAllButton(boolean isDisable) {
        for (Button button : keyboard) {
            button.setDisable(isDisable);
        }
    }
    @FXML
    void playButtonOnAction(MouseEvent event) {
        start();
    }

    @FXML
    void exitButtonOnAction(MouseEvent event) {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void AButtonOnAction(ActionEvent event) {
        char guess = 'a';
        updateHiddenWord(guess);
        AButton.setDisable(true);
    }

    @FXML
    void BButtonOnAction(ActionEvent event) {
        char guess = 'b';
        updateHiddenWord(guess);
        BButton.setDisable(true);
    }

    @FXML
    void CButtonOnAction(ActionEvent event) {
        char guess = 'c';
        updateHiddenWord(guess);
        CButton.setDisable(true);
    }

    @FXML
    void DButtonOnAction(ActionEvent event) {
        char guess = 'd';
        DButton.setDisable(true);
        updateHiddenWord(guess);
    }

    @FXML
    void EButtonOnAction(ActionEvent event) {
        char guess = 'e';
        EButton.setDisable(true);
        updateHiddenWord(guess);
    }

    @FXML
    void FButtonOnAction(ActionEvent event) {
        char guess = 'f';
        FButton.setDisable(true);
        updateHiddenWord(guess);
    }

    @FXML
    void GButtonOnAction(ActionEvent event) {
        char guess = 'g';
        GButton.setDisable(true);
        updateHiddenWord(guess);
    }

    @FXML
    void HButtonOnAction(ActionEvent event) {
        char guess = 'h';
        HButton.setDisable(true);
        updateHiddenWord(guess);
    }

    @FXML
    void IButtonOnAction(ActionEvent event) {
        char guess = 'i';
        IButton.setDisable(true);
        updateHiddenWord(guess);
    }

    @FXML
    void JButtonOnAction(ActionEvent event) {
        char guess = 'j';
        JButton.setDisable(true);
        updateHiddenWord(guess);
    }

    @FXML
    void KButtonOnAction(ActionEvent event) {
        char guess = 'k';
        KButton.setDisable(true);
        updateHiddenWord(guess);
    }

    @FXML
    void LButtonOnAction(ActionEvent event) {
        char guess = 'l';
        LButton.setDisable(true);
        updateHiddenWord(guess);
    }

    @FXML
    void MButtonOnAction(ActionEvent event) {
        char guess = 'm';
        MButton.setDisable(true);
        updateHiddenWord(guess);
    }

    @FXML
    void NButtonOnAction(ActionEvent event) {
        char guess = 'n';
        NButton.setDisable(true);
        updateHiddenWord(guess);
    }

    @FXML
    void OButtonOnAction(ActionEvent event) {
        char guess = 'o';
        OButton.setDisable(true);
        updateHiddenWord(guess);
    }

    @FXML
    void PButtonOnAction(ActionEvent event) {
        char guess = 'p';
        PButton.setDisable(true);
        updateHiddenWord(guess);
    }

    @FXML
    void QButtonOnAction(ActionEvent event) {
        char guess = 'q';
        QButton.setDisable(true);
        updateHiddenWord(guess);
    }

    @FXML
    void RButtonOnAction(ActionEvent event) {
        char guess = 'r';
        RButton.setDisable(true);
        updateHiddenWord(guess);
    }

    @FXML
    void SButtonOnAction(ActionEvent event) {
        char guess = 's';
        SButton.setDisable(true);
        updateHiddenWord(guess);
    }

    @FXML
    void TButtonOnAction(ActionEvent event) {
        char guess = 't';
        TButton.setDisable(true);
        updateHiddenWord(guess);
    }

    @FXML
    void UButtonOnAction(ActionEvent event) {
        char guess = 'u';
        UButton.setDisable(true);
        updateHiddenWord(guess);
    }

    @FXML
    void VButtonOnAction(ActionEvent event) {
        char guess = 'v';
        VButton.setDisable(true);
        updateHiddenWord(guess);
    }

    @FXML
    void WButtonOnAction(ActionEvent event) {
        char guess = 'w';
        WButton.setDisable(true);
        updateHiddenWord(guess);
    }

    @FXML
    void XButtonOnAction(ActionEvent event) {
        char guess = 'x';
        XButton.setDisable(true);
        updateHiddenWord(guess);
    }

    @FXML
    void YButtonOnAction(ActionEvent event) {
        char guess = 'y';
        YButton.setDisable(true);
        updateHiddenWord(guess);
    }

    @FXML
    void ZButtonOnAction(ActionEvent event) {
        char guess = 'z';
        ZButton.setDisable(true);
        updateHiddenWord(guess);
    }
}
