
public class Data {

	private int dia;
	private int mes;
	private int ano;

	public Data(int dia, int mes, int ano) {
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if (dia < 1 || dia > 31) {
			System.out.println("Dia inválido");
		} else {
			this.dia = dia;
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (mes < 1 || mes > 12) {
			System.out.println("Mês inválido");
		} else {
			this.mes = mes;
		}
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void displayData() {
		if (getAno() > 0) {
			System.out.println(getDia() + "/" + getMes() + "/" + getAno());
		} else if (getAno() < 0){
			System.out.println(getDia() + "/" + getMes() + "/" + Math.abs(getAno()) + "a.c.");
		} else {
			System.out.println(getDia() + "/" + getMes() + "/0000");
		}
		
	}

	@Override
	public String toString() {
		return "Data [dia=" + dia + ", mes=" + mes + ", ano=" + ano + "]";
	}

}
