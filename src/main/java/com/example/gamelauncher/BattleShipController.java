package com.example.gamelauncher;

import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;


import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import static com.example.gamelauncher.BattleShip.HEIGHT_MAP;
import static com.example.gamelauncher.BattleShip.WIDTH_MAP;

public class BattleShipController extends GameLauncher implements Initializable, UIGame {
    public static final int MAX_WRONG = 10;
    private List<Timeline> timelines = new ArrayList<>();
    private List<TranslateTransition> translateTransitions = new ArrayList<>();
    @FXML private ImageView health1, health2, health3, health4, health5, health6, health7, health8, health9, health10;
    @FXML private Label messageLabel;
    @FXML private Button button00;
    @FXML private Button button10;
    @FXML private Button button20;
    @FXML private Button button30;
    @FXML private Button button40;
    @FXML private Button button50;
    @FXML private Button button60;
    @FXML private Button button70;
    @FXML private Button button80;
    @FXML private Button button90;
    @FXML private Button button01;
    @FXML private Button button11;
    @FXML private Button button21;
    @FXML private Button button31;
    @FXML private Button button41;
    @FXML private Button button51;
    @FXML private Button button61;
    @FXML private Button button71;
    @FXML private Button button81;
    @FXML private Button button91;
    @FXML private Button button02;
    @FXML private Button button12;
    @FXML private Button button22;
    @FXML private Button button32;
    @FXML private Button button42;
    @FXML private Button button52;
    @FXML private Button button62;
    @FXML private Button button72;
    @FXML private Button button82;
    @FXML private Button button92;
    @FXML private Button button03;
    @FXML private Button button13;
    @FXML private Button button23;
    @FXML private Button button33;
    @FXML private Button button43;
    @FXML private Button button53;
    @FXML private Button button63;
    @FXML private Button button73;
    @FXML private Button button83;
    @FXML private Button button93;
    @FXML private Button button04;
    @FXML private Button button14;
    @FXML private Button button24;
    @FXML private Button button34;
    @FXML private Button button44;
    @FXML private Button button54;
    @FXML private Button button64;
    @FXML private Button button74;
    @FXML private Button button84;
    @FXML private Button button94;
    @FXML private Button button05;
    @FXML private Button button15;
    @FXML private Button button25;
    @FXML private Button button35;
    @FXML private Button button45;
    @FXML private Button button55;
    @FXML private Button button65;
    @FXML private Button button75;
    @FXML private Button button85;
    @FXML private Button button95;
    @FXML private Button button06;
    @FXML private Button button16;
    @FXML private Button button26;
    @FXML private Button button36;
    @FXML private Button button46;
    @FXML private Button button56;
    @FXML private Button button66;
    @FXML private Button button76;
    @FXML private Button button86;
    @FXML private Button button96;
    @FXML private Button button07;
    @FXML private Button button17;
    @FXML private Button button27;
    @FXML private Button button37;
    @FXML private Button button47;
    @FXML private Button button57;
    @FXML private Button button67;
    @FXML private Button button77;
    @FXML private Button button87;
    @FXML private Button button97;
    @FXML private Button button08;
    @FXML private Button button18;
    @FXML private Button button28;
    @FXML private Button button38;
    @FXML private Button button48;
    @FXML private Button button58;
    @FXML private Button button68;
    @FXML private Button button78;
    @FXML private Button button88;
    @FXML private Button button98;
    @FXML private Button button09;
    @FXML private Button button19;
    @FXML private Button button29;
    @FXML private Button button39;
    @FXML private Button button49;
    @FXML private Button button59;
    @FXML private Button button69;
    @FXML private Button button79;
    @FXML private Button button89;
    @FXML private Button button99;
    @FXML private Label word1;
    @FXML private Label word2;
    @FXML private Label word3;
    @FXML private Label word4;
    @FXML private Label word5;
    @FXML private Label word6;
    private List<ImageView> healthList = new ArrayList<>();
    private BattleShip btShip;
    private List<List<String>> map;
    private List<List<String>> currentMap;
    private List<String> words;
    private List<String> wordChosen;
    private List<List<Button>> buttonList = new ArrayList<>();

    private int count = 0;
    private int wrong = 0;

    public void setButtonList() {
        List<Button> tmp0 = new ArrayList<>();
        List<Button> tmp1 = new ArrayList<>();
        List<Button> tmp2 = new ArrayList<>();
        List<Button> tmp3 = new ArrayList<>();
        List<Button> tmp4 = new ArrayList<>();
        List<Button> tmp5 = new ArrayList<>();
        List<Button> tmp6 = new ArrayList<>();
        List<Button> tmp7 = new ArrayList<>();
        List<Button> tmp8 = new ArrayList<>();
        List<Button> tmp9 = new ArrayList<>();

        tmp0.add(button00);
        tmp0.add(button10);
        tmp0.add(button20);
        tmp0.add(button30);
        tmp0.add(button40);
        tmp0.add(button50);
        tmp0.add(button60);
        tmp0.add(button70);
        tmp0.add(button80);
        tmp0.add(button90);
        tmp1.add(button01);
        tmp1.add(button11);
        tmp1.add(button21);
        tmp1.add(button31);
        tmp1.add(button41);
        tmp1.add(button51);
        tmp1.add(button61);
        tmp1.add(button71);
        tmp1.add(button81);
        tmp1.add(button91);
        tmp2.add(button02);
        tmp2.add(button12);
        tmp2.add(button22);
        tmp2.add(button32);
        tmp2.add(button42);
        tmp2.add(button52);
        tmp2.add(button62);
        tmp2.add(button72);
        tmp2.add(button82);
        tmp2.add(button92);
        tmp3.add(button03);
        tmp3.add(button13);
        tmp3.add(button23);
        tmp3.add(button33);
        tmp3.add(button43);
        tmp3.add(button53);
        tmp3.add(button63);
        tmp3.add(button73);
        tmp3.add(button83);
        tmp3.add(button93);
        tmp4.add(button04);
        tmp4.add(button14);
        tmp4.add(button24);
        tmp4.add(button34);
        tmp4.add(button44);
        tmp4.add(button54);
        tmp4.add(button64);
        tmp4.add(button74);
        tmp4.add(button84);
        tmp4.add(button94);
        tmp5.add(button05);
        tmp5.add(button15);
        tmp5.add(button25);
        tmp5.add(button35);
        tmp5.add(button45);
        tmp5.add(button55);
        tmp5.add(button65);
        tmp5.add(button75);
        tmp5.add(button85);
        tmp5.add(button95);
        tmp6.add(button06);
        tmp6.add(button16);
        tmp6.add(button26);
        tmp6.add(button36);
        tmp6.add(button46);
        tmp6.add(button56);
        tmp6.add(button66);
        tmp6.add(button76);
        tmp6.add(button86);
        tmp6.add(button96);
        tmp7.add(button07);
        tmp7.add(button17);
        tmp7.add(button27);
        tmp7.add(button37);
        tmp7.add(button47);
        tmp7.add(button57);
        tmp7.add(button67);
        tmp7.add(button77);
        tmp7.add(button87);
        tmp7.add(button97);
        tmp8.add(button08);
        tmp8.add(button18);
        tmp8.add(button28);
        tmp8.add(button38);
        tmp8.add(button48);
        tmp8.add(button58);
        tmp8.add(button68);
        tmp8.add(button78);
        tmp8.add(button88);
        tmp8.add(button98);
        tmp9.add(button09);
        tmp9.add(button19);
        tmp9.add(button29);
        tmp9.add(button39);
        tmp9.add(button49);
        tmp9.add(button59);
        tmp9.add(button69);
        tmp9.add(button79);
        tmp9.add(button89);
        tmp9.add(button99);

        buttonList.add(tmp0);
        buttonList.add(tmp1);
        buttonList.add(tmp2);
        buttonList.add(tmp3);
        buttonList.add(tmp4);
        buttonList.add(tmp5);
        buttonList.add(tmp6);
        buttonList.add(tmp7);
        buttonList.add(tmp8);
        buttonList.add(tmp9);
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

    public void getData() {
        btShip = new BattleShip();
        map = new ArrayList<>();
        currentMap = new ArrayList<>();
        words = new ArrayList<>();
        wordChosen = new ArrayList<>();

        setButtonList();
        this.getButtonList();
        btShip.setRandomMap();

        currentMap = btShip.getCurrentMap();
        map = btShip.getMap();
        words = btShip.getWords();
        wordChosen = btShip.getWordChosen();
    }

    @Override
    public void getWordList() {
        btShip.getWordList();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setHover();
        setHealthList();
        setHealthTransition();
    }

    @FXML
    public void start() {
        messageLabel.setText("");
        wrong = 0;
        getData();
        setWord();
        setAllButton(false);
        setHealth();
    }

    public void setWord() {
        word1.setText(wordChosen.get(0));
        word2.setText(wordChosen.get(1));
        word3.setText(wordChosen.get(2));
        word4.setText(wordChosen.get(3));
        word5.setText(wordChosen.get(4));
        word6.setText(wordChosen.get(5));
    }

    public boolean isWinning() {
        int sumLength = btShip.getSumLength();
        return count == sumLength;
    }

    public boolean isLosing() {
        return wrong == MAX_WRONG;
    }

    public void setButtonByMap() {
        for (int i = 0; i < HEIGHT_MAP; i++) {
            for (int j = 0; j < WIDTH_MAP; j++) {
                String cur = map.get(i).get(j);
                if (cur.equals("*")) {
                    buttonList.get(i).get(j).setText("[]");
                    buttonList.get(i).get(j).setTextFill(Color.rgb(255, 0, 0));
                } else {
                    buttonList.get(i).get(j).setText(cur.toUpperCase());
                    buttonList.get(i).get(j).setDisable(true);
                }
            }
        }
        setAllButton(true);
    }

    public void setAllButton(boolean isDisable) {
        for (List<Button> b1 : buttonList) {
            for (Button b2 : b1) {
                b2.setText("");
                b2.setTextFill(Color.BLACK);
                b2.setDisable(isDisable);
            }
        }
    }

    public void setHealthList() {
        healthList.clear();
        healthList.add(health1);
        healthList.add(health2);
        healthList.add(health3);
        healthList.add(health4);
        healthList.add(health5);
        healthList.add(health6);
        healthList.add(health7);
        healthList.add(health8);
        healthList.add(health9);
        healthList.add(health10);
    }

    public void setHealthTransition() {
        for (ImageView img : healthList) {
            TranslateTransition translateTransition = new TranslateTransition(Duration.millis(75), img);
            translateTransition.setFromX(0);
            translateTransition.setToX(5);
            translateTransition.setAutoReverse(true);
            translateTransitions.add(translateTransition);

            Timeline timeline = new Timeline(
                    new KeyFrame(Duration.ZERO, new KeyValue(img.translateXProperty(), 0)),
                    new KeyFrame(Duration.millis(500), e -> {
                        translateTransition.playFromStart();
                    })
            );
            timeline.setCycleCount(Timeline.INDEFINITE);
            timelines.add(timeline);
        }
    }
    
    public void setHealth() {
        if (MAX_WRONG - wrong == 1) {
            timelines.forEach(Timeline::play);
        } else {
            timelines.forEach(Timeline::stop);
        }
        Image healthPath = new Image("C:\\INT 2204 (OOP)\\java\\GameLauncher\\src\\main\\resources\\com\\example\\gamelauncher\\battleship\\health.png");
        Image emptyHealthPath = new Image("C:\\INT 2204 (OOP)\\java\\GameLauncher\\src\\main\\resources\\com\\example\\gamelauncher\\battleship\\emptyhealth.png");
        for (int i = 1; i <= MAX_WRONG - wrong; i++) {
            healthList.get(i - 1).setImage(healthPath);
        }
        for (int i = MAX_WRONG - wrong + 1; i <= MAX_WRONG; i++) {
            healthList.get(i - 1).setImage(emptyHealthPath);
        }
    }

    public List<List<Button>> getButtonList() {
        return buttonList;
    }

    @FXML
    public void exit() {
        Stage stage = (Stage) button00.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void button00(ActionEvent event) {
        int x = 0;
        int y = 0;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button00.setTextFill(Color.rgb(255, 0, 0));
            button00.setText("[]");
        } else {
            count++;
            button00.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button00.setDisable(true);
    }

    @FXML
    public void button10(ActionEvent event) {
        int x = 0;
        int y = 1;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button10.setTextFill(Color.rgb(255, 0, 0));
            button10.setText("[]");
        } else {
            count++;
            button10.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button10.setDisable(true);
    }

    @FXML
    public void button20(ActionEvent event) {
        int x = 0;
        int y = 2;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button20.setTextFill(Color.rgb(255, 0, 0));
            button20.setText("[]");
        } else {
            count++;
            button20.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button20.setDisable(true);
    }

    @FXML
    public void button30(ActionEvent event) {
        int x = 0;
        int y = 3;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button30.setTextFill(Color.rgb(255, 0, 0));
            button30.setText("[]");
        } else {
            count++;
            button30.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button30.setDisable(true);
    }

    @FXML
    public void button40(ActionEvent event) {
        int x = 0;
        int y = 4;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button40.setTextFill(Color.rgb(255, 0, 0));
            button40.setText("[]");
        } else {
            count++;
            button40.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button40.setDisable(true);
    }

    @FXML
    public void button50(ActionEvent event) {
        int x = 0;
        int y = 5;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button50.setTextFill(Color.rgb(255, 0, 0));
            button50.setText("[]");
        } else {
            count++;
            button50.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button50.setDisable(true);
    }

    @FXML
    public void button60(ActionEvent event) {
        int x = 0;
        int y = 6;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button60.setTextFill(Color.rgb(255, 0, 0));
            button60.setText("[]");
        } else {
            count++;
            button60.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button60.setDisable(true);
    }

    @FXML
    public void button70(ActionEvent event) {
        int x = 0;
        int y = 7;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button70.setTextFill(Color.rgb(255, 0, 0));
            button70.setText("[]");
        } else {
            count++;
            button70.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button70.setDisable(true);
    }

    @FXML
    public void button80(ActionEvent event) {
        int x = 0;
        int y = 8;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button80.setTextFill(Color.rgb(255, 0, 0));
            button80.setText("[]");
        } else {
            count++;
            button80.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button80.setDisable(true);
    }

    @FXML
    public void button90(ActionEvent event) {
        int x = 0;
        int y = 9;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button90.setTextFill(Color.rgb(255, 0, 0));
            button90.setText("[]");
        } else {
            count++;
            button90.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button90.setDisable(true);
    }

    @FXML
    public void button01(ActionEvent event) {
        int x = 1;
        int y = 0;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button01.setTextFill(Color.rgb(255, 0, 0));
            button01.setText("[]");
        } else {
            count++;
            button01.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button01.setDisable(true);
    }

    @FXML
    public void button11(ActionEvent event) {
        int x = 1;
        int y = 1;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button11.setTextFill(Color.rgb(255, 0, 0));
            button11.setText("[]");
        } else {
            count++;
            button11.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button11.setDisable(true);
    }

    @FXML
    public void button21(ActionEvent event) {
        int x = 1;
        int y = 2;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button21.setTextFill(Color.rgb(255, 0, 0));
            button21.setText("[]");
        } else {
            count++;
            button21.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button21.setDisable(true);
    }

    @FXML
    public void button31(ActionEvent event) {
        int x = 1;
        int y = 3;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button31.setTextFill(Color.rgb(255, 0, 0));
            button31.setText("[]");
        } else {
            count++;
            button31.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button31.setDisable(true);
    }

    @FXML
    public void button41(ActionEvent event) {
        int x = 1;
        int y = 4;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button41.setTextFill(Color.rgb(255, 0, 0));
            button41.setText("[]");
        } else {
            count++;
            button41.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button41.setDisable(true);
    }

    @FXML
    public void button51(ActionEvent event) {
        int x = 1;
        int y = 5;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button51.setTextFill(Color.rgb(255, 0, 0));
            button51.setText("[]");
        } else {
            count++;
            button51.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button51.setDisable(true);
    }

    @FXML
    public void button61(ActionEvent event) {
        int x = 1;
        int y = 6;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button61.setTextFill(Color.rgb(255, 0, 0));
            button61.setText("[]");
        } else {
            count++;
            button61.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button61.setDisable(true);
    }

    @FXML
    public void button71(ActionEvent event) {
        int x = 1;
        int y = 7;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button71.setTextFill(Color.rgb(255, 0, 0));
            button71.setText("[]");
        } else {
            count++;
            button71.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button71.setDisable(true);
    }

    @FXML
    public void button81(ActionEvent event) {
        int x = 1;
        int y = 8;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button81.setTextFill(Color.rgb(255, 0, 0));
            button81.setText("[]");
        } else {
            count++;
            button81.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button81.setDisable(true);
    }

    @FXML
    public void button91(ActionEvent event) {
        int x = 1;
        int y = 9;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button91.setTextFill(Color.rgb(255, 0, 0));
            button91.setText("[]");
        } else {
            count++;
            button91.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button91.setDisable(true);
    }

    @FXML
    public void button02(ActionEvent event) {
        int x = 2;
        int y = 0;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button02.setTextFill(Color.rgb(255, 0, 0));
            button02.setText("[]");
        } else {
            count++;
            button02.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button02.setDisable(true);
    }

    @FXML
    public void button12(ActionEvent event) {
        int x = 2;
        int y = 1;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button12.setTextFill(Color.rgb(255, 0, 0));
            button12.setText("[]");
        } else {
            count++;
            button12.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button12.setDisable(true);
    }

    @FXML
    public void button22(ActionEvent event) {
        int x = 2;
        int y = 2;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button22.setTextFill(Color.rgb(255, 0, 0));
            button22.setText("[]");
        } else {
            count++;
            button22.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button22.setDisable(true);
    }

    @FXML
    public void button32(ActionEvent event) {
        int x = 2;
        int y = 3;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button32.setTextFill(Color.rgb(255, 0, 0));
            button32.setText("[]");
        } else {
            count++;
            button32.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button32.setDisable(true);
    }

    @FXML
    public void button42(ActionEvent event) {
        int x = 2;
        int y = 4;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button42.setTextFill(Color.rgb(255, 0, 0));
            button42.setText("[]");
        } else {
            count++;
            button42.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button42.setDisable(true);
    }

    @FXML
    public void button52(ActionEvent event) {
        int x = 2;
        int y = 5;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button52.setTextFill(Color.rgb(255, 0, 0));
            button52.setText("[]");
        } else {
            count++;
            button52.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button52.setDisable(true);
    }

    @FXML
    public void button62(ActionEvent event) {
        int x = 2;
        int y = 6;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button62.setTextFill(Color.rgb(255, 0, 0));
            button62.setText("[]");
        } else {
            count++;
            button62.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button62.setDisable(true);
    }

    @FXML
    public void button72(ActionEvent event) {
        int x = 2;
        int y = 7;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button72.setTextFill(Color.rgb(255, 0, 0));
            button72.setText("[]");
        } else {
            count++;
            button72.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button72.setDisable(true);
    }

    @FXML
    public void button82(ActionEvent event) {
        int x = 2;
        int y = 8;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button82.setTextFill(Color.rgb(255, 0, 0));
            button82.setText("[]");
        } else {
            count++;
            button82.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button82.setDisable(true);
    }

    @FXML
    public void button92(ActionEvent event) {
        int x = 2;
        int y = 9;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button92.setTextFill(Color.rgb(255, 0, 0));
            button92.setText("[]");
        } else {
            count++;
            button92.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button92.setDisable(true);
    }

    @FXML
    public void button03(ActionEvent event) {
        int x = 3;
        int y = 0;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button03.setTextFill(Color.rgb(255, 0, 0));
            button03.setText("[]");
        } else {
            count++;
            button03.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button03.setDisable(true);
    }

    @FXML
    public void button13(ActionEvent event) {
        int x = 3;
        int y = 1;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button13.setTextFill(Color.rgb(255, 0, 0));
            button13.setText("[]");
        } else {
            count++;
            button13.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button13.setDisable(true);
    }

    @FXML
    public void button23(ActionEvent event) {
        int x = 3;
        int y = 2;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button23.setTextFill(Color.rgb(255, 0, 0));
            button23.setText("[]");
        } else {
            count++;
            button23.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button23.setDisable(true);
    }

    @FXML
    public void button33(ActionEvent event) {
        int x = 3;
        int y = 3;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button33.setTextFill(Color.rgb(255, 0, 0));
            button33.setText("[]");
        } else {
            count++;
            button33.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button33.setDisable(true);
    }

    @FXML
    public void button43(ActionEvent event) {
        int x = 3;
        int y = 4;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button43.setTextFill(Color.rgb(255, 0, 0));
            button43.setText("[]");
        } else {
            count++;
            button43.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button43.setDisable(true);
    }

    @FXML
    public void button53(ActionEvent event) {
        int x = 3;
        int y = 5;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button53.setTextFill(Color.rgb(255, 0, 0));
            button53.setText("[]");
        } else {
            count++;
            button53.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button53.setDisable(true);
    }

    @FXML
    public void button63(ActionEvent event) {
        int x = 3;
        int y = 6;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button63.setTextFill(Color.rgb(255, 0, 0));
            button63.setText("[]");
        } else {
            count++;
            button63.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button63.setDisable(true);
    }

    @FXML
    public void button73(ActionEvent event) {
        int x = 3;
        int y = 7;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button73.setTextFill(Color.rgb(255, 0, 0));
            button73.setText("[]");
        } else {
            count++;
            button73.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button73.setDisable(true);
    }

    @FXML
    public void button83(ActionEvent event) {
        int x = 3;
        int y = 8;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button83.setTextFill(Color.rgb(255, 0, 0));
            button83.setText("[]");
        } else {
            count++;
            button83.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button83.setDisable(true);
    }

    @FXML
    public void button93(ActionEvent event) {
        int x = 3;
        int y = 9;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button93.setTextFill(Color.rgb(255, 0, 0));
            button93.setText("[]");
        } else {
            count++;
            button93.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button93.setDisable(true);
    }

    @FXML
    public void button04(ActionEvent event) {
        int x = 4;
        int y = 0;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button04.setTextFill(Color.rgb(255, 0, 0));
            button04.setText("[]");
        } else {
            count++;
            button04.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button04.setDisable(true);
    }

    @FXML
    public void button14(ActionEvent event) {
        int x = 4;
        int y = 1;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button14.setTextFill(Color.rgb(255, 0, 0));
            button14.setText("[]");
        } else {
            count++;
            button14.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button14.setDisable(true);
    }

    @FXML
    public void button24(ActionEvent event) {
        int x = 4;
        int y = 2;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button24.setTextFill(Color.rgb(255, 0, 0));
            button24.setText("[]");
        } else {
            count++;
            button24.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button24.setDisable(true);
    }

    @FXML
    public void button34(ActionEvent event) {
        int x = 4;
        int y = 3;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button34.setTextFill(Color.rgb(255, 0, 0));
            button34.setText("[]");
        } else {
            count++;
            button34.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button34.setDisable(true);
    }

    @FXML
    public void button44(ActionEvent event) {
        int x = 4;
        int y = 4;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button44.setTextFill(Color.rgb(255, 0, 0));
            button44.setText("[]");
        } else {
            count++;
            button44.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button44.setDisable(true);
    }

    @FXML
    public void button54(ActionEvent event) {
        int x = 4;
        int y = 5;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button54.setTextFill(Color.rgb(255, 0, 0));
            button54.setText("[]");
        } else {
            count++;
            button54.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button54.setDisable(true);
    }

    @FXML
    public void button64(ActionEvent event) {
        int x = 4;
        int y = 6;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button64.setTextFill(Color.rgb(255, 0, 0));
            button64.setText("[]");
        } else {
            count++;
            button64.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button64.setDisable(true);
    }

    @FXML
    public void button74(ActionEvent event) {
        int x = 4;
        int y = 7;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button74.setTextFill(Color.rgb(255, 0, 0));
            button74.setText("[]");
        } else {
            count++;
            button74.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button74.setDisable(true);
    }

    @FXML
    public void button84(ActionEvent event) {
        int x = 4;
        int y = 8;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button84.setTextFill(Color.rgb(255, 0, 0));
            button84.setText("[]");
        } else {
            count++;
            button84.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button84.setDisable(true);
    }

    @FXML
    public void button94(ActionEvent event) {
        int x = 4;
        int y = 9;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button94.setTextFill(Color.rgb(255, 0, 0));
            button94.setText("[]");
        } else {
            count++;
            button94.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button94.setDisable(true);
    }

    @FXML
    public void button05(ActionEvent event) {
        int x = 5;
        int y = 0;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button05.setTextFill(Color.rgb(255, 0, 0));
            button05.setText("[]");
        } else {
            count++;
            button05.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button05.setDisable(true);
    }

    @FXML
    public void button15(ActionEvent event) {
        int x = 5;
        int y = 1;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button15.setTextFill(Color.rgb(255, 0, 0));
            button15.setText("[]");
        } else {
            count++;
            button15.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button15.setDisable(true);
    }

    @FXML
    public void button25(ActionEvent event) {
        int x = 5;
        int y = 2;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button25.setTextFill(Color.rgb(255, 0, 0));
            button25.setText("[]");
        } else {
            count++;
            button25.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button25.setDisable(true);
    }

    @FXML
    public void button35(ActionEvent event) {
        int x = 5;
        int y = 3;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button35.setTextFill(Color.rgb(255, 0, 0));
            button35.setText("[]");
        } else {
            count++;
            button35.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button35.setDisable(true);
    }

    @FXML
    public void button45(ActionEvent event) {
        int x = 5;
        int y = 4;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button45.setTextFill(Color.rgb(255, 0, 0));
            button45.setText("[]");
        } else {
            count++;
            button45.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button45.setDisable(true);
    }

    @FXML
    public void button55(ActionEvent event) {
        int x = 5;
        int y = 5;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button55.setTextFill(Color.rgb(255, 0, 0));
            button55.setText("[]");
        } else {
            count++;
            button55.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button55.setDisable(true);
    }

    @FXML
    public void button65(ActionEvent event) {
        int x = 5;
        int y = 6;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button65.setTextFill(Color.rgb(255, 0, 0));
            button65.setText("[]");
        } else {
            count++;
            button65.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button65.setDisable(true);
    }

    @FXML
    public void button75(ActionEvent event) {
        int x = 5;
        int y = 7;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button75.setTextFill(Color.rgb(255, 0, 0));
            button75.setText("[]");
        } else {
            count++;
            button75.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button75.setDisable(true);
    }

    @FXML
    public void button85(ActionEvent event) {
        int x = 5;
        int y = 8;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button85.setTextFill(Color.rgb(255, 0, 0));
            button85.setText("[]");
        } else {
            count++;
            button85.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button85.setDisable(true);
    }

    @FXML
    public void button95(ActionEvent event) {
        int x = 5;
        int y = 9;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button95.setTextFill(Color.rgb(255, 0, 0));
            button95.setText("[]");
        } else {
            count++;
            button95.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button95.setDisable(true);
    }

    @FXML
    public void button06(ActionEvent event) {
        int x = 6;
        int y = 0;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button06.setTextFill(Color.rgb(255, 0, 0));
            button06.setText("[]");
        } else {
            count++;
            button06.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button06.setDisable(true);
    }

    @FXML
    public void button16(ActionEvent event) {
        int x = 6;
        int y = 1;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button16.setTextFill(Color.rgb(255, 0, 0));
            button16.setText("[]");
        } else {
            count++;
            button16.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button16.setDisable(true);
    }

    @FXML
    public void button26(ActionEvent event) {
        int x = 6;
        int y = 2;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button26.setTextFill(Color.rgb(255, 0, 0));
            button26.setText("[]");
        } else {
            count++;
            button26.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button26.setDisable(true);
    }

    @FXML
    public void button36(ActionEvent event) {
        int x = 6;
        int y = 3;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button36.setTextFill(Color.rgb(255, 0, 0));
            button36.setText("[]");
        } else {
            count++;
            button36.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button36.setDisable(true);
    }

    @FXML
    public void button46(ActionEvent event) {
        int x = 6;
        int y = 4;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button46.setTextFill(Color.rgb(255, 0, 0));
            button46.setText("[]");
        } else {
            count++;
            button46.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button46.setDisable(true);
    }

    @FXML
    public void button56(ActionEvent event) {
        int x = 6;
        int y = 5;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button56.setTextFill(Color.rgb(255, 0, 0));
            button56.setText("[]");
        } else {
            count++;
            button56.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button56.setDisable(true);
    }

    @FXML
    public void button66(ActionEvent event) {
        int x = 6;
        int y = 6;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button66.setTextFill(Color.rgb(255, 0, 0));
            button66.setText("[]");
        } else {
            count++;
            button66.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button66.setDisable(true);
    }

    @FXML
    public void button76(ActionEvent event) {
        int x = 6;
        int y = 7;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button76.setTextFill(Color.rgb(255, 0, 0));
            button76.setText("[]");
        } else {
            count++;
            button76.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button76.setDisable(true);
    }

    @FXML
    public void button86(ActionEvent event) {
        int x = 6;
        int y = 8;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button86.setTextFill(Color.rgb(255, 0, 0));
            button86.setText("[]");
        } else {
            count++;
            button86.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button86.setDisable(true);
    }

    @FXML
    public void button96(ActionEvent event) {
        int x = 6;
        int y = 9;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button96.setTextFill(Color.rgb(255, 0, 0));
            button96.setText("[]");
        } else {
            count++;
            button96.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button96.setDisable(true);
    }

    @FXML
    public void button07(ActionEvent event) {
        int x = 7;
        int y = 0;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button07.setTextFill(Color.rgb(255, 0, 0));
            button07.setText("[]");
        } else {
            count++;
            button07.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button07.setDisable(true);
    }

    @FXML
    public void button17(ActionEvent event) {
        int x = 7;
        int y = 1;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button17.setTextFill(Color.rgb(255, 0, 0));
            button17.setText("[]");
        } else {
            count++;
            button17.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button17.setDisable(true);
    }

    @FXML
    public void button27(ActionEvent event) {
        int x = 7;
        int y = 2;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button27.setTextFill(Color.rgb(255, 0, 0));
            button27.setText("[]");
        } else {
            count++;
            button27.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button27.setDisable(true);
    }

    @FXML
    public void button37(ActionEvent event) {
        int x = 7;
        int y = 3;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button37.setTextFill(Color.rgb(255, 0, 0));
            button37.setText("[]");
        } else {
            count++;
            button37.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button37.setDisable(true);
    }

    @FXML
    public void button47(ActionEvent event) {
        int x = 7;
        int y = 4;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button47.setTextFill(Color.rgb(255, 0, 0));
            button47.setText("[]");
        } else {
            count++;
            button47.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button47.setDisable(true);
    }

    @FXML
    public void button57(ActionEvent event) {
        int x = 7;
        int y = 5;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button57.setTextFill(Color.rgb(255, 0, 0));
            button57.setText("[]");
        } else {
            count++;
            button57.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button57.setDisable(true);
    }

    @FXML
    public void button67(ActionEvent event) {
        int x = 7;
        int y = 6;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button67.setTextFill(Color.rgb(255, 0, 0));
            button67.setText("[]");
        } else {
            count++;
            button67.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button67.setDisable(true);
    }

    @FXML
    public void button77(ActionEvent event) {
        int x = 7;
        int y = 7;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button77.setTextFill(Color.rgb(255, 0, 0));
            button77.setText("[]");
        } else {
            count++;
            button77.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button77.setDisable(true);
    }

    @FXML
    public void button87(ActionEvent event) {
        int x = 7;
        int y = 8;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button87.setTextFill(Color.rgb(255, 0, 0));
            button87.setText("[]");
        } else {
            count++;
            button87.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button87.setDisable(true);
    }

    @FXML
    public void button97(ActionEvent event) {
        int x = 7;
        int y = 9;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button97.setTextFill(Color.rgb(255, 0, 0));
            button97.setText("[]");
        } else {
            count++;
            button97.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button97.setDisable(true);
    }

    @FXML
    public void button08(ActionEvent event) {
        int x = 8;
        int y = 0;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button08.setTextFill(Color.rgb(255, 0, 0));
            button08.setText("[]");
        } else {
            count++;
            button08.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button08.setDisable(true);
    }

    @FXML
    public void button18(ActionEvent event) {
        int x = 8;
        int y = 1;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button18.setTextFill(Color.rgb(255, 0, 0));
            button18.setText("[]");
        } else {
            count++;
            button18.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button18.setDisable(true);
    }

    @FXML
    public void button28(ActionEvent event) {
        int x = 8;
        int y = 2;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button28.setTextFill(Color.rgb(255, 0, 0));
            button28.setText("[]");
        } else {
            count++;
            button28.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button28.setDisable(true);
    }

    @FXML
    public void button38(ActionEvent event) {
        int x = 8;
        int y = 3;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button38.setTextFill(Color.rgb(255, 0, 0));
            button38.setText("[]");
        } else {
            count++;
            button38.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button38.setDisable(true);
    }

    @FXML
    public void button48(ActionEvent event) {
        int x = 8;
        int y = 4;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button48.setTextFill(Color.rgb(255, 0, 0));
            button48.setText("[]");
        } else {
            count++;
            button48.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button48.setDisable(true);
    }

    @FXML
    public void button58(ActionEvent event) {
        int x = 8;
        int y = 5;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button58.setTextFill(Color.rgb(255, 0, 0));
            button58.setText("[]");
        } else {
            count++;
            button58.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button58.setDisable(true);
    }

    @FXML
    public void button68(ActionEvent event) {
        int x = 8;
        int y = 6;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button68.setTextFill(Color.rgb(255, 0, 0));
            button68.setText("[]");
        } else {
            count++;
            button68.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button68.setDisable(true);
    }

    @FXML
    public void button78(ActionEvent event) {
        int x = 8;
        int y = 7;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button78.setTextFill(Color.rgb(255, 0, 0));
            button78.setText("[]");
        } else {
            count++;
            button78.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button78.setDisable(true);
    }

    @FXML
    public void button88(ActionEvent event) {
        int x = 8;
        int y = 8;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button88.setTextFill(Color.rgb(255, 0, 0));
            button88.setText("[]");
        } else {
            count++;
            button88.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button88.setDisable(true);
    }

    @FXML
    public void button98(ActionEvent event) {
        int x = 8;
        int y = 9;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button98.setTextFill(Color.rgb(255, 0, 0));
            button98.setText("[]");
        } else {
            count++;
            button98.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button98.setDisable(true);
    }

    @FXML
    public void button09(ActionEvent event) {
        int x = 9;
        int y = 0;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button09.setTextFill(Color.rgb(255, 0, 0));
            button09.setText("[]");
        } else {
            count++;
            button09.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button09.setDisable(true);
    }

    @FXML
    public void button19(ActionEvent event) {
        int x = 9;
        int y = 1;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button19.setTextFill(Color.rgb(255, 0, 0));
            button19.setText("[]");
        } else {
            count++;
            button19.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button19.setDisable(true);
    }

    @FXML
    public void button29(ActionEvent event) {
        int x = 9;
        int y = 2;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button29.setTextFill(Color.rgb(255, 0, 0));
            button29.setText("[]");
        } else {
            count++;
            button29.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button29.setDisable(true);
    }

    @FXML
    public void button39(ActionEvent event) {
        int x = 9;
        int y = 3;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button39.setTextFill(Color.rgb(255, 0, 0));
            button39.setText("[]");
        } else {
            count++;
            button39.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button39.setDisable(true);
    }

    @FXML
    public void button49(ActionEvent event) {
        int x = 9;
        int y = 4;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button49.setTextFill(Color.rgb(255, 0, 0));
            button49.setText("[]");
        } else {
            count++;
            button49.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button49.setDisable(true);
    }

    @FXML
    public void button59(ActionEvent event) {
        int x = 9;
        int y = 5;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button59.setTextFill(Color.rgb(255, 0, 0));
            button59.setText("[]");
        } else {
            count++;
            button59.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button59.setDisable(true);
    }

    @FXML
    public void button69(ActionEvent event) {
        int x = 9;
        int y = 6;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button69.setTextFill(Color.rgb(255, 0, 0));
            button69.setText("[]");
        } else {
            count++;
            button69.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button69.setDisable(true);
    }

    @FXML
    public void button79(ActionEvent event) {
        int x = 9;
        int y = 7;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button79.setTextFill(Color.rgb(255, 0, 0));
            button79.setText("[]");
        } else {
            count++;
            button79.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button79.setDisable(true);
    }

    @FXML
    public void button89(ActionEvent event) {
        int x = 9;
        int y = 8;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button89.setTextFill(Color.rgb(255, 0, 0));
            button89.setText("[]");
        } else {
            count++;
            button89.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button89.setDisable(true);
    }

    @FXML
    public void button99(ActionEvent event) {
        int x = 9;
        int y = 9;
        String cur = map.get(x).get(y);
        if (cur.equals("*")) {
            wrong++;
            setHealth();
            button99.setTextFill(Color.rgb(255, 0, 0));
            button99.setText("[]");
        } else {
            count++;
            button99.setText(cur.toUpperCase());
        }
        if (isWinning()) {
            messageLabel.setText("You Win!");
            messageLabel.setTextFill(Color.rgb(0, 255, 0));
            setButtonByMap();
        }
        if (isLosing()) {
            messageLabel.setText("You Lose!");
            setAllButton(true);
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
        }
        button99.setDisable(true);
    }
}
