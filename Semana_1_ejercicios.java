//1. Introducción a Java

//Test de autoevaluación
//1) ¿Qué es el código de ensamblaje y el programa traductor ensamblador?

/*El código de ensamblaje (o lenguaje ensamblador) es un lenguaje de programación de bajo nivel que está estrechamente 
relacionado con el código máquina, el cual es el conjunto de instrucciones ejecutables por un microprocesador.

El programa traductor ensamblador, o simplemente ensamblador, es una herramienta que traduce el código de ensamblaje 
a código máquina ejecutable por la computadora. */

//2) ¿Qué es la abstracción en informática?

/*La abstracción en informática es el proceso de simplificar un sistema complejo ocultando los detalles innecesarios 
y resaltando solo las características esenciales. Permite a los desarrolladores enfocarse en lo importante sin preocuparse 
por la complejidad subyacente.*/

//3) Explique los diferentes niveles de abstracción en lenguajes de programación y de algunos
//ejemplos de lenguajes por nivel de abstracción

/*
Los lenguajes de programación se clasifican en diferentes niveles de abstracción, que determinan cuánto se oculta 
la complejidad del hardware y qué tan cercanos están al lenguaje humano o al código máquina.

Niveles de Abstracción en Lenguajes de Programación:
Lenguajes de Bajo Nivel: Están cerca del hardware y ofrecen un control directo sobre los componentes del sistema. 
Requieren un conocimiento detallado del funcionamiento interno de la computadora.

Ejemplos:
Código Máquina: El nivel más bajo, compuesto de instrucciones binarias.
Ensamblador: Usa mnemónicos en lugar de código binario puro, como MOV, ADD.
Uso: Programación de microcontroladores, optimización extrema de recursos.

Lenguajes de Nivel Medio: Ofrecen un balance entre control del hardware y facilidad de uso. Permiten manipular la memoria y los registros, 
pero también utilizan estructuras más legibles.

Ejemplos:
C: Ofrece acceso a punteros y manipulación directa de memoria.
C++: Expande C con características de programación orientada a objetos.
Uso: Sistemas operativos, drivers, aplicaciones de alto rendimiento.

Lenguajes de Alto Nivel: Están diseñados para ser fáciles de leer y escribir, ocultando los detalles del hardware y gestionando la memoria automáticamente.

Ejemplos:
Python: Sintaxis simple, alto nivel de abstracción y gran cantidad de bibliotecas.
Java: Gestión automática de memoria y una sintaxis orientada a objetos.
Ruby, JavaScript: Fáciles de aprender y muy usados en desarrollo web.
Uso: Desarrollo de aplicaciones, software empresarial, scripting.

Lenguajes de Muy Alto Nivel (o Específicos de Dominio): Están diseñados para resolver problemas específicos con una sintaxis muy simple, 
escondiendo casi por completo los detalles de implementación.

Ejemplos:
SQL: Lenguaje específico para la manipulación de bases de datos.
MATLAB: Utilizado para cálculos matemáticos y simulaciones.
HTML/CSS: Usados para estructuración y diseño de páginas web.
Uso: Tareas específicas como consultas de datos, análisis matemático, diseño web.

Resumen:
Bajo Nivel: Control absoluto (Ensamblador).
Medio Nivel: Balance control/abstracción (C, C++).
Alto Nivel: Facilidad y productividad (Python, Java).
Muy Alto Nivel: Orientados a tareas específicas (SQL, HTML).
Cada nivel de abstracción ayuda a los programadores a enfocarse en la lógica del problema en lugar de los detalles de la implementación.
*/

//4) Defina interprete, compilador y explique la diferencia entre estos dos conceptos

/*
Un intérprete es un programa que ejecuta el código fuente de un lenguaje de programación línea por línea, 
traduciendo cada instrucción directamente al lenguaje máquina en tiempo de ejecución. No genera un archivo 
ejecutable separado; en cambio, traduce y ejecuta las instrucciones de inmediato.

Un compilador es un programa que traduce el código fuente completo de un lenguaje de programación a código máquina 
antes de su ejecución. Este proceso crea un archivo ejecutable independiente que puede ejecutarse sin necesidad del compilador.

Los intérpretes ofrecen flexibilidad y rapidez de desarrollo, 
mientras que los compiladores optimizan el rendimiento y crean programas ejecutables independientes.
*/

//5) ¿Qué es un paradigma de programación? Nombre algunos de ellos

/*
Un paradigma de programación es un enfoque o estilo fundamental que define cómo se estructura y 
organiza un programa y cómo se resuelven los problemas en programación. Los paradigmas influyen 
en la forma de pensar y de escribir el código, proporcionando distintos modelos de diseño y ejecución para los desarrolladores.

Principales Paradigmas de Programación:

Paradigma Imperativo: Se centra en describir cómo se debe ejecutar una tarea mediante instrucciones secuenciales que cambian el estado del programa.
Ejemplos de Lenguajes: C, Pascal, Fortran.

Paradigma Orientado a Objetos (POO): Se basa en la organización del código en objetos que combinan datos
y métodos para manipular esos datos. Facilita la reutilización y la modularidad del código.
Ejemplos de Lenguajes: Java, C++, Python.

Paradigma Declarativo: Describe qué se desea obtener sin especificar los pasos exactos para conseguirlo, dejando la ejecución al motor subyacente.
Ejemplos de Lenguajes: SQL (para bases de datos), Prolog.
*/

//6) Explique que es el paradigma orientado a objetos

/*
El paradigma orientado a objetos (POO) es un estilo de programación que organiza el software en objetos, 
los cuales son entidades que combinan datos y comportamientos en una estructura cohesiva. 
Este paradigma se centra en modelar componentes del mundo real o conceptos abstractos mediante clases y objetos, 
facilitando la reutilización, modularidad y mantenimiento del código.
*/

//7) ¿Cómo es que Java es tan popular en tecnologías webs, si cuando se creó el lenguaje no
//existía Internet tal y como se la conoce en la actualidad?

/*
Java se ha mantenido como uno de los lenguajes más populares en tecnologías web debido a una combinación de sus características técnicas, 
adaptabilidad, y el apoyo de la comunidad, a pesar de haber sido creado antes del auge de Internet.

Razones de la Popularidad de Java en Tecnologías Web: Independencia de la Plataforma ("Write Once, Run Anywhere"), seguridad Integrada,
bibliotecas, APIs amplias, ecosistema de frameworks, herramientas, adopción empresarial, soporte de grandes empresas,
evolución continua, adaptación, popularidad de las Applets en los 90s.
*/

//8) Liste las características más relevantes del lenguaje y desarrolle brevemente cada una de ellas

/*
Java es un lenguaje de programación muy utilizado por sus múltiples características que lo hacen adecuado para una amplia variedad de aplicaciones, 
especialmente en entornos empresariales y web. A continuación, se presentan las características más relevantes de Java:

Características de Java:

Independencia de Plataforma ("Write Once, Run Anywhere"): Java fue diseñado para ser independiente de la plataforma, 
lo que significa que el código escrito en Java puede ejecutarse en cualquier dispositivo con una Java Virtual Machine (JVM). 
Esto se logra compilando el código Java a un bytecode que la JVM puede interpretar en cualquier sistema operativo, como Windows, Linux o MacOS.

Orientado a Objetos: Java se basa en el paradigma de programación orientado a objetos, lo que facilita la creación de software modular, reutilizable y fácil de mantener. 
Los conceptos de clases, objetos, herencia, polimorfismo, encapsulamiento y abstracción son fundamentales en Java.

Multihilo: Java permite la ejecución de múltiples hilos de forma simultánea, lo que es crucial para desarrollar aplicaciones concurrentes
y de alto rendimiento, como servidores web y aplicaciones que manejan múltiples tareas al mismo tiempo.

Gestión Automática de Memoria (Garbage Collection): Java incluye un recolector de basura automático que gestiona la memoria liberando objetos
que ya no se utilizan. Esto reduce la probabilidad de errores como fugas de memoria y facilita el trabajo del programador, 
quien no necesita gestionar manualmente la memoria.
 
Seguridad: Java fue diseñado con seguridad en mente. La JVM proporciona un entorno seguro de ejecución,
impidiendo accesos no autorizados al sistema operativo y verificando el código antes de ejecutarlo. 

Robustez y Manejo de Errores: Java está diseñado para ser robusto y minimizar los errores en tiempo de ejecución. 
Su manejo de excepciones y chequeo de errores en tiempo de compilación permite a los desarrolladores identificar y corregir problemas 
antes de que el código se ejecute, mejorando la fiabilidad del software.

Sintaxis Simple y Familiar: Java se inspira en C++, pero simplifica muchos de sus aspectos complejos,
como la gestión de punteros, lo que facilita el aprendizaje y reduce los errores. Su sintaxis clara y
consistente lo hace accesible para principiantes y eficaz para programadores experimentados.

Portabilidad: Al ser independiente del hardware y del sistema operativo, Java garantiza que los programas sean altamente portables.
Además, los tipos de datos tienen un tamaño fijo, lo cual evita problemas de compatibilidad entre diferentes plataformas.

Rendimiento Mejorado: Aunque Java es interpretado por la JVM, tecnologías como Just-In-Time (JIT) Compilation permiten que el bytecode se convierta
en código máquina en tiempo de ejecución, mejorando significativamente el rendimiento.

Amplia Biblioteca Estándar (API): Java cuenta con una extensa biblioteca estándar que proporciona funcionalidades listas para usar, 
como estructuras de datos, manejo de archivos, redes, interfaces gráficas y mucho más, lo cual acelera el desarrollo y reduce 
la necesidad de escribir código desde cero.

Soporte para Redes y Distribución: Java está diseñado para aplicaciones en red, con soporte nativo para TCP/IP, HTTP y otros protocolos de red. 
Esto facilita la creación de aplicaciones distribuidas y servicios web.

Extensible y Escalable: Su arquitectura modular y capacidad de integración con otras tecnologías, hace que Java sea altamente extensible y escalable,
lo que lo hace ideal para aplicaciones empresariales y de gran tamaño.
*/

//9) ¿Cómo es que Java es multiplataforma y al mismo tiempo sus programas se ejecutan de
//una manera eficiente respecto al tiempo de ejecución?

/*
Java es multiplataforma gracias a su arquitectura de ejecución basada en la Java Virtual Machine (JVM),
y logra mantener una ejecución eficiente a través de diversas técnicas de optimización.

Java combina la independencia de plataforma gracias a la JVM con la eficiencia de ejecución mediante la compilación JIT y
otras optimizaciones en tiempo real. Esta arquitectura híbrida permite que los programas Java se ejecuten en cualquier
sistema operativo manteniendo un rendimiento competitivo con lenguajes compilados nativamente, lo que ha sido clave
en su popularidad y adopción en entornos de producción.
*/

//10) ¿Qué es y cómo funciona la máquina virtual de Java?

/*
La JVM es un componente esencial que permite la ejecución de programas Java en cualquier plataforma, 
gestionando memoria, seguridad y optimización del rendimiento en tiempo real. Gracias a su diseño, 
Java logra ser multiplataforma y eficiente, haciendo de la JVM una herramienta poderosa y versátil para el desarrollo de software.

La Máquina Virtual de Java (JVM) es una parte fundamental del entorno de ejecución de Java que permite que los programas escritos en Java 
(y otros lenguajes compatibles) se ejecuten de manera independiente del sistema operativo y del hardware subyacente.
La JVM es responsable de interpretar y ejecutar el bytecode generado por el compilador de Java, 
haciendo posible que un mismo programa funcione en cualquier plataforma que tenga una JVM instalada.
*/

//2. Elementos básicos del lenguaje

//Test de autoevaluación
//1) ¿Qué es un linker o cargador, y para qué sirve?

/*
Un linker (o cargador) es un programa que forma parte del proceso de construcción de software y 
tiene como función principal combinar varios módulos de código objeto (archivos que contienen código compilado) 
en un solo archivo ejecutable o biblioteca. El linker se encarga de resolver las referencias entre los módulos, 
ajustando direcciones y combinando diferentes partes del programa para que funcionen de manera coherente y puedan ser ejecutadas por la computadora.
*/

//2) ¿Cuáles son las tres zonas de memoria utilizadas por Java?

/*
Las tres zonas de memoria más relevantes utilizadas por la Java Virtual Machine (JVM) son:

Heap: Almacena objetos y estructuras dinámicas, gestionado por el Garbage Collector.
Stack: Gestiona variables locales y la secuencia de ejecución de métodos, específico por hilo.
Metaspace: Contiene los metadatos de las clases y la información de la JVM, con una gestión más eficiente y flexible que su predecesor, PermGen.
*/

//3) Explique para qué sirve la zona de memoria de datos

/*
En el contexto de la ejecución de programas, la zona de memoria de datos (también conocida como segmento de datos) es una región específica
de la memoria que se utiliza para almacenar variables y datos globales que el programa necesita durante su ejecución. 
Esta zona de memoria se encuentra en lenguajes de bajo nivel como C y C++, pero no es directamente gestionada en Java,
donde los datos se almacenan principalmente en el Heap y Stack.
*/

//4) Explique para qué sirve la zona de memoria conocida como pila o stack

/*
La zona de memoria conocida como pila o stack es esencial para la gestión de llamadas a métodos, 
almacenamiento de variables locales y datos temporales, y control del flujo de ejecución de un programa.
Su estructura LIFO y su gestión automática permiten un manejo eficiente y ordenado de la memoria durante la ejecución, 
aunque su tamaño limitado requiere una planificación cuidadosa para evitar errores de desbordamiento.
*/

//5) Explique para qué sirve la zona de memoria conocida como montículo o heap

/*
La zona de memoria conocida como heap es crucial para la gestión de memoria en aplicaciones que requieren almacenamiento dinámico de datos. 
Permite la creación y almacenamiento de objetos y datos que persisten durante la vida del programa y facilita la asignación y liberación de memoria 
en tiempo de ejecución. La gestión de la memoria en el heap puede ser automática (como en Java con el Garbage Collector) o manual (como en C/C++), 
y su manejo eficiente es esencial para el rendimiento y la estabilidad del programa.
*/

//6) ¿Qué es un atributo y de qué tipos de datos puede ser definido?

/*
En programación orientada a objetos, un atributo (también conocido como campo o propiedad) es una característica o propiedad de una clase que representa
un dato o estado asociado a los objetos de esa clase. Los atributos permiten que los objetos mantengan información relevante sobre su estado y 
comportamientos.

Tipos de Datos para Atributos.

Los atributos pueden ser definidos con una variedad de tipos de datos, que incluyen:

Tipos Primitivos:

Enteros: int, long, short, byte en Java; int, long, short, char en C/C++.
Punto Flotante: float, double en Java y C/C++.
Booleanos: boolean en Java; bool en C++.
Caracteres: char en Java y C/C++.

Tipos de Datos Compuestos:

Cadenas de Texto: String en Java; std::string en C++.
Arreglos: int[], String[] en Java; int[], std::vector en C++.
Estructuras: En C/C++, se pueden definir estructuras (struct) para agrupar diferentes tipos de datos. En Java, se utilizan clases para este propósito.
Listas y Colecciones: ArrayList, HashMap, Set en Java; std::vector, std::map, std::set en C++.

Tipos de Datos Personalizados:

Clases: Atributos pueden ser objetos de otras clases definidas por el usuario, permitiendo la creación de estructuras de datos más complejas. Ejemplo: un atributo puede ser un objeto de la clase Persona dentro de una clase Empresa.
Enumeraciones: enum en Java y C++ se utilizan para definir conjuntos de constantes relacionadas.
*/

//7) ¿Cuál es la diferencia entre tipos de datos primitivos y de referencia? Explique cada una de
//estas categorías

/*
Los tipos de datos primitivos son básicos, se almacenan directamente en la memoria, y son eficientes para operaciones simples. 
Los tipos de datos de referencia representan objetos más complejos, almacenan referencias a esos objetos en el heap, 
y permiten el uso de métodos y propiedades para manipular los datos. La distinción entre estas dos categorías es fundamental para entender 
cómo se gestionan y utilizan los datos en programación.

Características de los Tipos Primitivos:
Representación Directa: Los valores primitivos se almacenan directamente en la memoria, en una ubicación específica. No necesitan instanciarse como objetos.

Tamaño Fijo: Tienen un tamaño y un rango de valores específicos que son definidos por el lenguaje de programación. 
Por ejemplo, un int puede tener 32 bits en muchos lenguajes.

Velocidad y Eficiencia: Los tipos primitivos suelen ser más rápidos y eficientes en términos de rendimiento, 
ya que se manejan directamente por el hardware y no requieren gestión adicional.

No Soportan Métodos: No pueden tener métodos o propiedades asociadas, ya que son simplemente valores.

Ejemplos de Tipos Primitivos:
Java: int, char, float, double, boolean, byte, short, long.
C/C++: int, char, float, double, bool, short, long, unsigned.


Tipos de Datos de Referencia

Características de los Tipos de Referencia:

Referencia a Objetos: Los tipos de referencia almacenan una referencia (o dirección) a un objeto en la memoria, 
en lugar de almacenar el valor directamente. El objeto mismo contiene los datos y puede tener métodos asociados.

Tamaño Variable: El tamaño de un tipo de referencia no está definido de forma fija, 
ya que el tamaño de los objetos puede variar dependiendo de la cantidad de datos que contienen y la implementación del lenguaje.

Gestión de Memoria: Los objetos referenciados están almacenados en el heap (montículo) y deben ser gestionados manualmente en algunos 
lenguajes (como C++) o mediante Garbage Collection en otros (como Java).

Soporte para Métodos y Propiedades: Los tipos de referencia pueden tener métodos y propiedades que permiten 
operar sobre los datos que contienen. Esto permite la creación de clases con funcionalidades y comportamientos específicos.

Ejemplos de Tipos de Referencia:
Java: String, Array, List, Map, Custom Class Instances (instancias de clases definidas por el usuario).
C++: std::string, std::vector, std::map, User-defined classes, Pointers (que son referencias a objetos).
*/

//8) El tipo de dato String, ¿Es un tipo de dato primitivo o de referencia? Explique las
//particularidades correspondientes al mismo

/*
El tipo de dato String es un tipo de referencia que maneja cadenas de texto como objetos. A diferencia de los tipos primitivos, 
String permite operaciones más complejas y maneja su memoria de manera más avanzada. La inmutabilidad y los métodos asociados proporcionan 
una gran flexibilidad para trabajar con texto, mientras que su gestión de memoria a través del heap permite un uso eficiente en aplicaciones que 
manipulan cadenas.

¿Por Qué es un Tipo de Dato de Referencia?
Referencia a un Objeto: En lugar de almacenar el valor de la cadena de texto directamente, el tipo String almacena una referencia a un objeto 
que contiene los caracteres de la cadena. Esto significa que String maneja una instancia de una clase (o tipo de datos más complejo) que
encapsula la cadena.

Gestión de Memoria:El objeto String se almacena en el heap (montículo) y su memoria es gestionada por el lenguaje, 
ya sea mediante Garbage Collection (como en Java) o manualmente (como en C++ con std::string)
*/
 
//9) Qué es la conversión entre tipos de datos y en qué casos resultaría útil hacer este tipo de
//conversión. Detalle los problemas que pueden surgir al trabajar con conversiones

/*
La conversión entre tipos de datos es el proceso de transformar un valor de un tipo de dato a otro. 
Este proceso es fundamental en programación, ya que permite a los desarrolladores manipular y operar datos de diferentes tipos de manera coherente.

La conversión de tipos de datos puede ser implícita (automática) o explícita (manual):

Conversión Implícita:
Automática: El lenguaje de programación realiza la conversión automáticamente cuando es segura y no se pierde información. 
Por ejemplo, convertir un int a un float suele ser implícito en muchos lenguajes.

Conversión Explícita:
Manual: El programador debe solicitar explícitamente la conversión usando funciones o métodos específicos. 
Esto es necesario cuando la conversión no se puede realizar automáticamente o puede llevar a la pérdida de datos. 
Por ejemplo, convertir un float a un int a menudo requiere una conversión explícita para evitar la pérdida de la parte decimal.

Casos en los que Resulta Útil la Conversión

Interoperabilidad entre Tipos de Datos: Cuando se combinan o comparan datos de diferentes tipos. 
Por ejemplo, sumar un int con un float requiere convertir el int a float para realizar la operación correctamente.

Integración de Datos: Al integrar datos de diferentes fuentes que pueden usar distintos formatos. 
Por ejemplo, al leer datos de una base de datos (que puede devolver cadenas de texto) y convertir esos datos a tipos primitivos para cálculos.

Ajuste a Interfaces o Funciones:  Al pasar datos a funciones o métodos que esperan un tipo de dato específico. 
Por ejemplo, una función que acepta un double como argumento necesitará convertir un int si se le pasa uno.

Compatibilidad con APIs y Librerías: Al utilizar APIs o librerías que requieren tipos específicos. 
Convertir datos a tipos esperados por la API facilita su uso.

Problemas que Pueden Surgir al Trabajar con Conversión de Tipos

Pérdida de Datos:

Desbordamiento y Redondeo: Convertir un float a un int puede resultar en la pérdida de la parte decimal, 
y convertir un número grande a un tipo más pequeño puede causar desbordamiento. Ejemplo: convertir 3.14 a int resultará en 3, perdiendo la parte decimal.

Errores de Conversión:

Conversión Inválida: Intentar convertir tipos incompatibles, como una cadena de texto no numérica a un número, 
puede provocar errores en tiempo de ejecución. Ejemplo: convertir "abc" a un número entero dará error si el lenguaje no maneja bien la conversión.

Rendimiento y Eficiencia:

Sobrecarga: Conversión de tipos puede introducir una sobrecarga de rendimiento, especialmente si se realizan muchas conversiones en operaciones críticas.

Pérdida de Precisión:

Número de Puntos Flotantes: Convertir un double con alta precisión a float puede llevar a la pérdida de precisión. 
Ejemplo: convertir 1.23456789 a float puede resultar en 1.234568, perdiendo precisión en los dígitos después del punto decimal.

Problemas de Compatibilidad:

Diferencias de Representación: Diferentes lenguajes o sistemas pueden tener diferentes representaciones para tipos de datos similares, 
lo que puede causar problemas al convertir entre ellos.
*/

//10) Liste y explique las convenciones de escritura adoptado por el común denominador de
//programadores

/*
Las convenciones de escritura (o convenciones de codificación) son pautas y estándares que los programadores siguen para escribir código de manera clara, 
consistente y mantenible. Estas convenciones pueden variar ligeramente entre diferentes lenguajes de programación, 
pero muchas prácticas comunes se aplican universalmente. Aquí están algunas de las convenciones de codificación más adoptadas por los programadores:

1. Nombres de Variables y Funciones
CamelCase: Utilizado frecuentemente en lenguajes como Java y C#. El primer término comienza en minúscula y los siguientes términos comienzan con mayúscula. 
Ejemplo: nombreCompleto, calcularPromedio.

PascalCase: Similar al CamelCase, pero el primer término también comienza con mayúscula. 
Se usa comúnmente para nombres de clases en Java y C#. Ejemplo: MiClase, CuentaBancaria.

snake_case: Los términos están separados por guiones bajos y todos los caracteres son minúsculas. 
Se usa a menudo en Python y C++. Ejemplo: nombre_completo, calcular_promedio.

UPPER_CASE: Utilizado para constantes o valores que no cambian. Todos los caracteres están en mayúscula y las palabras están separadas por guiones bajos. 
Ejemplo: MAX_VALUE, DEFAULT_TIMEOUT.

2. Indentación y Espaciado
Indentación: Usualmente, se usa una cantidad consistente de espacios (a menudo 2 o 4) o una tabulación para indentar el código. 
Esto mejora la legibilidad y organiza el código en bloques. La elección entre espacios y tabulaciones puede depender del equipo o del proyecto.

Espaciado: Se recomienda usar espacios en blanco para separar operadores, paréntesis, y otras estructuras para mejorar la legibilidad. Ejemplo:

int resultado = a + b * c;

3. Comentarios
Comentarios en Línea: Usados para explicar una línea específica de código. Comienzan con // en lenguajes como Java y C++, o # en Python. Ejemplo:

int resultado = a + b; // Sumar a y b

Comentarios de Bloque: Utilizados para describir secciones o bloques de código más grandes. En Java y C++, se escriben entre /* y */. 
//En Python, se utilizan triple comillas """ o '''. Ejemplo:

 /* Este método calcula la suma de dos números.*/
 
//public int sumar(int a, int b) {
//  return a + b;
//}
/* 4. Estructuración del Código

Funciones y Métodos: Deben ser cortos y realizar una sola tarea. Se recomienda tener un método para cada funcionalidad específica y 
evitar métodos demasiado largos.

Clases y Módulos: Deben ser organizados de manera que cada clase o módulo tenga una sola responsabilidad. 
Esto facilita el mantenimiento y la escalabilidad del código.

5. Convenciones de Archivo y Estructura del Proyecto

Nombres de Archivos: Los nombres de archivos suelen seguir el mismo estilo que las clases o módulos que contienen. 
Ejemplo: MiClase.java para una clase MiClase en Java.

Estructura del Proyecto: Los proyectos suelen tener una estructura de directorios consistente para separar diferentes tipos de archivos, 
como src para el código fuente, tests para pruebas, y docs para documentación.

6. Manejo de Errores y Excepciones

Manejo de Excepciones: Utilizar bloques try-catch o mecanismos equivalentes para manejar errores y excepciones de manera adecuada, 
asegurando que los errores sean gestionados y no causen fallos inesperados en el programa.
7. Estilo de Código

Longitud de Línea: Se recomienda mantener la longitud de las líneas de código dentro de un límite razonable 
(por ejemplo, 80 o 120 caracteres) para mejorar la legibilidad en editores y herramientas de revisión de código.

Consistencia: Mantener un estilo de codificación consistente en todo el proyecto es crucial para la legibilidad y mantenimiento del código.
*/

//PROGRAMACIÓN SOBRE REDES | EJERCICIOS DE EVALUACIÓN

//Ejercicios

public class Ejercicio1 {
    public static void main(String[] args) {
        int x = -1 + 5 / 3 % 2 * 5 + 7 * 2 + 1;
         System.out.println("El valor de x es: " + x); //x = 19
    }
}
//2) Indique el valor de x = -1 + (5 /3) % 2 * (5 + 7) * 2 + 1
public class Ejercicio2 {
    public static void main(String[] args) {
        double x = -1 + (5 / 3.0) % 2 * (5 + 7) * 2 + 1;
        System.out.println("El valor de x es: " + x); //x = 40
    }
}
//3) Indique el valor de x = 3 > 2 && 6 < 10 ^ true
public class Ejercicio3 {
    public static void main(String[] args) {
        boolean x = (3 > 2) && (6 < 10) ^ true;
        System.out.println("El valor de x es: " + x);//El valor de x es: false
    }
}
//4) Se poseen 4 atributos:
//  a de tipo short
//  b de tipo long
//  c de tipo float
//  d de tipo String
//Escriba los pasos necesarios para guardar:
// a en b
// b en c
// c en d
// d en a
public class Ejercicio4 {
    public static void main(String[] args) {
        // Declaración de variables
        short a = 10;
        long b;
        float c;
        String d;
        
        //Guardar a en b
        b = a;  //Conversión implícita de short a long
        
        //Guardar b en c
        c = b;  //Conversión implícita de long a float
        
        //Guardar c en d
        d = String.valueOf(c);  //Conversión explícita de float a String
        
        //Guardar d en a
        a = Short.parseShort(d);  //Conversión explícita de String a short
        
        //Resultados
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
        System.out.println("Valor de c: " + c);
        System.out.println("Valor de d: " + d);
    }
}
//5) Indique el valor de que tendrá x si se tiene que:
// 1 x = 5;
// 2
// x *= x%2*3+2;
public class Ejercicio5 {
    public static void main(String[] args) {
        int x = 5;
        x *= x % 2 * 3 + 2;
        System.out.println("El valor de x es: " + x);//El valor de x es 25
    }
}
//6) Indique el valor que tendrá x en cada una de las líneas
// 1 x = 1;
// 2 ++x;
// 3 x += x++;
// 4 --x;
public class Ejercicio6 {
    public static void main(String[] args) {
        //Línea 1
        int x = 1;    //x = 1

        //Línea 2
        ++x;          //x = 2 

        //Línea 3
        x += x++;     //x = 2 + 2, pero luego de la operación, x se incrementa a 3

        //Línea 4
        --x;          //x = 2 (resta 1 antes de usar el valor)

        //Imprimir el valor final de x
        System.out.println("El valor final de x es: " + x);//el valor de x es 3
    }
}

//7) Indique el valor resultante de cada una de las líneas
// 1 !(true ^ 10 > 5) & !(!true || !(false ^ false))
// 2 (10 < 5) && (false) || (false == true) ^ 8.3f >= 8.3f
// 3 5 < 11 ^ 5 > 15 | 2 == 2 & false ^ !true ^ 10 <= 10
// 4 !(true && true || false ^ !(4==3) & 3 > 1 ^ !true)
public class Ejercicio7 {
    public static void main(String[] args) {
        // Línea 1
        boolean resultado1 = !(true ^ 10 > 5) & !(!true || !(false ^ false));
        System.out.println("Resultado de la línea 1: " + resultado1);

        // Línea 2
        boolean resultado2 = (10 < 5) && (false) || (false == true) ^ 8.3f >= 8.3f;
        System.out.println("Resultado de la línea 2: " + resultado2);

        // Línea 3
        boolean resultado3 = 5 < 11 ^ 5 > 15 | 2 == 2 & false ^ !true ^ 10 <= 10;
        System.out.println("Resultado de la línea 3: " + resultado3);

        // Línea 4
        boolean resultado4 = !(true && true || false ^ !(4 == 3) & 3 > 1 ^ !true);
        System.out.println("Resultado de la línea 4: " + resultado4);
    }
}/*
Resultado de la línea 1: false
Resultado de la línea 2: true
Resultado de la línea 3: true
Resultado de la línea 4: false
*/
// PROGRAMACIÓN SOBRE REDES | EJERCICIOS DE EVALUACIÓN
//8) Indique el valor resultante de cada una de las líneas

// 1 int i = 43;
// 2 int mascara = 32;
// 3 int bit = i & mascara;
// 4 bit >>= 5;
// 5 mascara ^= 1;
// 6 bit |= i & mascara;
// 7 bit <<= 1;
// 8 mascara &= (~bit) >>> 3;
// 9 bit += (~(~0)<<1);
// 10 mascara += bit + i;
public class Ejercicio8 {
    public static void main(String[] args) {
        //Línea 1
        int i = 43;                 //Valor inicial de i: 43 (en binario: 101011)

        //Línea 2
        int mascara = 32;           //Valor inicial de mascara: 32 (en binario: 00100000)

        //Línea 3
        int bit = i & mascara;      //bit = 43 & 32 -> 00101011 & 00100000 = 00100000 (bit = 32)

        //Línea 4
        bit >>= 5;                  //bit = 32 >> 5 -> 00100000 (32) >> 5 = 00000001 (bit = 1)

        //Línea 5
        mascara ^= 1;               //mascara ^= 1 -> 00100000 ^ 00000001 = 00100001 (mascara = 33)

        //Línea 6
        bit |= i & mascara;         //bit |= 43 & 33 -> 00000001 | (00101011 & 00100001 = 00100001) = 00100001 (bit = 33)

        //Línea 7
        bit <<= 1;                  //bit <<= 1 -> 00100001 << 1 = 01000010 (bit = 66)

        //Línea 8
        mascara &= (~bit) >>> 3;    //mascara &= (~66) >>> 3 -> mascara &= (10111101) >>> 3 = 00010111 (mascara = 1)

        //Línea 9
        bit += (~(~0) << 1);        //bit += (~(~0) << 1) -> bit += (11111111 << 1 = 11111110) -> bit += -2 (bit = 66 + (-2) = 64)

        //Línea 10
        mascara += bit + i;         //mascara += 64 + 43 -> mascara = 1 + 64 + 43 = 108

        //Imprimir resultados finales
        System.out.println("Valor final de bit: " + bit);         //bit = 66
        System.out.println("Valor final de mascara: " + mascara); //mascara = 142
    }
}

// 9) Leyendo los códigos correspondientes de la tabla de código ASCII descifre el mensaje

// 1 String mensaje;
// 2 char caracter;
// 3 int encriptado = 79 >> 2;
// 4
// 5 encriptado = (~((-160) >> 3) << 2) + 3;
// 6 caracter = (char) encriptado;
// 7 mensaje = String.valueOf(caracter);
// 8
// 9 encriptado = (((encriptado >> 1 ) ^ 30) << 1) -7;
// 10 caracter = (char) encriptado;
// 11 mensaje += String.valueOf(caracter);

/*
Línea 3: int encriptado = 79 >> 2;

79 >> 2 = 19
El carácter ASCII 19 no es imprimible, así que no forma parte del mensaje final.


Línea 5: encriptado = (~((-160) >> 3) << 2) + 3;

(-160) >> 3 = -20
~(-20) = 19
19 << 2 = 76
76 + 3 = 79
El carácter ASCII 79 es 'O'


Líneas 6-7: Aquí se convierte 79 a carácter y se añade a mensaje.
El mensaje hasta ahora es: "O"
Línea 9: encriptado = (((encriptado >> 1 ) ^ 30) << 1) -7;

79 >> 1 = 39
39 ^ 30 = 57
57 << 1 = 114
114 - 7 = 107
El carácter ASCII 107 es 'k'


Líneas 10-11: Se convierte 107 a carácter y se añade a mensaje.

El mensaje final es: "Ok"

*/


/*10) Si un color está representado por un entero en el cual, el byte más significativo
corresponde al canal rojo, y los 3 bytes siguientes corresponden a los canales verde,
azul y alfa respectivamente, genere un algoritmo que separe los valores rojo, verde,
azul y alfa, y los guarde en cuatro atributos que correspondan a estos.
Luego averigüe estos valores para el siguiente color:*/
//2295136255
/*Para realizar este ejercicio debe utilizar operadores de bit.
Tabla de caracteres y símbolos ASCII*/
public class Ejercicio10 {
    public static void main(String[] args) {
        // El valor del color proporcionado (2295136255 en decimal)
        long color = 2295136255L;  // Cambiado de int a long y añadido el sufijo 'L'

        // Descomponer en los canales utilizando operaciones de bit
        int rojo = (int)((color >> 24) & 0xFF);  // Desplazamos 24 bits a la derecha y aplicamos máscara de 8 bits
        int verde = (int)((color >> 16) & 0xFF); // Desplazamos 16 bits y aplicamos máscara de 8 bits
        int azul = (int)((color >> 8) & 0xFF);   // Desplazamos 8 bits y aplicamos máscara de 8 bits
        int alfa = (int)(color & 0xFF);          // Aplicamos máscara de 8 bits directamente al valor de alfa

        // Imprimir los valores de los canales
        System.out.println("Rojo: " + rojo);
        System.out.println("Verde: " + verde);
        System.out.println("Azul: " + azul);
        System.out.println("Alfa: " + alfa);
    }
}
/*
Rojo: 136
Verde: 204
Azul: 255
Alfa: 255
*/
/*
3. Estructuras, arreglos y excepciones

a. Estructuras
 No se utilizan vectores
 No se utilizan métodos
 Verificar siempre que el usuario ingresa el o los datos que se le piden de manera correcta.

I. Nivel Inicial
1) Crear un programa que muestre por consola la frase “Hola mundo”.*/
public class Ejercicio3p1 {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
    }
}//"Hola mundo"
//2) Crear un programa que pida al usuario nombre y apellido y los muestre por consola.
import java.util.Scanner;

public class Ejercicio3p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre, apellido;

        System.out.print("Por favor, ingrese su nombre: ");
        nombre = scanner.nextLine().trim();
        while (nombre.isEmpty()) {
            System.out.print("El nombre no puede estar vacío. Ingrese su nombre: ");
            nombre = scanner.nextLine().trim();
        }

        System.out.print("Por favor, ingrese su apellido: ");
        apellido = scanner.nextLine().trim();
        while (apellido.isEmpty()) {
            System.out.print("El apellido no puede estar vacío. Ingrese su apellido: ");
            apellido = scanner.nextLine().trim();
        }

        System.out.println("Nombre y apellido ingresados: " + nombre + " " + apellido);

        scanner.close();
    }
}
//PROGRAMACIÓN SOBRE REDES | EJERCICIOS DE EVALUACIÓN
//3) Crear un programa que pida al usuario dos números enteros, y que imprima la suma,
//producto, diferencia, cociente y resto de los números.
import java.util.Scanner;

public class Ejercicio3p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2;

        // Pedir y validar el primer número
        while (true) {
            System.out.print("Ingrese el primer número entero: ");
            if (scanner.hasNextInt()) {
                numero1 = scanner.nextInt();
                break;
            } else {
                System.out.println("Error: Debe ingresar un número entero.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }

        // Pedir y validar el segundo número
        while (true) {
            System.out.print("Ingrese el segundo número entero: ");
            if (scanner.hasNextInt()) {
                numero2 = scanner.nextInt();
                if (numero2 != 0) {
                    break;
                } else {
                    System.out.println("Error: El segundo número no puede ser cero (para evitar división por cero).");
                }
            } else {
                System.out.println("Error: Debe ingresar un número entero.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }

        // Realizar y mostrar las operaciones
        System.out.println("Suma: " + (numero1 + numero2));
        System.out.println("Producto: " + (numero1 * numero2));
        System.out.println("Diferencia: " + (numero1 - numero2));
        System.out.println("Cociente: " + ((double) numero1 / numero2));
        System.out.println("Resto: " + (numero1 % numero2));

        scanner.close();
    }
}
//4) Crear un programa que pida al usuario dos números enteros y que imprima un mensaje
//indicando si el primer número es mayor, menor o igual al segundo.
import java.util.Scanner;

public class Ejercicio3p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2;

        System.out.print("Ingrese el primer número entero: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor, ingrese un número entero válido: ");
            scanner.next();
        }
        numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor, ingrese un número entero válido: ");
            scanner.next();
        }
        numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("El primer número es mayor que el segundo.");
        } else if (numero1 < numero2) {
            System.out.println("El primer número es menor que el segundo.");
        } else {
            System.out.println("El primer número es igual al segundo.");
        }

        scanner.close();
    }
}
//5) Crear un programa que pida al usuario tres números enteros y muestre la suma,
//promedio, producto, menor y mayor de esos números.
import java.util.Scanner;

public class Ejercicio3p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;

        // Ingresar y validar los tres números
        num1 = ingresarNumero(scanner, "Ingrese el primer número entero: ");
        num2 = ingresarNumero(scanner, "Ingrese el segundo número entero: ");
        num3 = ingresarNumero(scanner, "Ingrese el tercer número entero: ");

        // Calcular resultados
        int suma = num1 + num2 + num3;
        double promedio = suma / 3.0;
        long producto = (long) num1 * num2 * num3;
        int menor = Math.min(Math.min(num1, num2), num3);
        int mayor = Math.max(Math.max(num1, num2), num3);

        // Mostrar resultados
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Producto: " + producto);
        System.out.println("Menor: " + menor);
        System.out.println("Mayor: " + mayor);

        scanner.close();
    }

    private static int ingresarNumero(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Por favor, ingrese un número entero válido.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }
    }
}
//6) Crear un programa que pida al usuario cinco números enteros y que determine e
//imprima los enteros mayor y menor en el grupo.
import java.util.Scanner;

public class MayorMenorCincoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mayor, menor, numero;

        // Pedir y leer el primer número
        System.out.print("Ingrese el primer número entero: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor, ingrese un número entero válido: ");
            scanner.next();
        }
        numero = scanner.nextInt();
        mayor = menor = numero;

        // Pedir y comparar los siguientes cuatro números
        for (int i = 2; i <= 5; i++) {
            System.out.print("Ingrese el número entero #" + i + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("Por favor, ingrese un número entero válido: ");
                scanner.next();
            }
            numero = scanner.nextInt();

            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        // Imprimir resultados
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        scanner.close();
    }
}
//7) Crear un programa que informe si un número ingresado es par o impar.
import java.util.Scanner;

public class Ejercicio3p7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Pedir y validar el número
        System.out.print("Ingrese un número entero: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor, ingrese un número entero válido: ");
            scanner.next(); // Limpiar el buffer del scanner
        }
        numero = scanner.nextInt();

        // Determinar si es par o impar
        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }

        scanner.close();
    }
}
//8) Crear un programa que pida dos números enteros al usuario, y que informe si el
//primero es un múltiplo del segundo o no.
import java.util.Scanner;

public class Ejercicio3p8 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario los dos números
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        // Verificar si el segundo número es diferente de 0 para evitar división por cero
        if (num2 != 0) {
            // Verificar si num1 es múltiplo de num2
            if (num1 % num2 == 0) {
                System.out.println(num1 + " es múltiplo de " + num2);
            } else {
                System.out.println(num1 + " no es múltiplo de " + num2);
            }
        } else {
            System.out.println("El segundo número no puede ser cero.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
//9) Crear un programa que reciba cinco números, y que determine e imprima la cantidad
//de números negativos, positivos, y la cantidad de ceros recibidos.
import java.util.Scanner;

public class Ejercicio3p9 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Inicializar contadores para los números positivos, negativos y ceros
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        // Solicitar al usuario cinco números
        System.out.println("Ingrese cinco números:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            // Clasificar el número como positivo, negativo o cero
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        // Imprimir la cantidad de positivos, negativos y ceros
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
//10) Crear un programa que muestre los primeros 100 números pares.
public class Ejercicio3p10 {
    public static void main(String[] args) {
        // Inicializamos una variable contador para los números pares
        int contador = 0;

        // Recorremos desde el número 1 hasta encontrar los primeros 100 números pares
        for (int i = 1; contador < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);  // Mostrar el número par
                contador++;             // Incrementar el contador de pares
            }
        }
    }
}
//11) Crear un programa que calcule e informe el valor de n para el cual la siguiente suma
//excede a un valor x: 1 + 2 + 3 + 4 + ... + n. Por ejemplo para un x = 20, el número que
//excede es n = 6, ya que 1 + 2 + 3 + 4 + 5 + 6 = 21.
import java.util.Scanner;

public class Ejercicio3p11 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el valor de x
        System.out.print("Ingrese el valor de x: ");
        int x = scanner.nextInt();

        // Inicializar variables
        int suma = 0;
        int n = 0;

        // Realizar la suma hasta que exceda el valor de x
        while (suma <= x) {
            n++;        // Incrementar n
            suma += n;  // Sumar n a la suma total
        }

        // Imprimir el resultado
        System.out.println("El valor de n para el cual la suma excede " + x + " es: " + n);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
//12) Crear un programa que imprima los primeros 100 números naturales y la suma de los
//mismos.
public class Ejercicio3p12 {
    public static void main(String[] args) {
        // Inicializar la suma en 0
        int suma = 0;

        // Imprimir los primeros 100 números naturales y sumarlos
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);  // Imprimir el número
            suma += i;              // Sumar el número a la suma total
        }

        // Imprimir la suma total de los primeros 100 números
        System.out.println("La suma de los primeros 100 números naturales es: " + suma);
    }
}
//13) Crear un programa que determine e informe los primeros n números primos,
//comenzando de un número x. Se debe leer x y n.
import java.util.Scanner;

public class Ejercicio3p13 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el valor de x y n
        System.out.print("Ingrese el valor de x (número inicial): ");
        int x = scanner.nextInt();
        
        System.out.print("Ingrese el valor de n (cantidad de números primos): ");
        int n = scanner.nextInt();

        // Inicializar un contador para contar cuántos números primos hemos encontrado
        int contadorPrimos = 0;
        
        // Variable para iterar sobre los números a partir de x
        int numeroActual = x;

        // Mientras no hayamos encontrado n números primos
        while (contadorPrimos < n) {
            if (esPrimo(numeroActual)) {
                System.out.println(numeroActual);  // Imprimir el número primo
                contadorPrimos++;  // Incrementar el contador de números primos
            }
            numeroActual++;  // Ir al siguiente número
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;  // Los números menores que 2 no son primos
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;  // Si es divisible por algún número, no es primo
            }
        }
        return true;  // Si no es divisible por ningún número, es primo
    }
}

//14) Crear un programa que pida al usuario ingresar un carácter, y dado este, informar si es
//una vocal o no.
import java.util.Scanner;

public class Ejercicio3p14 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un carácter
        System.out.print("Ingrese un carácter: ");
        char caracter = scanner.next().toLowerCase().charAt(0);  // Convertir a minúscula

        // Verificar si el carácter es una vocal
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
            System.out.println("El carácter ingresado es una vocal.");
        } else {
            System.out.println("El carácter ingresado NO es una vocal.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

//15) Crear un programa que dado un carácter determine e informe si este es un dígito entre
//0 y 9.
import java.util.Scanner;

public class Ejercicio3p15 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un carácter
        System.out.print("Ingrese un carácter: ");
        char caracter = scanner.next().charAt(0);

        // Verificar si el carácter es un dígito entre 0 y 9
        if (caracter >= '0' && caracter <= '9') {
            System.out.println("El carácter ingresado es un dígito entre 0 y 9.");
        } else {
            System.out.println("El carácter ingresado NO es un dígito entre 0 y 9.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
//16) Crear un programa que multiplique dos números por medio de sumas sucesivas e
//informe el resultado.
import java.util.Scanner;

public class Ejercicio3p16 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los dos números
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        // Inicializar el resultado en 0
        int resultado = 0;

        // Multiplicar usando sumas sucesivas
        for (int i = 0; i < Math.abs(num2); i++) {
            resultado += num1;
        }

        // Si el segundo número es negativo, hacer el resultado negativo
        if (num2 < 0) {
            resultado = -resultado;
        }

        // Informar el resultado
        System.out.println("El resultado de la multiplicación es: " + resultado);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
//17) Crear un programa que divida dos números por medio de restas sucesivas e informe el
//resultado.
import java.util.Scanner;

public class Ejercicio3p17 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los dos números
        System.out.print("Ingrese el dividendo: ");
        int dividendo = scanner.nextInt();
        
        System.out.print("Ingrese el divisor: ");
        int divisor = scanner.nextInt();

        // Validar que el divisor no sea cero
        if (divisor == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return;
        }

        // Inicializar variables para el cociente y resto
        int cociente = 0;
        int resto = Math.abs(dividendo);

        // Realizar restas sucesivas
        while (resto >= Math.abs(divisor)) {
            resto -= Math.abs(divisor);
            cociente++;
        }

        // Ajustar el signo del cociente si uno de los números es negativo, pero no ambos
        if ((dividendo < 0 && divisor > 0) || (dividendo > 0 && divisor < 0)) {
            cociente = -cociente;
        }

        // Informar el resultado
        System.out.println("El cociente es: " + cociente);
        System.out.println("El resto es: " + resto);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
//18) Crear un programa que cuente e informe la cantidad de un número entero que ingrese
//el usuario.
import java.util.Scanner;

public class Ejercicio3p18 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Contar la cantidad de dígitos
        int cantidadDigitos = 0;
        int numeroAbsoluto = Math.abs(numero); // Convertir a valor absoluto para contar dígitos

        // Si el número es 0, su cantidad de dígitos es 1
        if (numeroAbsoluto == 0) {
            cantidadDigitos = 1;
        } else {
            while (numeroAbsoluto > 0) {
                numeroAbsoluto /= 10; // Dividir el número por 10
                cantidadDigitos++;
            }
        }

        // Informar la cantidad de dígitos
        System.out.println("El número tiene " + cantidadDigitos + " dígito(s).");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
//19) Crear un programa que calcule e informe la suma de la progresión geométrica: 1 + x +
//x
//2 + ... + xn
//.
import java.util.Scanner;

public class Ejercicio3p19 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario los valores de x y n
        System.out.print("Ingrese el valor de x: ");
        int x = scanner.nextInt();
        
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        // Inicializar la suma con el primer término
        double suma = 1; // Primer término de la progresión es 1

        // Calcular la suma de la progresión geométrica
        for (int i = 1; i <= n; i++) {
            suma += Math.pow(x, i); // Sumar cada término x^i a la suma
        }

        // Informar el resultado
        System.out.println("La suma de la progresión geométrica es: " + suma);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
//20) Crear un programa que calcule e informe la serie: 1/2 + 2/22 + 3/23 + ... + n/2n
//.
import java.util.Scanner;

public class Ejercicio3p20 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el valor de n
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        // Inicializar la variable para la suma
        double suma = 0;

        // Calcular la serie
        for (int i = 1; i <= n; i++) {
            suma += (double) i / (2 * i); // Sumar cada término i/(2*i)
        }

        // Informar el resultado
        System.out.println("La suma de la serie es: " + suma);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

//II. Nivel básico
//1) Crear un programa que informe su peso efectivo en la luna, sabiendo que este será un
//17% respecto a su peso en la tierra.
import java.util.Scanner;

public class EjercicioB1 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su peso en la Tierra
        System.out.print("Ingrese su peso en la Tierra (kg): ");
        double pesoTierra = scanner.nextDouble();

        // Calcular el peso en la Luna (17% del peso en la Tierra)
        double pesoLuna = pesoTierra * 0.17;

        // Informar el peso en la Luna
        System.out.println("Su peso en la Luna sería: " + pesoLuna + " kg");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

//2) Crear un programa que pida al usuario un número entero de 5 dígitos, y que muestre
//por consola el resultado de la suma de todos sus dígitos. En el caso de que se ingrese
//un número de más dígitos o de menos dígitos informar el error y volver a pedir el
//número.
import java.util.Scanner;

public class EjercicioB2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        // Solicitar al usuario un número de 5 dígitos
        while (true) {
            System.out.print("Ingrese un número entero de 5 dígitos: ");
            numero = scanner.nextInt();

            // Verificar que el número tenga exactamente 5 dígitos
            if (numero >= 10000 && numero <= 99999) {
                break; // Si tiene 5 dígitos, salir del bucle
            } else {
                System.out.println("Error: el número debe tener exactamente 5 dígitos. Intente nuevamente.");
            }
        }

        // Calcular la suma de los dígitos
        int suma = 0;
        int temp = numero;

        while (temp > 0) {
            suma += temp % 10;  // Sumar el último dígito
            temp /= 10;         // Eliminar el último dígito
        }

        // Mostrar el resultado de la suma
        System.out.println("La suma de los dígitos de " + numero + " es: " + suma);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
//3) Crear un programa que muestre los cuadrados y los cubos de los números del 0 al 10.
//El resultado debe mostrarse como figura en la siguiente imagen.
public class EjercicioB3 {
    public static void main(String[] args) {
        // Mostrar la cabecera de la tabla
        System.out.printf("%-10s %-10s %-10s\n", "Número", "Cuadrado", "Cubo");
        System.out.println("-------------------------------------");

        // Calcular y mostrar los cuadrados y cubos de los números del 0 al 10
        for (int i = 0; i <= 10; i++) {
            int cuadrado = i * i;
            int cubo = i * i * i;
            System.out.printf("%-10d %-10d %-10d\n", i, cuadrado, cubo);
        }
    }
}

//4) Crear un programa que muestre por consola los caracteres ASCII que se encuentran
//entre los valores 30 y 126 inclusive. Los caracteres se deben mostrar en 7 filas de 15
//columnas.
//El resultado debe ser como se muestra en la siguiente imagen.
public class EjercicioB4 {
    public static void main(String[] args) {
        // Variables para los límites del rango de caracteres ASCII
        int inicio = 30;
        int fin = 126;
        int contador = 0;

        // Recorrer los valores ASCII entre 30 y 126
        for (int i = inicio; i <= fin; i++) {
            // Mostrar el carácter correspondiente al valor ASCII
            System.out.printf("%-4c", (char) i);
            contador++;

            // Crear una nueva línea cada 15 caracteres
            if (contador % 15 == 0) {
                System.out.println();
            }
        }
    }
}

//5) Crear un programa que escriba los primeros 20 números de la sucesión de Fibonacci
//sabiendo que x1 = 1, x2 = 1 y xn = xn – 1 + xn – 2 para n > 2.
public class EjercicioB5 {
    public static void main(String[] args) {
        // Definir las primeras dos posiciones de la sucesión
        int x1 = 1, x2 = 1;
        int siguiente;

        // Mostrar los primeros dos números
        System.out.print(x1 + " " + x2 + " ");

        // Calcular y mostrar los 18 números restantes (para completar 20 en total)
        for (int i = 3; i <= 20; i++) {
            siguiente = x1 + x2;  // xn = xn-1 + xn-2
            System.out.print(siguiente + " ");
            x1 = x2;  // Mover los valores
            x2 = siguiente;
        }
    }
}
//6) Si la población actual fuera 7309784505 y el crecimiento poblacional por año fuera
//24807909, realice un programa que estipule la población mundial luego de uno, dos,
//tres, cuatro y cinco años.
public class EjercicioB6 {
    public static void main(String[] args) {
        // Población actual
        long poblacionActual = 7309784505L;
        // Crecimiento anual
        long crecimientoAnual = 24807909L;

        // Calcular y mostrar la población después de 1 a 5 años
        for (int anio = 1; anio <= 5; anio++) {
            poblacionActual += crecimientoAnual;
            System.out.println("Población luego de " + anio + " año(s): " + poblacionActual);
        }
    }
}
//7) Crear un programa que pida al usuario ingresar un valor en pesos, e informe la cantidad
//mínima de billetes y monedas necesarias para la cantidad ingresada.
import java.util.Scanner;

public class EjercicioB7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] denominaciones = {2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        String[] nombres = {"$2000", "$1000", "$500", "$200", "$100", "$50", "$20", "$10", "$5", "$2", "$1"};
        int[] cantidades = new int[denominaciones.length];
        
        // Pedir y validar el monto
        System.out.print("Ingrese un valor en pesos: ");
        while (!scanner.hasNextInt() || scanner.nextInt() < 0) {
            System.out.print("Por favor, ingrese un valor válido en pesos (entero positivo): ");
            scanner.next(); // Limpiar el buffer del scanner
        }
        int monto = scanner.nextInt();
        
        // Calcular la cantidad de billetes y monedas
        for (int i = 0; i < denominaciones.length; i++) {
            cantidades[i] = monto / denominaciones[i];
            monto = monto % denominaciones[i];
        }
        
        // Mostrar resultados
        System.out.println("Cantidad mínima de billetes y monedas:");
        for (int i = 0; i < denominaciones.length; i++) {
            if (cantidades[i] > 0) {
                System.out.println(nombres[i] + ": " + cantidades[i]);
            }
        }
        
        scanner.close();
    }
}
//8) Crear un programa que reciba del usuario el radio de un círculo como un entero, y que
//imprima el diámetro, la circunferencia y el área del círculo mediante el uso del valor de
//punto flotante 3.14159 para π, en donde diámetro = 2r, circunferencia = 2 πr y
//área = πr2
//.
import java.util.Scanner;

public class EjercicioB8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14159;
        int radio;

        // Pedir y validar el radio
        System.out.print("Ingrese el radio del círculo (entero positivo): ");
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor, ingrese un número entero válido: ");
            scanner.next(); // Limpiar el buffer del scanner
        }
        radio = scanner.nextInt();

        // Verificar que el radio sea positivo
        if (radio <= 0) {
            System.out.println("El radio debe ser un número positivo.");
            scanner.close();
            return;
        }

        // Calcular propiedades del círculo
        int diametro = 2 * radio;
        double circunferencia = 2 * PI * radio;
        double area = PI * radio * radio;

        // Mostrar resultados
        System.out.println("Para un círculo con radio " + radio + ":");
        System.out.println("Diámetro: " + diametro);
        System.out.printf("Circunferencia: %.2f\n", circunferencia);
        System.out.printf("Área: %.2f\n", area);

        scanner.close();
    }
}
//9) Crear un programa que calcule e informe el factorial de un número n. El factorial de un
//número n es: n! = 1 x 2 x 3 x ... x n.
import java.util.Scanner;

public class EjercicioB9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Pedir y validar el número
        System.out.print("Ingrese un número entero no negativo para calcular su factorial: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor, ingrese un número entero válido: ");
            scanner.next(); // Limpiar el buffer del scanner
        }
        n = scanner.nextInt();

        // Verificar que el número sea no negativo
        if (n < 0) {
            System.out.println("El factorial no está definido para números negativos.");
            scanner.close();
            return;
        }

        // Calcular el factorial
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        // Mostrar el resultado
        System.out.println("El factorial de " + n + " es: " + factorial);

        scanner.close();
    }
}
//10) Crear un programa en el que se ingrese el valor de un préstamo a obtener, el
//porcentaje de interés anual de ese préstamo y el valor que desea abonar por mes.
//Mediante esos datos calcule e informe cuanto tiempo en años y en meses, se tardará
//en pagar el préstamo.
import java.util.Scanner;

public class EjercicioB10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double prestamo, tasaInteresAnual, pagoMensual;
        int meses = 0;

        // Entrada de datos
        System.out.print("Ingrese el valor del préstamo: ");
        prestamo = leerDoublePositivo(scanner);

        System.out.print("Ingrese la tasa de interés anual (%): ");
        tasaInteresAnual = leerDoublePositivo(scanner) / 100 / 12; // Convertir a tasa mensual

        System.out.print("Ingrese el valor que desea abonar por mes: ");
        pagoMensual = leerDoublePositivo(scanner);

        // Verificar si el pago mensual es suficiente
        if (pagoMensual <= prestamo * tasaInteresAnual) {
            System.out.println("El pago mensual es muy bajo. No podrá pagar el préstamo.");
            scanner.close();
            return;
        }

        // Calcular el tiempo de pago
        while (prestamo > 0) {
            prestamo += prestamo * tasaInteresAnual; // Agregar interés
            prestamo -= pagoMensual; // Restar pago mensual
            meses++;
        }

        // Mostrar resultados
        int anios = meses / 12;
        int mesesRestantes = meses % 12;
        System.out.println("Tiempo para pagar el préstamo:");
        System.out.println(anios + " años y " + mesesRestantes + " meses");

        scanner.close();
    }

    private static double leerDoublePositivo(Scanner scanner) {
        double valor;
        do {
            while (!scanner.hasNextDouble()) {
                System.out.print("Por favor, ingrese un número válido: ");
                scanner.next(); // Limpiar el buffer del scanner
            }
            valor = scanner.nextDouble();
            if (valor <= 0) {
                System.out.print("Por favor, ingrese un número positivo: ");
            }
        } while (valor <= 0);
        return valor;
    }
}
//11) Crear un programa que determine e informe el monto a pagar por una llamada
//telefónica, teniendo en cuenta lo siguiente: Toda llamada que dure hasta 5 minutos
//tiene un costo de 5 pesos. Por cada minuto adicional se cobrará 50 centavos. Se debe
//leer el tiempo de la llamada.
import java.util.Scanner;

public class EjercicioB11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer el tiempo de la llamada en minutos
        System.out.print("Ingrese la duración de la llamada en minutos: ");
        int minutos = scanner.nextInt();
        
        double costo;
        
        // Calcular el costo de la llamada
        if (minutos <= 5) {
            costo = 5.0; // Costo fijo para llamadas de hasta 5 minutos
        } else {
            // Costo fijo + 50 centavos por cada minuto adicional
            costo = 5.0 + (minutos - 5) * 0.5;
        }
        
        // Mostrar el monto a pagar
        System.out.printf("El monto a pagar por la llamada es: %.2f pesos\n", costo);
        
        scanner.close();
    }
}

//12) Crear un programa que determine e informe si un año es bisiesto. Un año es bisiesto si
//es múltiplo de 4, excepto los múltiplos de 100 que no son bisiestos, salvo que a su vez
//también sean múltiplos de 400. (1800 no es bisiesto, 2000 si).
import java.util.Scanner;

public class EjercicioB12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer el año
        System.out.print("Ingrese el año: ");
        int ano = scanner.nextInt();
        
        // Determinar si el año es bisiesto
        boolean esBisiesto = (ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0);
        
        // Mostrar el resultado
        if (esBisiesto) {
            System.out.println(ano + " es un año bisiesto.");
        } else {
            System.out.println(ano + " no es un año bisiesto.");
        }
        
        scanner.close();
    }
}
//13) Crear un programa para determinar e informar si un número entero es capicúa
//(número que se escribe igual al derecho y al revés). No utilice cadenas.
import java.util.Scanner;

public class EjercicioB13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer el número entero
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        
        int numeroOriginal = numero;
        int numeroInvertido = 0;
        
        // Invertir el número
        while (numero > 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero = numero / 10;
        }
        
        // Verificar si el número es capicúa
        if (numeroInvertido == numeroOriginal) {
            System.out.println(numeroOriginal + " es un número capicúa.");
        } else {
            System.out.println(numeroOriginal + " no es un número capicúa.");
        }
        
        scanner.close();
    }
}

//14) Crear un programa que dada una cadena de fecha en el formato “dd mm aaaa”
//devuelva su correspondiente en texto. Ej.: Para 21 04 2015 el programa debe informar
//“21 de abril de 2015”.
import java.util.Scanner;

public class EjercicioB14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array con los nombres de los meses
        String[] nombresMeses = {
            "enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };
        
        // Leer la fecha en formato "dd mm aaaa"
        System.out.print("Ingrese la fecha en formato 'dd mm aaaa': ");
        String fecha = scanner.nextLine();
        
        // Dividir la fecha en componentes
        String[] partes = fecha.split(" ");
        
        if (partes.length != 3) {
            System.out.println("Formato de fecha incorrecto.");
            return;
        }
        
        // Extraer el día, mes y año
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int año = Integer.parseInt(partes[2]);
        
        // Validar el mes
        if (mes < 1 || mes > 12) {
            System.out.println("Mes inválido.");
            return;
        }
        
        // Obtener el nombre del mes
        String nombreMes = nombresMeses[mes - 1];
        
        // Mostrar la fecha en formato textual
        System.out.printf("%d de %s de %d\n", dia, nombreMes, año);
        
        scanner.close();
    }
}

//15) Crear un programa que lea un número entero n mayor a cero que identifica una
//cantidad de segundos, y calcule e imprima el número de horas, minutos y segundos
//contenidos en ella. Ejemplo: Para n = 15723 se debe imprimir 4 horas, 22 minutos y 3
//segundos.
import java.util.Scanner;

public class EjercicioB15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer el número de segundos
        System.out.print("Ingrese el número de segundos: ");
        int segundosTotales = scanner.nextInt();
        
        if (segundosTotales <= 0) {
            System.out.println("El número debe ser mayor a cero.");
            return;
        }
        
        // Calcular horas, minutos y segundos
        int horas = segundosTotales / 3600;
        int minutos = (segundosTotales % 3600) / 60;
        int segundos = segundosTotales % 60;
        
        // Mostrar el resultado
        System.out.printf("%d horas, %d minutos y %d segundos\n", horas, minutos, segundos);
        
        scanner.close();
    }
}


//16) Crear un programa que dada una hora en formato hh:mm:ss determine e informe cual
//será el tiempo dentro de n segundos. La cantidad de segundos debe ser indicada por el
//usuario.
import java.util.Scanner;

public class EjercicioB16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer la hora en formato hh:mm:ss
        System.out.print("Ingrese la hora en formato hh:mm:ss: ");
        String hora = scanner.nextLine();
        
        // Leer la cantidad de segundos a sumar
        System.out.print("Ingrese la cantidad de segundos a sumar: ");
        int segundosAgregar = scanner.nextInt();
        
        // Validar el formato de la hora
        String[] partes = hora.split(":");
        if (partes.length != 3) {
            System.out.println("Formato de hora incorrecto.");
            return;
        }
        
        // Extraer horas, minutos y segundos
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);
        int segundos = Integer.parseInt(partes[2]);
        
        // Validar el rango de horas, minutos y segundos
        if (horas < 0 || horas >= 24 || minutos < 0 || minutos >= 60 || segundos < 0 || segundos >= 60) {
            System.out.println("Hora, minutos o segundos inválidos.");
            return;
        }
        
        // Calcular el total de segundos desde el inicio del día
        int segundosTotales = horas * 3600 + minutos * 60 + segundos;
        
        // Sumar los segundos adicionales
        segundosTotales += segundosAgregar;
        
        // Calcular las nuevas horas, minutos y segundos
        int nuevasHoras = (segundosTotales / 3600) % 24;
        int nuevosMinutos = (segundosTotales % 3600) / 60;
        int nuevosSegundos = segundosTotales % 60;
        
        // Mostrar el nuevo tiempo
        System.out.printf("La nueva hora es: %02d:%02d:%02d\n", nuevasHoras, nuevosMinutos, nuevosSegundos);
        
        scanner.close();
    }
}
//17) Crear un programa que resuelva cualquier ecuación de segundo grado ax2
//-bx = c. Por
//tanto, se debe pedir al usuario que introduzca los valores a, b y c, y el programa
//indicará las posibles raíces solución.
import java.util.Scanner;

public class EjercicioB17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer los valores de a, b y c
        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Ingrese el valor de c: ");
        double c = scanner.nextDouble();
        
        // Calcular el discriminante
        double discriminante = b * b - 4 * a * (-c);
        
        if (discriminante > 0) {
            // Dos soluciones reales y distintas
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.printf("Las soluciones son: x1 = %.2f y x2 = %.2f\n", raiz1, raiz2);
        } else if (discriminante == 0) {
            // Una solución real doble
            double raiz = -b / (2 * a);
            System.out.printf("La solución doble es: x = %.2f\n", raiz);
        } else {
            // Soluciones complejas
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
            System.out.printf("Las soluciones son: x1 = %.2f + %.2fi y x2 = %.2f - %.2fi\n",
                              parteReal, parteImaginaria, parteReal, parteImaginaria);
        }
        
        scanner.close();
    }
}

//18) Crear un programa que pida al usuario un número entero y lo convierta a binario.
import java.util.Scanner;

public class EjercicioB18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer el número entero
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        
        // Convertir el número a binario
        String binario = Integer.toBinaryString(numero);
        
        // Mostrar el resultado
        System.out.println("El número en binario es: " + binario);
        
        scanner.close();
    }
}
//19) Crear un programa que pida al usuario una velocidad en Km/h, la convierta a m/s e
//informe por consola la conversión.
import java.util.Scanner;

public class EjercicioB19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer la velocidad en Km/h
        System.out.print("Ingrese la velocidad en Km/h: ");
        double velocidadKmH = scanner.nextDouble();
        
        // Convertir la velocidad a m/s
        double velocidadMS = velocidadKmH * 1000 / 3600;
        
        // Mostrar el resultado
        System.out.printf("La velocidad en m/s es: %.2f\n", velocidadMS);
        
        scanner.close();
    }
}

//20) Crear un programa en donde se ingrese la variedad de artículos vendidos y luego de
//eso, se ingrese la cantidad de artículos por cada ocurrencia, y el precio del artículo.
//Mostrar por consola a modo de factura, Nro de artículo, cantidad, precio unitario, y al
//final de la misma, total a pagar.*/
import java.util.Scanner;

public class EjercicioB20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la cantidad de artículos
        System.out.print("Ingrese el número de artículos: ");
        int numeroDeArticulos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Inicializar variables para la factura
        double totalPagar = 0.0;

        System.out.println("Ingrese los detalles de los artículos:");
        
        // Procesar cada artículo
        for (int i = 1; i <= numeroDeArticulos; i++) {
            // Leer la variedad del artículo
            System.out.print("Ingrese la variedad del artículo " + i + ": ");
            String variedad = scanner.nextLine();
            
            // Leer la cantidad del artículo
            System.out.print("Ingrese la cantidad del artículo " + i + ": ");
            int cantidad = scanner.nextInt();
            
            // Leer el precio unitario del artículo
            System.out.print("Ingrese el precio unitario del artículo " + i + ": ");
            double precioUnitario = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea
            
            // Calcular el total para este artículo
            double subtotal = cantidad * precioUnitario;
            totalPagar += subtotal;
            
            // Mostrar los detalles del artículo
            System.out.printf("Artículo %d: %s\n", i, variedad);
            System.out.printf("Cantidad: %d\n", cantidad);
            System.out.printf("Precio Unitario: %.2f\n", precioUnitario);
            System.out.printf("Subtotal: %.2f\n\n", subtotal);
        }
        
        // Mostrar el total a pagar
        System.out.printf("Total a pagar: %.2f\n", totalPagar);
        
        scanner.close();
    }
}

