/*
 * @fileoverview    {MedicamentoOnlineDTO} se encarga de realizar tareas específicas.
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementación realizada.
 * @version 2.0     Documentación agregada.
 */
package com.project.dev.api.dto;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO: Definición de {@code MedicamentoOnlineDTO}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class MedicamentoOnlineDTO {

    private Long intIdMedicamento;
    private Date dtFechaDescarga;
    private String strCantidad;
    private String strConcentracion;
    private String strDescripcion;
    private String strEan;
    private String strImagen;
    private String strLaboratorio;
    private String strMarca;
    private String strNombre;
    private String strPaginaProducto;
    private String strPrecioUnitario;
    private String strPresentacion;
    private String strPrincipioActivo;
    private String strRegistroInvima;
    private Long intIdPortalOrigen;

}
