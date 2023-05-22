package dayTwo;


/**
 * 
 * O desafio para o dia de hoje é implementar um sistema de gerenciamento de
 * pacientes em um hospital usando listas simplesmente encadeadas.
 * 
 * Cada paciente deve ter um nome, um número de identificação e o estado de
 * saúde atual do paciente, como "estável", "em tratamento intensivo", "em
 * estado crítico", entre outros.
 * 
 * O sistema deve permitir adicionar novos pacientes, remover pacientes e listar
 * todos os pacientes em ordem de chegada.
 * 
 * Obs: não é necessário criar nenhuma interface do usuário para esse desafio (a
 * não ser que você queira), o objetivo é executar apenas um único arquivo.
 * 
 * @author Pedro Henrique Pereira de Oliveira
 * @owner Giovanna Moeller
 */

public class App {
	
	public static void main(String[] args) {
		ListaDePacientes list = new ListaDePacientes();
		
		list.acidionar("Pedro", "Paciente Grave");
		list.acidionar("João", "Paciente Estável");
		list.acidionar("Marco", "Paciente Mediano");

		
		list.apagarTudo();
	}
}
