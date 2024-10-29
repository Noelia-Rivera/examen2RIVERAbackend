package pe.upeu.edu.Examen.dao;

import java.util.List;
import java.util.Optional;

import pe.upeu.edu.Examen.entity.Carrera;

public interface CarreraDao {
	Carrera create(Carrera ca);
	Carrera update(Carrera ca);
	void delete(Long id);
	Optional<Carrera> read(Long id);
	List<Carrera> readAll();
}
