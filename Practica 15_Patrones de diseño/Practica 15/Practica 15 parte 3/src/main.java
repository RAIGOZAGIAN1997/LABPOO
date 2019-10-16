public abstract class Vehiculo {
    public abstract void imprimir();
}


public class Motocicleta extends Vehiculo{
    @Override
    public void imprimir(){
        System.out.println("MOTOCICLETA");
    }
}
public class Compacto extends Vehiculo{
    @Override
    public void imprimir(){
        System.out.println("Compacto");
    }
}
public class Camioneta extends  Vehiculo{
    @Override
    public void imprimir(){
        System.out.println("Camioneta");
    }
}
public class Factory {
    public static Vehiculo crearVehiculo(int index){
        switch (index){
            case 1: {
                return new Motocicleta();
            }
            case 2: {
                return new Camioneta();
            }
            case 3:{
                return new Compacto();
            }
            default:{
                return null;
            }
        }
    }
}
public class PatronFactory{

    public static void main (String args []){
        Vehiculo v1 = Vehiculo.Factory.crearVehiculo(1);
        Vehiculo v2 = Vehiculo.Factory.crearVehiculo(2);
        Vehiculo v3 = Vehiculo.Factory.crearVehiculo(3);
        v3.imprimir();
    }
}
