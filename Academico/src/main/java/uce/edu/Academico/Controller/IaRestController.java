package uce.edu.Academico.Controller;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ia")
@CrossOrigin(origins = "*")
public class IaRestController {


    private final String GEMINI_API_KEY = "AQ.Ab8RN6JFCJqzFWKgdMcqF6DEzv0TtlNRIfRTakZAnfphjvwEgg";

    private final String GEMINI_URL = "https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash:generateContent?key=";

    @PostMapping("/analizar")
    public String analizarInterfaz(@RequestBody ConsultaIa consulta) {
        try {
            String promptSistema = "Actúa como un auditor senior de experiencia de usuario (UX) e interfaces web (UI). "
                    + "Analiza los detalles de este proyecto web académico desarrollado con Spring Boot, PostgreSQL y Vanilla JS. "
                    + "Proporciona una crítica técnica constructiva y estructurada con: "
                    + "1) Calificación General de Usabilidad (del 1 al 10), "
                    + "2) Puntos Fuertes del Diseño y la Arquitectura, "
                    + "3) 3 Sugerencias Concretas de Mejora en UI/UX o Accesibilidad, "
                    + "4) Veredicto Final. "
                    + "Responde de forma clara y profesional en español. "
                    + "Pregunta o contexto del estudiante: " + consulta.getMensaje();

            String jsonPayload = """
                {
                  "contents": [{
                    "parts": [{"text": "%s"}]
                  }]
                }
                """.formatted(promptSistema.replace("\"", "\\\"").replace("\n", " ").replace("\r", " "));

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(GEMINI_URL + GEMINI_API_KEY))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(jsonPayload))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();

        } catch (Exception e) {
            return "{\"error\": \"Error al conectar con el agente de IA: " + e.getMessage() + "\"}";
        }
    }

    public static class ConsultaIa {
        private String mensaje;
        public String getMensaje() { return mensaje; }
        public void setMensaje(String mensaje) { this.mensaje = mensaje; }
    }
}