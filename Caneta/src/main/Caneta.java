package main;

public class Caneta {
	
	String model, color, tampada;
	float ponta;
	 
	public void status() {
		System.out.println("\nSEGUE ABAIXO AS CARACTERÍSTICAS DA SUA CANETA" +
						   "\n\nModelo: " + this.model +
						   "\nCor: " + this.color +
						   "\nPonta: " + this.ponta +
						   "\nEstá tampada? " + this.tampada);
	}
	
	public void rabiscar() {
		if (this.tampada.toLowerCase().equals("sim")) {
			System.out.println("\n" + "É POSSIVEL RABISCAR!");
		} else {
			System.out.println("\n" + "NÃO É POSSÍVEL RABISCAR, POIS SUA CANETA ESTÁ TAMPADA!\n");
		}
	}
	
	protected void tampar() {
		System.out.println("\n" + "Você solicitou que sua caneta " + this.model.toLowerCase() + " " + this.color.toLowerCase() + " seja tampada." + "\n" +
							"SUA CANETA FOI TAMPADA.");
	}
	
	protected void destampar() {
		System.out.println("\n" + "Você solicitou que sua caneta " + this.model.toLowerCase() + " " + this.color.toLowerCase() + " seja destampada." + "\n" +
							"SUA CANETA FOI DESTAMPADA.");
	}

}