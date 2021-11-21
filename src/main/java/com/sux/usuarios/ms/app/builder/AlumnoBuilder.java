/*
 * Proyecto:        MS - USUARIOS
 * A.J. SUX  – Todos los derechos reservados. Para uso exclusivo de Abraham Juárez de la Cruz.
 */
package com.sux.usuarios.ms.app.builder;

import com.sux.usuarios.ms.app.models.dto.AlumnoDTO;
import com.sux.usuarios.ms.app.models.entity.Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @name AlumnoBuilder
 * @description Builder que se encaraga de fabricar objetos Entity a partir de objetos DTO y viceversa.
 *
 * @author Abraham Juárez de la Cruz - ajuarezdelacruz93@gmail.com
 * @creationDate 23/10/2021 08:43 PM
 * @version 0.4
 */
public class AlumnoBuilder {



    public AlumnoBuilder() {
    }

    
    /**
     * Método que construye una lista de objetos de tipo AlumnoDTO a partir de una lista de objetos de tipo Alumno.
     *
     * @param alumnoList Lista de Alumnos de tipo Entity.
     * @return Lista de Alumnos de tipo DTO.
     */
    public static List<AlumnoDTO> buildAlumnoDTOListFromAlumnoList(List<Alumno> alumnoList) {
        List<AlumnoDTO> alumnosDTOList = null;

        if (null != alumnoList) {
            alumnosDTOList = new ArrayList<>();
            for (Alumno alumno : alumnoList) {
                alumnosDTOList.add(buildAlumnoDTOFromAlumno(alumno));
            }
        }

        return alumnosDTOList;
    }

    /**
     * Método que convierte de un entity de tipo Alumno a un objeto de tipo AlumnoDTO.
     *
     * @param alumno Entidad Alumno.
     * @return Objeto AlumnoDTO.
     */
    public static AlumnoDTO buildAlumnoDTOFromAlumno(Alumno alumno) {
        AlumnoDTO alumnoDTO = null;

        if (null != alumno) {
            alumnoDTO = new AlumnoDTO();
            alumnoDTO.setId(alumno.getId());
            alumnoDTO.setNombre(alumno.getNombre());
            alumnoDTO.setApellidoPaterno(alumno.getApellidoPaterno());
            alumnoDTO.setApellidoMaterno(alumno.getApellidoMaterno());
            alumnoDTO.setEmail(alumno.getEmail());
            alumnoDTO.setCreateAt(alumno.getCreateAt());
        }

        return alumnoDTO;
    }

    /**
     * Método que construye un entity Alumno a partir de un objeto tipo AlumnoDTO.
     *
     * @param alumnoDTO Objeto AlumnoDTO.
     * @return Entidad Alumno.
     */
    public static Alumno buildAlumnoFromAlumnoDTO(AlumnoDTO alumnoDTO) {
        Alumno alumnoEntity = null;

        if (null != alumnoDTO) {
            alumnoEntity = new Alumno();
            alumnoEntity.setId(alumnoDTO.getId());
            alumnoEntity.setNombre(alumnoDTO.getNombre());
            alumnoEntity.setApellidoPaterno(alumnoDTO.getApellidoPaterno());
            alumnoEntity.setApellidoMaterno(alumnoDTO.getApellidoMaterno());
            alumnoEntity.setEmail(alumnoDTO.getEmail());
            alumnoEntity.setCreateAt( alumnoDTO.getId() != null ? alumnoDTO.getCreateAt() : null );
        }

        return alumnoEntity;
    }

    /**
     * Método que construye un AlumnoDTO a partir de un objeto de tipo Optional<AlumnoDTO> y otro AlumnoDTO.
     *
     * @param optional Optional de tipo AlumnoDTO.
     * @param alumnoDTO Objeto de tipo AlumnoDTO.
     * @return Objeto AlumnoDTO
     */
    public static AlumnoDTO buildAlumnoDTOUpdatedForAlumnoOptional(Optional<AlumnoDTO> optional, AlumnoDTO alumnoDTO) {
        AlumnoDTO alumnoDTOUpdated = null;

        if (optional.isPresent() && alumnoDTO!=null) {
            alumnoDTOUpdated = new AlumnoDTO();
            alumnoDTOUpdated.setId(optional.get().getId());
            alumnoDTOUpdated.setNombre(alumnoDTO.getNombre());
            alumnoDTOUpdated.setApellidoPaterno(alumnoDTO.getApellidoPaterno());
            alumnoDTOUpdated.setApellidoMaterno(alumnoDTO.getApellidoMaterno());
            alumnoDTOUpdated.setEmail(alumnoDTO.getEmail());
            alumnoDTOUpdated.setCreateAt(optional.get().getCreateAt());
        }

        return alumnoDTOUpdated;
    }

}
