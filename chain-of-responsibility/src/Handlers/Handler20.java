package Handlers;

public class Handler20 implements IMaquina{
    private IMaquina siguiente;
    @Override
    public void asignarSiguiente(IMaquina obj) {
        this.siguiente = obj;
    }

    @Override
    public void devolver(double saldo) {
        int cantidad = (int) Math.floor(saldo/20000);
        int residuo = (int) (saldo%20000);

        System.out.println("La cantidad de billetes 20.000 dispensados es: "+cantidad);
        this.siguiente.devolver(residuo);
    }
}

