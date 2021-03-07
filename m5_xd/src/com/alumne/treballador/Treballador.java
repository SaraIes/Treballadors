package com.alumne.treballador;

public class Treballador {
	static final int DIRECTOR = 0;
	static final int SUBDIRECTOR = 1;
	static final int BASE = 2;
	String nomTreballador;
	int tipusTreballador;
	float nominaTreballador;
	int horesExtresTreballador;

	// Constructor amb arguments, alternatiu al constructor per defecte
	Treballador(String nom, int tipus, float nomina, int hores) {
		nomTreballador = nom;
		tipusTreballador = tipus;
		nominaTreballador = nomina;
		horesExtresTreballador = hores;
	}

	// Constructor buit per defecte, l'hem de declarar si volem poder usar-lo per
	// culpa d'haver declarat l' anterior
	Treballador() {

	}

	// M�tode que assigna el nom al treballador sempre que sigui m�s llarg a 2
	// lletres
	void setNom(String nom) throws Exception {
		// Si la longitud del nou nom es inferior a tres caracters llen� excepcio
		// avisant del problema
		if (nom.length() < 3) {
			throw new Exception("El nom ha de tenir 3 o m�s caracters");
		}
		// En cas contrari assigna el nom
		nomTreballador = nom;
	}

	// Funci� que retorna el nom del treballador
	String getNom() {
		return nomTreballador;
	}

	// M�tode que assigna el valor dels euros a la nomina del treballador
	void setNomina(float euros) {
		// Per simplicitat no comprovem que la nomina �s superior a zero ja que el
		// programa no fallar� per aquest error i aix� ens estalviem les excepcions
		nominaTreballador = euros;
	}

	// Retrona el valor num�ric de la nomina
	float getNomina() {
		return nominaTreballador;
	}

	// Assigna el numero de hores a la variable hores extra
	void setHoresExtres(int hores) {
		// Les hores extra poden ser zero sense problema
		horesExtresTreballador = hores;
	}

	// Retorna el numero d'hores extra
	int getHoresExtres() {
		return horesExtresTreballador;
	}

	// Assignem el tipus de cada treballador a la variable corresponent i si no es
	// v�lid mostrem l'error
	void setTipusTreballador(int tipus) throws Exception {
		// Aqui no �s recomanable estalviar-se les comprovacions perqu� el tipus de
		// treballador nom�s pot ser DIRECTOR, SUbDIRECTOR o BASE
		if ((tipus == DIRECTOR) || (tipus == SUBDIRECTOR) || (tipus == BASE)) {
			// Si el tipus �s v�lid, l'assignem
			tipusTreballador = tipus;
		} else {
			// Si el tipus no �s valid, creem excepci�
			throw new Exception("Tipus de treballador no v�lid");
		}
	}

	// Retorna el valor de la variable del tipus de treballador
	int getTipusTreballador() {
		return tipusTreballador;
	}
}
