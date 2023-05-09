package principal;

import java.util.ArrayList;

public class Pedido {

	// Lista Lanche
	public static ArrayList<Ingrediente> ingredientes = new ArrayList<>();

	public void addIngrediente(Ingrediente ingrediente) {
		ingredientes.add(ingrediente);
	}

	public void removerIngrediente(int num) {
		ingredientes.remove(num);
	}

	public static ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public static double getPrecoTotal() {
		double precoTotal = 0.0;

		for (Ingrediente i : ingredientes) {
			precoTotal += i.getPreco();
		}
		return precoTotal;
	}

	// Lista Bebida
	public static ArrayList<Ingrediente> bebidas = new ArrayList<>();

	public void addBebida(Ingrediente bebida) {
		this.bebidas.add(bebida);
	}

	public static ArrayList<Ingrediente> getBebida() {
		return bebidas;
	}

	public void setBebida(ArrayList<Ingrediente> bebida) {
		this.bebidas = bebida;
	}

	public static double getPrecoTotalBebida() {
		double precoTotal = 0.0;

		for (Ingrediente i : bebidas) {
			precoTotal += i.getPreco();
		}
		return precoTotal;
	}

	// Lista Sobremesa
	public static ArrayList<Ingrediente> sobremesas = new ArrayList<>();

	public void addSobremesa(Ingrediente sobremesa) {
		this.sobremesas.add(sobremesa);
	}

	public static ArrayList<Ingrediente> getSobremesa() {
		return sobremesas;
	}

	public void setSobremesa(ArrayList<Ingrediente> sobremesa) {
		this.sobremesas = sobremesa;
	}

	public static double getPrecoTotalSobremesa() {
		double precoTotal = 0.0;

		for (Ingrediente i : sobremesas) {
			precoTotal += i.getPreco();
		}
		return precoTotal;
	}
	
	public static ArrayList<Ingrediente> adicionais = new ArrayList<>();

	public void addAdicionais(Ingrediente adicionais) {
		this.adicionais.add(adicionais);
	}

	public void removerAdicionais(int num) {
		adicionais.remove(num);
	}

	public static ArrayList<Ingrediente> getAdicionais() {
		return adicionais;
	}

	public void setAdicionais(ArrayList<Ingrediente> adicionais) {
		this.adicionais = adicionais;
	}

	public static double getPrecoTotalAdicionais() {
		double precoTotal = 0.0;

		for (Ingrediente i : adicionais) {
			precoTotal += i.getPreco();
		}
		return precoTotal;
	}
}