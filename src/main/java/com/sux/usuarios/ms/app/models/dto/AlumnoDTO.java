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
 * @version 0.1
 */
public class AlumnoDTO {

    private Long idAlumno;
    private String nombreAlumno;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String emailAlumno;
    private Date createAtAlumno;

    public AlumnoDTO() {
    }

    public AlumnoDTO(Long idAlumno, String nombreAlumno, String apellidoPaterno, String apellidoMaterno,
                     String emailAlumno, Date createAtAlumno) {
        this.idAlumno = idAlumno;
        this.nombreAlumno = nombreAlumno;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.emailAlumno = emailAlumno;
        this.createAtAlumno = createAtAlumno;
    }

    public Long getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Long idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
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

    public String getEmailAlumno() {
        return emailAlumno;
    }

    public void setEmailAlumno(String emailAlumno) {
        this.emailAlumno = emailAlumno;
    }

    public Date getCreateAtAlumno() {
        return createAtAlumno;
    }

    public void setCreateAtAlumno(Date createAtAlumno) {
        this.createAtAlumno = createAtAlumno;
    }

    @Override
    public String toString() {
        return "AlumnoDTO{" +
                "idAlumno=" + idAlumno +
                ", nombreAlumno='" + nombreAlumno + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", emailAlumno='" + emailAlumno + '\'' +
                ", createAtAlumno=" + createAtAlumno +
                '}';
    }

}
