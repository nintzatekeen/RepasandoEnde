import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class FechaTest {
	private int dia, mes, anio;
	private boolean resul;
	

	public FechaTest(int dia, int mes, int anio, boolean resul) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		this.resul=resul;
	}
	
	@Parameters
	public static Collection<Object[]> fechas(){
		return Arrays.asList(new Object[][]{{32,5,2014, false},{28,2,2019, true},{29,2,2020, true}});
	}

	@Test
	public void test() {
		Fecha nueva= new Fecha(dia, mes, anio);
		boolean resultado=nueva.valida();
		assertEquals(resul, resultado);
	}

}
