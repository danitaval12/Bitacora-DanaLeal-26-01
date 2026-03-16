# | Bitácora Corte 2 – Semana 1 (N7) |

## Actividades realizadas

### Organización del trabajo en Jira

Para mejorar la gestión del tiempo y la organización académica del semestre, se creó un tablero de planificación en Jira donde se registran todas las actividades académicas.

Cada materia fue organizada como una **Épica**, mientras que cada actividad académica (talleres, parciales, quices y proyectos) se registró como **tareas** con subtareas asociadas.

Las subtareas incluyen actividades como:
- Estudio de teoría
- Resolución de ejercicios
- Simulación de evaluaciones
- Desarrollo de entregas
- Subida de evidencias

El tablero permite realizar seguimiento del progreso semanal mediante las columnas **To Do, In Progress y Done**.

Además en el tema de StoryPoints los acomode de la siguiente manera: 
1. -> Muy Sencillo
2. -> Sencillo
3. -> Medio
5. -> Complejo
8. -> Muy Complejo

Link del tablero de trabajo:
https://nana-works.atlassian.net/jira/software/projects/DLPSS/summary?atlOrigin=eyJpIjoiOTU4YmIyZGM1YjM5NGNiYTkzNDE1NDMyYmQyZjQ1YmYiLCJwIjoiaiJ9



### Implementar Ejercicios en Java con Streams

Durante esta actividad se desarrolló un sistema simple de análisis académico utilizando programación funcional en Java. A partir de un modelo de datos compuesto por las clases `Student` y `Grade`, se implementaron diferentes operaciones para analizar el rendimiento de los estudiantes y sus calificaciones.
La solución fue desarrollada utilizando la API de **Streams de Java**, permitiendo procesar colecciones de datos mediante operaciones como filtrado, transformación, agrupamiento y cálculo de promedios, cumpliendo además con la restricción de no utilizar ciclos tradicionales como `for` o `while`. Además, por lo que explicamos en clase organizamos tipo MVC.

#### Propuesta adicional 11

Como propuesta adicional se implementó un método que calcula el **promedio general del semestre por estudiante**, utilizando el identificador del estudiante como clave del resultado.

El método recorre la lista de estudiantes y calcula el promedio de todas sus calificaciones registradas, retornando un `Map` donde:

- La clave corresponde al **ID del estudiante**
- El valor corresponde al **promedio de sus notas**

Este análisis permite identificar de manera rápida el rendimiento académico general de cada estudiante dentro del sistema.


#### Propuesta adicional 12

Como segunda propuesta adicional se implementó un método que identifica los **estudiantes cuyo promedio general es superior a 4.0**.

El objetivo de esta funcionalidad es detectar estudiantes con un rendimiento académico destacado. Para ello se calcula el promedio de las notas de cada estudiante y se filtran aquellos cuyo promedio supera el valor establecido.

El resultado es una lista de estudiantes que presentan un desempeño académico alto dentro del sistema.

---

## Dificultades encontradas

- Al inicio resultó un poco extraño organizar las actividades en Jira, ya que normalmente 
utilizo un calendario de Gmail donde gestiono tanto mis actividades académicas como personales. 
Adaptarme a una nueva herramienta de organización requiere un proceso de ajuste.
---

## Tiempo estimado vs el Tiempo Real

| Tiempo Estimado | Tiempo Real     | Explicación                                                                                                                                                                          |
|-----------------|-----------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 2 Horas Diarias | 4 Horas Diarias | En tema de Orden de JIRA ya que no tenía creado el apartado para organización semanal y lo demás a crear.                                                                            |
| 2 Horas Diarias | 3 Horas Diarias | Me volví a acoplar de las pruebas unitarias las cuales realizabamos en POO, sin embargo, fue divertido y de aprendizaje volver a intentar código con Streams y con pruebas unitarias |

---

## Reflexión sobre gestión del tiempo

- Pues organizar todas las actividades de la semana puede ser un reto debido a la cantidad de compromisos académicos. Sin embargo, procuro cumplir con todas las entregas y mantener un buen nivel en los trabajos realizados.

- En tema de el desafío de código fue bueno repasar el tema de las pruebas unitarias, además del tema de los Streams, el cuál en su momento me genero muchas dudas y siento que ahorita no me siento super experta, pero puedo sacar adelante un código.
Además, el tiempo me jugo en contra, ya que, necesite repasar el tema de los STREAMS. 
---

## Evidencias

### JIRA

- TABLERO

![imgN7(3).png](../../../../../../../docs/image/imgN7%283%29.png)

- BACKLOG

![imgN7(1).png](../../../../../../../docs/image/imgN7%281%29.png)

- TAREAS CREADAS

![imgN7(2).png](../../../../../../../docs/image/imgN7%282%29.png)

### Implementar ejercicios en Java con Streams

- PRUEBAS UNITARIAS
![imgN7(4).png](../../../../../../../docs/image/SemanaN7/imgN7%284%29.png)
