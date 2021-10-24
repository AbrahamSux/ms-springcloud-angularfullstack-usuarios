/*
 * Proyecto:        MS - USUARIOS
 * A.J. SUX  – Todos los derechos reservados. Para uso exclusivo de Abraham Juárez de la Cruz.
 */
package com.sux.usuarios.ms.app.models.repository;

import com.sux.usuarios.ms.app.models.entity.Alumno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Nombre: AlumnoRepository
 * Descripcion: Repositorio que realiza las consultas sobre la entidad {@link Alumno}.
 *
 * @author Abraham Juárez de la Cruz - ajuarezdelacruz93@gmail.com
 * Fecha: 23/10/2021 08:03 PM
 * @version 0.1
 */
@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
}
