package br.unipe.mlpiii.sistema.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.unipe.mlpiii.sistema.exception.EntidadeNaoEncontradaException;
import br.unipe.mlpiii.sistema.modelo.Disciplina;

public class DisciplinaDAO {

	public void salvar(Disciplina disciplina) {
		Connection c = ConnectionFactory.getConnection();
		String sql = "INSERT INTO Disciplina (nome, periodo, ementa, professor) values (?,?,?,?)";
		PreparedStatement stmt = null;

		try {
			stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			stmt.setString(1, disciplina.getNome());
			stmt.setString(2, disciplina.getPeriodo());
			stmt.setString(3, disciplina.getEmenta());
			stmt.setString(4, disciplina.getProfessor());
			stmt.execute();

			System.out.println("Disciplina cadastrada com sucesso!");

			try (ResultSet rs = stmt.getGeneratedKeys()) {
				if (rs.next()) {
					int id = rs.getInt("id");
					disciplina.setId(id);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				c.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível fechar a conexão!");
			}
		}
	}

	public Disciplina coletaDisciplinaId(String nomeDisciplina) { // ESSA FUNÇÃO
																	// PASSARA A
																	// RETORNAR
																	// UM TIPO
																	// DISCIPLINA
		Connection c = ConnectionFactory.getConnection();
		String sql = "SELECT * FROM Disciplina WHERE nome = ?";
		Disciplina disciplina = new Disciplina();
		PreparedStatement stmt = null;
		ResultSet result = null;

		try {
			stmt = c.prepareStatement(sql, ResultSet.CONCUR_READ_ONLY,
					ResultSet.CONCUR_UPDATABLE);
			stmt.setString(1, nomeDisciplina);
			stmt.execute();

			result = stmt.getResultSet();
			if (!result.next()) {
				throw new EntidadeNaoEncontradaException(sql);
			}
			result.absolute(0);

			while (result.next()) {
				int id = result.getInt("id"); // VAI PASSAR A COLETAR TODOS OS
												// DADOS DE RETORNO
				String nome = result.getString("nome");
				String periodo = result.getString("periodo");
				String ementa = result.getString("ementa");
				String professor = result.getString("professor");
				disciplina = new Disciplina(id, nome, periodo, ementa,
						professor);
				disciplina.setId(id);
			}
			return disciplina;
		} catch (SQLException e) {
			System.out.println("Não foi possível realizar a consulta!");
			e.printStackTrace();
		} catch (EntidadeNaoEncontradaException e2) {
			e2.printStackTrace();
		} finally {
			try {
				result.close();
				stmt.close();
				c.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível fechar a conexão!");
			}
		}
		return null;
	}

	public Disciplina disciplinaId(int idDisciplina) { // ESSA FUNÇÃO PASSARA A
														// RETORNAR UM TIPO
														// DISCIPLINA
		Connection c = ConnectionFactory.getConnection();
		String sql = "SELECT * FROM Disciplina WHERE id = ?";
		Disciplina disciplina = new Disciplina();
		PreparedStatement stmt = null;
		ResultSet result = null;
		int id = 0;

		try {
			stmt = c.prepareStatement(sql, ResultSet.CONCUR_READ_ONLY,
					ResultSet.CONCUR_UPDATABLE);
			stmt.setInt(1, idDisciplina);
			stmt.execute();

			result = stmt.getResultSet();
			if (!result.next()) {
				throw new EntidadeNaoEncontradaException(sql);
			}
			result.absolute(0);

			while (result.next()) {
				id = result.getInt("id"); // VAI PASSAR A COLETAR TODOS OS DADOS
											// DE RETORNO
				String nome = result.getString("nome");
				String periodo = result.getString("periodo");
				String ementa = result.getString("ementa");
				String professor = result.getString("professor");
				disciplina = new Disciplina(id, nome, periodo, ementa,
						professor);
				disciplina.setId(id);
			}
			return disciplina;
		} catch (SQLException e) {
			System.out.println("Não foi possível realizar a consulta!");
			e.printStackTrace();
		} catch (EntidadeNaoEncontradaException e2) {
			e2.printStackTrace();
		} finally {
			try {
				result.close();
				stmt.close();
				c.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível fechar a conexão!");
			}
		}
		return null;
	}

	public List<Disciplina> ListaDisciplina() throws SQLException {
		List<Disciplina> disciplinas = new ArrayList<>();
		Connection c = ConnectionFactory.getConnection();
		String sql = "SELECT * FROM Disciplina";
		PreparedStatement stmt = null;
		ResultSet result = null;

		try {
			stmt = c.prepareStatement(sql, ResultSet.CONCUR_READ_ONLY,
					ResultSet.CONCUR_UPDATABLE);
			stmt.execute();

			result = stmt.getResultSet();
			if (!result.next()) {
				throw new EntidadeNaoEncontradaException(sql);
			}
			result.absolute(0);
			while (result.next()) {
				int id = result.getInt("id");
				String nome = result.getString("nome");
				String periodo = result.getString("periodo");
				String ementa = result.getString("ementa");
				String professor = result.getString("professor");
				Disciplina disciplina = new Disciplina(id, nome, periodo,
						ementa, professor);
				disciplina.setId(id);
				disciplinas.add(disciplina);
			}
			return disciplinas;
		} catch (SQLException e) {
			System.out.println("Não foi possível realizar a consulta!");
			e.printStackTrace();
		} catch (EntidadeNaoEncontradaException e2) {
			e2.printStackTrace();
		} finally {
			try {
				result.close();
				stmt.close();
				c.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível fechar a conexão!");
			}
		}
		return null;
	}

	public void update(Disciplina disciplina) {
		Connection c = ConnectionFactory.getConnection();
		String sql = "UPDATE Disciplina SET nome = ?, periodo = ?, ementa = ?, professor = ?"
				+ "WHERE id = ?";
		PreparedStatement stmt = null;

		try {
			stmt = c.prepareStatement(sql);

			stmt.setString(1, disciplina.getNome());
			stmt.setString(2, disciplina.getPeriodo());
			stmt.setString(3, disciplina.getEmenta());
			stmt.setString(4, disciplina.getProfessor());
			stmt.setInt(5, disciplina.getId());
			if (stmt.executeUpdate() > 0) {
				System.out.println("Disciplina atualizada com sucesso!");
			} else {
				throw new EntidadeNaoEncontradaException(sql);
			}
		} catch (SQLException e) {
			System.out.println("Não foi possível atualizar a disciplina!");
		} catch (EntidadeNaoEncontradaException e2) {
			e2.printStackTrace();
		} finally {
			try {
				stmt.close();
				c.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível fechar a conexão!");
			}
		}
	}

	public void delete(int id) {
		Connection c = ConnectionFactory.getConnection();
		String sql = "DELETE FROM Disciplina WHERE id = ?";
		PreparedStatement stmt = null;

		try {
			stmt = c.prepareStatement(sql);
			stmt.setInt(1, id);
			if (stmt.executeUpdate() > 0) {
				System.out.println("Disciplina removida com sucesso!");
			} else {
				throw new EntidadeNaoEncontradaException(sql);
			}
		} catch (SQLException e) {
			System.out.println("Não foi possível remover a disciplina!");
			e.printStackTrace();
		} catch (EntidadeNaoEncontradaException e2) {
			e2.printStackTrace();
		} finally {
			try {
				stmt.close();
				c.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível fechar a conexão!");
			}
		}
	}
}
