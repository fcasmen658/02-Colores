/*
Secuencia de escape ANSI: La secuencia de escape ANSI se representa en Java como una cadena de texto que comienza con
"\033[" (el carácter ASCII 27 seguido de los corchetes).

Códigos de formato: Después de la secuencia de escape, se pueden agregar diferentes códigos para aplicar formatos al
texto. Algunos ejemplos son:

Estilo de texto: 0 (reiniciar), 1 (negrita), 4 (subrayado), 7 (invertir)
Color de texto: 30 (negro), 31 (rojo), 32 (verde), 33 (amarillo), 34 (azul), 35 (magenta), 36 (cián), 37 (blanco)
Color de fondo: 40 (negro), 41 (rojo), 42 (verde), 43 (amarillo), 44 (azul), 45 (magenta), 46 (cián), 47 (blanco)
Terminar la secuencia: Para restablecer los valores predeterminados, se usa la secuencia "\033[0m".

*/

public class Colores {
    public static void main(String[] args) {
        System.out.print("\033[34m"+"\033[1m"+"\033[7m");
        System.out.println("Hola mundo");
        System.out.println("\033[0m");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("\033[0m (\\033[0m) Prueba de escritura.\033[0m");
        System.out.println("\033[1m (\\033[1m) Prueba de escritura.\033[0m");
        System.out.println("\033[2m (\\033[2m) Prueba de escritura.\033[0m");
        System.out.println("\033[3m (\\033[3m) Prueba de escritura.\033[0m");
        System.out.println("\033[4m (\\033[4m) Prueba de escritura.\033[0m");
        System.out.println("\033[5m (\\033[5m) Prueba de escritura.\033[0m");
        System.out.println("\033[6m (\\033[6m) Prueba de escritura.\033[0m");
        System.out.println("\033[7m (\\033[7m) Prueba de escritura.\033[0m");
        System.out.println("\033[8m (\\033[8m) Prueba de escritura.\033[0m");
        System.out.println("\033[9m (\\033[9m) Prueba de escritura.\033[0m");
        System.out.println("\033[21m (\\033[21m) Prueba de escritura.\033[0m");
        System.out.println("\033[22m (\\033[22m) Prueba de escritura.\033[0m");
        System.out.println("\033[23m (\\033[23m) Prueba de escritura.\033[0m");
        System.out.println("\033[24m (\\033[24m) Prueba de escritura.\033[0m");
        System.out.println("\033[25m (\\033[25m) Prueba de escritura.\033[0m");
        System.out.println("\033[26m (\\033[26m) Prueba de escritura.\033[0m");
        System.out.println("\033[27m (\\033[27m) Prueba de escritura.\033[0m");
        System.out.println("\033[28m (\\033[28m) Prueba de escritura.\033[0m");
        System.out.println("\033[29m (\\033[29m) Prueba de escritura.\033[0m");
        System.out.println("\033[30m (\\033[30m) Prueba de escritura.\033[0m");
        System.out.println("\033[31m (\\033[31m) Prueba de escritura.\033[0m");
        System.out.println("\033[32m (\\033[32m) Prueba de escritura.\033[0m");
        System.out.println("\033[33m (\\033[33m) Prueba de escritura.\033[0m");
        System.out.println("\033[34m (\\033[34m) Prueba de escritura.\033[0m");
        System.out.println("\033[35m (\\033[35m) Prueba de escritura.\033[0m");
        System.out.println("\033[36m (\\033[36m) Prueba de escritura.\033[0m");
        System.out.println("\033[37m (\\033[37m) Prueba de escritura.\033[0m");
        System.out.println("\033[38m (\\033[38m) Prueba de escritura.\033[0m");
        System.out.println("\033[41m (\\033[41m) Prueba de escritura.\033[0m");
        System.out.println("\033[42m (\\033[42m) Prueba de escritura.\033[0m");
        System.out.println("\033[43m (\\033[43m) Prueba de escritura.\033[0m");
        System.out.println("\033[44m (\\033[44m) Prueba de escritura.\033[0m");
        System.out.println("\033[45m (\\033[45m) Prueba de escritura.\033[0m");
        System.out.println("\033[46m (\\033[46m) Prueba de escritura.\033[0m");
        System.out.println("\033[47m (\\033[47m) Prueba de escritura.\033[0m");
        System.out.println("\033[50m (\\033[50m) Prueba de escritura.\033[0m");
        System.out.println("\033[51m (\\033[51m) Prueba de escritura.\033[0m");
        System.out.println("\033[52m (\\033[52m) Prueba de escritura.\033[0m");
        System.out.println("\033[53m (\\033[53m) Prueba de escritura.\033[0m");
        System.out.println("\033[90m (\\033[90m) Prueba de escritura.\033[0m");
        System.out.println("\033[91m (\\033[91m) Prueba de escritura.\033[0m");
        System.out.println("\033[92m (\\033[92m) Prueba de escritura.\033[0m");
        System.out.println("\033[93m (\\033[93m) Prueba de escritura.\033[0m");
        System.out.println("\033[94m (\\033[94m) Prueba de escritura.\033[0m");
        System.out.println("\033[95m (\\033[95m) Prueba de escritura.\033[0m");
        System.out.println("\033[96m (\\033[96m) Prueba de escritura.\033[0m");
        System.out.println("\033[97m (\\033[97m) Prueba de escritura.\033[0m");
        System.out.println("\033[98m (\\033[98m) Prueba de escritura.\033[0m");
        System.out.println("\033[100m (\\033[100m) Prueba de escritura.\033[0m");
        System.out.println("\033[101m (\\033[101m) Prueba de escritura.\033[0m");
        System.out.println("\033[102m (\\033[102m) Prueba de escritura.\033[0m");
        System.out.println("\033[103m (\\033[103m) Prueba de escritura.\033[0m");
        System.out.println("\033[104m (\\033[104m) Prueba de escritura.\033[0m");
        System.out.println("\033[105m (\\033[105m) Prueba de escritura.\033[0m");
        System.out.println("\033[106m (\\033[106m) Prueba de escritura.\033[0m");
        System.out.println("\033[107m (\\033[107m) Prueba de escritura.\033[0m");
   }
}