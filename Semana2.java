/*IV. Nivel avanzado
1) Realizar un programa para resolver el siguiente problema: Un granjero, un lobo, una
gallina y un saco de maíz deben cruzar el río. Para ello se dispone de un bote con una
capacidad de dos ocupantes, el hombre (el único que sabe remar) y otro. Si de un lado
del rio se quedan solos el lobo y la gallina, el lobo se come a la gallina. Si en una orilla se
quedan solos la gallina y el maíz, la gallina se come al maíz.*/

import java.util.Scanner;

//Realizar un programa para resolver el siguiente problema: Un granjero, un lobo, una
//gallina y un saco de maíz deben cruzar el río. Para ello se dispone de un bote con una
//capacidad de dos ocupantes, el hombre (el único que sabe remar) y otro. Si de un lado
//del rio se quedan solos el lobo y la gallina, el lobo se come a la gallina. Si en una orilla se
//quedan solos la gallina y el maíz, la gallina se come al maíz.

public class Ejercicio1NV {

    // Variables que representan el estado de cada objeto (1=lado inicial, 0=lado final)
    static int granjero = 1;
    static int lobo = 1;
    static int gallina = 1;
    static int maiz = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean resuelto = false;

        System.out.println("¡Bienvenido al problema del granjero, lobo, gallina y saco de maíz!");
        
        while (!resuelto) {
            mostrarEstado();
            System.out.println("¿Qué quieres mover con el granjero? (lobo/gallina/maiz/nada)");
            String decision = scanner.nextLine().toLowerCase();
            
            // Lógica de movimiento
            if (decision.equals("nada")) {
                moverGranjero();
            } else if (decision.equals("lobo") && lobo == granjero) {
                moverGranjero();
                moverLobo();
            } else if (decision.equals("gallina") && gallina == granjero) {
                moverGranjero();
                moverGallina();
            } else if (decision.equals("maiz") && maiz == granjero) {
                moverGranjero();
                moverMaiz();
            } else {
                System.out.println("Movimiento no válido o el objeto no está en el mismo lado que el granjero.");
            }
            
            // Comprobamos si se ha violado alguna restricción
            if (seVioloRegla()) {
                System.out.println("¡Regla violada! Has perdido.");
                mostrarEstado();
                break;
            }

            // Comprobamos si todos han cruzado al otro lado
            if (granjero == 0 && lobo == 0 && gallina == 0 && maiz == 0) {
                System.out.println("¡Felicitaciones! Has resuelto el problema.");
                resuelto = true;
            }
        }
        
        scanner.close();
    }

    // Función que muestra el estado actual
    public static void mostrarEstado() {
        System.out.println("Estado actual:");
        System.out.println("Granjero está en el lado: " + (granjero == 1 ? "Inicial" : "Final"));
        System.out.println("Lobo está en el lado: " + (lobo == 1 ? "Inicial" : "Final"));
        System.out.println("Gallina está en el lado: " + (gallina == 1 ? "Inicial" : "Final"));
        System.out.println("Maíz está en el lado: " + (maiz == 1 ? "Inicial" : "Final"));
    }

    // Funciones de movimiento
    public static void moverGranjero() {
        granjero = (granjero == 1) ? 0 : 1;
    }

    public static void moverLobo() {
        lobo = (lobo == 1) ? 0 : 1;
    }

    public static void moverGallina() {
        gallina = (gallina == 1) ? 0 : 1;
    }

    public static void moverMaiz() {
        maiz = (maiz == 1) ? 0 : 1;
    }

    // Comprobamos si se ha violado alguna regla
    public static boolean seVioloRegla() {
        // Si el granjero no está con la gallina y el lobo y la gallina están solos
        if (granjero != gallina && lobo == gallina) {
            System.out.println("¡El lobo se comió a la gallina!");
            return true;
        }
        // Si el granjero no está con la gallina y la gallina y el maíz están solos
        if (granjero != gallina && gallina == maiz) {
            System.out.println("¡La gallina se comió el maíz!");
            return true;
        }
        return false;
    }
}


/*2) Realizar un programa para resolver el siguiente problema: Clara, Luisa, María y Nélida
son cuatro mujeres que aman sus trabajos. Ellas trabajan como diseñadora de moda,
florista, jardinera y directora de orquesta. Cada mujer tiene un solo trabajo, y cada
trabajo es ocupado por una sola mujer. Con las siguientes pistas, encontrar el trabajo
realizado por cada mujer:
(a) Clara es violentamente alérgica a las plantas.
(b) Luisa y la florista comparten el departamento
(c) A María y Luisa les gusta solamente la música rock
(d) La jardinera, la diseñadora de modas y Nélida no se conocen entre sí
*/

public class Ejercicio2NV {
    
    public static void main(String[] args) {

        // Variables para almacenar los trabajos asignados a cada mujer
        String trabajoClara = "";
        String trabajoLuisa = "";
        String trabajoMaria = "";
        String trabajoNelida = "";

        // Pista (a): Clara es alérgica a las plantas, así que no puede ser ni florista ni jardinera
        // Clara será la diseñadora de moda o directora de orquesta.
        trabajoClara = "Directora de Orquesta"; // Lo veremos más adelante por descarte
        
        // Pista (b): Luisa y la florista comparten departamento, así que Luisa no es la florista.
        // Pista (c): María y Luisa solo escuchan rock, por lo tanto, ninguna puede ser la directora de orquesta.
        // Dado que Clara es la directora de orquesta y Luisa no es florista, Luisa será la diseñadora de moda.
        trabajoLuisa = "Diseñadora de Moda";
        
        // Pista (d): Nélida no se conoce con la jardinera ni con la diseñadora de modas, así que Nélida no puede tener estos trabajos.
        // Por lo tanto, Nélida será la florista.
        trabajoNelida = "Florista";
        
        // Finalmente, María será la jardinera porque es el único trabajo restante.
        trabajoMaria = "Jardinera";
        
        // Mostrar los resultados finales
        System.out.println("Asignación de trabajos:");
        System.out.println("Clara es: " + trabajoClara);
        System.out.println("Luisa es: " + trabajoLuisa);
        System.out.println("María es: " + trabajoMaria);
        System.out.println("Nélida es: " + trabajoNelida);
    }
}


/*3) Realizar un programa para resolver el siguiente problema: El Sr. Ido, el químico, tiene
seis frascos llenos de líquidos coloreados. Hay uno de cada color: rojo, anaranjado,
amarillo, verde, azul y violeta. El señor Ido sabe que algunos de esos líquidos son
tóxicos, pero no recuerda cuales...
Sin embargo, sí recuerda algunos datos. En cada uno de los siguientes pares de frascos
hay uno con veneno y otro no:
a) los frascos violeta y azul
b) los frascos rojo y amarillo
c) los frascos azul y anaranjado
El Sr. Ido recuerda también que en estos otros pares de frascos hay uno sin veneno:
d) el violeta y el amarillo
e) el rojo y el anaranjado
f) el verde y el azul

¡Ah! Casi lo olvido, añade el Sr. Ido, el líquido del frasco rojo no es venenoso. ¿Qué
frascos tienen veneno?*/

public class Ejercicio3NV {

    public static void main(String[] args) {
        // Declaramos los frascos: true = tiene veneno, false = no tiene veneno
        boolean rojo = false;       // El frasco rojo no tiene veneno, pista dada directamente
        boolean amarillo = false;
        boolean violeta = false;
        boolean azul = false;
        boolean verde = false;
        boolean anaranjado = false;
        
        // Pistas
        // Pista 1: Los frascos violeta y azul, uno tiene veneno, el otro no
        if (violeta == false) {
            azul = true;
        } else {
            azul = false;
        }

        // Pista 2: Los frascos rojo y amarillo, uno tiene veneno, el otro no
        if (rojo == false) {
            amarillo = true;
        } else {
            amarillo = false;
        }

        // Pista 3: Los frascos azul y anaranjado, uno tiene veneno, el otro no
        if (azul == true) {
            anaranjado = false;
        } else {
            anaranjado = true;
        }

        // Pista 4: En los frascos violeta y amarillo, uno no tiene veneno
        if (amarillo == true) {
            violeta = false;
        } else {
            violeta = true;
        }

        // Pista 5: En los frascos rojo y anaranjado, uno no tiene veneno
        if (rojo == false) {
            anaranjado = false;
        }

        // Pista 6: En los frascos verde y azul, uno no tiene veneno
        if (azul == true) {
            verde = false;
        } else {
            verde = true;
        }

        // Mostrar los resultados
        System.out.println("El frasco rojo tiene veneno: " + rojo);
        System.out.println("El frasco amarillo tiene veneno: " + amarillo);
        System.out.println("El frasco violeta tiene veneno: " + violeta);
        System.out.println("El frasco azul tiene veneno: " + azul);
        System.out.println("El frasco verde tiene veneno: " + verde);
        System.out.println("El frasco anaranjado tiene veneno: " + anaranjado);
    }
}


/*4) Realizar una calculadora en la cual se deberá ingresar una expresión, se analizará si la
expresión ingresada es válida y se resuelva dicha expresión. Las operaciones de la
calculadora son: Suma, resta, multiplicación, división, potenciación y radicación.*/

import java.util.*;

public class Ejercicio4NV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una expresión matemática ");
        String expresion = scanner.nextLine();
        
        try {
            double resultado = evaluarExpresion(expresion);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();
    }
    
    public static double evaluarExpresion(String expresion) {
        return new Object() {
            int pos = -1, ch;
            
            void nextChar() {
                ch = (++pos < expresion.length()) ? expresion.charAt(pos) : -1;
            }
            
            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }
            
            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < expresion.length()) throw new RuntimeException("Carácter inesperado: " + (char)ch);
                return x;
            }
            
            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm();
                    else if (eat('-')) x -= parseTerm();
                    else return x;
                }
            }
            
            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor();
                    else if (eat('/')) x /= parseFactor();
                    else return x;
                }
            }
            
            double parseFactor() {
                if (eat('+')) return parseFactor();
                if (eat('-')) return -parseFactor();
                
                double x;
                int startPos = this.pos;
                if (eat('(')) {
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(expresion.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') {
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = expresion.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else throw new RuntimeException("Función desconocida: " + func);
                } else {
                    throw new RuntimeException("Carácter inesperado: " + (char)ch);
                }
                
                if (eat('^')) x = Math.pow(x, parseFactor());
                
                return x;
            }
        }.parse();
    }
}

//Ejemplos de expresiones válidas:

//2 + 3 * 4
//(10 - 5) * 3
//2^3 + sqrt(16)
//10 / (2 + 3)

/*5) Se sabe que el operador << desplaza dos bits hacia la izquierda, por lo que si se realiza
por ejemplo 2<<2 se obtiene como resultado 8. Al hacer 2 << -2 el resultado es
-2147483648, y al hacer 12<<-2 el resultado es 0. ¿Por qué sucede esto?*/

public class Ejercicio5NV {
    public static void main(String[] args) {
        System.out.println("2 << 2  = " + (2 << 2));
        System.out.println("2 << -2 = " + (2 << -2));
        System.out.println("2 << 30 = " + (2 << 30));
        System.out.println("12 << -2 = " + (12 << -2));
        System.out.println("12 << 30 = " + (12 << 30));
        
        // Mostrando los 5 bits menos significativos de -2
        System.out.println("-2 & 0x1F = " + (-2 & 0x1F));

        /*este comportamiento aparentemente extraño se debe a cómo Java implementa el operador 
        de desplazamiento a la izquierda, considerando solo los 5 bits menos significativos 
        del segundo operando. Esto hace que los desplazamientos negativos se comporten de manera 
        inesperada si no se está familiarizado con esta implementación específica.*/
    }
}

/*b. Arreglos
 No se utilizan métodos
 Verificar siempre que el usuario ingresa el o los datos que se le piden de manera correcta.
*/
/*I. Nivel Inicial
1) Crear un programa que pida 10 números enteros al usuario, los guarde en un vector, y
finalmente muestre los datos del vector indicando los índices correspondientes a cada
valor.*/
import java.util.Scanner;

public class Ej1arreglos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[10];

        // Solicitar números al usuario
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        // Mostrar los datos del vector con sus índices
        System.out.println("\nDatos del vector:");
        System.out.println("Índice | Valor");
        System.out.println("-------|------");
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("%6d | %5d%n", i, vector[i]);
        }

        scanner.close();
    }
}


/*2) Crear un programa que llene un arreglo con los números enteros comprendidos entre 4
y 14, y luego lo muestre por consola indicando los índices correspondientes a cada
valor.*/

public class Ej2arreglos {
    public static void main(String[] args) {
        // Definir el tamaño del arreglo
        int tamano = 11; // Números del 4 al 14 (11 números en total)
        
        // Crear el arreglo
        int[] arreglo = new int[tamano];
        
        // Llenar el arreglo con los números del 4 al 14
        for (int i = 0; i < tamano; i++) {
            arreglo[i] = i + 4;
        }
        
        // Mostrar el arreglo por consola con sus índices
        System.out.println("Índice | Valor");
        System.out.println("-------|------");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("%6d | %5d%n", i, arreglo[i]);
        }
    }
}
/*3) Crear un programa que llene un arreglo con los números pares comprendidos entre 1 y
100 y luego los muestre por consola indicando los índices correspondientes a cada
valor.*/

public class Ej3arreglos {
    public static void main(String[] args) {
        // Calcular el tamaño del arreglo (50 números pares entre 1 y 100)
        int tamano = 50;
        
        // Crear el arreglo
        int[] arregloPares = new int[tamano];
        
        // Llenar el arreglo con números pares
        for (int i = 0; i < tamano; i++) {
            arregloPares[i] = (i + 1) * 2;
        }
        
        // Mostrar el arreglo por consola con sus índices
        System.out.println("Índice | Valor");
        System.out.println("-------|------");
        for (int i = 0; i < arregloPares.length; i++) {
            System.out.printf("%6d | %5d%n", i, arregloPares[i]);
        }
    }
}

/*4) Crear un programa que llene un arreglo con los números comprendidos entre 0 y 100
divisibles por 3 y luego los muestre por consola indicando los índices correspondientes
a cada valor.*/

public class Ej4arreglos {
    public static void main(String[] args) {
        // Calcular el tamaño del arreglo (34 números divisibles por 3 entre 0 y 100)
        int tamano = 34;
        
        // Crear el arreglo
        int[] arregloDivisibles = new int[tamano];
        
        // Llenar el arreglo con números divisibles por 3
        int numero = 0;
        for (int i = 0; i < tamano; i++) {
            arregloDivisibles[i] = numero;
            numero += 3;
        }
        
        // Mostrar el arreglo por consola con sus índices
        System.out.println("Índice | Valor");
        System.out.println("-------|------");
        for (int i = 0; i < arregloDivisibles.length; i++) {
            System.out.printf("%6d | %5d%n", i, arregloDivisibles[i]);
        }
    }
}

/*5) Crear un programa que llene un arreglo con cinco números enteros consecutivos y
haga una copia de ese arreglo en otro.*/

public class Ej5arreglos {
    public static void main(String[] args) {
        // Crear el primer arreglo
        int[] arregloOriginal = new int[5];
        
        // Llenar el arreglo con números enteros consecutivos
        // Empezaremos desde 1, pero puedes cambiar este valor inicial si lo deseas
        int valorInicial = 1;
        for (int i = 0; i < arregloOriginal.length; i++) {
            arregloOriginal[i] = valorInicial + i;
        }
        
        // Crear una copia del arreglo
        int[] arregloCopia = new int[arregloOriginal.length];
        for (int i = 0; i < arregloOriginal.length; i++) {
            arregloCopia[i] = arregloOriginal[i];
        }
        
        // Mostrar ambos arreglos para verificar
        System.out.println("Arreglo Original:");
        mostrarArreglo(arregloOriginal);
        
        System.out.println("\nArreglo Copia:");
        mostrarArreglo(arregloCopia);
    }
    
    // Método para mostrar un arreglo
    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Índice " + i + ": " + arr[i]);
        }
    }
}

/*6) Crear un programa que llene un arreglo con los veinte primeros números pares y
calcule su suma, informando el resultado.*/

public class Ej6arreglos {
    public static void main(String[] args) {
        // Crear el arreglo para los 20 primeros números pares
        int[] numerosPares = new int[20];
        
        // Llenar el arreglo con los 20 primeros números pares
        for (int i = 0; i < numerosPares.length; i++) {
            numerosPares[i] = (i + 1) * 2;
        }
        
        // Calcular la suma de los números en el arreglo
        int suma = 0;
        for (int numero : numerosPares) {
            suma += numero;
        }
        
        // Mostrar el arreglo y la suma
        System.out.println("Los 20 primeros números pares son:");
        for (int i = 0; i < numerosPares.length; i++) {
            System.out.println("Índice " + i + ": " + numerosPares[i]);
        }
        
        System.out.println("\nLa suma de estos números es: " + suma);
    }
}

//7) Crear un programa que solicite cinco números, los almacene en un arreglo y luego
//calcule el promedio de esos números informando el resultado.

import java.util.Scanner;

public class Ej7arreglos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];
        
        // Solicitar y almacenar los cinco números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next(); // Limpiar la entrada inválida
                System.out.print("Ingrese el número " + (i + 1) + ": ");
            }
            numeros[i] = scanner.nextDouble();
        }
        
        // Calcular la suma de los números
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }
        
        // Calcular el promedio
        double promedio = suma / numeros.length;
        
        // Mostrar los números ingresados y el promedio
        System.out.println("\nLos números ingresados son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        }
        
        System.out.printf("\nEl promedio de los números es: %.2f\n", promedio);
        
        scanner.close();
    }
}

//8) Crear un programa que tras asignar los números, -2, 5, 8, -9, 10, 15 y –4 a un arreglo
//calcule e informe, independientemente, la suma de los elementos positivos y la de los
//elementos negativos.

public class Ej8arreglos {
    public static void main(String[] args) {
        // Crear y asignar valores al arreglo
        int[] numeros = {-2, 5, 8, -9, 10, 15, -4};
        
        // Inicializar variables para las sumas
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        
        // Calcular las sumas
        for (int numero : numeros) {
            if (numero > 0) {
                sumaPositivos += numero;
            } else if (numero < 0) {
                sumaNegativos += numero;
            }
        }
        
        // Mostrar el arreglo original
        System.out.println("El arreglo original es:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        
        // Informar los resultados
        System.out.println("\nLa suma de los elementos positivos es: " + sumaPositivos);
        System.out.println("La suma de los elementos negativos es: " + sumaNegativos);
    }
}

//9) Crear un programa que almacene en un arreglo los números primos comprendidos
//entre 1 y 100, y luego los muestre por consola indicando los índices correspondientes a
//cada valor.

import java.util.ArrayList;

public class Ej9arreglos {
    public static void main(String[] args) {
        ArrayList<Integer> primos = new ArrayList<>();
        
        // Encontrar números primos entre 1 y 100
        for (int numero = 2; numero <= 100; numero++) {
            if (esPrimo(numero)) {
                primos.add(numero);
            }
        }
        
        // Convertir ArrayList a array
        int[] arregloPrimos = new int[primos.size()];
        for (int i = 0; i < primos.size(); i++) {
            arregloPrimos[i] = primos.get(i);
        }
        
        // Mostrar los números primos con sus índices
        System.out.println("Números primos entre 1 y 100:");
        System.out.println("Índice | Valor");
        System.out.println("-------|------");
        for (int i = 0; i < arregloPrimos.length; i++) {
            System.out.printf("%6d | %5d%n", i, arregloPrimos[i]);
        }
        
        System.out.println("\nTotal de números primos encontrados: " + arregloPrimos.length);
    }
    
    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

//10) Crear un programa que informe el número de vocales de una cadena introducida por el
//usuario.

import java.util.Scanner;

public class Ej10arreglos {
    public static void main(String[] args) {
        // Crear un escáner para recibir la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena
        System.out.println("Ingrese una cadena de texto:");
        String cadena = scanner.nextLine();

        // Convertir la cadena a minúsculas para evitar problemas con mayúsculas
        cadena = cadena.toLowerCase();

        // Inicializar contador de vocales
        int contadorVocales = 0;

        // Iterar sobre cada carácter de la cadena
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            // Verificar si el carácter es una vocal
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVocales++;
            }
        }

        // Mostrar el número total de vocales
        System.out.println("El número de vocales en la cadena es: " + contadorVocales);

        // Cerrar el escáner para evitar el error de fuga de recursos
        scanner.close();
    }
}


//11) Crear un programa que lea una cadena de caracteres introducida desde el teclado por
//el usuario y la muestre al revés.

import java.util.Scanner;

public class Ej11arreglos {
    public static void main(String[] args) {
        // Crear un escáner para recibir la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena
        System.out.println("Ingrese una cadena de texto:");
        String cadena = scanner.nextLine();

        // Crear una variable para almacenar la cadena invertida
        String cadenaInvertida = "";

        // Iterar sobre la cadena de forma inversa y construir la cadena invertida
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }

        // Mostrar la cadena invertida
        System.out.println("La cadena invertida es: " + cadenaInvertida);

        // Cerrar el escáner para evitar el error de fuga de recursos
        scanner.close();
    }
}


//12) Crear un programa que determine e informe si una cadena de caracteres introducida
//por el usuario es o no un palíndromo, es decir, una palabra que se lee igual al derecho
//que al revés.

import java.util.Scanner;

public class Ej12arreglos {
    public static void main(String[] args) {
        // Crear un escáner para recibir la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena
        System.out.println("Ingrese una cadena de texto:");
        String cadena = scanner.nextLine();

        // Eliminar espacios y convertir a minúsculas para comparar correctamente
        String cadenaLimpia = cadena.replaceAll("\\s+", "").toLowerCase();

        // Crear una variable para almacenar la cadena invertida
        String cadenaInvertida = "";

        // Iterar sobre la cadena de forma inversa y construir la cadena invertida
        for (int i = cadenaLimpia.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadenaLimpia.charAt(i);
        }

        // Comparar si la cadena original limpia es igual a la invertida
        if (cadenaLimpia.equals(cadenaInvertida)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }

        // Cerrar el escáner para evitar el error de fuga de recursos
        scanner.close();
    }
}


//13) Crear un programa en donde se almacenen los números del 1 al 100 en un vector, y se
//informe por consola los números pares e impares.

public class Ej13arreglos {
    public static void main(String[] args) {
        // Crear un arreglo para almacenar los números del 1 al 100
        int[] numeros = new int[100];

        // Llenar el arreglo con los números del 1 al 100
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        // Mostrar los números pares
        System.out.println("Números pares:");
        for (int i = 0; i < 100; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }

        // Salto de línea para separar la salida de los números impares
        System.out.println("\n");

        // Mostrar los números impares
        System.out.println("Números impares:");
        for (int i = 0; i < 100; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.print(numeros[i] + " ");
            }
        }
    }
}


//14) Crear un programa en donde se pida al usuario la dimensión del vector a crear, y luego
//se pida al mismo que ingrese números enteros correspondientes a cada posición del
//vector. Se debe ordenar el mismo en forma creciente y luego mostrar el vector
//ordenado indicando los índices correspondientes a cada valor.

import java.util.Arrays;
import java.util.Scanner;

public class Ej14arreglos {
    public static void main(String[] args) {
        // Crear un escáner para recibir la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la dimensión del vector
        System.out.println("Ingrese la dimensión del vector:");
        int dimension = scanner.nextInt();

        // Crear un arreglo con la dimensión indicada por el usuario
        int[] vector = new int[dimension];

        // Pedir al usuario que ingrese los números para cada posición del vector
        for (int i = 0; i < dimension; i++) {
            System.out.println("Ingrese el número para la posición " + i + ":");
            vector[i] = scanner.nextInt();
        }

        // Ordenar el vector en forma creciente
        Arrays.sort(vector);

        // Mostrar el vector ordenado con sus índices correspondientes
        System.out.println("Vector ordenado en forma creciente:");
        for (int i = 0; i < dimension; i++) {
            System.out.println("Índice " + i + ": " + vector[i]);
        }

        // Cerrar el escáner para evitar el error de fuga de recursos
        scanner.close();
    }
}


//15) Modificar el ejercicio anterior para calcular e informar el valor máximo y mínimo del
//vector.

import java.util.Arrays;
import java.util.Scanner;

public class Ej15arreglos {
    public static void main(String[] args) {
        // Crear un escáner para recibir la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la dimensión del vector
        System.out.println("Ingrese la dimensión del vector:");
        int dimension = scanner.nextInt();

        // Crear un arreglo con la dimensión indicada por el usuario
        int[] vector = new int[dimension];

        // Pedir al usuario que ingrese los números para cada posición del vector
        for (int i = 0; i < dimension; i++) {
            System.out.println("Ingrese el número para la posición " + i + ":");
            vector[i] = scanner.nextInt();
        }

        // Ordenar el vector en forma creciente
        Arrays.sort(vector);

        // Mostrar el vector ordenado con sus índices correspondientes
        System.out.println("Vector ordenado en forma creciente:");
        for (int i = 0; i < dimension; i++) {
            System.out.println("Índice " + i + ": " + vector[i]);
        }

        // Calcular e informar el valor máximo y mínimo del vector
        int valorMinimo = vector[0];
        int valorMaximo = vector[dimension - 1];

        System.out.println("\nEl valor mínimo es: " + valorMinimo);
        System.out.println("El valor máximo es: " + valorMaximo);

        // Cerrar el escáner para evitar el error de fuga de recursos
        scanner.close();
    }
}


//16) Modificar el ejercicio anterior para calcular e informar la cantidad de números
//negativos, positivos y ceros.

import java.util.Arrays;
import java.util.Scanner;

public class Ej16arreglos {
    public static void main(String[] args) {
        // Crear un escáner para recibir la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la dimensión del vector
        System.out.println("Ingrese la dimensión del vector:");
        int dimension = scanner.nextInt();

        // Crear un arreglo con la dimensión indicada por el usuario
        int[] vector = new int[dimension];

        // Variables para contar negativos, positivos y ceros
        int negativos = 0;
        int positivos = 0;
        int ceros = 0;

        // Pedir al usuario que ingrese los números para cada posición del vector
        for (int i = 0; i < dimension; i++) {
            System.out.println("Ingrese el número para la posición " + i + ":");
            vector[i] = scanner.nextInt();

            // Contar negativos, positivos y ceros
            if (vector[i] < 0) {
                negativos++;
            } else if (vector[i] > 0) {
                positivos++;
            } else {
                ceros++;
            }
        }

        // Ordenar el vector en forma creciente
        Arrays.sort(vector);

        // Mostrar el vector ordenado con sus índices correspondientes
        System.out.println("Vector ordenado en forma creciente:");
        for (int i = 0; i < dimension; i++) {
            System.out.println("Índice " + i + ": " + vector[i]);
        }

        // Calcular e informar el valor máximo y mínimo del vector
        int valorMinimo = vector[0];
        int valorMaximo = vector[dimension - 1];

        System.out.println("\nEl valor mínimo es: " + valorMinimo);
        System.out.println("El valor máximo es: " + valorMaximo);

        // Informar la cantidad de números negativos, positivos y ceros
        System.out.println("\nCantidad de números negativos: " + negativos);
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de ceros: " + ceros);

        // Cerrar el escáner para evitar el error de fuga de recursos
        scanner.close();
    }
}


//17) Crear un programa que mediante un menú permita consultar, asignar, modificar y
//eliminar datos de un vector de tipo entero de veinte posiciones. Para realizar las
//operaciones se debe ingresar la posición del vector a la cual se desea acceder.

import java.util.Scanner;

public class Ej17arreglos {
    public static void main(String[] args) {
        // Crear un vector de 20 posiciones
        int[] vector = new int[20];

        // Crear un escáner para recibir la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú de opciones
            System.out.println("\nMenú de operaciones sobre el vector:");
            System.out.println("1. Consultar valor en una posición");
            System.out.println("2. Asignar valor a una posición");
            System.out.println("3. Modificar valor en una posición");
            System.out.println("4. Eliminar valor en una posición");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Consultar valor en una posición
                    System.out.print("Ingrese la posición a consultar (0-19): ");
                    int posConsultar = scanner.nextInt();
                    if (esPosicionValida(posConsultar)) {
                        System.out.println("El valor en la posición " + posConsultar + " es: " + vector[posConsultar]);
                    } else {
                        System.out.println("Posición inválida. Debe ser un valor entre 0 y 19.");
                    }
                    break;

                case 2:
                    // Asignar valor a una posición
                    System.out.print("Ingrese la posición a asignar (0-19): ");
                    int posAsignar = scanner.nextInt();
                    if (esPosicionValida(posAsignar)) {
                        System.out.print("Ingrese el valor a asignar: ");
                        vector[posAsignar] = scanner.nextInt();
                        System.out.println("Valor asignado correctamente.");
                    } else {
                        System.out.println("Posición inválida. Debe ser un valor entre 0 y 19.");
                    }
                    break;

                case 3:
                    // Modificar valor en una posición
                    System.out.print("Ingrese la posición a modificar (0-19): ");
                    int posModificar = scanner.nextInt();
                    if (esPosicionValida(posModificar)) {
                        System.out.print("Ingrese el nuevo valor: ");
                        vector[posModificar] = scanner.nextInt();
                        System.out.println("Valor modificado correctamente.");
                    } else {
                        System.out.println("Posición inválida. Debe ser un valor entre 0 y 19.");
                    }
                    break;

                case 4:
                    // Eliminar valor en una posición (se asigna 0 como valor eliminado)
                    System.out.print("Ingrese la posición a eliminar (0-19): ");
                    int posEliminar = scanner.nextInt();
                    if (esPosicionValida(posEliminar)) {
                        vector[posEliminar] = 0;
                        System.out.println("Valor eliminado correctamente.");
                    } else {
                        System.out.println("Posición inválida. Debe ser un valor entre 0 y 19.");
                    }
                    break;

                case 5:
                    // Salir
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, elija una opción válida.");
            }

        } while (opcion != 5);

        // Cerrar el escáner
        scanner.close();
    }

    // Método para verificar si la posición es válida (entre 0 y 19)
    public static boolean esPosicionValida(int posicion) {
        return posicion >= 0 && posicion < 20;
    }
}


//18) Crear un programa que reciba los datos para rellenar un arreglo de 10 posiciones con
//números enteros, y que copie las últimas 5 posiciones en otro arreglo. Informar el
//arreglo resultante de la copia de valores indicando los índices correspondientes a cada
//valor.

import java.util.Scanner;

public class Ej18arreglos {
    public static void main(String[] args) {
        // Crear el escáner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear un arreglo de 10 posiciones
        int[] arregloOriginal = new int[10];

        // Pedir al usuario que ingrese los 10 números
        System.out.println("Ingrese 10 números enteros para llenar el arreglo:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Posición " + i + ": ");
            arregloOriginal[i] = scanner.nextInt();
        }

        // Crear un nuevo arreglo para copiar las últimas 5 posiciones
        int[] arregloCopia = new int[5];

        // Copiar las últimas 5 posiciones del arreglo original al nuevo arreglo
        for (int i = 0; i < 5; i++) {
            arregloCopia[i] = arregloOriginal[5 + i];
        }

        // Mostrar el arreglo resultante de la copia
        System.out.println("\nArreglo resultante de la copia (últimas 5 posiciones):");
        for (int i = 0; i < 5; i++) {
            System.out.println("Índice " + i + ": " + arregloCopia[i]);
        }

        // Cerrar el escáner
        scanner.close();
    }
}


//19) Crear un programa para leer por teclado la nota de N alumnos de una clase y
//almacenarlas en un vector. Calcular la nota promedio de la clase y mostrar los alumnos
//por encima del promedio.

import java.util.Scanner;

public class Ej19arreglos {
    public static void main(String[] args) {
        // Crear un escáner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de alumnos
        System.out.print("Ingrese la cantidad de alumnos: ");
        int N = scanner.nextInt();

        // Crear un arreglo para almacenar las notas de los alumnos
        double[] notas = new double[N];

        // Leer las notas de los alumnos
        System.out.println("Ingrese las notas de los alumnos:");
        for (int i = 0; i < N; i++) {
            System.out.print("Nota del alumno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Calcular la nota promedio
        double suma = 0;
        for (int i = 0; i < N; i++) {
            suma += notas[i];
        }
        double promedio = suma / N;
        System.out.println("\nLa nota promedio de la clase es: " + promedio);

        // Mostrar las notas de los alumnos por encima del promedio
        System.out.println("\nAlumnos con notas por encima del promedio:");
        for (int i = 0; i < N; i++) {
            if (notas[i] > promedio) {
                System.out.println("Alumno " + (i + 1) + " - Nota: " + notas[i]);
            }
        }

        // Cerrar el escáner
        scanner.close();
    }
}


//20) Crear un programa que pida ingresar los datos de N empleados. Por cada empleado se
//pide nombre y sueldo, que deben almacenar en dos vectores. Luego de eso calcular e
//informar el empleado con mayor sueldo.
import java.util.Scanner;

public class Ej20arreglos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de empleados: ");
        int n = 0;

        // Verificar que se ingrese un número válido
        while (true) {
            try {
                n = Integer.parseInt(scanner.nextLine());
                if (n <= 0) {
                    System.out.print("Por favor, ingrese un número mayor que 0: ");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Por favor, ingrese un número entero: ");
            }
        }

        String[] nombres = new String[n];
        double[] sueldos = new double[n];

        // Recopilar datos de los empleados
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();

            System.out.print("Ingrese el sueldo de " + nombres[i] + ": ");
            while (true) {
                try {
                    sueldos[i] = Double.parseDouble(scanner.nextLine());
                    if (sueldos[i] < 0) {
                        System.out.print("El sueldo no puede ser negativo. Intente de nuevo: ");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.print("Entrada inválida. Por favor, ingrese un número para el sueldo: ");
                }
            }
        }

        // Determinar el empleado con el mayor sueldo
        String empleadoMayorSueldo = nombres[0];
        double mayorSueldo = sueldos[0];

        for (int i = 1; i < n; i++) {
            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                empleadoMayorSueldo = nombres[i];
            }
        }

        // Informar el empleado con mayor sueldo
        System.out.println("El empleado con mayor sueldo es " + empleadoMayorSueldo + " con un sueldo de " + mayorSueldo);
        
        scanner.close();
    }
}
