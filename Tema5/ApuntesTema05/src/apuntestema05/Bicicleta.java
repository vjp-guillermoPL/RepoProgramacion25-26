/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntestema05;

/**
 *
 * @author alumno
 */
public class Bicicleta {
    //ATRIBUTOS
    int ruedas; // friendly --> Mal
    protected String manillar; //--> Mal
    private String pedales; //--> Bien
    private String frenos;
    private boolean estaPedaleando;
    
    
    // Atributo estático que pertenece a la clase
    private static int numBicicleta = 0;
    
    // ATRIBUTO DE OTRA CLASE (Composición de clases)
    private Ciclista ciclista;
    
    //CONSTRUCTORES
    //Por defecto
    public Bicicleta(){
        this.ruedas = 0;
        this.manillar = "";
        this.pedales = "";
        this.frenos = "";
        this.estaPedaleando = false;
        
        // Incrementamos el valor del número de bicicletas
        incrementarNumBicicleta();
        
        //IMPORTANTE Inicializamos un ciclista por defecto (Con el constructor por defecto)
        this.ciclista = new Ciclista();
    }
    
    public Bicicleta(int ruedas, String manillar, String pedales, String frenos, boolean estaPedaleando, Ciclista ciclista) {
        this.ruedas = ruedas;
        this.manillar = manillar;
        this.pedales = pedales;
        this.frenos = frenos;
        this.estaPedaleando = estaPedaleando;
        
        // Incrementamos el valor del número de bicicletas
        incrementarNumBicicleta();
        
        //Inicializamos un ciclista con los valores pasados por parámetro
        this.ciclista = ciclista;
    }
    
    // GETTERS Y SETTERS
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    
    public int getRuedas() {
        return this.ruedas;
    }
    
    public void setManillar(String manillar) {
        this.manillar = manillar;
    }
    
    public String getManillar() {
        return this.manillar;
    }
    
    public void setPedales(String pedales) {
        this.pedales = pedales;
    }
    
    public String getPedales() {
        return this.pedales;
    }
    
    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }
    
    public String getFrenos() {
        return this.frenos;
    }
    
    public void setEstaPedaleando(boolean estaPedaleando) {
        this.estaPedaleando = estaPedaleando;
    }
    
    public boolean getEstaPedaleando() {
        return this.estaPedaleando;
    }
    
    public int getNumBicicleta() {
        return this.numBicicleta;
    }
    
    //METODOS
    private void acelerar() {
        System.out.println("Acelerando...");
    }
    
    private static void incrementarNumBicicleta() {
        numBicicleta++;
    }
    
    //Añadimos el get y set del ciclista
    public Ciclista getCiclista(){
        return this.ciclista;
    }
    
    public void setCiclista(Ciclista ciclista){
        this.ciclista = ciclista;
    }
    
    
    //TO STRING
    @Override
    public String toString() {
        return "Mi bicicleta tiene "+ this.ruedas +" ruedas, "+ this.manillar +
                " manillar, "+ this.pedales +" pedales, "+ this.frenos +
                " frenos y esta pedaleando"+ this.estaPedaleando + this.ciclista;
    }
    
}
