package com.gtd.prueba.model.bill;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;


@Entity
@Table(name = "factura")
@Data
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "noFactura", nullable = false)
    private Integer id;

    @Column(name = "codFactura", nullable = false)
    private Integer codFactura;

    @Column(name = "fecha", nullable = false)
    private Instant fecha;

    @Column(name = "estado", nullable = false, length = 20)
    private String estado;
}
