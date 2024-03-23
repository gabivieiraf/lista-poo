package ex2;

public class Lâmpada {
	Estado estado;
	int qtdAcesa;
	
	int click() {
		if (estado == Estado.ACESA)
			estado = Estado.APAGADA;
		else {
			estado = Estado.ACESA;
			qtdAcesa++;
		}
			return qtdAcesa;
			
	}
	
	void qtdAcendimentos() {
		System.out.println(qtdAcesa);
	}
	
	void checaEstado() {
		System.out.println(estado);
	}
}
