package Handlers;

public class Handler50 implements IMaquina{
    private IMaquina siguiente;
    @Override
    public void asignarSiguiente(IMaquina obj) {
        this.siguiente = obj;
    }

    @Override
    public void devolver(double saldo) {
        int cantidad = (int) Math.floor(saldo/50000);
        int residuo = (int) (saldo%50000);

        System.out.println("La cantidad de billetes 50.000 dispensados es: "+cantidad);
        this.siguiente.devolver(residuo);
    }
}
