package ar.edu.unahur.obj2;

import java.util.List;
import java.util.Random;

public class DistribuidorDeTrafico {

    private Random random = new Random();
    public List<Aerolinea> proveedores;

    //lista de las aerolineas existentes:

    public DistribuidorDeTrafico(List<Aerolinea> aerolineas) {
        this.proveedores = aerolineas;
    }

    public Aerolinea aerolinea(){
        return proveedores.get(random.nextInt(proveedores.size()));
    }

/*
    public String proveedor() {
        switch (random.nextInt(9)) {
            case 0:
            case 1:
            case 2: return "Amadeus";
            case 3:
            case 4:
            case 5: return "Sabre";
            case 6:
            case 7:
            case 8: return "Worldspan";
            default: return "Amadeus";
        }

    }

    */

}
