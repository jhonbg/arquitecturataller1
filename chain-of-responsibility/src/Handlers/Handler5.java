package Handlers;

public class Handler5 implements IMaquina{
    private IMaquina siguiente;
    @Override
    public void asignarSiguiente(IMaquina obj) {
        this.siguiente = obj;
    }

    @Override
    public void devolver(double saldo) {
        int cantidad = (int) Math.floor(saldo/5000);
        int residuo = (int) (saldo%5000);

        System.out.println("La cantidad de billetes 5.000 dispensados es: "+cantidad);

    }
}

