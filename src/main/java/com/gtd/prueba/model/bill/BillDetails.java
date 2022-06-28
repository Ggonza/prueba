package com.gtd.prueba.model.bill;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "detallesFactura")
@Data
public class BillDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "noDetalle", nullable = false)
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codFactura", nullable = false, referencedColumnName = "codFactura")
    private Bill codFactura;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "precio", precision = 19, scale = 4)
    private BigDecimal precio;

    @Column(name = "importe", nullable = false, precision = 19, scale = 4)
    private BigDecimal importe;

    @Column(name = "detalle", length = 500)
    private String detalle;
}
