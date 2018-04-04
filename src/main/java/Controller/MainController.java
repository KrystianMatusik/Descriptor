package Controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class MainController {
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
        auctionNameTextField.setText("");
        allegroAuctionNameTextField.setText("");
        productTypeTextField.setText("");
        capacityTextField.setText("");
        hairTypeTextField.setText("");
        aboutTextField.setText("");
        descriptionTextField.setText("");
    }

    @FXML
    void openGenerateButton(ActionEvent event) {
        auctionTextArea.setText(auctionNameTextField.getText());
    }
}
