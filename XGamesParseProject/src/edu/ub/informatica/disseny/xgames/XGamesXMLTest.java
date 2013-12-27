package edu.ub.informatica.disseny.xgames;

import java.util.Scanner;
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
        Scanner sc = new Scanner(System.in);
        
	public static void main(String[] args) {
            
            new XGamesXMLTest("data/XGames.xml").menuPrincipal();   
               
        }
    private XGamesDataManager dataManager;

	/**
	 * Parseja el fitxer XML i guarda les dades
	 * 
	 * @param nomFitxer fitxer XML a parsejar
	 */
	public XGamesXMLTest(String nomFitxer) {
		this.dataManager = new XGamesDataManager();
		this.dataManager.obtenirDades(nomFitxer);
	}
        
     /**
     * Mostrem el menu principal 
     */
        private void menuPrincipal(){
            
            escriu("\nMENU PRINCIPAL");
            escriu("\n--------------\n\n");
            escriu("1-Registre\n");
            escriu("2-Login\n");
            escriu("3-Veure Esports i Disciplines\n");
            escriu("4-Sortir\n\n");
            
            int opcio = llegeixInt();
            switch(opcio){
                case 1:
                    registrarUsuari();
                    break;
                case 2:
                    //login();
                    break;
                case 3: 
                    //veureEsportsiDisciplines();
                    break;
                case 4:
                    escriu("Adéu!");
                    return;
                default:
                    escriu("Opció no vàlida.");
                    break;
            }
            menuPrincipal();
        }
     
        
     /**
     * Mostrem el menu usuari logat 
     */
        private void menuUsuariLogat(){
            
            escriu("\nMENU USUARI LOGAT");
            escriu("\n------------------\n\n");
            escriu("1-Veure Esports i Disciplines\n");
            escriu("2-Veure Esportistes\n");
            escriu("3-Veure Classificacio\n");
            escriu("4-Veure Medaller\n");
            escriu("5-Sortir\n\n");
            
            int opcio = llegeixInt();
            switch(opcio){
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3: 
                    
                    break;
                case 4: 
                    
                    break;

                case 5:
                    escriu("Adéu!");
                    return;
                default:
                    escriu("Opció no vàlida.");
                    break;
            }
            menuUsuariLogat();
        }
        
        
     /**
     * Mostrem el menu admin 
     */
        private void menuAdmin(){
            
            escriu("\nMENU ADMIN");
            escriu("\n-----------\n\n");
            escriu("1-Afegeix Esport\n");
            escriu("2-Elimina Esport\n");
            escriu("3-Afegeix Esportistes\n");
            escriu("4-Elimina Esportista\n");
            escriu("5-Afegeix Jutge\n");
            escriu("6-Elimina Jutge\n");
            escriu("7-Inicia Sistema\n");
            escriu("8-Sortir\n\n");
            
            int opcio = llegeixInt();
            switch(opcio){
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3: 
                    
                    break;
                case 4: 
                    
                    break;
                case 5: 
                    
                    break;
                case 6: 
                    
                    break;
                case 7: 
                    
                    break;

                case 8:
                    escriu("Adéu!");
                    return;
                default:
                    escriu("Opció no vàlida.");
                    break;
            }
            menuAdmin();
        }
        
        
     /**
     * Mostrem el menu jutge
     */
        private void menuJutge(){
            
            escriu("\nMENU JUTGE");
            escriu("\n-----------\n\n");
            escriu("1-Crear Prova\n");
            escriu("2-Registrar Esportistes\n");
            escriu("3-Registrar Resultats\n");
            escriu("4-Sortir\n\n");
            
            int opcio = llegeixInt();
            switch(opcio){
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3: 
                    
                    break;
              
                case 4:
                    escriu("Adéu!");
                    return;
                default:
                    escriu("Opció no vàlida.");
                    break;
            }
            menuAdmin();
        }
     
     /**
     * Registre un usuari
     */
        
        private void registrarUsuari(){
            
            UsuariLogat usu;
            
            escriu("\nFORMULARI REGISTRE USUARI");
            escriu("\n-------------------------\n\n");
            escriu("Intro username:\n");
            String usuari = llegeixString();
            escriu("Intro password:\n");
            String password = llegeixString();
            escriu("Intro nom:\n");
            String nom = llegeixString();
            escriu("Intro dni:\n");
            String dni = llegeixString();
            escriu("Intro adreca:\n");
            String adreca = llegeixString();
            escriu("Intro pais:\n");
            String pais = llegeixString();
            /*escriu("Intro dia naixament:\n");
            int dia = llegeixInt();
            escriu("Intro mes naixament:\n");
            int mes = llegeixInt();
            escriu("Intro any naixament:\n");
            int any = llegeixInt();*/
            escriu("Data naixament:\n");
            String data = llegeixString();
            
            usu = this.dataManager.getUser(usuari);

            
            
            

        }
        
        
        
     /**
     * Imprimeix la cadena pasada per parÃ metre.
     * @param s
     */
        private void escriu(String s){
            System.out.print(s);
        }
        
        /**
     * Imprimeix el nÃºmero passat per parÃ metre.
     * @param i
     */
        private void escriu(int i){
            System.out.print(i);
        }

        /**
         * Imprimeix el nÃºmero decimal passat per parÃ metre.
         * @param f
         */
        private void escriu(float f){
            System.out.print(f);
        }

        /**
         * Llegeix una cadena per consola.
         * @return cadena
         */
        private String llegeixString(){
            String cadena = sc.nextLine();
            return cadena;
        }

         /**
         * Llegeix un nÃºmero per consola.
         * @return num
         */
        private int llegeixInt(){
            String cadena = "";
            do{
            cadena = sc.nextLine();
            }while(!(esInt(cadena)));
            int num = Integer.parseInt(cadena);
            return num;
        }
        private double llegeixDouble(){
            String cadena = "";
            do{
            cadena = sc.nextLine();
            }while(!(esDouble(cadena)));
            double num = Double.parseDouble(cadena);
            return num;
        }

        private boolean llegeixBoolean() {
            String cadena = "";
            do{
            escriu("escriu una n o una s siusplau\n");
            cadena = sc.nextLine();
            }while(!(esBoolean(cadena)));
            return cadena.equals("s");

        }

        /**
        * Comprova si la cadena es un Int.
        * @param cadena
        * @return true/false
        */
        private boolean esInt(String cadena){
            try {
                    Integer.parseInt(cadena);
                    return true;
            } catch (Exception e){
                    escriu("\nSimbol no valid, escriu un numero si us plau.\n\n");
                    return false;
            }
        }
        private boolean esDouble(String cadena){
            try {
                    Double.parseDouble(cadena);
                    return true;
            } catch (Exception e){
                    escriu("\nSimbol no valid, escriu un numero si us plau.\n\n");
                    return false;
            }
        }

        private boolean esBoolean(String cadena) {
            try {
                    return cadena.equals("s")||cadena.equals("n");
            } catch (Exception e){
                    escriu("\nSimbol no valid, escriu una s o una n si us plau.\n\n");
                    return false;
            }    
        }
}
