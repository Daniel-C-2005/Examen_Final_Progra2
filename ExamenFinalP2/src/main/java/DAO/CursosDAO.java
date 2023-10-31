package DAO;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cursos", schema = "public")
public class CursosDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    private Long id;

    @Column(name = "nombre_curso")
    private String nombreCurso;

    @Column(name = "profesor")
    private String profesor;

    @OneToMany(mappedBy = "curso")
    private List<InscripcionesDAO> inscripciones;

    public CursosDAO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<InscripcionesDAO> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(List<InscripcionesDAO> inscripciones) {
        this.inscripciones = inscripciones;
    }

    public CursosDAO(Long id, String nombreCurso, String profesor) {
        this.id = id;
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "CursosDAO{" +
                "id=" + id +
                ", nombreCurso='" + nombreCurso + '\'' +
                ", profesor='" + profesor + '\'' +
                '}';
    }
}
