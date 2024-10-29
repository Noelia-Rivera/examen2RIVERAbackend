package pe.upeu.edu.Examen.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.upeu.edu.Examen.dao.FacultadDao;
import pe.upeu.edu.Examen.entity.Facultad;
import pe.upeu.edu.Examen.repository.FacultadRepository;

@Component
public class FacultadDaoImpl implements FacultadDao{
	@Autowired
	private FacultadRepository repository;
	
	@Override
	public Facultad create(Facultad fa) {
		// TODO Auto-generated method stub
		return repository.save(fa);
	}

	@Override
	public Facultad update(Facultad fa) {
		// TODO Auto-generated method stub
		return repository.save(fa);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Facultad> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Facultad> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
