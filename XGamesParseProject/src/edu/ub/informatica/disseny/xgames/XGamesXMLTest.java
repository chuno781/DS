package edu.ub.informatica.disseny.xgames;

import org.xml.sax.helpers.DefaultHandler;

/**
 * Test de carrega de fitxer XML de XGames_Soft
 * 
 */
public class XGamesXMLTest extends DefaultHandler {

	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new XGamesXMLTest("data/XGames.xml");
	}

	/**
	 * Parseja el fitxer XML i guarda les dades
	 * 
	 * @param nomFitxer fitxer XML a parsejar
	 */
	public XGamesXMLTest(String nomFitxer) {
		XGamesDataManager dataManager = new XGamesDataManager();
		dataManager.obtenirDades(nomFitxer);
	}
}
