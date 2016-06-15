package br.unipe.mlpiii.sistema.application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox implements Initializable {

	static String msg;
	static int width = 0;

	@FXML
	private Label labelMessage;
	@FXML
	private Button okButton;
	@FXML
	private Label art;
	@FXML
	private Label kevin;
	@FXML
	private Label was;
	@FXML
	private Label email;
	@FXML
	private Label acds;
	@FXML
	private Label grupo;
	@FXML
	private Label contato;

	public void initialize(URL location, ResourceBundle resources) {
		labelMessage.setText(msg);
	}

	static Stage alertBox;

	public AlertBox(int width) {
		AlertBox.width = width;
	}

	public AlertBox() {

	}

	public void display(String str) throws Exception {

		msg = str;
		alertBox = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource(
				"/br/unipe/mlpiii/sistema/application/Sobre.fxml"));/* Exception */
		alertBox.initModality(Modality.APPLICATION_MODAL);
		Scene scene;
		if (width != 0)
			scene = new Scene(root, width, 100);

		else
			scene = new Scene(root, 400, 100);

		alertBox.setScene(scene);

		alertBox.showAndWait();

	}

	public void close() {
		alertBox.close();
	}

}
