package Heranca;

public class Veiculo {
	private int ano;
	private String marca;
	private String modelo;
	private String cor;
	
	public Veiculo (int ano, String marca, String modelo, String cor) {
		this.ano=ano;
		this.marca=marca;
		this.modelo=modelo;
		this.cor=cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano=ano;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void SEtModelo(String modelo) {
		this.modelo=modelo;
	}
	public String getCor() {
		return cor;
	}
	public void SetCor(String cor) {
		this.cor=cor;
	}
}
	

