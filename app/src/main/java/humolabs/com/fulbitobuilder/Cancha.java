package humolabs.com.fulbitobuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by ALE on 21/09/2016.
 */
public class Cancha {
    private String nombre;
    private String direccion;
    private Integer capacidad;
    private String tipo;

    public Cancha(){

    }

    public Cancha(String nombre, String direccion, Integer capacidad, String tipo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }
    @JsonProperty("nombre")
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }
    @JsonProperty("direccion")
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCapacidad() {
        return capacidad;
    }
    @JsonProperty("capacidad")
    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }
    @JsonProperty("tipo")
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
