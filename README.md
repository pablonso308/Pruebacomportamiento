link a mi repositorio: https://github.com/pablonso308/Pruebacomportamiento.git


# Program Halt Checker System

## Overview

Este sistema fue diseñado para evaluar programas en Java, determinando si terminarán su ejecución o continuarán indefinidamente. El objetivo principal es ofrecer una herramienta que pueda realizar estas evaluaciones sin necesidad de modificar el código fuente de los programas analizados. Se ha implementado utilizando el patrón de diseño Chain of Responsibility para facilitar la extensibilidad y el mantenimiento del sistema.

## Components

### `Program`
Es una clase abstracta que sirve como base para todos los programas que el sistema evaluará. Fue diseñada para ser extendida por cualquier programa que necesite ser verificado, proporcionando así un marco de trabajo estandarizado para todas las implementaciones futuras. Esta abstracción permite que el sistema maneje diferentes tipos de programas sin acoplarse fuertemente a implementaciones específicas.

### `CountUp` y `CountDown`
Estas clases son implementaciones concretas de `Program`. `CountUp` representa un programa que incrementa indefinidamente un contador, mientras que `CountDown` decrementa un contador desde un número inicial hasta que llega a cero y se detiene. Se seleccionaron estos dos tipos para demostrar cómo el sistema puede manejar tanto programas que terminan como aquellos que no.

### `HaltChecker`
Utiliza el patrón Chain of Responsibility para determinar si un programa dado se detendrá eventualmente. Esta clase es crucial porque actúa como un orquestador que pasa cada programa a través de una serie de manejadores que evalúan su comportamiento. Este diseño fue elegido porque permite agregar o modificar evaluaciones sin alterar el código existente, siguiendo el principio Open/Closed.

### `HaltCheckerHandler`
Es una interfaz que define los métodos que cada manejador debe implementar para poder evaluar programas. Los manejadores específicos como `CountDownHandler` y `CountUpHandler` implementan esta interfaz, permitiendo que el sistema se extienda fácilmente con nuevos manejadores para diferentes tipos de programas.

### `CountDownHandler` y `CountUpHandler`
Son implementaciones concretas de `HaltCheckerHandler`. Cada uno está diseñado para manejar un tipo específico de programa (`CountDown` y `CountUp`, respectivamente). Estos manejadores evalúan si los programas asociados se detendrán basándose en sus características únicas. Estos fueron seleccionados para demostrar cómo diferentes comportamientos de programas pueden ser manejados de manera efectiva dentro del mismo sistema.

## Features

- **Extensibility**: El uso del patrón Chain of Responsibility permite añadir nuevos manejadores para tipos adicionales de programas sin necesidad de modificar los manejadores existentes.
- **Decoupling**: Los manejadores están desacoplados de la lógica principal de `HaltChecker`, lo que facilita la modificación y extensión del sistema.
- **GUI**: La interfaz gráfica de usuario proporciona una forma amigable y directa de interactuar con el sistema, permitiendo a los usuarios evaluar programas con solo presionar un botón y recibir una respuesta inmediata.

## Usage

1. **Running the GUI**:
   - Compile y ejecute la clase `Main` usando su IDE Java preferido.
   - Utilice los botones de la interfaz para evaluar los programas.
   - Observe los resultados en el área de texto de la GUI.

2. **Extending the System**:
   - Implemente la clase `Program` para su nuevo tipo de programa.
   - Cree un nuevo manejador que implemente `HaltCheckerHandler` para su tipo de programa y configúrelo dentro de la cadena de responsabilidades en `HaltChecker`.

# Componente Reverser

## Descripción del Componente Reverser

El Reverser es una parte esencial del proyecto que simula el famoso "problema de parar" en la teoría de la computación. Este componente interactúa con programas y un verificador de parada para demostrar cómo la predicción del comportamiento de un programa puede influir y alterar su ejecución.

## Funcionalidades

**Predicción y Respuesta:** El Reverser utiliza el ProgramHaltChecker para predecir si un programa proporcionado se detendrá o continuará ejecutándose. Basado en esta predicción, altera su comportamiento:
- *Bucle Infinito:* Si se predice que el programa se detendrá, el Reverser entra en un bucle infinito.
- *Terminación Inmediata:* Si se predice que el programa no se detendrá, el Reverser termina su ejecución de inmediato.

## Implementación

El Reverser está implementado como una clase en Java que sigue la interfaz Programa, permitiendo una integración fluida con otros componentes del sistema.

## Conclusión

El Reverser demuestra de manera efectiva las paradojas inherentes al problema de parar y ofrece una herramienta didáctica para explorar conceptos avanzados en computación. Este componente destaca los desafíos y las consideraciones necesarias cuando se predice el comportamiento de los programas en un contexto práctico y educativo.

# Program Halt Checker System

## Overview

Este sistema fue diseñado para evaluar programas en Java, determinando si terminarán su ejecución o continuarán indefinidamente. El objetivo principal es ofrecer una herramienta que pueda realizar estas evaluaciones sin necesidad de modificar el código fuente de los programas analizados. Se ha implementado utilizando el patrón de diseño Chain of Responsibility para facilitar la extensibilidad y el mantenimiento del sistema.

## Componentes

### `Program`

Es una clase abstracta que sirve como base para todos los programas que el sistema evaluará. Fue diseñada para ser extendida por cualquier programa que necesite ser verificado, proporcionando así un marco de trabajo estandarizado para todas las implementaciones futuras. Esta abstracción permite que el sistema maneje diferentes tipos de programas sin acoplarse fuertemente a implementaciones específicas.

### `CountUp` y `CountDown`

Estas clases son implementaciones concretas de `Program`. `CountUp` representa un programa que incrementa indefinidamente un contador, mientras que `CountDown` decrementa un contador desde un número inicial hasta que llega a cero y se detiene. Se seleccionaron estos dos tipos para demostrar cómo el sistema puede manejar tanto programas que terminan como aquellos que no.

### `HaltChecker`

Utiliza el patrón Chain of Responsibility para determinar si un programa dado se detendrá eventualmente. Esta clase es crucial porque actúa como un orquestador que pasa cada programa a través de una serie de manejadores que evalúan su comportamiento. Este diseño fue elegido porque permite agregar o modificar evaluaciones sin alterar el código existente, siguiendo el principio Open/Closed.

### `HaltCheckerHandler`

Es una interfaz que define los métodos que cada manejador debe implementar para poder evaluar programas. Los manejadores específicos como `CountDownHandler` y `CountUpHandler` implementan esta interfaz, permitiendo que el sistema se extienda fácilmente con nuevos manejadores para diferentes tipos de programas.

### `CountDownHandler` y `CountUpHandler`

Son implementaciones concretas de `HaltCheckerHandler`. Cada uno está diseñado para manejar un tipo específico de programa (`CountDown` y `CountUp`, respectivamente). Estos manejadores evalúan si los programas asociados se detendrán basándose en sus características únicas. Estos fueron seleccionados para demostrar cómo diferentes comportamientos de programas pueden ser manejados de manera efectiva dentro del mismo sistema.

## Características

- **Extensibilidad**: El uso del patrón Chain of Responsibility permite añadir nuevos manejadores para tipos adicionales de programas sin necesidad de modificar los manejadores existentes.
- **Desacoplamiento**: Los manejadores están desacoplados de la lógica principal de `HaltChecker`, lo que facilita la modificación y extensión del sistema.
- **Interfaz Gráfica de Usuario (GUI)**: La GUI proporciona una forma amigable y directa de interactuar con el sistema, permitiendo a los usuarios evaluar programas con solo presionar un botón y recibir una respuesta inmediata.

## Uso

1. **Ejecución de la GUI**:
   - Compile y ejecute la clase `Main` utilizando su IDE Java preferido.
   - Utilice los botones de la interfaz para evaluar los programas.
   - Observe los resultados en el área de texto de la GUI.

2. **Extensión del Sistema**:
   - Implemente la clase `Program` para su nuevo tipo de programa.
   - Cree un nuevo manejador que implemente `HaltCheckerHandler` para su tipo de programa y configúrelo dentro de la cadena de responsabilidades en `HaltChecker`.


