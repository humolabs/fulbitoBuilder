package humolabs.com.fulbitobuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by ALE on 21/09/2016.
 */

public class Partido {
        private Cancha cancha;
        private String horario;
        private Ubicacion ubicacion;
        private List<Jugador> jugadores;

    public Partido(){

    }

    public Partido(Cancha cancha, String horario, Ubicacion ubicacion, List<Jugador> jugadores) {
        this.cancha = cancha;
        this.horario = horario;
        this.ubicacion = ubicacion;
        this.jugadores = jugadores;
    }

    public Cancha getCancha() {
        return cancha;
    }
    @JsonProperty("cancha")
    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }

    public String getHorario() {
        return horario;
    }
    @JsonProperty("horario")
    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
    @JsonProperty("ubicacion")
    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }
    @JsonProperty("jugadores")
    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
