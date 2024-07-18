package poo.gestaodecontas;

public class HistoricoDeLancamento {

	private Lancamento[] lancamentos;
	private int ultimoLancamento;
	
	public void HistoricoDeLancamentos(int numeroDeLancamento) {
	this.lancamentos = new Lancamento[numeroDeLancamento + 1];
}
	
	public void insereLancamento(Lancamento lancamento) {
	if(this.ultimoLancamento == this.lancamentos.length - 1) {
	for(int i = 0; i < this.lancamentos.length; i++) {
	this.lancamentos[i] = this.lancamentos[i+1];
	
}
	}
	
	else {
	this.ultimoLancamento++;
}
	this.lancamentos[this.ultimoLancamento] = lancamento;
}
	
	public String geraHistoricoDeLancamentos() {
	 StringBuilder historico = new StringBuilder();
	 for (int i = 0; i < this.ultimoLancamento; i++) {
	  historico.append(this.lancamentos[i].getDescricao())
	      .append(": R$")
	      .append(this.lancamentos[i].getValor())
	      .append("\n");
}
	return historico.toString();

	}
}
