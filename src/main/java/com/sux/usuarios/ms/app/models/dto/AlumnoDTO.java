/*
 * Proyecto:        MS - USUARIOS
 * A.J. SUX  – Todos los derechos reservados. Para uso exclusivo de Abraham Juárez de la Cruz.
 */
package com.sux.usuarios.ms.app.models.dto;

import java.util.Date;

/**
 * @name AlumnoDTO
 * @description Clase que encapsula la informacion perteneciente a un Alumno.
 *
 * @author Abraham Juárez de la Cruz - ajuarezdelacruz93@gmail.com
 * @creationDate 23/10/2021 08:48 PM
 * @version 0.2
 */
public class AlumnoDTO {

    private Long id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String email;
    private Date createAt;

    public AlumnoDTO() {
    }

    public AlumnoDTO(Long id, String nombre, String apellidoPaterno, String apellidoMaterno,
                     String email, Date createAt) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.email = email;
        this.createAt = createAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return "AlumnoDTO{" +
                "idAlumno=" + id +
                ", nombreAlumno='" + nombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", emailAlumno='" + email + '\'' +
                ", createAtAlumno=" + createAt +
                '}';
    }

}
