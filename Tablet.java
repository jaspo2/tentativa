
public class Tablet {
	
	private String marca;
	private int memoria;
	private int ano;
	
	public Tablet(String marca, int memoria, int ano) {
		this.marca = marca;
		this.memoria = memoria;
		this.ano = ano;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public String getMarca() {
		return marca;
	}

	public int getAno() {
		return ano;
	}
	
	public boolean eIgualA(Tablet tablet) {
		// chamada no principal:  tablet1.eIgualA(tablet2)
		return this.marca.equals(tablet.marca) && this.memoria == tablet.getMemoria() 
				&& this.ano == tablet.getAno();
	}
	
	//  Tablet (marca, memoria GB, ano)

}
