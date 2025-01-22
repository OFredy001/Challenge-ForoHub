package com.fororhubalura.forohub.domain.respuesta.validaciones.actualizar;

import com.fororhubalura.forohub.domain.respuesta.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {

    public void validate(ActualizarRespuestaDTO data, Long respuestaId);

}
