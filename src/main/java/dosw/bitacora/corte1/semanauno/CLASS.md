<img width="877" height="283" alt="image" src="https://github.com/user-attachments/assets/19b55855-0c0a-4187-b47d-bb1462723fb9" />

# **| CLASE TEÓRICA |**

### **CICLO DE VIDA DEL SOFTWARE (SDLC)**

SDLC es **Software Development Life Cycle** es un proceso estructurado que se usa para desarrollar software de forma organizada, controlada y de calidad. 

1. **PLANEACIÓN:** Su objetivo es determinar si el proyecto es viable, entonces, se define: *el problema a resolver, alcance del proyecto, tiempo estimado, presupuesto, recursos humanos y técnico, y sus riesgos.*

2. **ANÁLISIS DE REQUERIMIENTOS:** Su objetivo es definir exactamente **QUE DEBE HACER EL SISTEMA**, Se identifican los requerimientos funcionales (que hace el sistema) y los no funcionales (como debe comportarse), creando casos de uso, historias de usuario y así se evita ambigüedades. Si esta fase falla, todo el proyecto falla.

3. **DISEÑO:** Traducimos los requerimientos en una estructura técnica clara, entonces diseñamos: *arquitectónico* (Como se organizará el sistema), *datos* (Modelo entidad-relación, base de datos), *interfaz* (Mockups, Wireframes) y *técnico* (Clases, diagramas UML, patrones de diseño).

4. **IMPLEMENTACIÓN:** Convertimos el diseño en un software funcional, entonces es programar.

5. **PRUEBAS Y DESPLIEGUE:** Primero se verifica que el sistema funcione correctamente con pruebas: *unitarias* (Partes pequeñas del código), *integración* (Módulos juntos), *sistema* (Sistema completo) y de *aceptación*. Cuando todo funcione correctamente se entrega el sistema al usuario (DESPLIEGUE) y se capacita al usuario.

6. **MANTENIMIENTO:** El software nunca se termina ya que puede pasar estos tipos: *correctivo* (Arreglar errores), *adaptativo* (Cambios por nuevas leyes o tecnología), *perfectivo* (mejoras) o *preventivo* (optimización  futura).

### **GIT**

Es un sistema de control de versiones distribuido, es decir, *guarda el historial de cambios*, *permite volver a versiones anteriores*, *permite trabajo en equipo sin sobreescribir código* y *cada desarrollador tiene una copia completa del repositorio.*

Sus conceptos básicos son:

<img width="1329" height="473" alt="image" src="https://github.com/user-attachments/assets/52f2d81d-9b3e-40be-a5b7-6b6d127602ea" />

- **REPOSITORIO:** Es el proyecto controlado por Git. (Puede ser en mi PC (local) o en Remoto (GitHub, GitLab, demás))
- **WORKING DIRECTORY:** Es mi carpeta actual del proyecto que este realizando.
- **BRANCH:** Una rama es una línea paralela de desarrollo, que permite trabajar en nuevas funcionalidades, corregir errores y no afectar la versión principal.


### **GIT FLOW**

Es un modelo de trabajo con ramas, creado por Vincent Driessen. Donde no es Git sino es una estrategia para usar Git. 
Su estructura es la siguiente:

<img width="583" height="365" alt="image" src="https://github.com/user-attachments/assets/3c9518a1-8e78-4cf8-b5ec-adff5a26b302" />

- **MAIN:** Código en producción, y siempre es estable.
- **DEVELOP:** La rama de integración y aquí se unen todas las features.
- **FEATURE/*:** Nuevas funcionalidades, se crean desde develop y se mergean a develop.
- **RELEASE/*:** Preparación de versión final, corrigen errores menores y se mergea a main y develop.
- **HOTFIX/*:** Correciones urgentes en producción, se crea desde el main y se hace merge a main y a develop.


## **| CLASE LABORATORIO |**

## **TAREA INVESTIGACIÓN**
- **¿CUALES SON LOS TIPOS DE BRANCH QUE PODEMOS MANEJAR COMO ESTRATEGIAS CON GIT FLOW Y CUAL ES SU FUNCIÓN?**

En Git Flow existen dos tipos principales de ramas: 

1. **PERMANENTES:** Son las que siempre existen durante la vida del proyecto. (Como MAIN y DEVELOP)
2. **TEMPORALES:** Son las que se crean para tareas específicas y luego se eliminan. (Como FEATURE, RELEASE y HOTFIX)

- **COMANDOS DE GIT (ALGUNOS)**
<img width="1376" height="477" alt="image" src="https://github.com/user-attachments/assets/c74fb314-f3ae-4663-ab5f-2eb50f7efa42" />
<img width="1380" height="489" alt="image" src="https://github.com/user-attachments/assets/1bea8da2-10e4-4553-a950-ba5b7ae9ad02" />
<img width="1376" height="495" alt="image" src="https://github.com/user-attachments/assets/40f42a46-360f-4874-9676-e7b6f17a7f91" />
<img width="1377" height="508" alt="image" src="https://github.com/user-attachments/assets/b7756edb-6a83-4d04-9340-c3a367bdf564" />

 
## **ESTRUCTURA DE DATOS**
Una estructura de datos es una forma de organizar y almacenar datos para que puedan usarse de manera eficiente. 
(TERMINAR)

## **PROGRAMACIÓN FUNCIONAL**
Es un estilo de programación que se enfoca en el uso de funciones como bloques de construcción principales, de forma sencilla. En Java, se utiliza mucho junto con el concepto de lambda expressions
y Stream API para trabajar de manera funcional.

  **CONCEPTOS CLAVES**
  - FUNCIONES PURAS: Funciones que, dado el mismo input, siempre devuelven el mismo output y no tienen efectos secundarios (no modifican variables externas).
  - INMUTABILIDAD: Los datos no se pueden modificar después de ser creados, lo que ayuda a evitar errores y facilita el razonamiento sobre el código.
  - FUNCIONES DE ORDEN SUPERIOR: Funciones que pueden tomar otras funciones como argumentos o devolver funciones como resultado
  - COMPOSICIÓN DE FUNCIONES: Combinar varias funciones para crear una nueva función más compleja, pasando el resultado de una función como entrada a la siguiente.
  - ENFOQUE DECLARATIVO: Se describe qué se quiere lograr, no cómo se debe lograr, evitando detalles de implementación y estructuras de control como bucles

### **LAMBDAS**
- Es una forma corta de escribir funciones o bloques de código que puedes pasar como parámetros a métodos o usar dentro de colecciones. 
- Es una manera de representar una función o procedimiento sin tener que escribir toda la estructura de un método.
- Se integran desde la JDK 8, para incorporar la programación funcional.
- Se conocen también como funciones anónimas, y básicamente implementan métodos sin necesidad de una clase.

Su sintaxis de las expresiones es: *(Para poder utilizar expresiones Lambdas, es necesario implementar Interfaces Funcionales).*
<img width="639" height="146" alt="image" src="https://github.com/user-attachments/assets/37d41db5-d7ff-4bdf-94a9-90f03822792e" />

  *Interfaces Funcionales: Son aquellas que tienen exactamente solo un método abstracto.* Se le debe agregar el @FuncionalInterface en el código. **SIEMPRE SE USA CON LAMBDAS Y CLASES ANONIMAS**

### **REFERENCIA A MÉTODOS (::)**
- Permite usar un método ya existente sin tener que escribir una función anónima o lambda para ejecutarlo.
- Existe cuatro formas de implementar la referencia de métodos:

  *REFERENCIA A UN MÉTODO ESTATICO*
    - Método propio de la clase.
  

### **STREAMS**
  - Es una forma de trabajar con colecciones (como listas o conjuntos) de manera más eficiente y funcional.
  - Sirve para realizar tareas comunes con colecciones como: **Filtrar elementos**, **Agrupar o reducir elementos**, **Operaciones paralelas** y más.

ORDEN DE STREAMS
<img width="849" height="305" alt="image" src="https://github.com/user-attachments/assets/33ce6b4b-0d67-438b-920e-3c0b30690a60" />
<img width="877" height="282" alt="image" src="https://github.com/user-attachments/assets/8047eb13-38fe-4858-8531-b362f1657537" />
