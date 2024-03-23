
package tpclase1;


public class TpClase1 {

  
    public static void main(String[] args) {
        //Creamos una instancia del objeto Edificiio y le asignamos un valor de 90 al numero de oficinas debido a que son 10 pisos de 9 oficinas con sensores cada uno
        Edificio edificio = new Edificio(90);
        //utilizamos dos bucles anidados que recorren todas las Oficinas de todos los pisos del edificio. Hacemos un llamado al metodo ObtenerSensor(); en cada iteracion para asignar un valor booleano a cada oficina
        for(int piso=1; piso<=10; piso++){
            for(int oficina=1; oficina<=9; oficina++){
                  edificio.ObtenerSensor(piso, oficina);
            }
        }
        //mostramos en pantalla la cantidad de oficinas activas haciendo uso del metodo CantidadOficinasActivas(); 
        System.out.println("cantidad de oficinas activas " + edificio.CantidadOficinasActivas());
        //mostramos en pantalla la ubicacion de la primera oficina activa haciendo uso del metodo PrimeraOficina(); 
        System.out.println("primera oficina activa "+ edificio.PrimeraOficina());
    }
    
}
