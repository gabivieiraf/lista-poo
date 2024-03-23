package ex1;

public class Churrasco {
	double qtdCarne;
	
	void verificarConsumo(int idade, boolean vegetariana) {
		if(idade<4 || vegetariana== true) 
			qtdCarne = 0;
		else if (idade>=4 && idade<=12)
			qtdCarne = 1;
		else
			qtdCarne = 2;
		System.out.println(qtdCarne);
	}
	
}
