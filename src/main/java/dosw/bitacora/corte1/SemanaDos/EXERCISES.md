<img width="881" height="287" alt="image" src="https://github.com/user-attachments/assets/dc2a1186-92d2-4a9d-8876-7aa452552aa9" />

---
<img width="881" height="245" alt="image" src="https://github.com/user-attachments/assets/8ce99f86-a525-46a3-a32c-5d38e028d568" />

1. *Ejercicio 1 Patrón Creacional (Factory Method)
Contexto:
Una aplicación necesita crear diferentes tipos de notificaciones según el canal de envío.
Enunciado:
Diseñe una solución que permita crear distintos tipos de notificaciones:
Notificación por correo electrónico
Notificación por SMS
Notificación por notificación push
Todas las notificaciones deben poder enviarse, pero la forma de envío cambia según el tipo.
El sistema debe permitir crear el tipo de notificación sin que el código principal dependa directamente de las clases concretas.
Restricciones:
Use una interfaz o clase abstracta para representar la notificación.
Aplique polimorfismo para enviar la notificación.
Evite crear instancias directamente desde el main.*

<img width="1919" height="1017" alt="image" src="https://github.com/user-attachments/assets/a0fd4f29-8c2b-4e74-8bb4-b66ca198a370" />

Se implementó el patrón Factory Method creando una interfaz común para las notificaciones y una fábrica encargada de instanciar los distintos tipos. El código cliente depende únicamente de la abstracción, evitando el acoplamiento con clases concretas.


2. *Ejercicio 2 – Patrón Estructural (Adapter)
Contexto:
En la aplicación existen dos clases que imprimen mensajes, pero lo hacen de manera distinta:
Clase A (impresora simple):
Imprime únicamente el texto del mensaje en consola.
Clase B (impresora detallada):
Imprime el mensaje incluyendo información adicional, como:
El texto del mensaje
El nombre del autor
La fecha del mensaje
El sistema fue diseñado para trabajar solo con la impresora simple, por lo que no puede usar directamente la impresora detallada.
Enunciado:
Diseñe una solución que permita que el sistema pueda utilizar ambos tipos de impresoras sin modificar ninguna de las clases existentes.
Para lograrlo, debe crear un Adapter que permita que la impresora detallada se comporte como si fuera una impresora simple desde el punto de vista del sistema.
Deben:
Crear una clase que imprima solo el texto del mensaje.
Crear otra clase que imprima el mensaje junto con autor y fecha.
Definir una interfaz común que el sistema espera usar para imprimir mensajes.
Implementar un Adapter que transforme la información necesaria y delegue la impresión a la impresora detallada.
Restricciones:
No modificar ninguna de las dos clases de impresión.
Usar encapsulamiento para proteger los datos del mensaje.
Aplicar polimorfismo para que el sistema pueda usar cualquiera de las impresoras sin saber cuál es.
El código cliente debe depender únicamente de la interfaz.*

<img width="1919" height="1018" alt="image" src="https://github.com/user-attachments/assets/6647515f-bda1-408b-a1c9-107858b786ee" />

Se implementó el patrón Adapter creando una clase que adapta la impresora detallada para que pueda usarse como una impresora simple. El sistema depende de una interfaz común, permitiendo el uso de distintas implementaciones sin modificar las clases existentes.


3. *Ejercicio 3 – Patrón de Comportamiento (Memento)
Contexto:
Un editor sencillo permite modificar el contenido de un texto, pero se quiere agregar la opción de deshacer cambios.
Enunciado:
Diseñe un sistema que permita guardar el estado de un texto antes de ser modificado y restaurarlo cuando el usuario lo solicite.
El sistema debe permitir:
Guardar el estado actual del texto en una estructura de datos (lista)
Restaurar un estado anterior sin exponer los detalles internos del objeto que contiene el texto.
El historial de estados debe manejarse sin violar el encapsulamiento del objeto principal.
Restricciones:
Aplique encapsulamiento para proteger el estado interno.
Use el patrón Memento para almacenar y restaurar estados.
El objeto que guarda los estados no debe modificar directamente el contenido del texto.
El diseño debe permitir múltiples estados guardados.*

<img width="1915" height="1017" alt="image" src="https://github.com/user-attachments/assets/697cdafe-9345-4a06-a3c4-012f68547d8a" />

Se implementó el patrón Memento para guardar y restaurar el estado de un editor de texto sin exponer su estado interno. Se utilizó un objeto que almacena múltiples estados manteniendo el encapsulamiento del contenido.


4. *Ejercicio 4 – Principios SOLID (Calculadora simple)
Contexto:
Se desea construir una calculadora básica, pero bien diseñada.
Enunciado:
Implemente una calculadora que pueda realizar las siguientes operaciones:
Suma de numeros enteros y de numeros decimales
Resta de numeros enteros y de numeros decimales
Multiplicación de numeros enteros y de numeros decimales
División de numeros enteros y de numeros decimales
Cada operación debe estar separada de la calculadora principal, de manera que agregar una nueva operación no implique modificar el código existente.
Objetivo SOLID:
Aplicar Responsabilidad Única (cada operación hace solo una cosa).
Aplicar Abierto/Cerrado (agregar operaciones sin modificar la calculadora).
Usar interfaces para representar las operaciones (Liskov substitution e Interface Segregation)*

<img width="1919" height="1020" alt="image" src="https://github.com/user-attachments/assets/58a1da3d-85e2-4fe8-b6ef-38d495de0864" />

Se diseñó una calculadora aplicando los principios SOLID, separando cada operación en una clase independiente y utilizando una interfaz común. Esto permite agregar nuevas operaciones sin modificar la clase principal, manteniendo la alta cohesión y el bajo acoplamiento.

---

<img width="882" height="243" alt="image" src="https://github.com/user-attachments/assets/b8bddb85-7d00-41c9-a239-d9896f1029a3" />

1. ¿Qué entendí mal antes?
Gracias a la explicación a fondo de POO, siento que me ayudo a entender un poco mejor el tema de S.O.L.I.D ya que anteriormente, solo me explicaron 2 y siento yo que fue muy por encima. Sin embargo, ahora entiendo más conceptos y detalles que me faltaban entender.

2. ¿Qué entiendo ahora?
Entiendo mejor como funciona el tema de SOLID y me gusta que pienso más a fondo cuando realizo un ejercicio como quiero resolverlo, más mirando con que patrón queda.

3. ¿Qué me falta reforzar?
Me falta reforzar los patrones, se que entendí pero siento que ,e falta revisarlos más a fondo para comprenderlos mejor.

