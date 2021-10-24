/*
 * Proyecto:        MS - USUARIOS
 * A.J. SUX  – Todos los derechos reservados. Para uso exclusivo de Abraham Juárez de la Cruz.
 */
package com.sux.usuarios.ms.app.services.impl;

import com.sux.usuarios.ms.app.builder.AlumnoBuilder;
import com.sux.usuarios.ms.app.dao.repository.AlumnoRepository;
import com.sux.usuarios.ms.app.models.dto.AlumnoDTO;
import com.sux.usuarios.ms.app.models.entity.Alumno;
import com.sux.usuarios.ms.app.services.AlumnoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @name AlumnoService
 * @description Implementación de la interface {@link AlumnoService} que define las operaciones realizar sobre
 * la entidad {@link Alumno}.
 *
 * @author Abraham Juárez de la Cruz - ajuarezdelacruz93@gmail.com
 * @creationDate 23/10/2021 09:45 PM
 * @version 0.1
 */
@Service("alumnoServiceImpl")
public class AlumnoServiceImpl implements AlumnoService {

    /**
     * Utilizado para manipular los mensajes informativos y de error.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(AlumnoServiceImpl.class);


    @Autowired
    @Qualifier("alumnoRepository")
    private AlumnoRepository alumnoRepository;



    // METODOS

    @Override
    @Transactional(readOnly = true)
    public List<AlumnoDTO> findAll() {

        if (LOGGER.isInfoEnabled()) {
            LOGGER.info(">>> findAll()");
        }

        List<AlumnoDTO> alumnosDTOList = AlumnoBuilder.buildAlumnoDTOListFromAlumnoList(alumnoRepository.findAll());

        if (LOGGER.isInfoEnabled()) {
            if (alumnosDTOList != null) {
                for (AlumnoDTO alumnoDTO: alumnosDTOList) {
                    LOGGER.info("AlumnoDTO : {}", alumnoDTO.toString());
                }
            }
        }

        return alumnosDTOList;
    }

    @Override
    @Transactional(readOnly = true)
    public AlumnoDTO findById(Long identificador) {

        if (LOGGER.isInfoEnabled()) {
            LOGGER.info(">>> findById( {} )", identificador);
        }

        Alumno alumno = alumnoRepository.findById(identificador);

        AlumnoDTO alumnoDTO = AlumnoBuilder.buildAlumnoDTOFromAlumno(alumno);

        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("Alumno DTO : " + alumnoDTO.toString());
        }

        return alumnoDTO;
    }

    @Override
    @Transactional
    public AlumnoDTO save(AlumnoDTO alumnoDTO) {

        if (LOGGER.isInfoEnabled()) {
            LOGGER.info(">>> save( {} )", alumnoDTO.toString());
        }

        Alumno alumno = AlumnoBuilder.buildAlumnoFromAlumnoDTO(alumnoDTO);

        AlumnoDTO alumnoDTOSave = AlumnoBuilder.buildAlumnoDTOFromAlumno(alumnoRepository.save(alumno));

        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("Save Alumno DTO : " + alumnoDTOSave.toString());
        }

        return alumnoDTOSave;
    }

    @Override
    @Transactional
    public boolean deleteById(Long identificador) {

        if (LOGGER.isInfoEnabled()) {
            LOGGER.info(">>> deleteById( {} )", identificador);
        }

        boolean response = Boolean.FALSE;

        Alumno alumno = alumnoRepository.findById(identificador);

        if (alumno != null) {
            alumnoRepository.deleteById(Math.toIntExact(identificador));
            response = Boolean.TRUE;
        }


        return response;
    }

}
