package Controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class MainController {
    private String beginning = "Poczatkowy kod";
    private String capacityCode = "Capacity code";
    private String hairTypeCode = "Hair type";
    private String aboutCode = "About code";
    private String end = "End";

    private String beginningAllegro = "Poczatkowy kod Allegro";
    private String capacityCodeAllegro = "Capacity code Allegro";
    private String hairTypeCodeAllegro = "Hair type Allegro";
    private String aboutCodeAllegro = "About code Allegro";
    private String endAllegro = "End Allegro";
    @FXML
    private TextField auctionNameTextField;

    @FXML
    private TextField allegroAuctionNameTextField;

    @FXML
    private Label auctionNameLabel;

    @FXML
    private Label allegroAuctionNameLabel;

    @FXML
    private Label amountLabel;

    @FXML
    private Label productTypeLabel;

    @FXML
    private TextField productTypeTextField;

    @FXML
    private TextField capacityTextField;

    @FXML
    private CheckBox capacityCheckBox;

    @FXML
    private CheckBox aboutCheckBox;

    @FXML
    private CheckBox hairTypeCheckBox;

    @FXML
    private TextField hairTypeTextField;

    @FXML
    private TextField aboutTextField;

    @FXML
    private Button generateButton;

    @FXML
    private Button clearButton;

    @FXML
    private Label descriptionLabel;

    @FXML
    private TextArea descriptionTextField;

    @FXML
    private TextArea auctionTextArea;

    @FXML
    private TextArea allegroAuctionTextArea;

    @FXML
    void openClearButton(ActionEvent event) {
        auctionNameTextField.clear();
        allegroAuctionNameTextField.clear();
        productTypeTextField.clear();
        capacityTextField.clear();
        hairTypeTextField.clear();
        aboutTextField.clear();
        descriptionTextField.clear();
        auctionTextArea.clear();
        allegroAuctionTextArea.clear();
        aboutCheckBox.setSelected(false);
        hairTypeCheckBox.setSelected(false);
        capacityCheckBox.setSelected(false);
    }

    @FXML
    void openGenerateButton(ActionEvent event) {
        try {
            FileReader fileReader = new FileReader("Path to file");
            BufferedReader bufferReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferReader.readLine()) != null) {
                if (line.contains("[productTitle]"))
                    line = line.replace("[productTitle]", auctionNameTextField.getText());
                if (line.contains("[typeOfProduct]"))
                    line = line.replace("[typeOfProduct]", productTypeTextField.getText());
                if (line.contains("[productDescription]"))
                    line = line.replace("[productDescription]", descriptionTextField.getText());
                if (aboutCheckBox.isSelected() == false)
                    line = line.replace("<div class=\"flexy-item\"><img src=\"https://zamondo.pl/data/include/cms/opis_prod/ikonki/Artboard_66.png\" alt=\"Rodzaj włosów dla których przeznaczony jest produkt kosmetyczny na Zamondo.pl\"><p class=\"long-text\"><strong>O serii:</strong>: [aboutSeries]</p>", " ");
                else
                    line = line.replace("[aboutSeries]", aboutTextField.getText());
                if (hairTypeCheckBox.isSelected() == false)
                    line = line.replace("<div class=\"flexy-item\"><img src=\"https://zamondo.pl/data/include/cms/opis_prod/ikonki/Artboard_66.png\" alt=\"Rodzaj włosów dla których przeznaczony jest produkt kosmetyczny na Zamondo.pl\"><p class=\"long-text\"><strong>Rodzaj włosów</strong>: [hairType]</p></div>", " ");
                else
                    line = line.replace("[hairType]", hairTypeTextField.getText());
                if (capacityCheckBox.isSelected() == false)
                    line = line.replace("<div class=\"flexy-item\"><img src=\"https://zamondo.pl/data/include/cms/opis_prod/ikonki/Artboard_44.png\" alt=\"Pojemność produktu kosmetycznego na Zamondo.pl\"><p class=\"long-text\"><strong>Pojemność</strong>: [productCapacity] </p></div>", "");
                else
                    line = line.replace("[productCapacity]", capacityTextField.getText());
                auctionTextArea.appendText(line + "\n");
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader("Path to file");
            BufferedReader bufferReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferReader.readLine()) != null) {
                if (line.contains("[productTitle]"))
                    line = line.replace("[productTitle]", allegroAuctionNameTextField.getText());
                if (line.contains("[typeOfProduct]"))
                    line = line.replace("[typeOfProduct]", productTypeTextField.getText());
                if (line.contains("[productDescription]"))
                    line = line.replace("[productDescription]", descriptionTextField.getText());
                if (aboutCheckBox.isSelected() == false)
                    line = line.replace("<h2>O serii:</h2><p>[aboutSeries]</p>", " ");
                else
                    line = line.replace("[aboutSeries]", aboutTextField.getText());
                if (capacityCheckBox.isSelected() == false)
                    line = line.replace("<h2>Pojemność:</h2><p>[productCapacity]</p>", " ");
                else
                    line = line.replace("[productCapacity]", capacityTextField.getText());
                if (hairTypeCheckBox.isSelected() == false)
                    line = line.replace("<h2>Rodzaj włosów:</h2><p>[hairType]</p>", "");
                else
                    line = line.replace("[hairType]", hairTypeTextField.getText());
                allegroAuctionTextArea.appendText(line + "\n");
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
