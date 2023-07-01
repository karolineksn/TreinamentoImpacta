package OrientacaoObjeto.cap6;
//Sobrecarga de Métodos
public class Cap6_Lab2 {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        System.out.println("Sobrecarga de métodos: ");
        System.out.println("int + int: " + calc.subtrair(11,10));
        System.out.println("double + double: " + calc.subtrair(5.5,4.5));
        System.out.println("int + double: " + calc.subtrair(10,5.5));
        System.out.println("double + int: " + calc.subtrair(10.5,4));


    }
}
