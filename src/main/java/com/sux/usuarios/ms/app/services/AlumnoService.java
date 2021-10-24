/*
 * Proyecto:        MS - USUARIOS
 * A.J. SUX  – Todos los derechos reservados. Para uso exclusivo de Abraham Juárez de la Cruz.
 */
package com.sux.usuarios.ms.app.services;

import com.sux.usuarios.ms.app.models.dto.AlumnoDTO;
import com.sux.usuarios.ms.app.models.entity.Alumno;

import java.util.List;
import java.util.Optional;

/**
 * @name AlumnoService
 * @description Interfaz que contiene las operaciones a realizar sobre la entidad {@link Alumno}.
 *
 * @author Abraham Juárez de la Cruz - ajuarezdelacruz93@gmail.com
 * @creationDate 23/10/2021 08:34 PM
 * @version 0.1
 */
public interface AlumnoService {

    /**
     * Método encargado de obtener una iteración de objetos de tipo AlumnoDTO.
     *
     * @return Lista de objetos de tipo AlumnoDTO.
     */
    List<AlumnoDTO> findAll();

    /**
     * Metodo que regresa un objeto de tipo AlumnoDTO en base a un identificador recibido.
     *
     * @param identificador Identificador del Alumno.
     * @return Objeto de tipo AlumnoDTO.
     */
    AlumnoDTO findById(Long identificador);

    /**
     * Método encargado de mandar a guardar al objeto de tipo AlumnoDTO recibido.
     *
     * @param alumnoDTO Objeto Alumno.
     * @return Objeto de tipo AlumnoDTO.
     */
    AlumnoDTO save(AlumnoDTO alumnoDTO);

    /**
     * Método encargado de mandar a eliminar al Alumno correspondiente al identificador recibido.
     *
     * @param identificador Identificador del Alumno.
     * @return TRUE si el alumno se elimino correctamente, FALSE en caso contrario.
     */
    boolean deleteById(Long identificador);

}
