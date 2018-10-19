package aplicação;

public class Ocorrencia {
	
	public Ocorrencia(Integer id, String nome, TipoOcorrencia tipo, PrioridadeOcorrencia prioridade, Funcionario responsavel) {
		m_id = id;
		m_nome = nome;
		m_responsavel = responsavel;
		m_tipo = tipo;
		m_prioridade = prioridade;
		m_estado = EstadoOcorrencia.ABERTA;
	}
	
	public Integer id() {
		return m_id;
	}
	
	public String nome() {
		return m_nome;
	}
	
	public TipoOcorrencia tipo() {
		return m_tipo;
	}
	
	public PrioridadeOcorrencia prioridade() {
		return m_prioridade;
	}
	
	public void alterarPrioridade(PrioridadeOcorrencia prioridade) {
		m_prioridade = prioridade;
	}
	
	public Funcionario responsavel() {
		return m_responsavel;
	}
	
	public EstadoOcorrencia estado() {
		return m_estado;
	}
	
	public void concluir() {
		m_estado = EstadoOcorrencia.FECHADA;
	}
	
	private Integer m_id;
	private String m_nome;
	private TipoOcorrencia m_tipo;
	private PrioridadeOcorrencia m_prioridade;
	private Funcionario m_responsavel;
	private EstadoOcorrencia m_estado;
	
}
