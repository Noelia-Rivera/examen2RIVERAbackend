package pe.upeu.edu.Examen.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.upeu.edu.Examen.dao.FacultadDao;
import pe.upeu.edu.Examen.entity.Facultad;
import pe.upeu.edu.Examen.service.FacultadService;

@Service
public class FacultadServiceImpl implements FacultadService{
	@Autowired
	private FacultadDao dao;
	
	@Override
	public Facultad create(Facultad fa) {
		// TODO Auto-generated method stub
		return dao.create(fa);
	}

	@Override
	public Facultad update(Facultad fa) {
		// TODO Auto-generated method stub
		return dao.update(fa);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Facultad> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Facultad> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
	
}
