
public class Main {
	public static int MAX =4;
	public static int[] Grilo = new int [MAX]; 
	public static int[] Pulos = new int [MAX]; 
	public static int Pista= 100;
	public static boolean Fim = false;


	        
	public static void main(String[] args) {
	    for (int indice=0;indice < MAX; indice++){
	        Grilo[indice] = 0;
	        Pulos[indice] = 0;    
	    }
	    int maxThread = 4;
	    int nElements = MAX / maxThread;
		
		Corrida [] threads = new Corrida[maxThread];
		
		for (int i = 0; i < maxThread; i++){
			threads[i] = new Corrida(MAX, Grilo, Pulos, 
												 Pista, Fim, i * nElements);
			threads[i].start();
		}
		
		
		for (int i = 0; i < maxThread; i++){
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}   

}
