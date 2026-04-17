package domain;

public class VehiculoCombustible extends Vehiculo {
    private double kilometrosPorLitro;
    private double litrosExtra;

    public VehiculoCombustible(String patente, Marca marca, String modelo, int anio, double capacidadCarga,
                               Sucursal sucursal, double kilometrosPorLitro, double litrosExtra) {
        super(VehiculoTipo.COMBUSTIBLE, patente, marca, modelo, anio, capacidadCarga, sucursal);
        this.kilometrosPorLitro = kilometrosPorLitro;
        this.litrosExtra = litrosExtra;
    }
    
     public double getKilometrosPorLitro() {
        return kilometrosPorLitro;
    }

    public double getLitrosExtra() {
        return litrosExtra;
    }

    @Override
    public double calcularConsumo(double kilometros) {
        int anioNuevo=2026;
        int antiguedad=anioNuevo-anio;
        
        if(antiguedad>5){
            double total = (kilometros/kilometrosPorLitro) + ((kilometros/15)*litrosExtra);
            return total;
        }else{
            double total=kilometros/kilometrosPorLitro;
            return total;
        }
    }
}
