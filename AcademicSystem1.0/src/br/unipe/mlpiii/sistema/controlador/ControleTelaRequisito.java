package br.unipe.mlpiii.sistema.controlador;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControleTelaRequisito {

	@FXML
	private Button select;

	static Stage ControleTelaRequisito;

	public void selecionar() throws IOException {
		Node voltar = select;
		Stage a = (Stage) voltar.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource(
				"/br/unipe/mlpiii/sistema/application/Login.fxml"));
		Scene scene = new Scene(root, 900, 600);

		a.setScene(scene);

		a.showAndWait();
	}

}
