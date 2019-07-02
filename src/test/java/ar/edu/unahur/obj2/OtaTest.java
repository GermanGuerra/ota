package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.proveedores.Amadeus;
import ar.edu.unahur.obj2.proveedores.Sabre;
import ar.edu.unahur.obj2.proveedores.Worldspan;
import org.joda.time.DateTime;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.testng.Assert.*;

public class OtaTest {

    @org.testng.annotations.Test
    public void testBuscarVuelos() {


        AmadeusADAPTER amadeus = new AmadeusADAPTER(new Amadeus());
        SabreADAPTER sabre = new SabreADAPTER(new Sabre());
        WorldspanADAPTER worldspan = new WorldspanADAPTER(new Worldspan());

        DistribuidorDeTrafico distribuidorDeTrafico = new DistribuidorDeTrafico(Arrays.asList(amadeus, sabre, worldspan));
        Ota ota = new Ota(distribuidorDeTrafico);

        DateTime fecha = new DateTime("2019-12-13");


        List<Vuelo> vuelos = ota.buscarVuelos(fecha, "BUE", "MIA");


    }

    @org.testng.annotations.Test
    public void testReservar() {

        AmadeusADAPTER amadeus = new AmadeusADAPTER(new Amadeus());
        SabreADAPTER sabre = new SabreADAPTER(new Sabre());
        WorldspanADAPTER worldspan = new WorldspanADAPTER(new Worldspan());

        DistribuidorDeTrafico distribuidorDeTrafico = new DistribuidorDeTrafico(Arrays.asList(amadeus, sabre, worldspan));
        Ota ota = new Ota(distribuidorDeTrafico);

        DateTime fecha = new DateTime("2019-12-13");


        List<Vuelo> vuelos = ota.buscarVuelos(fecha, "BUE", "MIA");

        Vuelo elegido =  vuelos.get(0);
        Set<Pasajero> pasajeros = Stream.of(new Pasajero("Juan", "Pérez", 40)).collect(Collectors.toSet());

        Boleto boleto = ota.reservar(elegido, pasajeros );

        assertEquals(boleto.getVuelo(), elegido);


    }
}