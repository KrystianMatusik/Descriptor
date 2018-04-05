package Controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


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
        auctionTextArea.setText(beginning + " " + auctionNameTextField.getText() + "\n" + descriptionTextField.getText() + "\n " + productTypeTextField.getText() + "\n");
        if (capacityCheckBox.isSelected())
            auctionTextArea.appendText(capacityCode + capacityTextField.getText() + "\n");
        if (hairTypeCheckBox.isSelected())
            auctionTextArea.appendText(hairTypeCode + hairTypeTextField.getText() + "\n");
        if (aboutCheckBox.isSelected())
            auctionTextArea.appendText(aboutCode + aboutTextField.getText() + "\n");
        auctionTextArea.appendText(end);

        allegroAuctionTextArea.setText(beginningAllegro + "\n" + allegroAuctionNameTextField.getText() + "\n" + descriptionTextField.getText() + "\n " + productTypeTextField.getText() + "\n");
        if (capacityCheckBox.isSelected())
            allegroAuctionTextArea.appendText(capacityCodeAllegro + capacityTextField.getText() + "\n");
        if (hairTypeCheckBox.isSelected())
            allegroAuctionTextArea.appendText(hairTypeCodeAllegro + hairTypeTextField.getText() + "\n");
        if (aboutCheckBox.isSelected())
            allegroAuctionTextArea.appendText(aboutCodeAllegro + aboutTextField.getText() + "\n");
        allegroAuctionTextArea.appendText(endAllegro);

    }
}
