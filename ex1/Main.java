package ex1;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.idade = 15;
		p.nome = "Gabriela";
		p.sexo = "Feminino";
		p.vegetariana = false;
		
		Churrasco c = new Churrasco();
		c.verificarConsumo(p.idade,p.vegetariana);

	}

}
