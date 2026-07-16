void main() {
    IO.println("""
        ===========================================
        |   SISTEMA DE MATRÍCULA - PUCE TEC       |
        |      Carrera de Desarrollo de Software  |
        ===========================================
        """);

    String nombreEstudiante = "";
    String PrerrequisitoProgramacion = "Fundamentos de Programación";
    double NotaPrerrequisito = 0.0;
    
    nombreEstudiante = IO.readln("Ingrese el nombre del estudiante: ");
    String EsEstudianteReingreso = IO.readln("¿Es estudiante de reingreso o arrastre? (S/N): ");

    String[] HistorialMaterias = new String[0];

    if (EsEstudianteReingreso.equalsIgnoreCase("S")) {
        HistorialMaterias = new String[]{ PrerrequisitoProgramacion };
        String inputNota = IO.readln("Ingrese la nota final obtenida en '" + PrerrequisitoProgramacion + "' (0-10): ");
        NotaPrerrequisito = Double.parseDouble(inputNota);
    } else {
        IO.println("-> Registrando como estudiante de Primer Semestre...");
        HistorialMaterias = new String[]{};
    }

    IO.println("\n--- MATERIA A SOLICITAR ---");
    IO.println("Materia destino: [ Estructuras de Datos ] (Requisito: Haber aprobado Fundamentos con >= 7.0)");
    String reqCupo = IO.readln("¿Desea solicitar el cupo para esta materia? (S/N): ");

    if (reqCupo.equalsIgnoreCase("S")) {
        boolean TienePrerrequisito = false;

        for (int i = 0; i < HistorialMaterias.length; i++) {
            if (HistorialMaterias[i].equals(PrerrequisitoProgramacion)) {
                TienePrerrequisito = true;
            }
        }

        String resultadoMatricula = switch (String.valueOf(TienePrerrequisito)) {
            case "true" -> {
                if (NotaPrerrequisito >= 7.0) {
                    yield "MATRÍCULA APROBADA: Cumple con el prerrequisito.";
                } else {
                    yield "MATRÍCULA RECHAZADA: Reprobó el prerrequisito con " + NotaPrerrequisito;
                }
            }
            case "false" -> "MATRÍCULA RECHAZADA: No cuenta con el prerrequisito en su historial.";
            default -> "Error del sistema.";
        };

        IO.println("\n[RESULTADO]: " + resultadoMatricula);

    } else {
        IO.println("\nProceso finalizado. No se solicitaron materias de segundo nivel.");
    }
}
