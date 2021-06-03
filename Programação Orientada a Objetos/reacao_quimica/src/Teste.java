public class Teste {

	private static void testarReacao() {
		int totalTestes = 7;
		int testesCorretos = 0;
		System.out.println("### Reacao\n");
		Reacao r = new Reacao(1, 1);
		testesCorretos += rodarTeste("Valores iniciais", r.getC() == 0);
		r.adicionarA(1);
		r.adicionarB(1);
		testesCorretos += rodarTeste("Se não agitar, continua igual", r.getC() == 0);
		r.agitar();
		testesCorretos += rodarTeste("Se agitar, produz C", r.getC() == 1);
		r.agitar();
		testesCorretos += rodarTeste("Se agitar de novo, não produz mais C", r.getC() == 1);

		r = new Reacao(2, 3);
		r.adicionarA(6);
		r.adicionarB(6);
		r.agitar();
		testesCorretos += rodarTeste("C é produzido na quantidade correta", r.getC() == 2);
		r.adicionarB(6);
		r.agitar();
		testesCorretos += rodarTeste("Sobra de A pode ser reutilizada", r.getC() == 3);
		r.adicionarA(2);
		r.agitar();
		testesCorretos += rodarTeste("Sobra de B pode ser reutilizada", r.getC() == 4);

		mostrarResultado(testesCorretos, totalTestes);
	}

	private static void testarPersonagem() {
		int totalTestes = 24;
		int testesCorretos = 0;
		System.out.println("### Personagem\n");
		Personagem p = new Personagem(500, 70, 100, 10, 200);
		testesCorretos += rodarTeste("Nivel inicia em 1", p.getNivel() == 1);
		testesCorretos += rodarTeste("Nivel 1 pode melhorar habilidade", p.melhorarHabilidade(0));
		testesCorretos += rodarTeste("Nivel 1 pode melhorar apenas uma habilidade", !p.melhorarHabilidade(0));
		p.adicionarXP(100);
		testesCorretos += rodarTeste("Personagem pode subir de nível", p.getNivel() == 2);
		testesCorretos += rodarTeste("Personagem pode melhorar outra habilidade", p.melhorarHabilidade(1));
		p.adicionarXP(50);
		p.adicionarXP(50);
		testesCorretos += rodarTeste("Personagem sobe de nivel mesmo recebendo experiência aos poucos",
				p.getNivel() == 3);
		testesCorretos += rodarTeste("Personagem não pode melhorar ultimate antes do nivel 6",
				!p.melhorarHabilidade(3));
		p.adicionarXP(300);
		testesCorretos += rodarTeste("Personagem pode chegar no nivel 6", p.getNivel() == 6);
		testesCorretos += rodarTeste("Personagem pode melhorar ultimate no nivel 6", p.melhorarHabilidade(3));
		testesCorretos += rodarTeste("Personagem não pode usar habilidade com nível de melhoria 0",
				!p.usarHabilidade(2));
		p.melhorarHabilidade(2);
		testesCorretos += rodarTeste("Personagem pode usar habilidade com nível de melhoria >0", p.usarHabilidade(2));
		// até aqui: personagem nivel 6 com habilidades nivel: 1 1 1 1; mana: 490/500
		p.usarHabilidade(3);
		p.usarHabilidade(3);
		// mana 90/500
		testesCorretos += rodarTeste("Personagem não pode usar habilidade se não tiver mana suficiente",
				!p.usarHabilidade(3));

		// Poção
		p.consumirPocao(); // 440/500
		testesCorretos += rodarTeste("Personagem pode recuperar mana com poção", p.usarHabilidade(3));
		p.consumirPocao(); // mana 500/500
		p.consumirPocao(); // tomar outras vezes nao deveria deixar passar dos 500
		p.consumirPocao();
		p.consumirPocao();
		// mana 500/500
		p.usarHabilidade(3);
		p.usarHabilidade(3);
		p.usarHabilidade(1);
		// mana 0/500
		testesCorretos += rodarTeste("Poção não recupera além da mana máxima", !p.usarHabilidade(2));

		// Niveis máximos
		p.adicionarXP(2500);
		testesCorretos += rodarTeste("Não é possível passar do nível 25", p.getNivel() == 25);
		// habilidades ainda 1 1 1 1
		p.melhorarHabilidade(0);
		p.melhorarHabilidade(0);
		testesCorretos += rodarTeste("Habilidade 0 chega ao nível 4", p.melhorarHabilidade(0));
		testesCorretos += rodarTeste("Habilidade 0 não passa do nível 4", !p.melhorarHabilidade(0));
		p.melhorarHabilidade(1);
		p.melhorarHabilidade(1);
		testesCorretos += rodarTeste("Habilidade 1 chega ao nível 4", p.melhorarHabilidade(1));
		testesCorretos += rodarTeste("Habilidade 1 não passa do nível 4", !p.melhorarHabilidade(1));
		p.melhorarHabilidade(2);
		p.melhorarHabilidade(2);
		testesCorretos += rodarTeste("Habilidade 2 chega ao nível 4", p.melhorarHabilidade(2));
		testesCorretos += rodarTeste("Habilidade 2 não passa do nível 4", !p.melhorarHabilidade(2));
		p.melhorarHabilidade(3);
		testesCorretos += rodarTeste("Habilidade 3 chega ao nível 3", p.melhorarHabilidade(3));
		testesCorretos += rodarTeste("Habilidade 3 não passa do nível 3", !p.melhorarHabilidade(3));

		p.consumirPocao();
		p.consumirPocao();
		// mesmo os 500 de mana não são suficientes para usar a ult no nivel 3 (200*3
		// = 600)
		testesCorretos += rodarTeste("Consumo de mana é proporcional ao nível da habilidade", !p.usarHabilidade(3));

		mostrarResultado(testesCorretos, totalTestes);
	}

	private static int rodarTeste(String titulo, boolean resultado) {
		System.out.println("- " + (resultado ? "OK" : "X ") + "\t" + titulo);
		return resultado ? 1 : 0;
	}

	private static void mostrarResultado(int testesCorretos, int totalTestes) {
		System.out.println("\n> Testes corretos: " + testesCorretos + "/" + totalTestes + " ("
				+ (100 * testesCorretos / totalTestes) + "%)");
		if (testesCorretos == totalTestes) {
			System.out.println("> Tudo certo!!!");
		} else {
			System.out.println(">  Ainda falta um pouquinho, mas você consegue!");
		}
	}

	public static void main(String[] args) {
		testarReacao();
		System.out.println();
		testarPersonagem();
	}
}
