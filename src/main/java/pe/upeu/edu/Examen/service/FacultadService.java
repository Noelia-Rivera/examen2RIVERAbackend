package pe.upeu.edu.Examen.service;

import java.util.List;
import java.util.Optional;

import pe.upeu.edu.Examen.entity.Facultad;

public interface FacultadService {
	Facultad create(Facultad fa);
	Facultad update(Facultad fa);
	void delete(Long id);
	Optional<Facultad> read(Long id);
	List<Facultad> readAll();
}
