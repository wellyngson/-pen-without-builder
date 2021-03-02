package main;

public class Caneta {
	
	String model, color, tampada;
	float ponta;
	 
	public void status() {
		System.out.println("\nSEGUE ABAIXO AS CARACTER�STICAS DA SUA CANETA" +
						   "\n\nModelo: " + this.model +
						   "\nCor: " + this.color +
						   "\nPonta: " + this.ponta +
						   "\nEst� tampada? " + this.tampada);
	}
	
	public void rabiscar() {
		if (this.tampada.toLowerCase().equals("sim")) {
			System.out.println("\n" + "� POSSIVEL RABISCAR!");
		} else {
			System.out.println("\n" + "N�O � POSS�VEL RABISCAR, POIS SUA CANETA EST� TAMPADA!\n");
		}
	}
	
	protected void tampar() {
		System.out.println("\n" + "Voc� solicitou que sua caneta " + this.model.toLowerCase() + " " + this.color.toLowerCase() + " seja tampada." + "\n" +
							"SUA CANETA FOI TAMPADA.");
	}
	
	protected void destampar() {
		System.out.println("\n" + "Voc� solicitou que sua caneta " + this.model.toLowerCase() + " " + this.color.toLowerCase() + " seja destampada." + "\n" +
							"SUA CANETA FOI DESTAMPADA.");
	}

}