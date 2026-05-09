import co.edu.uniquindio.poo.model.Camion;
import co.edu.uniquindio.poo.model.Carro;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.Vehiculo;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Clase para probar el metodo para verificar el calculo correcto del valor del peaje
 * @author Área de programación UQ
 * @since 2023-08
 *
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */
public class verificarCalculoPeajeTest {
    private static final Logger LOG = Logger.getLogger(verificarCalculoPeajeTest.class.getName());

  @Test
  public void verificarCalculoPeajeMoto(){
      LOG.info("Inicio del test");
      double valorEsperado = 7000;
      Vehiculo moto = new Moto(null,0,null,null,250,5000);

      double valorCalculado = ((Moto)moto).valorFinalPeaje();

      assertEquals(valorEsperado,valorCalculado);
      LOG.info("Fin del test, el resultado fue:"+valorCalculado);
  }
  @Test
    public void verificarCalculoPeajeCarro(){
    LOG.info("Inicio del test");
    double valorEsperado = 9500;
    Vehiculo carro = new Carro(null,0,null,null,true,true,10000);

    double valorCalculado = ((Carro)carro).calcularPeajeFinal();
    assertEquals(valorEsperado,valorCalculado);
    LOG.info("Fin del test y el resultado es: "+valorCalculado);
  }
  @Test
    public void verificarCalculoPeajeCamion(){
      LOG.info("inicio del test");

      Vehiculo camion = new Camion(null,0,null,null,11,4,7000);

      double valorEsperado = 30800;

      double valorCalculado = ((Camion) camion).calcularPeajeFinal();
      assertEquals(valorEsperado,valorCalculado);
      LOG.info("Fin del test,el resultado es: "+valorCalculado);
  }
}
