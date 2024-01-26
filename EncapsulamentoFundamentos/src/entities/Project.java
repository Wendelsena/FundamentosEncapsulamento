package entities;

public class Project {

	private String name; // private por que não são acessados por outras classes.
	private double price;

	// para acessar/obter o atributo usamos getName().
	public String getName() { 
		return name;
	}

	// para alterar o valor do atributo usamos setName e depois o nome do atributo
	public void setName(String name) { // void por que não retorna nada.
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
