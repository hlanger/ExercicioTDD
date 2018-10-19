package aplicação;

import java.util.ArrayList;

public class Empresa {
	public Empresa() {
		m_funcionarios = new ArrayList<Funcionario>();
		m_projetos = new ArrayList<Projeto>(); 
		proximoFuncId = 1;
		proximoProjId = 1;
		proximaOcorrId = 1;
	}
	
	public Funcionario addFuncionario(String nome) {
		Funcionario func;
		m_funcionarios.add(func = new Funcionario(proximoFuncId++, nome));
		return func;
	}
	
	public Projeto addProjeto(String nome) {
		Projeto proj;
		m_projetos.add(proj = new Projeto(proximoProjId++, nome));
		return proj;
	}
	
	public Ocorrencia criarOcorrencia(String nome, Projeto proj, TipoOcorrencia tipo, PrioridadeOcorrencia prioridade, Funcionario responsavel) {
		if (!responsavel.podeReceberOcorrencia()) {
			throw new IllegalArgumentException("Funcinario nao pode mais assumir ocorrencias");
		}
		Ocorrencia ocorrencia = proj.addOcorrencia(proximaOcorrId++, nome, tipo, prioridade, responsavel);
		responsavel.atribuirOcorrencia(ocorrencia);
		return ocorrencia;
	}
	
	public void concluirOcorrencia(Ocorrencia ocorrencia) {
		ocorrencia.responsavel().retirarOcorrencia(ocorrencia);
		ocorrencia.concluir();
	}
	
	public Integer numFuncionarios() {
		return m_funcionarios.size();
	}
	
	public Integer numProjetos() {
		return m_projetos.size();
	}
	
	private ArrayList<Projeto> m_projetos;
	private ArrayList<Funcionario> m_funcionarios;
	
	private Integer proximoFuncId;
	private Integer proximoProjId;
	private Integer proximaOcorrId;
}
