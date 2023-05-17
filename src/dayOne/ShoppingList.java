package dayOne;

import java.util.Arrays;

public class ShoppingList {
	private Item[] shoppingList;

	public ShoppingList() {
		this.shoppingList = new Item[5];

	}

	/**
	 * Adicionar um novo Item na lista de Compras. Caso não seja possível, podemos
	 * presumir que o array está cheio, então um novo será gerado, redimensionado e
	 * com o item em questão adicionado
	 * 
	 * @param nameItem String nome do produto
	 * @param quantity int quantidade
	 */
	public boolean add(String nameItem, int quantity) {

		for (int i = 0; i < this.shoppingList.length; i++) {
			if (shoppingList[i] == null) {
				shoppingList[i] = new Item(nameItem, quantity);
				return true;
			}
		}

		this.shoppingList = Arrays.copyOf(this.shoppingList, this.shoppingList.length + 5);
		add(nameItem, quantity);
		return false;
	}

	/**
	 * Listar todos os Produtos. Caso o Array esteja vazio, uma mensagem será
	 * retornada
	 * 
	 * @return a lista com todos os produtos
	 */
	public String list() {

		String result = "Shopping List" + System.lineSeparator();
		boolean isEmpty = true;

		for (Item item : this.shoppingList) {
			if (item != null) {
				result += item.toString() + System.lineSeparator();
				isEmpty = false;
			}
		}

		return isEmpty ? "Não existem itens listados" : result;
	}

	/**
	 * Remove um item da lista de compras pelo nome
	 * 
	 * @param productName
	 * @return um boolean confirmando que o item foi removido
	 */
	public boolean remove(String productName) {
		
		for (int i = 0; i < shoppingList.length; i++) {
			if (productName.equalsIgnoreCase(shoppingList[i].getProduct().getName())) {
				shoppingList[i] = null;
				return true;				
			}
		}
	
		return false;
	}

	public Item[] getShoppingList() {
		return shoppingList;
	}

	public void setShoppingList(Item[] shoppingList) {
		this.shoppingList = shoppingList;
	}

}
