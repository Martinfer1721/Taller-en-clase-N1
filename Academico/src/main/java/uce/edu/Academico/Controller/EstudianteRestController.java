package uce.edu.Academico.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import uce.edu.Academico.Model.Estudiante;
import uce.edu.Academico.Service.EstudianteService;

/**
 * API REST del CRUD de Estudiante.
 */
@RestController
@RequestMapping("/api/estudiantes")
@CrossOrigin(origins = "*") // permite que el HTML se abra desde otro puerto o desde un archivo
public class EstudianteRestController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    public List<Estudiante> listar() {
        return estudianteService.listarEstudiante();
    }

    @GetMapping("/{id}")
    public Estudiante obtener(@PathVariable Long id) {
        return estudianteService.getEstudiantePorNumMatri(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Estudiante crear(@RequestBody Estudiante estudiante) {
        estudiante.setNumMatricula(null); // la BD genera el número de matrícula
        return estudianteService.insertarEstudiante(estudiante);
    }

    @PutMapping("/{id}")
    public Estudiante actualizar(@PathVariable Long id, @RequestBody Estudiante estudiante) {
        estudianteService.getEstudiantePorNumMatri(id); // lanza error si no existe
        estudiante.setNumMatricula(id);
        return estudianteService.insertarEstudiante(estudiante);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id) {
        estudianteService.eliminarEstPorNumMatri(id);
    }
}
