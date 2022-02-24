package istqb.entites;

public class Operation {
	public int addToFive(int n)throws Exception
	{
		if(n==Integer.MAX_VALUE)
			throw new Exception("Valeur trop large !!");
		
		return n+5;
	}
	public double divide(int a, int b) throws ArithmeticException{
		if(b==0)
			throw new ArithmeticException();
		return (double)a/b;
	}
}
