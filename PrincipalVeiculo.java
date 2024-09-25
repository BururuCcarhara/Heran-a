package Heranca;

public class PrincipalVeiculo {

	public static void main(String[] args) {
		
		Veiculo veiculo= new Veiculo (2075, "Toyota", "tanto faz", "preto");
		System.out.println("Veiculo: ");
		System.out.println("Ano: "+veiculo.getAno());
		System.out.println("Marca: "+veiculo.getMarca());
		System.out.println("Modelo: "+veiculo.getModelo());
		System.out.println("Cor: : "+veiculo.getCor());

		Automovel automovel =new  Automovel  (4, 2016,"potente", "Chevrolet","camionete", "azul" );
		System.out.println("\nAutomovel: ");
		System.out.println("numero de portas: "+automovel.getNumeroPortas());
		System.out.println("Ano: "+automovel.getAno());
		System.out.println("Motor: "+automovel.getMotor());
		System.out.println("Marca: "+automovel.getMarca());
		System.out.println("Modelo: "+automovel.getModelo());
		System.out.println("Cor: "+automovel.getCor());
	
		Moto moto = new Moto (2000,22, "insira marca de moto", "modelo é igual moto", "roxo");
		System.out.println("\nMoto: ");
		System.out.println("cilidrada: "+moto.getCilidrada());
		System.out.println("Ano: "+moto.getAno());
		System.out.println("Marca: "+moto.getMarca());
		System.out.println("Modelo: "+moto.getModelo());
		System.out.println("Cor: : "+moto.getCor());
	}
}
