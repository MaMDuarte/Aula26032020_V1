
public class PrincipalObj 
{
	public static void main(String[] args) 
	{
		Caixa cx = new Caixa(6,6);
		cx.caracter = "/";
		cx.gerarCaixa();
		
		Caixa cx2 = new Caixa(9,16);
		cx2.caracter = "#";
		cx2.gerarCaixa();
	}
}

