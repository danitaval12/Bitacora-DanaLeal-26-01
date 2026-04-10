# | Bitácora Corte 2 – Semana 2 (N8) |
#### (DESDE EL 9 MARZO HASTA EL 15 MARZO)

## Actividades realizadas

### COMBINACIÓN DE PATRONES DE DISEÑO 
El objetivo de este refuerzo es practicar la combinación de patrones de diseño dentro de un mismo sistema, entendiendo cómo se complementan para resolver problemas reales de software.

#### | Ejercicio 1: Sistema de Notificaciones |
   
**PATRONES DE DISEÑO UTILIZADOS**

| PATRÓN    | TIPO                     | JUSTIFICACIÓN                                                                                                                                                                                                                                                                                                              |
|-----------|--------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| STRATEGY  | Patrón de Comportamiento | Permite cambiar dinámicamente el tipo de notificación (Email o SMS) sin modificar el código principal del sistema. Cada tipo de notificación se implementa como una estrategia independiente que comparte una misma interfaz, lo que permite que el sistema sea flexible y extensible ante nuevos canales de comunicación. |
| SINGLETON | Patrón Creacional        | Se implementó en el servicio de notificaciones con el objetivo de garantizar que exista una única instancia encargada del envío de mensajes. Esto evita la creación de múltiples instancias innecesarias y centraliza la lógica de envío dentro del sistema.                                                                                                                                                                                                                                                                                                             |

**DIAGRAMA UML**
![UML EJ1.png](../../../../../../../docs/uml/UML%20EJ1.png)
El servicio de notificaciones mantiene una referencia a la interfaz NotificationStrategy, lo que le permite delegar el comportamiento de envío a la estrategia seleccionada en tiempo de ejecución.
Esta relación evidencia el uso del patrón Strategy, ya que el comportamiento puede cambiar dinámicamente sin modificar la estructura del sistema.

**EXPLICACIÓN DEL DISEÑO**
El sistema fue diseñado utilizando una interfaz común (NotificationStrategy) que define el comportamiento general de envío de notificaciones. A partir de esta interfaz se implementan diferentes tipos de notificación como Email y SMS.
El servicio de notificaciones actúa como un punto central que utiliza una estrategia específica para enviar el mensaje, permitiendo cambiar el comportamiento en tiempo de ejecución sin afectar otras partes del sistema.

**IMPLEMENTACIÓN**
Se implementaron las clases correspondientes al patrón Strategy (NotificationStrategy, EmailNotification, SMSNotification) y el servicio NotificationService aplicando el patrón Singleton.

#### | Ejercicio 2: Sistema de Procesamiento de Pagos |

**PATRONES DE DISEÑO UTILIZADO**

| PATRÓN                    | TIPO                     | JUSTIFICACIÓN                                                                                                                                                                                                                                  |
|--------------------------|--------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| ADAPTER                  | Patrón Estructural       | Permite integrar diferentes proveedores de pago (PayPal, Stripe, tarjeta, transferencia) que poseen interfaces distintas, adaptándolos a una interfaz común del sistema. Esto facilita la extensión del sistema sin modificar el código existente. |
| CHAIN OF RESPONSIBILITY  | Patrón de Comportamiento | Permite ejecutar una serie de validaciones (saldo, fraude, límite) de manera secuencial, donde cada una decide si el proceso continúa o se detiene. Esto permite agregar o remover validaciones sin afectar la estructura principal del sistema. |

**DIAGRAMA UML**
![UML EJ2.png](../../../../../../../docs/uml/UML%20EJ2.png)
El sistema se divide en dos partes principales. Por un lado, los proveedores de pago implementan una interfaz común (PaymentProcessor) mediante el uso del patrón Adapter, lo que permite unificar el procesamiento de pagos independientemente del proveedor.
Por otro lado, las validaciones se organizan en una cadena utilizando el patrón Chain of Responsibility, donde cada validador ejecuta su lógica y decide si el proceso continúa al siguiente elemento de la cadena.

**EXPLICACIÓN DE DISEÑO**
El sistema fue diseñado para separar la lógica de validación y procesamiento de pagos.

Se utilizó una interfaz común (PaymentProcessor) para abstraer los diferentes proveedores de pago, permitiendo que el sistema pueda trabajar con cualquier proveedor sin depender de su implementación específica.
Adicionalmente, se implementó una cadena de validaciones mediante el patrón Chain of Responsibility, donde cada validación se ejecuta en orden y decide si el proceso de pago debe continuar o detenerse.
Este diseño permite que el sistema sea flexible, extensible y fácil de mantener, ya que se pueden agregar nuevos proveedores de pago o nuevas validaciones sin modificar el código principal.

**IMPLEMENTACIÓN**
Se implementaron las clases correspondientes al patrón Adapter mediante la interfaz PaymentProcessor y sus implementaciones concretas (PayPalAdapter, StripeAdapter, CreditCardAdapter y BankTransferAdapter).
Por otro lado, se implementó el patrón Chain of Responsibility a través de la clase abstracta PaymentValidator y sus diferentes validadores (BalanceValidator, FraudValidator y LimitValidator), los cuales se encadenan para validar el proceso antes de ejecutar el pago.

#### | Ejercicio 3: Sistema de Reportes de una Plataforma |

**PATRONES DE DISEÑO UTILIZADO**

| PATRÓN    | TIPO                     | JUSTIFICACIÓN                                                                                                                                                                                                                                    |
|-----------|--------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| BUILDER   | Patrón Creacional        | Permite construir el reporte paso a paso agregando diferentes secciones como información general, estadísticas y resumen. Facilita la creación de objetos complejos sin necesidad de usar constructores extensos o rígidos.                      |
| DECORATOR | Patrón Estructural       | Permite extender el comportamiento del reporte añadiendo funcionalidades adicionales como firma digital, marca de agua o compresión sin modificar la estructura base del objeto. Esto hace el sistema flexible y abierto a extensiones futuras.  |

**DIAGRAMA UML**
![UML EJ3.png](../../../../../../../docs/uml/UML%20EJ3.png)
El sistema separa la construcción del reporte de sus extensiones. El patrón Builder permite crear el reporte de forma progresiva, mientras que el patrón Decorator permite añadir funcionalidades adicionales envolviendo el objeto base.
Esta combinación permite que el sistema sea altamente flexible, permitiendo tanto la creación de nuevos tipos de reportes como la incorporación de nuevas funcionalidades sin modificar el código existente.

**EXPLICACIÓN DE DISEÑO**
El sistema fue diseñado separando la construcción del reporte de su comportamiento adicional.
Por un lado, se utilizó el patrón Builder para construir el reporte de manera progresiva, agregando diferentes secciones como información general, estadísticas y resumen final.
Por otro lado, se utilizó el patrón Decorator para extender el comportamiento del reporte, permitiendo agregar funcionalidades como firma digital, marca de agua y compresión sin modificar la clase base.
Este diseño permite que el sistema sea flexible, escalable y fácil de mantener, ya que se pueden agregar nuevas secciones o nuevas funcionalidades sin afectar la estructura principal.

**IMPLEMENTACIÓN**
Se implementaron las clases correspondientes al patrón Builder mediante la interfaz ReportBuilder y su implementación concreta ConcreteReportBuilder, encargada de construir el objeto Report paso a paso.
Adicionalmente, se implementó el patrón Decorator mediante la clase abstracta ReportDecorator y sus implementaciones concretas (DigitalSignatureDecorator, WatermarkDecorator y CompressionDecorator), las cuales permiten extender el comportamiento del reporte de manera dinámica.

### RETROESPECTIVA DE JIRA - Semana Ocho

Se realizo el mismo procedimiento de la semana siete. 

---

## Dificultades encontradas

- Al inicio resultó un poco extraño organizar las actividades en Jira, ya que normalmente
  utilizo un calendario de Gmail donde gestiono tanto mis actividades académicas como personales.
  Adaptarme a una nueva herramienta de organización requiere un proceso de ajuste.

- También se presentaron algunas dificultades al integrar herramientas como Jacoco y al estructurar correctamente los paquetes en los ejercicios, lo que tomó tiempo adicional de prueba y corrección.
---

## Tiempo estimado vs el Tiempo Real

| Tiempo Estimado | Tiempo Real       | Explicación                                                                 |
|-----------------|------------------|-----------------------------------------------------------------------------|
| 1 Hora Diaria   | 1 Hora Diaria    | El primer ejercicio fue claro, el mayor tiempo se fue en configuración.     |
| 1 Hora Diaria   | 1:20 Horas Diaria| Las pruebas unitarias requirieron repaso y práctica adicional.              |
| 1 Hora Diaria   | 1 Hora Diaria    | El último ejercicio fue más fluido al tener mayor claridad en los patrones. |
---

## Reflexión sobre gestión del tiempo

Organizar todas las actividades de la semana puede ser retador debido a la carga académica, pero mantener una planificación constante ayuda a cumplir con las entregas de manera adecuada.
En cuanto al uso de herramientas como Jira, aunque al inicio no fue tan intuitivo para mí, poco a poco voy entendiendo su utilidad para llevar un mejor control de las tareas y tiempos.
Considero que esta semana fue positiva en términos de aprendizaje, especialmente en la aplicación de patrones de diseño y en la mejora del uso de pruebas unitarias.
---

## Evidencias

**PRUEBAS UNITARIAS |EJERCICIO UNO|**
![imgN8(1).png](../../../../../../../docs/image/SemanaN8/imgN8%281%29.png)
Se desarrollaron pruebas unitarias utilizando JUnit para validar el correcto funcionamiento del sistema, verificando que las notificaciones se envían correctamente al cambiar la estrategia de envío.

**PRUEBAS UNITARIAS |EJERCICIO DOS|**
![imgN8(2).png](../../../../../../../docs/image/SemanaN8/imgN8%282%29.png)

**PRUEBAS UNITARIAS |EJERCICIO TRES|**
![imagN8(3).png](../../../../../../../docs/image/SemanaN8/imagN8%283%29.png)

**COBERTURA CON JACOCO**
Se utilizó la herramienta Jacoco para medir la cobertura de las pruebas unitarias, permitiendo verificar que los métodos implementados fueron ejecutados durante las pruebas. Se obtuvo un porcentaje de cobertura adecuado según los requisitos establecidos.

**ANÁLISIS ESTÁTICO**
Se realizó análisis estático del código utilizando herramientas como Sonar, con el fin de identificar posibles problemas de calidad, mejorar la mantenibilidad del código y asegurar buenas prácticas de desarrollo.

