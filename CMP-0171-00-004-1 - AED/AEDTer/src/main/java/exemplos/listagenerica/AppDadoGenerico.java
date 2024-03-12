package exemplos.listagenerica;

public class AppDadoGenerico {

	public static void main(String[] args) {
		
		UsaCarroPessoa<Veiculo, String> veiculoProprietario = new UsaCarroPessoa<>();
		
		veiculoProprietario.setProprietario("André");
		veiculoProprietario.setVeiculo(new Carro(2024, "Fiat", "Uno"));
		
		
		UsaCarroPessoa<Veiculo, Pessoa> carroPessoa = new UsaCarroPessoa<>();
		
		carroPessoa.setProprietario(new Pessoa("Felipe"));
		carroPessoa.setVeiculo(new Veiculo(2024, "Ferrari", "355"));
		
		
		System.out.println(veiculoProprietario.getProprietario());
		System.out.println(veiculoProprietario.getVeiculo());
		
		
		System.out.println(carroPessoa.getProprietario());
		System.out.println(carroPessoa.getVeiculo());
	}
	
}
