package ex2;

public class Main {

	public static void main(String[] args) {
		
		Lâmpada l = new Lâmpada();
		l.estado = Estado.ACESA;
		l.checaEstado();
		l.click();
		l.checaEstado();
		l.click();
		l.checaEstado();
		l.click();
		l.checaEstado();
		l.click();
		l.checaEstado();
		l.click();
		l.qtdAcendimentos();

	}

}
