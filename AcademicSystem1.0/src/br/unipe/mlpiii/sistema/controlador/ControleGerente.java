package br.unipe.mlpiii.sistema.controlador;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControleGerente {
	@FXML
	private Button inserirg;
	@FXML
	private Button configurarg;
	@FXML
	private Button inserirgp;
	@FXML
	private Button configurargp;
	@FXML
	private Button inseriric;
	@FXML
	private Button configuraric;
	@FXML
	private Button sobreg;
	@FXML
	private Button sairg;

	public void open() throws IOException {
		Node alunoin = inserirg;
		Stage a = (Stage) alunoin.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource(
				"/br/unipe/mlpiii/sistema/application/AlunoCadastro.fxml"));
		Scene scene = new Scene(root, 900, 600);
		a.setScene(scene);
		a.show();
	}
}
