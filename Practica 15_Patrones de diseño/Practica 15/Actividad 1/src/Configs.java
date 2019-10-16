import java.util.Scanner;

public class Configs {

    private static Configs configs;
    public String configuration;
    private Configs(){
        this.configuration = "Configuracion Sistema";
    }
    public static Configs getInstancia(){
        if(configs != null ){
            return configs;
        } else {
            configs = new Configs();
            return configs;
        }

    }

    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        Configs c1 = Configs.getInstancia();
        Configs c2 = Configs.getInstancia();
        Configs c3 = Configs.getInstancia();
        System.out.println("C1: "+ c1.configuration);
        System.out.println("C2: "+ c2.configuration);
        System.out.println("C3: "+ c3.configuration);
        System.out.println("Ingrese la configuracion: ");
        String Conf = scanner.nextLine();

        c1.configuration = Conf;
        System.out.println("C1: "+ c1.configuration);
        System.out.println("C2: "+ c2.configuration);
        System.out.println("C3: "+ c3.configuration);


    }
}
