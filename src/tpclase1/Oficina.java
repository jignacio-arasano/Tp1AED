
package tpclase1;


public class Oficina {
    //Declaramos los atributos de la clase Oficina
    int piso;
    int nro;
    
    //Definimos el constructor de Oficina el cual toma como parametros un piso y un numero de oficina
    public Oficina(int piso, int nro) {
        this.piso = piso;
        this.nro = nro;
    }
    
    //sobreescribimos el metodo nativo de Java toString(); para que al imprimir en consola un objeto del tipo Oficina devuelva este mensaje: 
    @Override
    public String toString() {
        return "Oficina{" +
                "nro=" + nro +
                ", piso=" + piso +
                '}';
    }
    
}
