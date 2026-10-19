package uce.edu.Academico.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uce.edu.Academico.Model.Estudiante;
import uce.edu.Academico.Repository.EstudianteRepository;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    public Estudiante insertarEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    public List<Estudiante> listarEstudiante() {
        return estudianteRepository.findAll();
    }

    public Estudiante getEstudiantePorNumMatri(long numMatricula) {
        Optional<Estudiante> optional = estudianteRepository.findById(numMatricula);
        Estudiante estudiante = null;
        if (optional.isPresent()) {
            estudiante = optional.get();
        } else {
            throw new RuntimeException(" Estudiaten no encontrado "
                    + "con este Num Matricula:" + numMatricula);
        }
        return estudiante;
    }

    public void eliminarEstPorNumMatri(long numMat) {
        this.estudianteRepository.deleteById(numMat);
    }
}
