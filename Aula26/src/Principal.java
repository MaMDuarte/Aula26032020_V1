
public class Principal 
{
	public static void main(String[] args)
	{
		caixa("8");		
	}
	
	public static void caixa(String chr)
	{
		extremes(chr);
		
		for(int c=0; c<4;c++)
		{
			line(chr);
		}
		
		extremes(chr);
	}
	
	public static void extremes(String chr)
	{
		for(int c=0; c<6; c++ )
		{
			System.out.print(chr);
		}
		System.out.print("\n");
	}
	
	public static void line(String chr)
	{
		System.out.print(chr);
		
		for(int c=0;c<4;c++)
		{
			System.out.print(" ");
		}
		System.out.print(chr);
		
		System.out.print("\n");
	}
}
