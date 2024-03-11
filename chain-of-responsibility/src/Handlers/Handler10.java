package Handlers;

public class Handler10 implements IMaquina{
    private IMaquina siguiente;
    @Override
    public void asignarSiguiente(IMaquina obj) {
        this.siguiente = obj;
    }

    @Override
    public void devolver(double saldo) {
        int cantidad = (int) Math.floor(saldo/10000);
        int residuo = (int) (saldo%10000);

        System.out.println("La cantidad de billetes 10.000 dispensados es: "+cantidad);
        this.siguiente.devolver(residuo);
    }
}

