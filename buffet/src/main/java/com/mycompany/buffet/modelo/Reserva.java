package com.mycompany.buffet.modelo;

import com.mycompany.buffet.modelo.Producto;
import java.time.LocalDateTime;

public class Reserva {
    private Producto producto;
    private int cantidad;
    private LocalDateTime horario; // Cambiado a LocalDateTime

    public Reserva(Producto producto, int cantidad, LocalDateTime horario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.horario = horario;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public LocalDateTime getHorario() {
        return horario; // Ahora devuelve LocalDateTime
    }

    // M�todo para obtener el horario en el formato requerido para la base de datos
    public String getHorarioFormateado() {
        return horario.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
