package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
import views.ListarVehiculosView;
import views.AgregarVehiculo;

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();
        ListarVehiculosView view = new ListarVehiculosView();
        view.setVisible(true);
        AgregarVehiculo v = new AgregarVehiculo();
        v.setVisible(true);
    }
}
