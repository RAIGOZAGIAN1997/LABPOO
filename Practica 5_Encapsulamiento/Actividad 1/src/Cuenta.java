public class Cuenta {
    private String nombre;
    private int numeroCuenta;
    private int credito;
    private int saldo;

//Constructor por defecto
    public Cuenta() {
    }

    //Constructor con parámetros
    public Cuenta(String nombre, int numeroCuenta, int saldo, int credito) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.credito = credito;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public class CadenaEnteros
    {
        //Devuelve true si en una cadena que llega todos son numeros, false en caso contrario
        public boolean esEntero(String cad)
        {
            for(int i = 0; i<cad.length(); i++)
                if( !Character.isDigit(cad.charAt(i)) )
                    return false;

            return true;
        }
    }
}

