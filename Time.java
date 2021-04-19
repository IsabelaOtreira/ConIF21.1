import java.util.concurrent.Semaphore;

public class Time {   
	Semaphore mutex;
	public Time(int id) {
	this.id = id;
	this.mutex = new Semaphore(1);
	}
	
	int id = 0;
    boolean winner = false;
    int PulosT = 0;
    int DistanciaT;
  

	public synchronized void Update(int distance) {
		try {
		mutex.acquire();
		PulosT += 1;
		DistanciaT += distance;
		}
		catch(InterruptedException e1) {
            e1.printStackTrace();
		}
		finally {
		mutex.release();
		}
	}
	public void Final() {

		System.out.println("Time " + (id+1) + " : pulou " + PulosT + " vezes e percorreu " + DistanciaT + "cm");
		
	}
	public void GanhadorF() {
		
		if(winner) {
			System.out.println("Time " + (id+1) + " foi o ganhador");

			System.out.println("Fim da Corrida!");
		}
	}
}