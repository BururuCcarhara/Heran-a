package Heranca;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa= new Pessoa ("Rodolfo", "(11) 9999-9999");
		System.out.println("pessoa: ");
		System.out.println("nome: "+pessoa.getNome());
		System.out.println("telefone: "+pessoa.getTelefone());

	PessoaFisica PessoaFisica =new PessoaFisica ("Epaminondas", "(15) 4622-8922", "6666", "5555" );
	System.out.println("\nPessoa física: ");
	System.out.println("nome: "+PessoaFisica.getNome());
	System.out.println("telefone: "+PessoaFisica.getTelefone());
	System.out.println("cpf: "+PessoaFisica.getCpf());
	System.out.println("rg: "+PessoaFisica.getRg());
	
	PessoaJuridica PessoaJuridica = new PessoaJuridica ("Empresa ABC", "(11) 4545-1212","88888");
	System.out.println("\nPessoa jurídica: ");
	System.out.println("nome: "+PessoaJuridica.getNome());
	System.out.println("telefone: "+PessoaJuridica.getTelefone());
	System.out.println("cpf: "+PessoaJuridica.getCnpj());
	}
}
