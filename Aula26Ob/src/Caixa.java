
public class Caixa 
{
	private int largura;
	private int altura;
	public String caracter = "*";
	public Caixa(int alt, int larg) 
	{
		this.altura = alt;
		this.largura = larg;
	}
	
	public void gerarCaixa()
	{
		gerarTopo();
		gerarMeio();
		gerarTopo();
	}
	
	private void gerarTopo()
	{
		for(int c=0;c<largura;c++)
		{
			System.out.print(caracter);
		}
		System.out.print("\n");
	}

	private void gerarMeio()
	{
		for(int c=0; c<altura-2; c++)
		{
			System.out.print(gerarLinhaMeio());
		}
	}
	private String gerarLinhaMeio()
	{
		String linha = "";
		linha += caracter;
		for(int c=0;c<largura-2;c++)
		{
			linha += " ";
		}
		linha += caracter;
		linha += "\n";
		
		return linha;
	}
}
