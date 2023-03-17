package udec.lab4.poo;

public class CalculadoraEspecial implements InterfazCalculadora {

    @Override
    public int sumarEnteros(int numero1, int numero2) {
        System.out.print("Total suma = ");
        return (numero1 + numero2) / 2;
    }

    @Override
    public int restarEnteros(int numero1, int numero2) {
        System.out.print("Total resta = ");
        return (numero1 - numero2) / 2;
    }

    @Override
    public int multiplicarEnteros(int numero1, int numero2) {
        System.out.print("Total multiplicación = ");
        return (numero1 * numero2) / 2;
    }

    @Override
    public int dividirEnteros(int numero1, int numero2) {
        System.out.print("Total división = ");
        return (numero1 / numero2) / 2;
    }

    @Override
    public double calcularRaizCuadrada(int numero1) {
        System.out.print("Total raíz cuadrada = ");
        return Math.sqrt(numero1) / 2;
    }

}
