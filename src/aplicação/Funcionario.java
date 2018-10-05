package aplicação;

import java.util.ArrayList;



public class Funcionario {
	
	public static final int MAX_NUM_OCORRENCIAS = 10;
	
	public Funcionario(Integer id, String nome) {
		m_id = id;
		m_nome = nome;
		m_projetos = new ArrayList<Projeto>();
		m_ocorrenciasAtribuidas = new ArrayList<Ocorrencia>();
	}
	
	public Integer id() {
		return m_id;
	}
	
	public String nome() {
		return m_nome;
	}
	
	public void addProjeto(Projeto proj) {
		m_projetos.add(proj);
	}
	
	public void atribuirOcorrencia(Ocorrencia ocorrencia) {
		m_ocorrenciasAtribuidas.add(ocorrencia);
	}
	
	public void retirarOcorrencia(Ocorrencia ocorrencia) {
		for (int i = 0; i < m_ocorrenciasAtribuidas.size(); ++i) {
			if (m_ocorrenciasAtribuidas.get(i).id() == ocorrencia.id()) {
				m_ocorrenciasAtribuidas.remove(i);
			}
		}
	}
	
	public Integer numOcorrenciasAtribuidas() {
		return m_ocorrenciasAtribuidas.size();
	}
	
	public boolean podeReceberOcorrencia() {
		return m_ocorrenciasAtribuidas.size() < MAX_NUM_OCORRENCIAS;
	}
	
	
	private Integer m_id;
	private String m_nome;
	
	
	private ArrayList<Projeto> m_projetos;
	private ArrayList<Ocorrencia> m_ocorrenciasAtribuidas;
}
