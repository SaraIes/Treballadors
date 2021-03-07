package com.alumne.treballador;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TreballadorTest {

	@Test
	public void testNomTreballadorIncorrecte() {
		// Aquest test prova si el programa detecta que volem assignar un nom incorrecte
		// i llen�a l'excepci� que toca
		// Noteu que per als objectes individuals de la classe Treballador i Exception
		// podem triar els noms que ens done la gana,
		// no cal fer-los coincidir amb els de les classes
		Treballador treballadorMeu = new Treballador();
		// Codi per a provocar excepcions, modificat a partir de 'exemple de la
		// calculadora
		Exception excepcioMeva = assertThrows(Exception.class, () -> treballadorMeu.setNom(""));
		// L'assercio mira si el text de l'excepcio avisa del problema de nom curt
		assertEquals("El nom ha de tenir 3 o m�s caracters", excepcioMeva.getMessage());
	}

	@Test
	public void testNomTreballadorCorrecte() {
		String nomTest = "Emilio";
		Treballador treballador = new Treballador();
		// Assignem un nom, com el metode setNom pot produir excepcions ha d'anar en un
		// bloc try catch
		// A diferencia del cas anterior, aqu� no estem provocant l'excepci� a prop�sit,
		// sino que �s el tractament
		// habitual de les excepcions, ja ho veureu en M3
		try {
			treballador.setNom(nomTest);
		} catch (Exception e) {
			// Si es produeix una excepcio, el bloc catch la captura i mostra per pantalla,
			// aixi el programa no peta
			System.out.println(e.getMessage());
		}

		// L'assercio comprova que el nom �s correcte i en cas contrari mostraria el
		// missatge d'error
		assertEquals(nomTest, treballador.getNom(), "Els noms han de coincidir!!!");
	}

	@Test
	public void testNomina() {
		float nomina = 2300;
		Treballador treballador = new Treballador();
		// Assignem una nomina, com aquest m�tode no provoca excepcions no necessitem el
		// bloc try-catch
		treballador.setNomina(nomina);
		// L'asserci� comprova que la nomina �s correcta i en cas contrari mostra
		// missatge d'error
		assertEquals(nomina, treballador.getNomina(), "Els dos valors de la  nomina han de coincidir!!!");
	}

	@Test
	// Comprova que les hores extres siguin correctes i sin� mostra un missatge
	// d'error
	public void testHoresExtres() {
		int horesExtres = 20;
		Treballador treballador = new Treballador();
		// Comprovem que el valor sigui correcte
		treballador.setHoresExtres(horesExtres);
		// Si no �s el corresponent mostrem un missatge d'error
		assertEquals(horesExtres, treballador.getHoresExtres(), "El valor de hores extres no �s correcte");
	}

	@Test
	// Assignem un tipus de treballador que no existeix per provar l'error
	public void testTipusTreballadorIncorrecte() {
		Treballador treballador = new Treballador();
		// Provem un valor no v�lid i guardem l'excepci�
		Exception exception1 = assertThrows(Exception.class, () -> treballador.setTipusTreballador(4));
		// Avisa del problema al text de l'excepci�
		assertEquals("Tipus de treballador no v�lid", exception1.getMessage());
	}

	@Test
	// Provem un tipus de treballador correcte i en cas contrari mostrem un missatge
	// d'error
	public void testTipusTreballadorCorrecte() {
		int tipus = 0;
		Treballador treballador = new Treballador();

		try {
			treballador.setTipusTreballador(tipus);
		} catch (Exception e) {
			// Si es produceix l'excepci�, la guardem i mostrem un missatge per tal que el
			// programa no pari
			System.out.println(e.getMessage());
		}

		// Si el tipus no �s correcte mostra el missatge d'error
		assertEquals(tipus, treballador.getTipusTreballador(), "Els tipus de treballador no coincideixen");
	}
}
