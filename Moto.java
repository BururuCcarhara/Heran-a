package Heranca;

public class Moto extends Veiculo {
	private int cilidrada;
	
	public Moto (int ano,int cilidrada, String marca, String modelo, String cor) {
		super( ano, marca, modelo, cor);
		this.cilidrada=cilidrada;
	}
		
		public int getCilidrada() {
			return cilidrada;
		}
		public void setCilidrada(int cilidrada) {
			this.cilidrada=cilidrada;
		}
}