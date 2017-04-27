package es.unileon.prg1.sieteymedia;

public class Carta {
	private int numero;
	private Palo palo;

	public Carta(int numero, Palo palo)throws SieteYmedioException {
		if(numero<1||numero > 10){
			throw new SieteYmedioException("Carta - Error: Numero "+numero+" no valido. Debe estar entre 1 y 10");
		}else{
			this.numero=numero;
		}
		this.palo=palo;
	}
	
	public Carta(int numero, int palo)throws SieteYmedioException {
		if(numero<1||numero > 10){
			throw new SieteYmedioException("Carta - Error: Numero "+numero+" no valido. Debe estar entre 1 y 10");
		}else{
			this.numero=numero;
		}
		if(palo <1|| palo >4){
			// throw new SieteYmedioException("Carta - Error: Palo "+palo+" no valido. Debe estar entre 1 y 10");
			else{
				switch(palo){
				case 1:
					this.palo = Palo.OROS;
					break;
				case 2:
					this.palo = Palo.COPAS;
					break;
				case 3:
					this.palo = Palo.ESPADAS;
					break;
				case 4:
					this.palo = Palo.BASTOS;
					break;
				}
			}
		}
		this.palo=palo;
	}
	
	public String toString(){
		return numero + palo;
	}
}
