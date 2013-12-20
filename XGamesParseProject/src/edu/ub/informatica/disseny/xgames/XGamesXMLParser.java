package edu.ub.informatica.disseny.xgames;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * Parser per a obtenir dades d'un fitxer XML de XGames_Soft
 * 
 */
public class XGamesXMLParser {

	/**
	 * Data manager
	 */
	XGamesDataManager dataManager;

	/**
	 * Constructor
	 */
	public XGamesXMLParser(XGamesDataManager dataManager) {
		this.dataManager = dataManager;
	}
	
	/**
	 * Parseja un fitxer XML de XGames_Soft i guarda les dades al sistema 
	 * 
	 * @param nomFitxer
	 */
	public void parse(String nomFitxer) {
		try {
			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
			Document doc = docBuilder.parse (new File(nomFitxer));
			doc.getDocumentElement().normalize();

			// Obtenim les dades
                    	obtenirAdministradors(doc);
			obtenirUsuaris(doc);
                        obtenirJutges(doc);
                        obtenirEsportistes(doc);
                        obtenirEsports(doc);    
                        obtenirParticipantsALesProves(doc);
		}
		catch (SAXParseException err) {
			System.out.println ("** Error parsejant" +", linia " + err.getLineNumber () + ", uri " + err.getSystemId ());
			System.out.println(" " + err.getMessage ());
		}
		catch (SAXException e) {
			Exception x = e.getException ();
			((x == null) ? e : x).printStackTrace (); 
		}
		catch (Throwable t) {
			t.printStackTrace ();
		}
	}
        
        /**
	 * Obte els esports per XGames
	 * 
	 * @param doc document XML del que obtenir les dades
	 */
	private void obtenirEsports(Document doc) {
		NodeList esports = doc.getElementsByTagName("esport");
		String id, nom;
		int numEsports = esports.getLength();

		// Parsejo tots els elements esport
		for(int i=0; i<numEsports; i++) {
			Node esport = esports.item(i);

			if(esport.getNodeType() == Node.ELEMENT_NODE){
				Element eEsport = (Element)esport;
				id = esport.getAttributes().getNamedItem("id").getTextContent();
				
				NodeList nNom = eEsport.getElementsByTagName("nom");
				Element eNom = (Element)nNom.item(0);
				nom = eNom.getTextContent();
			
				// Creem un nou esport amb la informacio obtinguda
                                dataManager.crearEsport(id, nom);
				
				// Obtenim informacio de les disciplines
                                this.obtenirDisciplines(eEsport, id);
			}
		}
	}

	/**
	 * Obte informacio sobre els artistes que hi participen a un film
	 * 
	 * @param eEsport film on buscar els artistes
	 * @param idEsport id de la pelicula
	 */
	private void obtenirDisciplines(Element eEsport, String idEsport) {
		NodeList disciplines = eEsport.getElementsByTagName("disciplina");
		String id, nom;
		int numDisciplines = disciplines.getLength();

		// Parsejo tots els elements disciplina
		for(int i=0; i<numDisciplines; i++) {
			Node disciplina = disciplines.item(i);

			if(disciplina.getNodeType() == Node.ELEMENT_NODE){
                                Element eDisciplina = (Element)disciplina;
				id = disciplina.getAttributes().getNamedItem("id").getTextContent();
				nom = disciplina.getAttributes().getNamedItem("nom").getTextContent();
				dataManager.crearDisciplina(id, nom);
                                
                                // Obtenim informacio de la prova
                                this.obtenirProva(eDisciplina, id);
			}			
		}
	}
        
        /**
	 * Obte informacio sobre la prova d'una disciplina
	 * 
	 * @param eDisciplina disciplina de la qual volem obtenir la prova
	 * @param idDisciplina id de la disciplina
	 */
	private void obtenirProva(Element eDisciplina, String idDisciplina) {
		NodeList proves = eDisciplina.getElementsByTagName("prova");
		int numProves = proves.getLength();

		// Parsejo tots els elements prova
		for(int i=0; i<numProves; i++) {
			Node prova = proves.item(i);

			if(prova.getNodeType() == Node.ELEMENT_NODE){
                                Element eProva = (Element) prova; 
				String id = prova.getAttributes().getNamedItem("id").getTextContent();
                                String jutge = prova.getAttributes().getNamedItem("jutge").getTextContent();
				String lloc = prova.getAttributes().getNamedItem("lloc").getTextContent();
                                String data = prova.getAttributes().getNamedItem("data").getTextContent();
				
                                dataManager.crearProva(id, jutge, lloc, data);
                                                               
			}			
		}
	}
	
           
              
       /**
	 * Obte informacio sobre els administradors 
	 * 
	 * @param doc fitxer XML del que obtenir les dades
	 */
	private void obtenirAdministradors(Document doc) {
		NodeList admins = doc.getElementsByTagName("admin");
		int numAdmins = admins.getLength();

		// Parsejo tots els elements admin
		for(int i=0; i<numAdmins; i++) {
			Node admin = admins.item(i);

			if(admin.getNodeType() == Node.ELEMENT_NODE){
				String id = admin.getAttributes().getNamedItem("id").getTextContent();
				Element eAdmin = (Element)admin;

				NodeList nNom = eAdmin.getElementsByTagName("nom");
				Element eNom = (Element)nNom.item(0);
				String nom = eNom.getTextContent();
                                
                                NodeList nDNI = eAdmin.getElementsByTagName("dni");
                                Element eDNI = (Element)nDNI.item(0);
                                String dni = eDNI.getTextContent();

				NodeList nCodi = eAdmin.getElementsByTagName("codi");
				Element eCodi = (Element)nCodi.item(0);
				String codi = eCodi.getTextContent();

				NodeList nPassword = eAdmin.getElementsByTagName("password");
				Element ePassword = (Element)nPassword.item(0);
				String password = ePassword.getTextContent();
                                
                                NodeList nData = eAdmin.getElementsByTagName("naixement");
				Element eData = (Element)nData.item(0);
				String data = eData.getTextContent();
                                
                                NodeList nPais = eAdmin.getElementsByTagName("pais");
				Element ePais = (Element)nPais.item(0);
				String pais = ePais.getAttributes().getNamedItem("name").getTextContent();

				// Creem l'admin
				dataManager.crearAdmin(id, nom, dni, codi, password, data, pais);
			}
		}
	}


        
        /**
	 * Obte informacio sobre els jutges
	 * 
	 * @param doc fitxer XML del que obtenir les dades
	 */
	private void obtenirJutges(Document doc) {
		NodeList jutges = doc.getElementsByTagName("jutge");
		int numJutges = jutges.getLength();

		// Parsejo tots els elements Jutge
		for(int i=0; i<numJutges; i++) {
			Node jutge = jutges.item(i);

			if(jutge.getNodeType() == Node.ELEMENT_NODE){
				String id = jutge.getAttributes().getNamedItem("id").getTextContent();
				Element eJutge = (Element)jutge;

				NodeList nNom = eJutge.getElementsByTagName("nom");
				Element eNom = (Element)nNom.item(0);
				String nom = eNom.getTextContent();

				NodeList nDni = eJutge.getElementsByTagName("dni");
				Element eDni = (Element)nDni.item(0);
				String dni = eDni.getTextContent();
				
				NodeList nAdreca = eJutge.getElementsByTagName("adreca");
				Element eAdreca = (Element)nAdreca.item(0);
				String adreca = eAdreca.getTextContent();
				
				NodeList nCodi = eJutge.getElementsByTagName("codi");
				Element eCodi = (Element)nCodi.item(0);
				String codi = eCodi.getTextContent();

				NodeList nPassword = eJutge.getElementsByTagName("password");
				Element ePassword = (Element)nPassword.item(0);
				String password = ePassword.getTextContent();
                                
                                NodeList nAny = eJutge.getElementsByTagName("anyinici");
				Element eAny = (Element)nAny.item(0);
				String any = eAny.getTextContent();
                                
                                NodeList nPais = eJutge.getElementsByTagName("pais");
				Element ePais = (Element)nPais.item(0);
                                String pais = ePais.getAttributes().getNamedItem("name").getTextContent();

				// Creem el jutge
				dataManager.crearJutge(id, nom, dni, adreca, codi, password, pais, any);
			}
		}
	}

	/**
	 * Obte informacio sobre els usuari
	 * 
	 * @param doc fitxer XML del que obtenir les dades
	 */
	private void obtenirUsuaris(Document doc) {
		NodeList usuaris = doc.getElementsByTagName("usuari");
		int numUsuaris = usuaris.getLength();

		// Parsejo tots els elements usuari
		for(int i=0; i<numUsuaris; i++) {
			Node usuari = usuaris.item(i);

			if(usuari.getNodeType() == Node.ELEMENT_NODE){
				String id = usuari.getAttributes().getNamedItem("id").getTextContent();
				Element eUsuari = (Element)usuari;

				NodeList nNom = eUsuari.getElementsByTagName("nom");
				Element eNom = (Element)nNom.item(0);
				String nom = eNom.getTextContent();

				NodeList nDni = eUsuari.getElementsByTagName("dni");
				Element eDni = (Element)nDni.item(0);
				String dni = eDni.getTextContent();
				
				NodeList nAdreca = eUsuari.getElementsByTagName("adreca");
				Element eAdreca = (Element)nAdreca.item(0);
				String adreca = eAdreca.getTextContent();
				
				NodeList nCodi = eUsuari.getElementsByTagName("codi");
				Element eCodi = (Element)nCodi.item(0);
				String codi = eCodi.getTextContent();

				NodeList nPassword = eUsuari.getElementsByTagName("password");
				Element ePassword = (Element)nPassword.item(0);
				String password = ePassword.getTextContent();
                                
                                NodeList nAny = eUsuari.getElementsByTagName("naixement");
				Element eAny = (Element)nAny.item(0);
				String data = eAny.getTextContent();
                                
                                NodeList nPais = eUsuari.getElementsByTagName("pais");
				Element ePais = (Element)nPais.item(0);
                                String pais = ePais.getAttributes().getNamedItem("name").getTextContent();

				// Creem el usuari
				dataManager.crearUsuari(id, nom, dni, adreca, codi, password, data, pais);
			}
		}
	}
        
        /**
	 * Obte informacio sobre els esportistes
	 * 
	 * @param doc fitxer XML del que obtenir les dades
	 */
	private void obtenirEsportistes(Document doc) {
		NodeList esportistes = doc.getElementsByTagName("esportista");
		int numEsportistes = esportistes.getLength();

		// Parsejo tots els elements Esportista
		for(int i=0; i<numEsportistes; i++) {
			Node esportista = esportistes.item(i);

			if(esportista.getNodeType() == Node.ELEMENT_NODE){
				String id = esportista.getAttributes().getNamedItem("id").getTextContent();
				Element eUsuari = (Element)esportista;

				NodeList nNom = eUsuari.getElementsByTagName("nom");
				Element eNom = (Element)nNom.item(0);
				String nom = eNom.getTextContent();

				NodeList nDni = eUsuari.getElementsByTagName("dni");
				Element eDni = (Element)nDni.item(0);
				String dni = eDni.getTextContent();
				
				NodeList nAdreca = eUsuari.getElementsByTagName("adreca");
				Element eAdreca = (Element)nAdreca.item(0);
				String adreca = eAdreca.getTextContent();
                                
                                NodeList nAny = eUsuari.getElementsByTagName("naixement");
				Element eAny = (Element)nAny.item(0);
				String data = eAny.getTextContent();
                                
                                NodeList nPais = eUsuari.getElementsByTagName("pais");
				Element ePais = (Element)nPais.item(0);
                                String pais = ePais.getAttributes().getNamedItem("name").getTextContent();

				// Creem el esportista
				dataManager.crearEsportista(id, nom, dni, adreca, data, pais);
			}
		}
	}
        
               
       /**
	 * Obte informacio sobre les valoracions
	 * 
	 * @param doc fitxer XML del que obtenir les dades
	 */
	
	private void obtenirParticipantsALesProves(Document doc) {
		NodeList participants = doc.getElementsByTagName("participant");
		int numValoracions = participants.getLength();

		// Parsejo tots els elements participant
		for(int i=0; i<numValoracions; i++) {
			Node participant = participants.item(i);

			if(participant.getNodeType() == Node.ELEMENT_NODE){
                                // Aquest identificador nomes es informatiu, no s'ha de guardar
				String id = participant.getAttributes().getNamedItem("id").getTextContent();
                                
				String idEsportista = participant.getAttributes().getNamedItem("esportista").getTextContent();
				String idProva = participant.getAttributes().getNamedItem("prova").getTextContent();
				
                                // Crear la relació entre esportistes i proves
				dataManager.afegeixEsportistaAProva(idEsportista, idProva); 
				
			}			
		}
	}

}
