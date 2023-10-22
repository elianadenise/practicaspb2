package competenciaArqueria;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompetenciaTest {

	@Test
	public void queSePuedaCalcularDistancia() {
		Tiro uno = new Tiro(16.0, 25.0);
		Integer distancia = (int) Math.round(uno.getDistancia());
		assertEquals(new Integer(30), distancia);
	}
	
	@Test
	public void queSePuedaCalcularElPuntajeDelParticipante() {
		Participante p = new Participante(1);
		Tiro uno = new Tiro(10.0, 5.0); // 500
		Tiro dos = new Tiro(25.0, 10.0); // 200
		Tiro tres = new Tiro(10.0, 15.0); // 500
		Tiro cuatro = new Tiro(6.0, 35.0);// 100
		Tiro cinco = new Tiro(5.0, 47.0); //50
		
		assertTrue(p.agregarTiro(uno));
		assertTrue(p.agregarTiro(dos));
		assertTrue(p.agregarTiro(tres));
		assertTrue(p.agregarTiro(cuatro));
		assertTrue(p.agregarTiro(cinco));
		
		assertEquals(new Integer(1350), p.puntosAcumulados());
		assertEquals(new Integer(5), p.cantidadTiros());
	}

	@Test
	public void queNoSeAgreguenTirosInvalidos() {
		Participante p = new Participante(1);
		Tiro uno = new Tiro(51.0, 5.0); 
		
		assertFalse(p.agregarTiro(uno));
		
		assertEquals(new Integer(0), p.cantidadTiros());
	}
	
	@Test
	public void queSeAgreguenLos5MejoresTiros() {
		Participante p = new Participante(1);
		Tiro uno = new Tiro(10.0, 5.0); 
		Tiro dos = new Tiro(25.0, 10.0); 
		Tiro tres = new Tiro(10.0, 15.0); 
		Tiro cuatro = new Tiro(6.0, 35.0);
		Tiro cinco = new Tiro(5.0, 47.0); 
		Tiro seis = new Tiro(1.0, 1.0); 
		Tiro siete = new Tiro(3.0, 2.0);
		
		assertTrue(p.agregarTiro(uno));
		assertTrue(p.agregarTiro(dos));
		assertTrue(p.agregarTiro(tres));
		assertTrue(p.agregarTiro(cuatro));
		assertTrue(p.agregarTiro(cinco));
		assertTrue(p.agregarTiro(seis));
		assertTrue(p.agregarTiro(siete));
		
		assertEquals(new Integer(5), p.cantidadTiros());
	}
	
	@Test
	public void queSePuedanAgregarParticipantesCalificados() throws DescalificadoException {
		Participante p = new Participante(1);
		Tiro uno = new Tiro(10.0, 5.0); 
		Tiro dos = new Tiro(25.0, 10.0); 
		Tiro tres = new Tiro(10.0, 15.0); 
		Tiro cuatro = new Tiro(6.0, 35.0);
		Tiro cinco = new Tiro(5.0, 47.0); 
		p.agregarTiro(uno);
		p.agregarTiro(dos);
		p.agregarTiro(tres);
		p.agregarTiro(cuatro);
		p.agregarTiro(cinco);
		
		Competencia c = new Competencia();
		
		assertTrue(c.agregarParticipanteCalificado(p));
		assertEquals(new Integer(1), c.cantidadParticipantesCalificados());
	
	}
	
	@Test (expected = DescalificadoException.class)
	public void queNoSePuedanAgregarParticipantesDescalificados() throws DescalificadoException {
		Participante p = new Participante(1);
		Tiro uno = new Tiro(51.0, 5.0); // 0
		p.agregarTiro(uno);
		
		Competencia c = new Competencia();
		
		c.agregarParticipanteCalificado(p);
		
		assertEquals(new Integer(0), c.cantidadParticipantesCalificados());
	}
	
	@Test
	public void queSePuedaEstablecerUnPodio() throws DescalificadoException {
		Participante p = new Participante(1);
		Tiro uno = new Tiro(10.0, 5.0); 
		Tiro dos = new Tiro(25.0, 10.0); 
		Tiro tres = new Tiro(10.0, 15.0); 
		Tiro cuatro = new Tiro(6.0, 35.0);
		Tiro cinco = new Tiro(5.0, 47.0); 
		p.agregarTiro(uno);
		p.agregarTiro(dos);
		p.agregarTiro(tres);
		p.agregarTiro(cuatro);
		p.agregarTiro(cinco);
		
		Participante r = new Participante(57);
		Tiro once = new Tiro(27.0, 14.0); 
		Tiro doce = new Tiro(25.0, 10.0); 
		Tiro trece = new Tiro(23.0, 40.0); 
		Tiro catorce = new Tiro(39.0, 35.0);
		Tiro quince = new Tiro(5.0, 47.0); 
		r.agregarTiro(once);
		r.agregarTiro(doce);
		r.agregarTiro(trece);
		r.agregarTiro(catorce);
		r.agregarTiro(quince);
		
		Participante q = new Participante(65);
		Tiro seis = new Tiro(15.0, 5.0); 
		Tiro siete = new Tiro(25.0, 10.0); 
		Tiro ocho = new Tiro(30.0, 15.0); 
		Tiro nueve = new Tiro(27.0, 35.0);
		Tiro diez = new Tiro(5.0, 47.0); 
		q.agregarTiro(seis);
		q.agregarTiro(siete);
		q.agregarTiro(ocho);
		q.agregarTiro(nueve);
		q.agregarTiro(diez);
		
		
		Competencia c = new Competencia();
		
		c.agregarParticipanteCalificado(p);
		c.agregarParticipanteCalificado(q);
		c.agregarParticipanteCalificado(r);
		
		c.establecerPodio();
		assertEquals(new Integer(3), c.cantidadParticipantesEnPodio());
	}
}
