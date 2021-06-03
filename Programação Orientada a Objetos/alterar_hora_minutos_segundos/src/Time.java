
public class Time {

	private int hour;
	private int minutes;
	private int seconds;
	
	public void setHour(int hour) {
		if (hour < 0 || hour > 23)
		{
			System.out.println("Digite um valor entre 0 e 23");
			this.hour = 00;
		} else {
			this.hour = hour;
		}
	}
	
	public void setMinutes(int minutes) {
		if (minutes > 59 || minutes < 0) {
			System.out.println("Digite um valor entre 0 e 59");
			this.minutes = 00;
		}
		else {
			this.minutes = minutes;
		}
	}
	
	public void setSeconds(int seconds) {
		if (seconds > 59 || seconds < 0) {
			System.out.println("Digite um valor entre 0 e 59");
			this.seconds = 00;
		}
		else {
			this.seconds = seconds;
		}
	}
	
	public String getTime() {
		return hour + ":" + minutes + ":" + seconds;
	}
}
