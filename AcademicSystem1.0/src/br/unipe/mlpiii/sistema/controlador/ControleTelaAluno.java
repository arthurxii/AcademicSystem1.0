package br.unipe.mlpiii.sistema.controlador;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ControleTelaAluno {

	private static Stage stage;

	@FXML
	private Text discita;
	@FXML
	private TextField disciplinaa;
	@FXML
	private Button buscarta;
	@FXML
	private Button nf;
	@FXML
	private Button boletim;
	@FXML
	private Button boletos;
	@FXML
	private Button situa;
	@FXML
	private Button relatoriofinanceiro;

	public void open() throws IOException {
		Node busc = buscarta;
		Stage a = (Stage) busc.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource(
				"/br/unipe/mlpiii/sistema/application/AlunoCadastro.fxml"));
		Scene scene = new Scene(root, 900, 600);
		a.setScene(scene);
		a.show();
	}

	public void sair() throws IOException {
		Node exit = buscarta;
		Stage a = (Stage) exit.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource(
				"/br/unipe/mlpiii/sistema/application/TelaRequisito.fxml"));
		Scene scene = new Scene(root, 900, 600);
		a.setScene(scene);
		a.show();
	}

	public void notas() throws IOException {
		Stage a = (Stage) nf.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource(
				"/br/unipe/mlpiii/sistema/application/TelaNotasFaltas.fxml"));
		Scene scene = new Scene(root, 900, 600);
		a.setScene(scene);
		a.show();
	}

	public void sobre() throws Exception {

		stage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource(
				"/br/unipe/mlpiii/sistema/application/Sobre.fxml"));/* Exception */
		stage.initModality(Modality.APPLICATION_MODAL);
		Scene scene;

		scene = new Scene(root, 500, 220);

		stage.setScene(scene);

		stage.showAndWait();
	}

}
