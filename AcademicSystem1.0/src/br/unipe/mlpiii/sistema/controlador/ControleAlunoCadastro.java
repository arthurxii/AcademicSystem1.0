package br.unipe.mlpiii.sistema.controlador;

import java.io.IOException;

import br.unipe.mlpiii.sistema.dao.AlunoDAO;
import br.unipe.mlpiii.sistema.modelo.Aluno;
import br.unipe.mlpiii.sistema.modelo.Endereco;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ControleAlunoCadastro {

	private static Stage stage;

	@FXML
	private TextField nomea;
	@FXML
	private TextField cpfa;
	@FXML
	private TextField identidadea;
	@FXML
	private TextField telefonea;
	@FXML
	private TextField enderecoa;
	@FXML
	private TextField cursoa;
	@FXML
	private Text nomeca;
	@FXML
	private Text cpfca;
	@FXML
	private Text identidadeca;
	@FXML
	private Text telefoneca;
	@FXML
	private Text enderecoca;
	@FXML
	private Text cursoca;
	@FXML
	private Button cadastrarca;
	@FXML
	private MenuItem sobreca;
	@FXML
	private MenuItem sairca;
	@FXML
	private TextField numerocasa;
	@FXML
	private TextField ncasa;

	public void actionPerformed(ActionEvent arg0) {

		Aluno aluno = new Aluno();
		Endereco endereco = new Endereco();

		endereco.setRua(enderecoa.getText());
		endereco.setNumeroDaCasa(ncasa.getText());
		aluno.setTelefone(telefonea.getText());
		aluno.setNome(nomea.getText());
		aluno.setCpf(cpfca.getText());
		aluno.setCurso(cursoca.getText());

	}

	public void cadastrarAluno(Aluno Aluno) throws IOException {

		AlunoDAO salvarAluno = new AlunoDAO();

		salvarAluno.salvar(Aluno);

	}

	public void sobre() throws Exception {

		stage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource(
				"/br/unipe/mlpiii/sistema/application/Sobre.fxml"));
		stage.initModality(Modality.APPLICATION_MODAL);
		Scene scene;

		scene = new Scene(root, 500, 220);

		stage.setScene(scene);

		stage.showAndWait();
	}

	public void sair() throws IOException {
		Node exit = cadastrarca;
		Stage a = (Stage) exit.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource(
				"/br/unipe/mlpiii/sistema/application/TelaRequisito.fxml"));
		Scene scene = new Scene(root, 900, 600);
		a.setScene(scene);
		a.show();
	}

}
