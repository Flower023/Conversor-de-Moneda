package principal;
import modelos.ConvertidorMoneda;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        ConvertidorMoneda convertidor = new ConvertidorMoneda();
        convertidor.iniciar();

    }
}
