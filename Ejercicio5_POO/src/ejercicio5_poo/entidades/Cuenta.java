package ejercicio5_poo.entidades;


/*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
 */
public class Cuenta {

    private Integer numeroCuenta;
    private Long dni;
    private Double saldoActual;

    /* Constructor por defecto y constructor con DNI, saldo y número de cuenta.*/
    public Cuenta() {
    }

    public Cuenta(Integer numeroCuenta, Long dni, Double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    /*metodo toString*/
    @Override
    public String toString() {
        return "Número de Cuenta: " + numeroCuenta + "\n DNI: " + dni + "\nSaldo Actual: " + saldoActual;
    }

    /*Agregar los métodos getters y setters correspondientes*/
    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public Double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(Double saldoActual) {
        this.saldoActual = saldoActual;
    }

}
