package testconsecionaria;

/**
 * 
 * @author Gustavo <@LastShadow>
 */
public class Camionetas extends Vehiculo{

    public Camionetas(int codigo, String marca, String tipo, int modelo, String patente, int kilometraje) {
        super(codigo, marca, tipo, modelo, patente, kilometraje);
    }

     @Override
    public String toString(){
        return "Codigo: " + super.getCodigo() + 
                "\nMarca: " + super.getMarca() + 
                "\nTipo: " + super.getTipo() +
                "\nModelo: " + super.getModelo() +
                "\nPatente: " + super.getPatente() +
                "\nKilometraje: " + super.getKilometraje();
    }
}
