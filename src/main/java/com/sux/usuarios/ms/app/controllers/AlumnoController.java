/*
 * Proyecto:        MS - USUARIOS
 * A.J. SUX  – Todos los derechos reservados. Para uso exclusivo de Abraham Juárez de la Cruz.
 */
package com.sux.usuarios.ms.app.controllers;

import com.sux.usuarios.ms.app.builder.AlumnoBuilder;
import com.sux.usuarios.ms.app.models.dto.AlumnoDTO;
import com.sux.usuarios.ms.app.services.AlumnoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * @name AlumnoController
 * @description Clase que expone el servicio REST para las operaciones relacionadas con el alumno.
 *
 * @author Abraham Juárez de la Cruz - ajuarezdelacruz93@gmail.com
 * @creationDate 23/10/2021 10:42 PM
 * @version 0.3
 */
@RestController
@RequestMapping("/alumnos/app")
public class AlumnoController {

    /**
     * Utilizado para manipular los mensajes informativos y de error.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(AlumnoController.class);


    @Autowired
    @Qualifier("alumnoServiceImpl")
    private AlumnoService alumnoService;



    // METODOS

    @GetMapping("/alumnos")
    public ResponseEntity<?> obtenerListaAlumnos() {

        if (LOGGER.isInfoEnabled()) {
            LOGGER.info(">>> obtenerListaAlumnos()");
        }

        Iterable<AlumnoDTO> listAlumnos = alumnoService.findAll();

        return ResponseEntity.ok().body(listAlumnos);
    }

    @GetMapping("/obtener/{id}")
    public ResponseEntity<?> obtenerAlumno(@PathVariable(name = "id") Long identificador) {

        if (LOGGER.isInfoEnabled()) {
            LOGGER.info(">>> obtenerAlumno( {} )", identificador);
        }

        Optional<AlumnoDTO> alumnoDTO = alumnoService.findById(identificador);

        if (!alumnoDTO.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(alumnoDTO);
    }

    @PostMapping("/alumno")
    public ResponseEntity<?> guardarAlumno(@RequestBody AlumnoDTO alumno) {

        if (LOGGER.isInfoEnabled()) {
            LOGGER.info(">>> guardarAlumno( {} )", alumno.toString());
        }

        AlumnoDTO alumnoDTO = alumnoService.save(alumno);

        return ResponseEntity.status(HttpStatus.CREATED).body(alumnoDTO);
    }

    @PutMapping("/alumno/{id}")
    public ResponseEntity<?> editarAlumno(@RequestBody AlumnoDTO alumno, @PathVariable(name = "id") Long identificador) {

        if (LOGGER.isInfoEnabled()) {
            LOGGER.info(">>> editarAlumno( {}, {} )", alumno.toString(), identificador);
        }

        Optional<AlumnoDTO> optional = alumnoService.findById(identificador);

        if (optional.isPresent()) {
            AlumnoDTO alumnoDTO = AlumnoBuilder.buildAlumnoDTOUpdatedforAlumnoOptional(optional, alumno);

            if (alumno != null) {
                return ResponseEntity.status(HttpStatus.CREATED).body(alumnoService.save(alumnoDTO));
            }
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarAlumno(@PathVariable(name = "id") Long identificador) {

        if (LOGGER.isInfoEnabled()) {
            LOGGER.info(">>> eliminarAlumno( {} )", identificador);
        }

        boolean response = alumnoService.deleteById(identificador);

        return ResponseEntity.ok(response);
    }

}
