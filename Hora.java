package examen;
/**
 * 
 * @author daw1xx
 * @version 1.0
 * Este proyecto consta en validar una hora, si la hora,minutos o segundos es negativa o superior
 * a 23 en el caso de la hora o a 59 en el caso de los minutos y segundos devolvera False, si no, True
 */
public class Hora {
	/**
	 * Este boolean hora valida es para devolver False en caso de que hora > 23, minutos > 59 o segundos > 59
	 */
	public static boolean horaValida;
/**
 * 
 * @param segundos Tipo int que si es negativo o mayor a 59 devuelve False o si no True
 * @param minutos Tipo int que si es negativo o mayor a 59 devuelve False o si no True
 * @param horas Tipo int que si es negativo o mayor a 23 devuelve False o si no True
 * @return
 */
	public static boolean validarHora(int segundos, int minutos, int horas) {
		horaValida = true;
		/*
		 * If que tiene que cumplir horas, minutos y segundos mayor que 0 para devolver TRUE
		 */
		if ((horas >= 0) && (minutos >= 0) && (segundos >= 0)) {
			if (horas > 23) {
				horaValida = false;
			} else if (minutos > 59) {
				horaValida = false;
			} else if (segundos > 59) {
				horaValida = false;
			}
		} else {
			horaValida = false;
		}
		return horaValida;
	}
}