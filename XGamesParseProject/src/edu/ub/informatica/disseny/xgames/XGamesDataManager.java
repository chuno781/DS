package edu.ub.informatica.disseny.xgames;

import static edu.ub.informatica.disseny.xgames.XGamesXMLTest.escriu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Data manager per XGames_Soft. Crea les estructures de dades necessàries 
 * per a manegar l'aplicació de gestió de XGames_Soft.
 * 
 */
public class XGamesDataManager {
    
    private ArrayList<UsuariLogat> usuaris;
    private ArrayList<Esport> esports;
    private ArrayList<Pais> paisos;
    private UsuariLogat usuariLogat;
    private ArrayList<Esportista> esportistes;
    
    
    public XGamesDataManager(){
        
        usuaris = new ArrayList();
        esports = new ArrayList();
        paisos = new ArrayList();
        esportistes = new ArrayList();
        usuariLogat = null;
    
    }

	/* -------------------------------------------------------------------
	 * Metodes a implementar per vosaltres. En aquests metodes creareu els
	 * vostres objectes a partir de la informacio obtinguda del fitxer XML
	 * 
	 * Podeu esborrar els prints si voleu. Tambe podeu canviar el tipus de
	 * dades que retorna el metode, es a dir que sou lliures de
	 * modificar-ho al gust, excepte les crides inicials que es fan.
	 * -------------------------------------------------------------------
	 */

	/**
	 * Obté les dades del fitxer XML passat per paràmetre
	 * 
	 * @param nomFitxer ruta del fitxer XML del que obtenir les dades
	 */
	public void obtenirDades(String nomFitxer) {
		XGamesXMLParser parser = new XGamesXMLParser(this);
		parser.parse(nomFitxer);
	}

	 /**
	 * Crea un nou esport a partir de la informacio obtinguda del fitxer XML
	 * 
	 * @param id de l'esport
	 * @param nom de l'esport
	 */	
	public void crearEsport(String id, String nom) {

		/*  TODO: A partir d'aqui creeu el vostre objecte que contingui la informacio
		 *  d'un nou esport
		 */

                //System.out.println("\n==================================================");
		//System.out.println("Esport amb ID: " + id);
		//System.out.println("    Nom: " + nom);
            esports.add(new Esport(id,nom));
	}
        
        
        /**
	 * Crea una nova disciplina a partir de la informacio obtinguda del fitxer XML
	 * 
	 * @param id de la disciplina
	 * @param nom de la disciplina
	 */	
	public void crearDisciplina(String id, String nom, String esport) {

		/*  TODO: A partir d'aqui creeu el vostre objecte que contingui
                 * la informacio d'una nova disciplina.
		 */
                //System.out.println("    ______________________________________________");
		//System.out.println("    Disciplina amb ID: " + id);
		//System.out.println("        Nom: " + nom);
            getEsport(esport).crearDisciplina(id,nom);
	}
        
        /**
	 * Crea una nova prova a partir de la informacio obtinguda del fitxer XML
	 * 
	 * @param id de la prova
	 * @param lloc on es realitza la prova
         * @param jutge assignat a la prova
         * @param data de la prova
	 */
	public void crearProva(String id, String jutge, String lloc, String data) {

		/*  TODO: A partir d'aqui creeu el vostre objecte que contingui la informacio
		 *  d'una nova prova.
		 */

                //System.out.println("    . . . . . . . . . . . . . . . . . . . . . . .");
                //System.out.println("    Prova amb ID: " + id);
                //System.out.println("        Jutge ID " + jutge);
		//System.out.println("        Lloc: " + lloc);
                //System.out.println("        Data: " + data);
	}
        

        public void crearProva(String id, String jutge, String lloc, String data, String disciplina, String esport) {
            getEsport(esport).getDisciplina(disciplina).crearProva(id, this.getJutge(jutge),lloc, new Data(data) );
         }
        public Jutge getJutge(String idJutge){
            return null;
        }
        
	/**
	 * Afegeix un Esportista a una prova en concret, la informacio obtinguda del fitxer XML és el identificador de l'esportista participant i el Id de la prova
	 * 
         * @param idEsportista dni de l'esportista participant
	 * @param idProva id de la prova on participa aquest esportista
	 * 
	 */
	public void afegeixEsportistaAProva(String idEsportista, String idProva)
        {       
                /* TODO: Creeu aqui el vostre codi per relacionar els objectes 
                 * esportista i prova
		 */

		//System.out.println("\nProva ID : " + idProva);
		//System.out.println("-----------------");
		//System.out.println("ID Esportista: " + idEsportista);
            getEsportista(idEsportista);
            getProva(idProva);
                                       
        }      
         
	/**
	 * Crea un nou admin a partir de la informacio obtinguda del fitxer XML
	 * 
	 * @param id id del administrador
	 * @param nom de l'administrador
         * @param dni de l'administrador
	 * @param usuari nom d'usuari de l'administrador
	 * @param password de l'administrador
         * @param data de naixement de l'administrador
         * @param pais de naixement de l'administrador
	 */
	public void crearAdmin(String id, String nom, String dni, String usuari, String password, String data, String pais) {

		/* TODO: Creeu aqui el vostre admin
		 */
                //System.out.println("\n==================================================");
		//System.out.println("Admin ID: " + id);
		//System.out.println("-----------------");
		//System.out.println("Nom: " + nom);
		//System.out.println("DNI: " + dni);
                //System.out.println("Nom: " + usuari);
		//System.out.println("Password: " + password);
                //System.out.println("Data naixement: " + data);
                //System.out.println("Pais: " + pais);
	}

	/**
	 * Crea un nou usuari a partir de la informacio obtinguda del fitxer XML
	 * 
	 * @param id de l'usuari
	 * @param nom de l'usuari
	 * @param dni de l'usuari
	 * @param adreca de l'usuari
	 * @param usuari nom d'usuari de l'usuari
	 * @param password de l'usuari
         * @param data de naixement de l'usuari
         * @param pais de naixement de l'usuari
	 
	 */
	public void crearUsuari(String id, String nom, String dni, String adreca, String usuari, String password, String data, String pais) {
        //public void crearUsuari(String username, String password, String nom, String dni, String adreca, String pais, Integer dia, Integer mes, Integer any) {

		/* TODO: Creeu aqui el vostre usuari
		 */

                //System.out.println("\n==========================-========================");
                //System.out.println("Usuari ID: " + id);
		//System.out.println("-----------------");
		//System.out.println("Nom: " + nom);
		//System.out.println("Nom d'usuari: " + usuari);
		//System.out.println("Dni: " + dni);
		//System.out.println("Adreça: " + adreca);
		//System.out.println("Password: " + password);
                //System.out.println("Data naixement: " + data);
                //System.out.println("Pais: " + pais);
            
            //UsuariLogat usu = new UsuariLogat(username,password,nom,dni,adreca,pais,dia,mes,any);
            
            UsuariLogat usu = getUser(usuari);
            Pais p = getPais(pais);

            if (usu==null){ 
                if (p==null){
                    crearPais(Pais.getNextID(),pais);
                }
                usu = new UsuariLogat(id,nom,dni,adreca,usuari,password,new Data(data),p);
                usuaris.add(usu);
            }
            
	}
        
        /**
	 * Crea un nou jutge a partir de la informacio obtinguda del fitxer XML
	 * 
	 * @param id del jutge
	 * @param nom del jutge
	 * @param dni del jutge
	 * @param adreca del jutge
	 * @param usuari nom d'usuari del jutge
	 * @param password  del jutge
         * @param pais de naixement del jutge
         * @param any d'inici com a jutge
	 */
	public void crearJutge(String id, String nom, String dni, String adreca, String usuari, String password, String pais, String any) {

		/* TODO: Creeu aqui el vostre jutge
		 */

                //System.out.println("\n==================================================");
                //System.out.println("Jutge ID: " + id);
		//System.out.println("-----------------");
		//System.out.println("Nom: " + nom);
		//System.out.println("Nom d'usuari: " + usuari);
		//System.out.println("Dni: " + dni);
		//System.out.println("Adreça: " + adreca);
		//System.out.println("Password: " + password);
		//System.out.println("Pais: " + pais);
		//System.out.println("Any d'inici: " + any);
	}
        
        /**
	 * Crea un nou esportista a partir de la informacio obtinguda del fitxer XML
	 * 
	 * @param id id de l'esportista
	 * @param nom nom de l'esportista
	 * @param dni dni de l'esportista
	 * @param adreca adreça de l'esportista
	 * @param usuari usuari al sistema de l'esportista
	 * @param password password de l'esportista
         * @param data de naixement de l'esportista
	 * @param pais de naixement de l'esportista
	 */
	public void crearEsportista(String id, String nom, String dni, String adreca, String data, String pais) {

		/* TODO: Creeu aqui el vostre esportista
		 */

                //System.out.println("\n==================================================");
                //System.out.println("Esportista ID: " + id);
		//System.out.println("-----------------");
		//System.out.println("Nom: " + nom);
		//System.out.println("Dni: " + dni);
		//System.out.println("Adreça: " + adreca);
		//System.out.println("Pais: " + pais);
		//System.out.println("Data de naixement: " + data);
            Esportista esp = getEsportista(id);
            Pais p = getPais(pais);

            if (esp==null){ 
                if (p==null){
                    crearPais(Pais.getNextID(),pais);
                }
                esp= new Esportista(id,nom,dni,adreca,new Data(data),p);
                esportistes.add(esp);
            }
            
	}
        
        public UsuariLogat getUser(String usuari){
            
            boolean es1 = false;
            UsuariLogat usu=null;
            int i=0;
            while (i<this.usuaris.size() && es1==false){
                usu= this.usuaris.get(i);
                es1 = usu.comprovar(usuari);
                i++;
            }
            
            if (es1 == false){
               usu = null;
            }
            
            return usu;
        }  
        
        public Pais getPais(String pais){
            
            boolean es1 = false;
            Pais p = null;
            int i=0;
            
            while(i<this.paisos.size() && es1 == false){
                
                p = this.paisos.get(i);
                es1 = p.comprovar(pais);
                i++;
            }
            
            if (es1 == false){
               p = null;
            }
            
            return p;
            
        }

        public Esport getEsport(String idEsport) {
            boolean es1 = false;
            Esport esp=null;
            int i=0;
            while (i<this.esports.size() && es1==false){
                esp= this.esports.get(i);
                es1 = esp.comprovar(idEsport);
                i++;
            }
            
            if (es1 == false){
               esp = null;
            }
            
            return esp;
        } 
        private static void orderPaisos(ArrayList<Pais> paisos) {

    Collections.sort(paisos, new Comparator() {

        @Override
        public int compare(Object o1, Object o2) {
            Pais p1=(Pais)o1;
            Pais p2=(Pais)o2;
            int or1 = p1.getOr();
            int plata1 = p1.getPlata();
            int bronze1 = p1.getBronze();
            int or2 = p2.getOr();
            int plata2 = p2.getPlata();
            int bronze2 = p2.getBronze();
            int comp = or2-or1;

            if (comp == 0) {
               comp=plata2-plata1;
               if (comp==0){
                   comp=bronze2-bronze1;
               }
            } 
            return comp;
        }
    });
}

    public void veureMedaller() {
        orderPaisos(paisos);
        int i=0;
        XGamesXMLTest.escriu("Nom\t\tOr\tPlata\tBronze\n");
        while(i<paisos.size()){
            paisos.get(i).imprMedalles();
            i++;
        }
    }
    
    public void imprLlistaJutges(){
        
        UsuariLogat usu=null;
        int i=0;
        
        while (i<this.usuaris.size()){
               usu = this.usuaris.get(i);
               
               if (usu instanceof Jutge){  
                   usu.imprimirDades();
               }
               i++;
        }
    }
    
    public void eliminarJutge(){
        UsuariLogat usu;
        
        imprLlistaJutges();
        System.out.println("Intro del username del jutge a eliminar");
        String jutge = System.in.toString();
        
        usu = getUser(jutge);
        if (usu != null){
            
            //DESTROY JUTGE DE TOTS ELS LLOCS ON ESTIGUI CREAT!!!
        }
        
    }

    public void crearPais(String id, String nom) {
        paisos.add(new Pais(id,nom));
    }

    UsuariLogat login(String usuari, String password) {

            UsuariLogat usu;
            String pass;
            usu = getUser(usuari);
            
            if (usu!=null){   
                pass = usu.getPassword();
                
                if (pass.equals(password)){
                    usuariLogat=usu;
                }else{
                    usu=null;
                }
            }
            return usu;
    }

    private Esportista getEsportista(String id) {
            boolean es1 = false;
            Esportista esp=null;
            int i=0;
            while (i<this.esportistes.size() && es1==false){
                esp= this.esportistes.get(i);
                es1 = esp.comprovar(id);
                i++;
            }
            
            if (es1 == false){
               esp = null;
            }
            
            return esp;
    }

    private void getProva(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
