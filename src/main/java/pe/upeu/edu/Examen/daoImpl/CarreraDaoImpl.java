package pe.upeu.edu.Examen.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.upeu.edu.Examen.dao.CarreraDao;
import pe.upeu.edu.Examen.entity.Carrera;
import pe.upeu.edu.Examen.repository.CarreraRepository;

@Component
public class CarreraDaoImpl implements CarreraDao{
	@Autowired
	private CarreraRepository repository;
	
	@Override
	public Carrera create(Carrera ca) {
		// TODO Auto-generated method stub
		return repository.save(ca);
	}

	@Override
	public Carrera update(Carrera ca) {
		// TODO Auto-generated method stub
		return repository.save(ca);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Carrera> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Carrera> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
