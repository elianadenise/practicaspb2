package excepcionesPildoras;

import javax.swing.JOptionPane;
import java.io.*;

public class CompruebaMail {

	public static void main(String[] args) {
		String mail = JOptionPane.showInputDialog("Mail: ");
		
		/* forma 1 throws y throw con try and catch
		try {
			examina_mail(mail);
		} catch(EOFException e) {
			System.out.println("La dirección no es correcta");
		}*/
		
		// forma 2
		try {
			examina_mail(mail);
		} catch (Longitud_mail_erroneo e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/* forma 1 throws y throw con try and catch
	static void examina_mail(String mail) throws EOFException{
		Integer arroba = 0;
		Boolean punto = Boolean.FALSE;
		
		if(mail.length() <= 3) {		
			throw new EOFException();
		} else {
			for(int i = 0; i < mail.length(); i++) {
				if(mail.charAt(i) == '@') {
					arroba++;
				}
				if(mail.charAt(i) == '.') {
					punto = Boolean.TRUE;
				}
			}
			if(arroba == 1 && punto == Boolean.TRUE) {
				System.out.println("Es correcto");
			} else {
				System.out.println("Incorrecto");
			}
		}
		
	}*/
	
	static void examina_mail(String mail) throws Longitud_mail_erroneo {
		Integer arroba = 0;
		Boolean punto = Boolean.FALSE;
		
		if(mail.length() <= 3) {	
			throw new Longitud_mail_erroneo("Mail demasiado corto");
		} else {
			for(int i = 0; i < mail.length(); i++) {
				if(mail.charAt(i) == '@') {
					arroba++;
				}
				if(mail.charAt(i) == '.') {
					punto = Boolean.TRUE;
				}
			}
			if(arroba == 1 && punto == Boolean.TRUE) {
				System.out.println("Es correcto");
			} else {
				System.out.println("Incorrecto");
			}
		}
	}
	
	
}

class Longitud_mail_erroneo extends Exception {
		// poner los dos constructores por convension
		public Longitud_mail_erroneo() {}
		public Longitud_mail_erroneo(String mensaje_error) {
			super(mensaje_error);
		}
		public void printStackTrace(){
			System.out.println("El mail no puede tener menos de 3 caracteres");
		}
	}