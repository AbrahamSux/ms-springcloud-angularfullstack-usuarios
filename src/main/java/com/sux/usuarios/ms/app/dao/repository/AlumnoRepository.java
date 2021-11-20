/*
 * Proyecto:        MS - USUARIOS
 * A.J. SUX  – Todos los derechos reservados. Para uso exclusivo de Abraham Juárez de la Cruz.
 */
package com.sux.usuarios.ms.app.dao.repository;

import com.sux.usuarios.ms.app.models.entity.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @name AlumnoRepository
 * @description Repositorio que realiza las consultas sobre la entidad {@link Alumno}.
 *
 * @author Abraham Juárez de la Cruz - ajuarezdelacruz93@gmail.com
 * @creationDate 23/10/2021 08:03 PM
 * @version 0.4
 */
@Repository("alumnoRepository")
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {



    /**
     * Método encargado de obtener al Alumno correspondiente del identificador recibido.
     *
     * @param identificador Identificador del Alumno.
     * @return Objeto de tipo Alumno.
     */
    // Alumno findById(Long identificador);

}
