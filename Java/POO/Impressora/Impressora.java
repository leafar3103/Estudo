
public class Impressora {
	
	public float exibir(final float x) {
		System.out.println(x);
		return x;
	}

	public void exibir(float x, float y) {
		System.out.println(x + " ," + y);
		//return y;
	}

	public void exibir(float x, String y) {
		System.out.println(x + " ," + y);
		//return x;
	}

	public void exibir( String x, float y) {
		System.out.println(x + " ," + y);
		
	}

	public  void exibir(String x, String y, String z) {
		System.out.println(x + " ," + y + " ," + z);
		
		
	}

	public void exibir(final int x, final int y, final String z) {
		System.out.println(x + " ," + y + " ," + z);
		
	}
}
