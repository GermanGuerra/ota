package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.proveedores.Worldspan;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;


public class WorldspanADAPTER implements Aerolinea {

    public Worldspan worldspan;

/*
    private int dia;
    private int mes;
    private int año;
*/
    @Override
    public List<Vuelo> buscarVuelos(DateTime fecha, String origen, String destino) {

        //tengo que trasformar el formato de la fecha
//        String[] arrOffecha = fecha.("-", 3);
//        for (String a : arrOffecha)


        return worldspan.searchFlights(fecha.get(DateTimeFieldType.dayOfWeek()),fecha.get(DateTimeFieldType.dayOfMonth()),fecha.get(DateTimeFieldType.dayOfYear()),origen,destino);


    }

    @Override
    public Boleto reservar(Vuelo vuelo, Set<Pasajero> pasajeros) {
        return null;
    }
}
