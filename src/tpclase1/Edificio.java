
package tpclase1;


public class Edificio {
    //Declaramos dos atributos, numero de oficinas y un array de booleanos de dos dimensiones para los sensores y asi guardar la oficina y el piso, devuelve True si el sensor fue activado y False si no se activo
    private int numOficinas;
    private boolean [][] sensores;
    //Definimos el constructor de la clase Edificio
    public Edificio(int numOficinas) {
        this.numOficinas = numOficinas;
        this.sensores = new boolean [10][9]; //10 pisos, 9 oficinas en cada uno
    }
    //Definimos el metodo ObtenerSensor(); recibe como parametros la ubicacion de una oficina determinada, le restamos 1 [nro-1][piso-1] debido a que los arrays empiezan con indice 0
    //Utilizamo Math.random() para asignar un valor booleano aleatoriio a la oficina especificada
    public boolean ObtenerSensor(int nro, int piso){
        return sensores [nro-1][piso-1] = Math.random() < 0.5;
        
    }
    //Definimos el metodo CantidadOficinasActivas() el cual indica cuantas oficinas han sido activadas; 
    //Utilizamos un acumulador y dos bucles anidados. El acumulador suma 1 si el llamado al metodo ObtenerSensor es True
    public int CantidadOficinasActivas (){
        int count = 0; 
        for (int piso=1; piso<=10; piso++){
            for(int oficina=1; oficina<=9; oficina++){
                if(ObtenerSensor(piso, oficina)){
                    count++;
                }
            }
        }
        return count;
    }
    //Definimos el metodo ´PrimeraOficina(); que indica la ubicacion de la primera Oficina Activa
    //Utilizamos un bucle anidado y en caso de que encuentre una oficina activa la devuelve, sino devuelve null.
    public Oficina PrimeraOficina(){
        for(int piso=1; piso<=10; piso++){
            for (int oficina=1; oficina<=9; oficina++){
                if(ObtenerSensor(piso, oficina)){
                    return new Oficina(piso, oficina);
                }
            }
        }
        return null;
    }
    
    
   
}
