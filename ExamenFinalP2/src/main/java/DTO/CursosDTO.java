package DTO;

import java.util.Objects;

public class CursosDTO {
    private int idCurso;
    private String nombreCurso;
    private String profesor;

    public int getIdCurso() {

        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CursosDTO cursosDTO = (CursosDTO) o;
        return idCurso == cursosDTO.idCurso && Objects.equals(nombreCurso, cursosDTO.nombreCurso) && Objects.equals(profesor, cursosDTO.profesor);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idCurso, nombreCurso, profesor);
    }
}
