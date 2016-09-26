package humolabs.com.fulbitobuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by ALE on 21/09/2016.
 */
public class Ubicacion {
    private String latitud;
    private String longitud;

    public Ubicacion(){

    }

    public Ubicacion(String latitud, String longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public String getLatitud() {
        return latitud;
    }
    @JsonProperty("latitud")
    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }


    public String getLongitud() {
        return longitud;
    }
    @JsonProperty("longitud")
    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

}
