package Handlers;

public interface IMaquina {


    //Pasar al siguiente manejador
    void asignarSiguiente(IMaquina obj);
    //Metodo de escritura
    void devolver(double saldo);

}
