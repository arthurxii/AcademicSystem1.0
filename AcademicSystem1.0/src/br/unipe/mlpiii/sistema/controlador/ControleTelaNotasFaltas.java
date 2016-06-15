package br.unipe.mlpiii.sistema.controlador;

import java.io.IOException;

import br.unipe.mlpiii.sistema.modelo.Disciplina;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ControleTelaNotasFaltas {

	private static Stage stage;
	@FXML
	private Button sobrefaltas;
	@FXML
	private Button sairfaltas;
	@FXML
	private TableColumn<Disciplina, String> disciplina;
	@FXML
	private TableColumn<Disciplina, String> nota1;
	@FXML
	private TableColumn<Disciplina, String> nota2;
	@FXML
	private TableColumn<Disciplina, String> nota3;
	@FXML
	private TableColumn<Disciplina, String> media;
	@FXML
	private TableColumn<Disciplina, String> discfaltas;
	@FXML
	private TableColumn<Disciplina, String> falta1;
	@FXML
	private TableColumn<Disciplina, String> falta2;
	@FXML
	private TableColumn<Disciplina, String> falta3;
	@FXML
	private TableColumn<Disciplina, String> totalfalta;
	@FXML
	private Button voltarfaltas;

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

	public void sair() throws IOException {
		Node exit = voltarfaltas;
		Stage a = (Stage) exit.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource(
				"/br/unipe/mlpiii/sistema/application/Login.fxml"));
		Scene scene = new Scene(root, 900, 600);
		a.setScene(scene);
		a.show();
	}

	public void voltar() throws IOException {
		Node exit = voltarfaltas;
		Stage a = (Stage) exit.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource(
				"/br/unipe/mlpiii/sistema/application/TelaAluno.fxml"));
		Scene scene = new Scene(root, 900, 600);
		a.setScene(scene);
		a.show();
	}

}
