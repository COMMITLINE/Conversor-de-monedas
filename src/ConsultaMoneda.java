import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class ConsultaMoneda {

    // Método
    public Moneda consultaMonedaorigen(String tipoMoneda) {
        // Vamos a conectarnos con la API con el método HttpRequest.
        // Aquí creamos la dirección URI, y además le concatenamos el tipoMoneda que capturará el método creado
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/e00084b7f0cee4eda9f990c2/latest/" + tipoMoneda);
        System.out.println("Connecting to: " + direccion);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        // Ahora aplicamos un HttpResponse y elegiremos una opción de try-catch para controlar un error.
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("No encontré la conversión: ", e);
        }
    }
}
