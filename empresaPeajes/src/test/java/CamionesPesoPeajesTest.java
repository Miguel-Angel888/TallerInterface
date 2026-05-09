import co.edu.uniquindio.poo.model.Camion;
import co.edu.uniquindio.poo.model.EmpresaPeajes;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.Vehiculo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

/**
 * Clase para probar el metodo para buscar los camiones con mas peso A (10) y mas peajes (5) pagados
 * @author Área de programación UQ
 * @since 2023-08
 *
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */
public class CamionesPesoPeajesTest {
    private static final Logger LOG = Logger.getLogger(CamionesPesoPeajesTest.class.getName());


    @Test
    public void buscarCamionesPorPesoYPeaje() {
        LOG.info("Inicio del test");

        List<Vehiculo> listaVehiculosTest = new ArrayList<>();
        List<Vehiculo> listaVehiculosVerdadera = new ArrayList<>();

        Vehiculo camion = new Camion(null, 10, null,null, 100, 0,0);
        Vehiculo camion1 = new Camion(null, 5, null, null, 15, 0,00);
        Vehiculo camion2 = new Camion(null, 1, null, null, 15, 0,0);
        Vehiculo camion3 = new Camion(null, 5, null, null, 5, 0,0);
        Vehiculo camion4 = new Camion(null,0,null,null,1,0,0);
        Vehiculo moto = new Moto(null,10,null,null,200,0);

        listaVehiculosTest.add(camion);
        listaVehiculosTest.add(camion1);
        listaVehiculosTest.add(camion2);
        listaVehiculosTest.add(camion3);
        listaVehiculosTest.add(camion4);
        listaVehiculosTest.add(moto);

        listaVehiculosVerdadera.add(camion);
        listaVehiculosVerdadera.add(camion1);

        EmpresaPeajes empresa = new EmpresaPeajes(null,listaVehiculosTest,null,null);
        List<Vehiculo> listaCamionesMetodo = empresa.buscarCamionesPorPesoYPeajes(10,5);

        assertIterableEquals(listaVehiculosVerdadera,listaCamionesMetodo);

        LOG.info("Fin del test, los vehiculos fueron: "+listaCamionesMetodo);

    }
}
