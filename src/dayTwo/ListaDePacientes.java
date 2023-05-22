package dayTwo;

public class ListaDePacientes {
	private Pacient inicio;
	private Pacient ultimo;
	private int tamanho = 0;

	/**
	 * Adiciona um novo Paciente dentro da última posição disponível da lista
	 * 
	 * @param name   Nome do Novo Paciente
	 * @param status Estado do novo Paciente
	 */

	public void acidionar(String name, String status) {
		/**
		 * Aqui eu vou criar um paciente de controle, que pode ser interpreado como uma
		 * célula atual, que vai ter alguns comportamentos diferenciados dependendo de
		 * certas condições
		 */
		Pacient controle = new Pacient(name, status);
		controle.setId(tamanho);

		/**
		 * Caso o tamanho da minha lista encadeada seja zero, meu paciente inicial vai
		 * ser, logicamente, minha célula de controle, pois ele é o único paciente
		 * registrado. Juntamente a isso, meu ultimo paciente também será o mesmo, já
		 * que ele também é o último elemento da lista
		 * 
		 * Caso contrário, iremos utilizar o último nó da lista, e vamos alterar a
		 * referência do último elemento, onde vamos, primeiramente, alterar o
		 * ultimo.proximo (Nesse caso, é meu atual elemento da lista) como minha célula
		 * de controle, garantindo a ligação dos nós, e logo após, vamos alterar o
		 * último elemento da lista como a própria célula de controle
		 * 
		 * Resumindo, alteramos a referência do nó atual e implementamos o "novo último"
		 * elemento da lista
		 */

		if (getTamanho() == 0) {
			this.inicio = controle;

		} else {
			this.ultimo.setNext(controle);

		}
		this.ultimo = controle;
		this.tamanho++;

	}

	/**
	 * @return todos os pacientes listados
	 */

	public String listar() {
		/**
		 * Mais um momento onde vamos usar uma variável de controle para iterar dentro
		 * da lista encadeada. Utilizando uma célula de controle atual como o paciente
		 * inicial, implementei uma estrutura de repetição simples, que vai rodar
		 * durante o intervalo do tamanho da lista.
		 * 
		 * Dentro dessa estrutura, simplesmente vamos requisitar o toString to meu
		 * paciente atual, e atribuir um novo valor para minha célula atual, o setando
		 * como a minha referência para o próximo elemento, nesse caso o atual.proximo.
		 */

		if (getTamanho() == 0) {
			return "Empty";
		}
		Pacient atual = this.inicio;

		String result = "";
		for (int i = 0; i < getTamanho(); i++) {
			result += atual.toString() + System.lineSeparator();
			atual = atual.getNext();
		}
		return result;
	}

	/**
	 * Apaga toda a lista
	 */
	public void apagarTudo() {

		/**
		 * Aqui, pessoalmente é onde minha mente deu uma bugada legal e eu demorei a
		 * entender como realmente funciona esse processo inteiro. Usualmente, eu
		 * poderia simplesmente setar o Paciente inicial, e o final como meu nulo e
		 * estaria tudo resolvido, mas achei por bem entender como esse algoritmo
		 * funciona dentro do Java.
		 * 
		 * Aqui, além de setarmos o elemento de início e o último como nulo, assim como
		 * o tamanho, uma estrtutra de repetição com duas variáveis de controle: Um
		 * paciente atual (Inicialmente o this.inicio) e um paciente próximo, que é o
		 * paciente atual.getNext().
		 * 
		 * Baseado nisso, dá pra entender melhor o script abaixo, de forma que fique
		 * clara como cada paciente é apagado dentro da lista encadeada.
		 * 
		 */

		for (Pacient atual = this.inicio; atual != null;) {
			Pacient proximo = atual.getNext();
			atual = null;
			atual = proximo;
		}

		this.inicio = null;
		this.ultimo = null;
		this.tamanho = 0;
	}

	public int getTamanho() {
		return tamanho;
	}

	public Pacient getInicio() {
		return inicio;
	}

	public Pacient getUltimo() {
		return ultimo;
	}
}
