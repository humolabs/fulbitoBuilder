package humolabs.com.fulbitobuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by ALE on 21/09/2016.
 */
public class Jugador {
    private String usuario;

    public Jugador(){

    }

    public Jugador(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }
    @JsonProperty("usuario")
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
