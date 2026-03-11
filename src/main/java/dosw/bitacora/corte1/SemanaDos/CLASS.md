<img width="899" height="288" alt="image" src="https://github.com/user-attachments/assets/1b6fbb4b-486b-477c-90c0-967b162884c9" />

# PARTE UNO 

## **| CLASE TEÓRICA Y LABORATORIO |**

### **S.O.L.I.D**
Es un conjunto de reglas y mejores practicas a seguir al diseñar una estructura de clase. Todos tienen el mismo proposito: *crear código mantenible más fácil y rápido, permite añadir nuevas funcionalidades de forma sencilla y favorece una mayor reusabilidad y calidad del código.*

- **CLEAN CODE:** Es una filosofía utilizada en el desarrollo de software cuyo objetivo es hacer más fácil la lectura y escritura de código.Se basa en la aplicación de técnicas sencillas con las que generamos un código claro e intuitivo que es más fácil de modificar.

### **PILARES DE LA PROGRAMACIÓN ORIENTADA A OBJETOS**
- **ENCAPSULAMIENTO** --> *ocultar los atributos internos y permitir el acceso controlado mediante métodos*

Niveles de encapsulamiento --> 1. **PUBLIC:** Acceso para todos.  2. **PRIVATE:** Uso para la clase y sus subcalses no es de acceso público.  3. **PROTECTED:** Accesible solo a la propia clase.

- **ABSTRACCIÓN** --> Es el proceso de definir los atributos y los métodos de una clase.

- **HERENCIA** --> Las clases hijo heredan atributos y métodos de la clases padres.

- **INMUTABILIDAD** --> Una vez que se ha creado un objeto no puede volver a modificarse, entonces hay mejor uso de memoria ya que todo su estado es final y la seguridad en multiples hilos de ejecución.
 
- **POLIMORFISMO** --> Da a la misma orden a varios objetos para que respondan de diferentes maneras. Es decir, tiene la capacidad de los objetos de una clase ofrecer respuestas de manera distintas e independientes en función de sus parametros durante su ejecución.

- **INTERFACES:** Proporciona un contrato/mecanismo de encapsulación de los protocolos de los métodos sin forzar al usuario a utilizar la herencia.

-**ACOPLAMIENTO** --> Grado de interdependecia de dos unidades de software entre si, es decir que tanto una clase depende de la otra.

-**COHESIÓN** --> Grado en que los elementos de un sistema permanecen unidos para alcanzar un mejor resultado que si trabajaran solos, entonces agurpa diversas unidades para crear una unidad mayor, es decir, que tan enfocada está una clase en una sola tarea.

**S** -> **Single Responsability Principle**

Establece que una clase, componente o servicio debe ser responsable de una sola cosa (desacople).
- Un consejo de aplicación es agrupar en una misma clase las funcionalidad que cambian por el mismo motivo y separa las que cambian por motivos distintos.
- Utiliza el encapsulamiento para proteger los datos internos de un objeto.

**FALLA CUANDO:**
- En una clase están involucradas dos capas de arquitectura
- Si contiene demasiados métodos públicos.
- Es díficil de probar (pruebas unitarias y granularidad)
- Una nueva funcionalidad la afecta.
 

**O** -> **Open/Closed Principle**

Establece que las entidades de software (clases, modulos y funciones) deberian estar abiertos para su extensión pero cerrados para su modificación, es decir, deberiamos agregar nuevas funciones sin tocar el código que ya existe, de esta manera evitamos el riesgo de crear errores potenciales.

- Un consejo de aplicación suele ser que se resuelve usando POLIMORFISMO al no obligar a la clase principal a saber como realizar la operación, se le delega a los objetos que se utiliza.

Existe el overloading: Un mismo método con formas distintas
<img width="634" height="609" alt="image" src="https://github.com/user-attachments/assets/47d37939-45f9-4fa5-b8e9-85a09c61e90e" />

OVERRIDING: Un mismo método sobreescrito.
<img width="578" height="615" alt="image" src="https://github.com/user-attachments/assets/b641dbe3-0b15-4a3e-a674-43d6bafa3225" />

**FALLA CUANDO:**
- Se detecta si una clase que se debe modificar muy a menudo y estos cambios afectan lo ya modificado
- Usp excesivo del if/else o switch en vez del polimorfismo
- Código duplicado con variaciones minimas.
- Si modificar una funcionalidad obliga a tocar muchas clases o métodos no relacionados con la nueva extensdión, el sistema no esta bien cerrado a modificaciones.
 

**L** -> **Liskov Substitution Principle**

Las subclases deben poder sustituir a sus clases base sin alterar el comportamiento correcto del programa, si una clase B hereda de A, entonces B debe poder usarse donde se una A sin dañar nada.
Entonces, El principio de sustitución de Liskov establece que una subclase debe poder reemplazar a su clase base sin alterar el comportamiento esperado del sistema. Si una subclase modifica o invalida comportamientos heredados, se está violando este principio.

- Un consejo de aplicación es con INMUTABILIDAD, ya que, se puede respetar este principio con este porque con ella podremos utilizar herencias de forma correcta.

**FALLA CUANDO:**
- Un método sobreescrito no hace nada o lanza una excepción.
- Si las pruebas padre no funcionan para la clase hija.
- Si el método en la subclase exige más condiciones de entrada que el de la clase padre.
- Si el hijo no respeta las reglas de uso, garantías y contratos del padre, lo que genera errores, comportamientos inesperados o la necesidad de tratar al hijo de forma distinta.


**I** -> **Interface Segregation Principle**

Los clientes no deberian verse forzados a depender de interfaces que no usan. Cuando un cliente depende de una clase que implementa una interfaz cuya funcionalidad este cliente no usa pero otros clientes si, este cliente esta siendo afectado por los cambios que fuercen otros clientes en dicha interfaz.

- Un consejo de aplicación es que es necesario definir una interfaz para cada tipo de cliente y no una general que aprupe métodos sin uso. Cada clase que se implemente una interfaz debe utilizar TODOS los métodos y una interfaz ayuda a desacoplar modulos entre si.
<img width="748" height="265" alt="image" src="https://github.com/user-attachments/assets/097168bd-634f-4417-8d10-0e390a286cf7" />

**FALLA CUANDO:**
- Una interfaz tiene demasiados métodos
- Una clase que implementa la interfaz se ve obligada a poner métodos vacíos o sin sentido.
- La interfaz mezcla responsabilidades diferentes.
- Si una interfaz obliga a las clases a implementar métodos que no usan.

  
**D** -> **Dependency Inversion Principle**

Establece que las dependencias deben estar en las abstracciones, no en los detalles de la implementación. Los modulos de alto nievel *(la lógica importante del sistema)* no deberian depender de modulos de bajo nivel, en lugar de depender directamente de clases concretas, las clases deben de depender de interfaces o abstracciones para mayor flexibilidad.

- Un consejo de aplicación es que definido mediante interfaces lo que ayuda a que la aplicación núcleo no tendra que conocer la implementación real para funcionar. Permite tener bajo ACOPLAMIENTO y alta COHESIÓN.

- **INYECCIÓN DE DEPENDENCIAS** Es un patron que permite a un objeto recibir sus dependencias de una fuente externa, en lugar de crearlas directamente.
<img width="736" height="200" alt="image" src="https://github.com/user-attachments/assets/0ba0318c-3136-422e-9209-b5fe2508547e" />

Esto en algun momento nuestra aplicación llegara a estar formada por muchos modulos y ahí es cuando debemos utilizar la Inyección. Para que podamos controlar las funcionalidades desde un sitio concreto en vez de tenerlas esparcidas. 

**FALLA CUANDO:**
- El modulo de alto nivel conoce detalles de la implementación.
- El flujo depende de clases concretas en lugar de Asbtracciones.
- No hay interfaces o contratos claros entre capas.
- No puedes usar mocks o stubs en pruebas unitarias porque las clases estan fuertemente acopladas.


### **PATRONES DE DISEÑO**

Son soluciones habituales a problemas que ocurren con frecuencia en el diseño de software.
Son como planos que se pueden personalizar para resolver un problema de diseño y son reutilizables y se pueden extraer y explicar en muchos ámbitos. 

EXISTEN TRES CATEGORIAS:

- **CREACIONALES**
Son los que proporcionan diversos mecanismos de creación de objetos que incrementan la flexibilidad y reutilización del código existente.

<img width="741" height="284" alt="image" src="https://github.com/user-attachments/assets/c68eedad-aea0-4dca-8c38-8574ed199d7b" />
<img width="678" height="260" alt="image" src="https://github.com/user-attachments/assets/0b533b0a-0b50-47e4-a2ae-a61264655ef2" />
<img width="714" height="120" alt="image" src="https://github.com/user-attachments/assets/35fd0008-5435-4181-9671-7d19986ce4f3" />


---
- **ESTRUCTURALES**
Son los que explican como ensamblar objetos y clases en estructuras más grandes, mientras se mantiene la flexibilidad y eficiencia de la estructura.

<img width="713" height="326" alt="image" src="https://github.com/user-attachments/assets/e80b693e-245a-448b-a487-0d8640183e71" />
<img width="739" height="345" alt="image" src="https://github.com/user-attachments/assets/fbb29e4f-212d-4c21-9105-0dc8f72c3cdb" />
<img width="750" height="145" alt="image" src="https://github.com/user-attachments/assets/f0f2dc66-6a78-4d7e-a2c8-9161bc424a40" />


---
- **COMPORTAMIENTO**
Estos patrones tratan con algoritmos y la asignación de responsabilidades entre objetos, es decir como interactuan entre sí.

<img width="752" height="323" alt="image" src="https://github.com/user-attachments/assets/f00aec9a-b2a1-4163-ac9b-13dd6a49b2cf" />
<img width="735" height="330" alt="image" src="https://github.com/user-attachments/assets/ec183082-f271-48a5-826a-632c7a5e188d" />
<img width="725" height="333" alt="image" src="https://github.com/user-attachments/assets/e85930da-59c8-438e-a5c1-30f0b510f316" />
<img width="743" height="136" alt="image" src="https://github.com/user-attachments/assets/09a3889c-e318-4722-bf42-7f31c0ee3437" />


### **DIAGRAMAS DE CLASES**

Es un diagrama estructural, parte de la familia que modela las relaciones estáticas de un sistema en estado estacionario. Es una herramienta vital para la POO. 

Una clase es un elemento de modelado que define las características del objeto que representa, incluidos sus atributos y comportamientos.

CLASES : *nombre, atributos, métodos, visibilidad*

RELACIONES: *asociación, agregación y composición, herencia y multiplicidad*


