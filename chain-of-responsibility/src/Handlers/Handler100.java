package Handlers;

public class Handler100 implements IMaquina {
    private IMaquina siguiente;
    @Override
    public void asignarSiguiente(IMaquina obj) {
        this.siguiente = obj;
    }

    @Override
    public void devolver(double saldo) {
        int cantidad = (int) Math.floor(saldo/100000);
        int residuo = (int) (saldo%100000);

        System.out.println("La cantidad de billetes 100.000 dispensados es: "+cantidad);
        this.siguiente.devolver(residuo);
    }
}
