package ejerciciosu4parte4;

public class Fecha {

	private int dia;
	private int mes;
	private int año;

	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public boolean esBisiesto() {
		return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
	}

	public boolean fechaCorrecta() {
		// Comprobar que mes esté entre 1 y 12
		if (mes < 1 || mes > 12) {
			return false;
		}

		// Comprobar que día esté entre 1 y 31
		if (dia < 1 || dia > 31) {
			return false;
		}

		if (mes == 2) {
			if (esBisiesto()) {
				if (dia > 29) {
					return false;
				}
			} else {
				if (dia > 28) {
					return false;
				}
			}
		}
		return true;
	}

	public void diaSiguiente() {
		dia++;

		// Variable para saber los días del mes actual
		int diasDelMes = 31; 

		// calcula los meses con 30 dias y los bisiestos
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			diasDelMes = 30;
		} else if (mes == 2) {
			if (esBisiesto()) {
				diasDelMes = 29;
			} else {
				diasDelMes = 28;
			}
		}

		// Si el día supera los días del mes, pasar al mes siguiente
		if (dia > diasDelMes) {
			dia = 1;
			mes++;

			// Si el mes supera 12, pasar al año siguiente
			if (mes > 12) {
				mes = 1;
				año++;
			}
		}
	}

	@Override
	public String toString() {
		return dia+ "-" + mes + "-" + año;
	}
}