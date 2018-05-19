package MultiplosTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import FizzBuzz.Multiplos;

class MultiplosTest {

	@Test
	public void multiplosTresTest() {
		String respuesta = Multiplos.multiplos(6);
		String esperado = "Fizz";
		assertEquals(esperado,respuesta);
	}
		
	@Test
	public void multiplosCincoTest() {
		String respuesta = Multiplos.multiplos(10);
		String esperado = "Buzz";
		assertEquals(esperado,respuesta);
	}

	@Test
	public void multiplosCincoTresTest() {
		String respuesta = Multiplos.multiplos(15);
		String esperado = "FizzBuzz";
		assertEquals(esperado,respuesta);
	}
	
	@Test
	public void noMultiplosCincoTresTest() {
		String respuesta = Multiplos.multiplos(14);
		String esperado = String.valueOf(14);
		assertEquals(esperado,respuesta);
	}

}