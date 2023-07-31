/*
Un profesor particular está dando cursos para grupos de cinco alumnos
y necesita un programa para organizar la información de cada curso.
Para ello, crearemos una clase entidad llamada Curso, cuyos atributos
serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana,
turno (mañana o tarde), precioPorHora y alumnos. Donde alumnos es un
arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno.
 */
package Entidad;

/**
 *
 * @author Ramiro
 */
public class Curso {
    private String nombreCurso, turno;
    private int cantidadHorasXDia, cantidadDiasXSemana;
    private double precioXHora;
    private String[] alumnos = new String[5];

    public Curso() {
    }

    public Curso(String nombreCurso, String turno, int cantidadHorasXDia, int cantidadDiasXSemana, double precioXHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.turno = turno;
        this.cantidadHorasXDia = cantidadHorasXDia;
        this.cantidadDiasXSemana = cantidadDiasXSemana;
        this.precioXHora = precioXHora;
        this.alumnos = alumnos;
    }

    

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getCantidadHorasXDia() {
        return cantidadHorasXDia;
    }

    public void setCantidadHorasXDia(int cantidadHorasXDia) {
        this.cantidadHorasXDia = cantidadHorasXDia;
    }

    public int getCantidadDiasXSemana() {
        return cantidadDiasXSemana;
    }

    public void setCantidadDiasXSemana(int cantidadDiasXSemana) {
        this.cantidadDiasXSemana = cantidadDiasXSemana;
    }

    public double getPrecioXHora() {
        return precioXHora;
    }

    public void setPrecioXHora(double precioXHora) {
        this.precioXHora = precioXHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    
    
    
}
