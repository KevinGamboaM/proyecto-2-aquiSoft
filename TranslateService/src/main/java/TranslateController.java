@RestController
@RequestMapping("/translate")
public class TranslateController {
    @PostMapping("/text")
    public ResponseEntity<String> translateText(@RequestBody String text) {
        // Simulación de traducción
        String translatedText = "Texto traducido";  // Traducir el texto
        return ResponseEntity.ok(translatedText);
    }
}
