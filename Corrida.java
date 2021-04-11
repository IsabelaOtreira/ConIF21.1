
public class Corrida extends Thread {
	
	public static int MAX;
    public static int[] Grilo;
    public static int[] Pulos;   
    public static int Pista;
    public static boolean Fim;
    public static int offSet;
    
	
	public Corrida(int _MAX, int _Grilo[], int _Pulos[] ,
			int _Pista, boolean _Fim, int _offSet) {
		MAX = _MAX;
		Grilo = _Grilo;
		Pulos = _Pulos;
		Pista = _Pista;
		Fim = _Fim;
		offSet = _offSet;
	}
	
	@Override
	public void run() {
		super.run();
		
        while (!Fim){
            for(int indice=0;indice <MAX; indice++){
               if (Grilo [indice]<Pista){
                   
               
                int pulinho = (int) (Math.random()*40);
            Grilo [indice]+=pulinho;
            Pulos[indice]+=1;
            System.out.println("O Grilo_"+(indice+1)+" pulou "+pulinho+"cm e já percorreu "+Grilo[indice]+"cm");
            if (Grilo[indice]>=Pista){
                System.out.println("Grilo_"+(indice+1)+" chegou a linha de chegada com "+Pulos[indice]+" pulos");
            }
               }
            }
            if (Grilo[0]>=Pista && Grilo[1]>=Pista && Grilo[2]>=Pista && Grilo[3]>=Pista)
            Fim = true;
        }
		}
}
