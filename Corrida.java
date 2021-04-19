
public class Corrida {
	static int grilosf = 0;
	public static int Pista = 0;
	static int Colocacao = 1;
	static int timesf = 0;
	static int ColocacaoT = 1;
	static boolean ganharam = false;
	
	
	
	public static void Inicio(int QtGrilos, CtlThread[] thread, Grilo[] grilo, Time[] times) {
        thread = new CtlThread[QtGrilos];

        for(int i = 0; i < QtGrilos; i++) 
        {
            thread[i] = new CtlThread(grilo[i]);
            thread[i].start();
        }
        for (int i = 0; i < thread.length; i++) 
        {
          try 
          {
            thread[i].join();
          } 
          catch (InterruptedException e ) 
          {
              e.printStackTrace();
          }
        }
        
        while(grilosf < QtGrilos) {
        Corre(QtGrilos, thread, grilo);
        }
        
        for(int i = 0; i < times; i++) 
		{
			times[i].Final();
		}
		for(int i = 0; i < times; i++) 
		{
			times[i].GanhadorF();
			
		}
    }

    public static void Corre(int QtGrilos, CtlThread[] thread, Grilo[] grilo) {
        for(int i = 0; i < QtGrilos; i++) 
        {
            if(grilo[i].acabou != true)
            {
                if(grilo[i].atposicao >= Pista) 
                { 
                grilosf ++;
                System.out.println("O " + grilo[i].nome +" Chegou em " + grilo[i].pulinhos + " pulos") ;
                if(grilo[i].atposicao >= Pista)
                {
                	System.out.println("O " + grilo[i].nome + " é o " + Colocacao + " colocado");
                	Colocacao +=1;
                	
                }
                	
                grilo[i].acabou = true;
                }
                else 
                {
                    thread[i].run();
                }
            }
        }
            for (int i = 0; i < thread.length; i++) 
            {
              try 
              {
                thread[i].join();
              } 
              catch (InterruptedException e ) 
              {
                  e.printStackTrace();
              }
            }
    }
}