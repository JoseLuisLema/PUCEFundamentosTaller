Integrantes:
Luis David Flores Hurtado
Jose Luis Lema Garcia
Sistema de Validacion de Matricula - PUCE TEC
Este programa automatiza la validacion de matriculas para los estudiantes de la carrera de Desarrollo de Software en el PUCE TEC. Su funcion principal es controlar el acceso a la materia "Estructuras de Datos", verificando que el alumno haya aprobado previamente su prerrequisito obligatorio,"Fundamentos de Programacion", con una nota minima de 7.0.
Descripcion del Problema
El sistema se encarga de:
Registrar los datos basicos del alumno.
Identificar si es un estudiante de reingreso o de primer semestre (arrastre).
Revisar su historial academico para verificar el cumplimiento de requisitos.
Determinar de forma automatica si la matricula es aprobada o rechazada.
Reconocer con un mensaje especial a los estudiantes que obtuvieron una calificacion perfecta (10.0).
Flujo de Datos del Sistema
1.- Inicio: El sistema da la bienvenida, presenta la informacipon de la aplicacion y solicita el nombre del estudiante.
2.- Clasificacion: El usuario indica si es de reingreso o arrastre. Dependiendo de la seleccion, el programa solicita la nota obtenida en la materia prerrequisito.
3.- Registro: Se guarda "Fundamentos de Programacion" como la asignatura llave para evaluar el acceso a "Estructuras de Datos".
4.- Verificacion: El alumno solicita el cupo y el sistema busca en su historial si cumple con el prerrequisito.
5.- Decisiones:
Nota >= 7.0: Matricula aprobada.
Nota < 7.0: Matricula rechazada.
Nota = 10.0: Matricula aprobada + reconocimiento especial como Tutor de Programacion.
6.- Resultado: El sistema muestra en pantalla el estado final del proceso de matricul