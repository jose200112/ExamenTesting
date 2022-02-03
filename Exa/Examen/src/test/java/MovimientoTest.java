import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MovimientoTest {
	Movimiento m;
	
	@BeforeEach
	public void init() {
		m = new Movimiento();
	}

	@Test
	void testGetImporte() {
		m.setImporte(50);
		assertEquals(50, m.getImporte());
	}

	@Test
	void testGetConcepto() {
		m.setConcepto("Cajero");
		assertEquals("Cajero", m.getConcepto());
	}

	@Test
	void testSetConcepto() {
		m.setConcepto("Cajero");
		assertEquals("Cajero", m.getConcepto());
	}

	@Test
	void testSetImporte() {
		m.setImporte(50);
		assertEquals(50, m.getImporte());
	}

}
