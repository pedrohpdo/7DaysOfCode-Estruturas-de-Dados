package dayTwo;

/**
 * 
 * Levando em conta a natureza do desafio, vou usar o próprio Paciente para
 * implementar um nó da minha lista encadeada. Todo paciente vai possuir um
 * nome(String name), uma condição(String status) e uma identificação(int id).
 * Lembrando que, o Nó já possui a referência para o próximo elemento da lista,
 * que é representado pelo Pacient next
 * 
 * @author Pedro Henrique Pereira de Oliveira
 *
 */

public class Pacient {
	private String name, status;
	private int id;

	private Pacient next;

	public Pacient(String name, String status) {
		setName(name);
		setStatus(status);

		this.next = null;
	}

	@Override
	public String toString() {
		return String.format("Id %s: %s | Status: %s | Próximo Paciente: %s", getId(), getName(), getStatus(),
				getNext() == null ? "Não Tem" : getNext().getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Pacient getNext() {
		return next;
	}

	public void setNext(Pacient next) {
		this.next = next;
	}

}
