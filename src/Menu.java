import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int opcion = 0;
        int subOpcion = 0;

        do {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("-                    MENU FUNDAMENTOS DE PROGRAMACION                   -");
            System.out.println("-                      HEIDY NIÑO - EDINSON MARTINEZ                    -");
            System.out.println("-                         HNINO         EMARTI4                         -");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("-                          1. Datos Primitivos                          -");
            System.out.println("-                          2. String                                    -");
            System.out.println("-                          3. Constantes                                -");
            System.out.println("-                          4. Tipos de operadores                       -");
            System.out.println("-                          5. Condicional IF, ELSE IF ELSE              -");
            System.out.println("-                          6. Condicional SWITCH                        -");
            System.out.println("-                          7. Bucle WHILE                               -");
            System.out.println("-                          8. Bucle DO WHILE                            -");
            System.out.println("-                          9. Bucle FOR                                 -");
            System.out.println("-                         10. Bucle FOR EACH                            -");
            System.out.println("-                         11. Ternaria                                  -");
            System.out.println("-                         12. Salir                                     -");
            System.out.println("-------------------------------------------------------------------------");
            System.out.print("Ingrese una opcion");
            while (!scanner.hasNextInt()) {
                System.out.println("La opcion que ingresaste no existe, intentalo nuevamente");
                scanner.next();
                System.out.println("Ingrese una opcion");
            }

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("                           DATOS PRIMITIVOS                              ");
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("-                          1. byte                                      -");
                    System.out.println("-                          2. short                                     -");
                    System.out.println("-                          3. int                                       -");
                    System.out.println("-                          4. long                                      -");
                    System.out.println("-                          5. float                                     -");
                    System.out.println("-                          6. double                                    -");
                    System.out.println("-                          7. char                                      -");
                    System.out.println("-                          8. boolean                                   -");
                    System.out.println("-                          12. Salir                                    -");
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("Ingrese una sub opcion");
                    while (!scanner.hasNextInt()) {
                        System.out.println("La sub opcion que ingresaste no existe, intentalo nuevamente");
                        scanner.next();
                        System.out.println("Ingrese una sub opcion");

                        /*System.out.print("Presione enter para continuar...");
                        scanner.nextLine();
                        scanner.nextLine();*/

                    }

                    subOpcion = scanner.nextInt();
                    switch (subOpcion) {
                        case 1:

                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("                           BYTE                                          ");
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("-        El tipo de dato byte se utiliza para almacenar valores         -");
                            System.out.println("-        numéricos enteros pequeños.                                    -");
                            System.out.println("-        Rango: -128 a 127.                                             -");
                            System.out.println("-        Ejemplo:                                                       -");
                            System.out.println("-                          byte edad = 26                               -");
                            System.out.println("-------------------------------------------------------------------------");
                            break;

                        case 2:
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("                           SHORT                                         ");
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("-        Se tipo de dato short se utiliza cuando se necesita un rango   -");
                            System.out.println("-        más amplio que el proporcionado por los bytes.                 -");
                            System.out.println("-        Rango: -32768 a 32767.                                         -");
                            System.out.println("-        Ejemplo:                                                       -");
                            System.out.println("-                          short año = 2024;                            -");
                            System.out.println("-------------------------------------------------------------------------");
                            break;

                        case 3:
                            System.out.println("--------------------------------------------------------------------------");
                            System.out.println("                           INT                                            ");
                            System.out.println("--------------------------------------------------------------------------");
                            System.out.println("-        Es un tipo de dato que representa números enteros, es decir,    -");
                            System.out.println("-        números sin parte decimal, estos pueden ser positivos, negativos-");
                            System.out.println("-        o cero.                                                         -");
                            System.out.println("-        Rango: -2,147,483,648 a 2,147,483,647                           -");
                            System.out.println("-        Ejemplo:                                                        -");
                            System.out.println("-                          int valorTotal = 21456                        -");
                            System.out.println("--------------------------------------------------------------------------");
                            break;

                        case 4:
                            System.out.println("--------------------------------------------------------------------------");
                            System.out.println("                           LONG                                           ");
                            System.out.println("--------------------------------------------------------------------------");
                            System.out.println("-      El tipo de dato long se utiliza para representar números enteros  -");
                            System.out.println("-      que requieren un rango mayor que el proporcionado por un tipo int -");
                            System.out.println("-      Rango: -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807     -");
                            System.out.println("-      Ejemplo:                                                          -");
                            System.out.println("-                         long token = 214562565454                      -");
                            System.out.println("--------------------------------------------------------------------------");
                            break;

                        case 5:
                            System.out.println("--------------------------------------------------------------------------");
                            System.out.println("                           FLOAT                                          ");
                            System.out.println("--------------------------------------------------------------------------");
                            System.out.println("-      El tipo de dato float se utiliza para representar números reales  -");
                            System.out.println("-      (decimales)                                                       -");
                            System.out.println("-      Precisòn: De 6 a 7 digitos.                                       -");
                            System.out.println("-      Ejemplo:                                                          -");
                            System.out.println("-                         float TRM = 4021.63                            -");
                            System.out.println("--------------------------------------------------------------------------");
                            break;

                        case 6:
                            System.out.println("--------------------------------------------------------------------------");
                            System.out.println("                           DOUBLE                                         ");
                            System.out.println("--------------------------------------------------------------------------");
                            System.out.println("-  El tipo de dato double se utiliza para representar números con mayor  -");
                            System.out.println("-  exactitud y un rango más amplio en comparación con el tipo float      -");
                            System.out.println("-      Precisòn: De 15 a 17 digitos.                                     -");
                            System.out.println("-      Ejemplo:                                                          -");
                            System.out.println("-                         double Temperatura = 28.635464646              -");
                            System.out.println("--------------------------------------------------------------------------");
                            break;

                        case 7:
                            System.out.println("--------------------------------------------------------------------------");
                            System.out.println("                           CHAR                                           ");
                            System.out.println("--------------------------------------------------------------------------");
                            System.out.println("-  El tipo de dato char se utiliza para representar un solo              -");
                            System.out.println("-  carácter, como una letra, un dígito, un símbolo o un espacio.         -");
                            System.out.println("-      Ejemplo:                                                          -");
                            System.out.println("-                         char Nota = B                                  -");
                            System.out.println("--------------------------------------------------------------------------");
                            break;

                        case 8:
                            System.out.println("--------------------------------------------------------------------------");
                            System.out.println("                           BOOLEAN                                        ");
                            System.out.println("--------------------------------------------------------------------------");
                            System.out.println("-  El tipo de dato boolean se usa para representar valores de dos        -");
                            System.out.println("-  posibles estados lógicos: true (verdadero) y false (falso).           -");
                            System.out.println("-      Ejemplo:                                                          -");
                            System.out.println("-                   boolean contraseñaCorrecta = false                   -");
                            System.out.println("--------------------------------------------------------------------------");
                            break;

                        case 12:
                            System.out.println("Saliendo...");
                            System.exit(0);
                            break;


                        default:
                            System.out.println("Opcion no valida, inicie nuevamente");
                            return;

                    }


                    break;

                case 2:
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("                           STRING                                         ");
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("-        El tipo de dato string (cadena de caracteres) se usa para       -");
                    System.out.println("-        representar secuencias de caracteres. se utilizan para          -");
                    System.out.println("         manejar texto, como nombres, descripciones, mensajes             ");
                    System.out.println("-        Ejemplo:                                                        -");
                    System.out.println("-                          string nombre = Juan                          -");
                    System.out.println("--------------------------------------------------------------------------");
                    break;

                case 3:
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("                           CONSTANTES                                      ");
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("-     Una constante es una variable cuyo valor no cambia una vez que ha   -");
                    System.out.println("-     sido asignado. Las constantes son utiles para definir valores fijos.-");
                    System.out.println("-     Para definirla se utiliza la palabra final.                         -");
                    System.out.println("-        Ejemplo:                                                         -");
                    System.out.println("-                  public static final string valor_venta = 5000          -");
                    System.out.println("---------------------------------------------------------------------------");
                    break;
                case 4:
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("                           TIPOS DE OPERADORES                           ");
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("-                          1. Aritmeticos                               -");
                    System.out.println("-                          2. Relacionales                              -");
                    System.out.println("-                          3. Logicos                                   -");
                    System.out.println("-                          4. Asignacion                                -");
                    System.out.println("-                          5. Incremento/Decremento                     -");
                    System.out.println("-                          12. Salir                                    -");
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("Ingrese una sub opcion");

                    while (!scanner.hasNextInt()) {
                        System.out.println("La sub opcion que ingresaste no existe, intentalo nuevamente");
                        scanner.next();
                        System.out.println("Ingrese una sub opcion");

                    }

                    subOpcion = scanner.nextInt();
                    switch (subOpcion) {
                        case 1:
                            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("-                                                      ARITMETICOS                                                              -");
                            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("- OPERADOR  |                             ACCION                                  |          EJEMPLO                            -");
                            System.out.println("-    +      | Suma dos operandos                                                  | int suma     = 5 + 3;          Resultado: 8 -");
                            System.out.println("-    -      | Resta el segundo operando del primero                               | int resta    = 5 - 3;          Resultado: 2 -");
                            System.out.println("-    *      | Multiplica dos operandos                                            | int multi    = 5 * 3,          Resultado: 15-");
                            System.out.println("-    /      | Divide el primer operando por el segundo                            | int division = 6 / 3;          Resultado: 2 -");
                            System.out.println("-    %      | Devuelve el resto de la division del primer operando por el segundo | int modulo   = 5 % 3;          Resultado: 2 -");
                            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                            break;

                        case 2:
                            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("-                                                            RELACIONALES                                                                  -");
                            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("- OPERADOR  |                             ACCION                                         |                    EJEMPLO                      -");
                            System.out.println("-    ==     | Comprueba si los valores de dos operandos son iguales.                     | boolean esIgual     = (5 == 3); Resultado: false-");
                            System.out.println("-    !=     | Comprueba si los valores de dos operandos no son iguales.                  | boolean noEsIgual   = (5 != 3); Resultado: true -");
                            System.out.println("-    >      | Comprueba si el valor del primer operando es mayor que el segundo          | boolean mayor       = (5 > 3);  Resultado: true -");
                            System.out.println("-    <      | Comprueba si el valor del primer operando es menor que el segundo          | boolean menor       = (5 < 3);  Resultado: false-");
                            System.out.println("-    >=     | Comprueba si el valor del primer operando es mayor o igual que el segundo  | boolean mayorOigual = (5 >= 3); Resultado: true -");
                            System.out.println("-    <=     | Comprueba si el valor del primer operando es menor o igual que el segundo  | boolean mayorOigual = (5 <= 3); Resultado: false-");
                            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
                            break;

                        case 3:
                            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("                                                                LOGICOS                                                                     ");
                            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("- OPERADOR  |                             ACCION                                   |                          EJEMPLO                      -");
                            System.out.println("-    &&     | Devuelve true si ambos operadores son true.                          | boolean resultado = (5 > 3 && 3 < 4); Resultado: true -");
                            System.out.println("-    ||     | Devuelve true si al menos una de ellas es true                       | boolean resultado = (5 < 3 || 3 < 4); Resultado: true -");
                            System.out.println("-    !      | Invierte el valor de un operador booleano.                           | boolean resultado = !(5 > 3);         Resultado: false-");
                            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
                            break;

                        case 4:
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("                                                                 ASIGNACION                                                                         -");
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("- OPERADOR  |                                       ACCION                                                         |           EJEMPLO              -");
                            System.out.println("-    =      | Asigna el valor del operando derecho al operando izquierdo.                                          | int a = 5;                     -");
                            System.out.println("-    +=     | Suma el operando derecho al operando izquierdo y asigna el resutado al izquierdo.                    | int a = 5; a+= 3; Resultado: 8 -");
                            System.out.println("-    -=     | Resta el operando derecho al operando izquierdo y asigna el resutado al izquierdo.                   | int a = 5; a-= 3; Resultado: 2 -");
                            System.out.println("-    *=     | Multiplica el operando derecho por operando izquierdo y asigna el resutado al izquierdo.             | int a = 5; a*= 3; Resultado:15 -");
                            System.out.println("-    /=     | Divide el operando izquierdo por operando derecho y asigna el resutado al izquierdo.                 | int a = 6; a/= 3; Resultado: 2 -");
                            System.out.println("-    %=     | Calcula el modulo del operando izquierdo por el operando derecho y asigna el resultado al izquierdo. | int a = 5; a%= 3; Resultado: 2 -");
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
                            break;

                        case 5:
                            System.out.println("----------------------------------------------------------------------------------------");
                            System.out.println("                           INCREMENTO/DECREMENTO                                       -");
                            System.out.println("----------------------------------------------------------------------------------------");
                            System.out.println("- OPERADOR  |                             ACCION        |         EJEMPLO              -");
                            System.out.println("-    ++     | Incrementa el valor del operando en uno.  | int a = 5; a++; Resultado: 6 -");
                            System.out.println("-    --     | Decrementa el valor del operando en uno.  | int a = 5; a--; Resultado: 4 -");
                            System.out.println("----------------------------------------------------------------------------------------");
                            break;


                        case 12:
                            System.out.println("Saliendo...");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opcion no valida, inicie nuevamente");
                            return;
                    }
                    break;
                case 5:
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("                           IF, ELSE, IF ELSE                             ");
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("-                          1. Teoria                                    -");
                    System.out.println("-                          2. Practica                                  -");
                    System.out.println("-                          12. Salir                                    -");
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("Ingrese una sub opcion");
                    while (!scanner.hasNextInt()) {
                        System.out.println("La opcion que ingresaste no existe, intentalo nuevamente");
                        scanner.next();
                        System.out.println("Ingrese una opcion");
                    }

                    while (!scanner.hasNextInt()) {
                        System.out.println("La sub opcion que ingresaste no existe, intentalo nuevamente");
                        scanner.next();
                        System.out.println("Ingrese una sub opcion");

                    }
                    subOpcion = scanner.nextInt();
                    switch (subOpcion) {
                        case 1:
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("-                                                      TEORIA IF, ELSE, ELSE IF                                             -");
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("-                                                                                                                           -");
                            System.out.println("-                                                        IF                                                                 -");
                            System.out.println("- Es una estructura de control que se utiliza para ejecutar un bloque de código solo si se cumple una condición específica. -");
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("-                                                                                                                           -");
                            System.out.println("-                                                       ELSE                                                                -");
                            System.out.println("-                                     Se ejecuta si la condición del if es false.                                           -");
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("-                                                                                                                           -");
                            System.out.println("-                                                       ELSE IF                                                             -");
                            System.out.println("-                                     Permite evaluar múltiples condiciones en secuencia.                                   -");
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                            break;

                        case 2:
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("-                          PRACTICA IF, ELSE, ELSE IF                   -");
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("-                          CONOCE TU RANGO DE EDAD                      -");
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("-         CUENTANOS QUE EDAD TIENES Y TE DIREMOS A QUE RANGO PERTENECES -");
                            System.out.println("-------------------------------------------------------------------------");

                            int edad;
                            System.out.println("Ingresar tu edad");
                            Scanner rangoEdad = new Scanner(System.in);
                            edad = rangoEdad.nextInt();
                            if (edad <= 12 && edad >= 0) {
                                System.out.println("Eres un niño");
                            } else if (edad >= 13 && edad <= 20) {
                                System.out.println("Eres un joven");
                            } else if (edad >= 21 && edad <= 60) {
                                System.out.println("Eres un adulto");
                            } else if (edad >= 61) {
                                System.out.println("Eres de la tercera edad");
                            }
                            break;

                        case 12:
                            System.out.println("Saliendo...");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opcion no valida, inicie nuevamente");
                            return;
                    }
                    break;
                case 6:
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("                           SWITCH                                        ");
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("-                          1. Teoria                                    -");
                    System.out.println("-                          2. Practica                                  -");
                    System.out.println("-                          12. Salir                                    -");
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("Ingrese una sub opcion");

                    while (!scanner.hasNextInt()) {
                        System.out.println("La sub opcion que ingresaste no existe, intentalo nuevamente");
                        scanner.next();
                        System.out.println("Ingrese una sub opcion");
                    }
                    subOpcion = scanner.nextInt();
                    switch (subOpcion) {
                        case 1:
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("-                                                      TEORIA SWITCH                                                        -");
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("-                                                                                                                           -");
                            System.out.println("-                Es una estructura de control de flujo que permite elegir entre múltiples opciones o casos.                 -");
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                            break;

                        case 2:
                            System.out.println("-----------------------------------------------------------------------------");
                            System.out.println("-                          PRACTICA SWITCH                                  -");
                            System.out.println("-----------------------------------------------------------------------------");
                            System.out.println("-                          CONSULTA TU NOTA                                 -");
                            System.out.println("-----------------------------------------------------------------------------");
                            System.out.println("-CUENTANOS QUE NUMERO DEL 1 AL 10 TE ASIGNARON Y TE DIREMOS QUE NOTA TIENES -");
                            System.out.println("-----------------------------------------------------------------------------");

                            int calificacion;
                            System.out.println("Ingresa el numero que te asignaron");
                            Scanner nota = new Scanner(System.in);
                            calificacion = scanner.nextInt();
                            switch (calificacion) {
                                case 1:
                                case 2:
                                    System.out.println("Tu calificacion es F");
                                    break;
                                case 3:
                                case 4:
                                    System.out.println("Tu calificacion es D");
                                    break;
                                case 5:
                                case 6:
                                    System.out.println("Tu calificacion es C");
                                    break;
                                case 7:
                                case 8:
                                    System.out.println("Tu calificacion es B");
                                    break;
                                case 9:
                                case 10:
                                    System.out.println("Tu calificacion es A");
                                    break;
                                default:
                                    System.out.println("Número no válido, por favor verifique");
                            }
                            break;

                        case 12:
                            System.out.println("Saliendo...");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opcion no valida, inicie nuevamente");
                            return;

                    }
                    break;
                case 7:
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("                           WHILE                                         ");
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("-                          1. Teoria                                    -");
                    System.out.println("-                          2. Practica                                  -");
                    System.out.println("-                          12. Salir                                    -");
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("Ingrese una sub opcion");

                    while (!scanner.hasNextInt()) {
                        System.out.println("La sub opcion que ingresaste no existe, intentalo nuevamente");
                        scanner.next();
                        System.out.println("Ingrese una sub opcion");
                    }
                    subOpcion = scanner.nextInt();
                    switch (subOpcion) {
                        case 1:
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("-                                                       TEORIA WHILE                                                        -");
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("-                                                                                                                           -");
                            System.out.println("- Es una estructura de control que permite repetir un bloque de código mientras se cumpla una condición específica.         -");
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                            break;

                        case 2:
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("-                               PRACTICA WHILE                          -");
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("-      Realizar la suma de los numero del 1 al 10.                      -");
                            System.out.println("-------------------------------------------------------------------------");

                            int suma = 0;
                            int i = 1;

                            while (i <= 10) {
                                suma += i;

                                i++;
                            }
                            System.out.println("La suma es: " + suma);
                            break;

                        case 12:
                            System.out.println("Saliendo...");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opcion no valida, inicie nuevamente");
                            return;

                    }
                    break;
                case 8:
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("                           DO WHILE                                      ");
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("-                          1. Teoria                                    -");
                    System.out.println("-                          2. Practica                                  -");
                    System.out.println("-                          12. Salir                                    -");
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("Ingrese una sub opcion");

                    while (!scanner.hasNextInt()) {
                        System.out.println("La sub opcion que ingresaste no existe, intentalo nuevamente");
                        scanner.next();
                        System.out.println("Ingrese una sub opcion");
                    }
                    subOpcion = scanner.nextInt();
                    switch (subOpcion) {
                        case 1:
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("-                                                       TEORIA DO WHILE                                                     -");
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("-                                                                                                                           -");
                            System.out.println("- Es una estructura de control en programación que permite ejecutar un bloque de código al menos una vez y luego repetirlo  -");
                            System.out.println("- mientras se cumpla una condición específica.                                                                              -");
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                            break;

                        case 2:
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("-                               PRACTICA DO WHILE                       -");
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("-      Realizar la suma de los numero del 1 al 10.                      -");
                            System.out.println("-------------------------------------------------------------------------");


                            int suma = 0;
                            int i = 1;

                            do {
                                System.out.println("La suma en esta iteracion es: " + suma);
                                suma += i;

                                i++;

                            } while (i <= 10);


                            System.out.println("La suma total es: " + suma);
                            break;

                        case 12:
                            System.out.println("Saliendo...");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opcion no valida, inicie nuevamente");
                            return;
                    }
                    break;
                case 9:
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("                           FOR                                           ");
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("-                          1. Teoria                                    -");
                    System.out.println("-                          2. Practica                                  -");
                    System.out.println("-                          12. Salir                                    -");
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("Ingrese una sub opcion");

                    while (!scanner.hasNextInt()) {
                        System.out.println("La sub opcion que ingresaste no existe, intentalo nuevamente");
                        scanner.next();
                        System.out.println("Ingrese una sub opcion");
                    }
                    subOpcion = scanner.nextInt();
                    switch (subOpcion) {
                        case 1:
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("-                                                       TEORIA FOR                                                          -");
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("-                                                                                                                           -");
                            System.out.println("- Es una estructura de control de flujo que se utiliza para repetir un bloque de código un número específico de veces.      -");
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                            break;

                        case 2:
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("-                               PRACTICA FOR                            -");
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("-      Realizar la suma de los numero del 1 al 10.                      -");
                            System.out.println("-------------------------------------------------------------------------");


                            int suma = 0;

                            for (int i = 1; i <= 10; i++) {
                                suma += i;

                                System.out.println("La sumatoria de los numeros enteros entre 1 y 10 es " + suma);
                            }
                            break;

                        case 12:
                            System.out.println("Saliendo...");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opcion no valida, inicie nuevamente");
                            return;
                    }
                    break;
                case 10:
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("                           FOR EACH                                      ");
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("-                          1. Teoria                                    -");
                    System.out.println("-                          2. Practica                                  -");
                    System.out.println("-                          12. Salir                                    -");
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("Ingrese una sub opcion");

                    while (!scanner.hasNextInt()) {
                        System.out.println("La sub opcion que ingresaste no existe, intentalo nuevamente");
                        scanner.next();
                        System.out.println("Ingrese una sub opcion");
                    }
                    subOpcion = scanner.nextInt();
                    switch (subOpcion) {
                        case 1:
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("-                                                       TEORIA FOR EACH                                                     -");
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("-                                                                                                                           -");
                            System.out.println("- Es una estructura de control que se utiliza para iterar sobre los elementos de una colección o secuencia,                 -");
                            System.out.println("- como un arreglo, una lista o un conjunto.                                                                                 -");
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                            break;

                        case 2:
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("-                               PRACTICA FOR EACH                       -");
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("-      Listar los numero del 1 al 10.                                   -");
                            System.out.println("-------------------------------------------------------------------------");


                            //Suma de valores utilizando for each:

                            /*List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

                            int[] suma = {0};

                            numeros.forEach(numero -> suma[0] += numero);

                            System.out.println(suma[0]);*/

                            int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


                            for (int numero : numeros) {
                                System.out.println("Número: " + numero);


                            }
                            break;

                        case 12:
                            System.out.println("Saliendo...");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opcion no valida, inicie nuevamente");
                            return;
                    }
                    break;

                case 11:
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("                           TERNARIA                                      ");
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("-                          1. Teoria                                    -");
                    System.out.println("-                          2. Practica                                  -");
                    System.out.println("-                          12. Salir                                    -");
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("Ingrese una sub opcion");

                    while (!scanner.hasNextInt()) {
                        System.out.println("La sub opcion que ingresaste no existe, intentalo nuevamente");
                        scanner.next();
                        System.out.println("Ingrese una sub opcion");
                    }
                    subOpcion = scanner.nextInt();
                    switch (subOpcion) {
                        case 1:
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("-                                                       TEORIA TERNARIA                                                     -");
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("-                                                                                                                           -");
                            System.out.println("- Es una forma compacta de escribir una estructura if-else en una sola línea. Son útiles para asignar valores               -");
                            System.out.println("- o tomar decisiones simples de manera más concisa.                                                                         -");
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
                            break;

                        case 2:
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("-                               PRACTICA TERNARIA                       -");
                            System.out.println("-------------------------------------------------------------------------");
                            System.out.println("-                           a = 20                 b = 10               -");
                            System.out.println("-      Entre el valor de a y el valor de b. Cual es el numero mayor?    -");
                            System.out.println("-------------------------------------------------------------------------");

                            int a = 20;
                            int b = 10;
                            int mayor = (a > b) ? a : b;
                            System.out.println("El mayor es: " + mayor);

                            break;

                        case 12:
                            System.out.println("Saliendo...");

                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opcion no valida, inicie nuevamente");
                            return;
                    }
                    break;
                case 12:
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida, inicie nuevamente");
                    return;
            }
            break;


        }
        while (opcion <= 10);


    }

}




































