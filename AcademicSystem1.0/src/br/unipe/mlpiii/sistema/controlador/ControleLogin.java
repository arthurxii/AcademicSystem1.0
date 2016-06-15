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
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;

public class ControleLogin {
	@FXML
	private Button loginbtn;
	@FXML
	private TextField usuariol;
	@FXML
	private TextField senhal;
	@FXML
	private Text usuariola;
	@FXML
	private Text usuariolaa;
	@FXML
	private Button cadastroaluno;
	@FXML
	Font x3;
	@FXML
	Color x4;

	public void logar() throws IOException {
		Node login = loginbtn;
		Stage a = (Stage) login.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource(
				"/br/unipe/mlpiii/sistema/application/TelaAluno.fxml"));
		Scene scene = new Scene(root, 900, 600);
		a.setScene(scene);
		a.show();
	}

	public void cadastroaluno() throws IOException {
		Node cadastro = cadastroaluno;
		Stage a = (Stage) cadastro.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource(
				"/br/unipe/mlpiii/sistema/application/AlunoCadastro.fxml"));
		Scene scene = new Scene(root, 900, 600);
		a.setScene(scene);
		a.show();
	}

}
