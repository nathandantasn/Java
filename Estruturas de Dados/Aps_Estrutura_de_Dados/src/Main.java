
import java.text.DateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Bem-vindo ao SÛMandrake Banking!");
		System.out.println("--------------------------------");

		Timer timer = new Timer();
		long timeRetirar = 5000;
		long timeEntrar = 5000;
		long timeImprimir = 5000;
		Fila fila = new Fila(10, 6);
		
		TimerTask timerTask = new TimerTask() {
			@Override
			public void run() {
				fila.remover();
			}
		};

		TimerTask timerTask2 = new TimerTask() {

			@Override
			public void run() {
				int idade = ThreadLocalRandom.current().nextInt(18, 80);
				fila.entrarNaFila(idade);

			}
		};
		
		TimerTask timerTask3 = new TimerTask() {

			@Override
			public void run() {
				DateFormat hora = DateFormat.getTimeInstance();
				Date data = new Date();
				System.out.print("Hora: " + hora.format(data.getTime()) + "\n");
				fila.imprimirFila();

			}
		};

		timer.schedule(timerTask3, 0, timeImprimir);
		timer.schedule(timerTask2, 0, timeEntrar);
		timer.schedule(timerTask, 20000, timeRetirar);

	}

}
