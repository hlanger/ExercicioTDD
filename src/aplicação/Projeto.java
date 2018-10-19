package aplicação;

import java.util.ArrayList;

public class Projeto {
	
	public Projeto(Integer id, String nome) {
		m_id = id;
		m_nome = nome;
		m_funcionarios = new ArrayList<Funcionario>(); 
		m_ocorrencias = new ArrayList<Ocorrencia>(); 
	}
	
	public Integer id() {
		return m_id;
	}
	
	public String nome() {
		return m_nome;
	}
	
	public void addFuncionario(Funcionario func ) {
		m_funcionarios.add(func);
		func.addProjeto(this);
	}
	
	public Ocorrencia addOcorrencia(Integer id, String nome, TipoOcorrencia tipo, PrioridadeOcorrencia prioridade, Funcionario responsavel) {
		Ocorrencia ocorrencia = null;
		Integer idResponsavel = 0;
		for (int i = 0; i < m_funcionarios.size(); ++i) {
			if (m_funcionarios.get(i).id() == responsavel.id()) {
				m_ocorrencias.add(ocorrencia = new Ocorrencia(id, nome, tipo, prioridade, responsavel));
				idResponsavel = responsavel.id();
			}
		}
		
		if (idResponsavel == 0) {
			throw new IllegalArgumentException("Id funcionario inexistente");
		}
		
		return ocorrencia;
		
	}
	
	
	private Integer m_id;
	private String m_nome;
	
	
	private ArrayList<Funcionario> m_funcionarios;
	private ArrayList<Ocorrencia> m_ocorrencias;
}
