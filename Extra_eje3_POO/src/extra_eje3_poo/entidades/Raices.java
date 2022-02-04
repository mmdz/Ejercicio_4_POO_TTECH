package extra_eje3_poo.entidades;

/*Vamos A realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles A, b
y c. Hay que insertar estos 3 valores para construir el objeto A través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:

Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*A*c)))/(2*A) Solo varia el signo
delante de -b*/
public class Raices {
//atributos

    private double A, B, C;
//constructores

    public Raices() {
    }

    public Raices(double a, double b, double c) {
        this.A = a;
        this.B = b;
        this.C = c;
    }

    /*• Método getDiscriminante(): devuelve el valor del discriminante (double). El
    discriminante tiene la siguiente formula: (b^2)-4*A*c*/
    public double getDiscriminante() {
        double determinante = (Math.pow(B, 2)) - (4 * A * C);
        return determinante;
    }

    /*• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
    que esto ocurra, el discriminante debe ser mayor o igual que 0.*/
    public Boolean tieneRaices() {

        return getDiscriminante() > 0;    //pregunta si es V o F    
    }

    /*• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
    para que esto ocurra, el discriminante debe ser igual que 0.*/
    public Boolean tieneRaiz() {
        return getDiscriminante() == 0;    //pregunta si es V o F    
    }

    /*• Método obtenerRaices(): llama A tieneRaíces() y si devolvió́ true, imprime las 2
    posibles soluciones. Raices= (-b±√((b^2)-(4*a*c)))/(2*a)*/
    public void obtenerRaices() {
        double raiz_x, raiz_y;
        if (tieneRaices() == true) {
            raiz_x = (-B + (Math.sqrt(getDiscriminante()))) / (2 * A);
            System.out.println("Raiz x = " + raiz_x);
            raiz_y = (-B - (Math.sqrt(getDiscriminante()))) / (2 * A);
            System.out.println("Raiz y = " + raiz_y);
        } else {
            if (getDiscriminante() < 0) {
                System.out.println("Discriminante negativo, la ecuación no tiene solución");
            }
            System.out.println("Raíz única");
        }
    }

    /*• Método obtenerRaiz(): llama A tieneRaiz() y si devolvió́ true imprime una única raíz.
    Es en el caso en que se tenga una única solución posible.*/
    public void obtenerRaiz() {
        double raiz;
        if (tieneRaiz() == true) {
            raiz = -B / (2 * A);
            System.out.println("La raíz es = " + raiz);
            if (getDiscriminante() < 0) {
                System.out.println("Discriminante negativo, la ecuación no tiene solución");
            }
        }
    }

    /*• Método calcular(): esté método llamará tieneRaices() y A tieneRaíz(), y mostrará por
    pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
    obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en
    caso de no existir solución, se mostrará un mensaje.*/
    public void calcular() {
        if (tieneRaiz()) {
            System.out.println("Tiene una solución única?");
            tieneRaiz();
            obtenerRaiz();
        } else {

            System.out.println("Tiene dos soluciones?");
            obtenerRaices();
        }
    }

///////////////////////////////////////////////////
//getter, setter y toString
    @Override
    public String toString() {
        return "Raices{" + "A=" + A + ", B=" + B + ", C=" + C + '}';
    }

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }

    public double getC() {
        return C;
    }

    public void setC(double C) {
        this.C = C;
    }

}
