package exemplos.classesgenericas;

public class UsaGenerinco {

	public static void main(String[] args) {
		UsaVeiculoPessoa<Moto, PessoaFisica> motoFisica = new UsaVeiculoPessoa<>();
		
		UsaVeiculoPessoa<Carro, PessoaJuridica> carroEmpresa = new UsaVeiculoPessoa<>();
		
		UsaVeiculoPessoa<Aviao, String> intString = new UsaVeiculoPessoa<>();
	}

}
