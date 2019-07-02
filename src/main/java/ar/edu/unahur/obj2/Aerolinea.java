package ar.edu.unahur.obj2;

import org.joda.time.DateTime;

import java.util.List;
import java.util.Set;

public interface Aerolinea {

    List<Vuelo> buscarVuelos(DateTime fecha, final String origen, final String destino);

    Boleto reservar(Vuelo vuelo, Set<Pasajero> pasajeros);

}
