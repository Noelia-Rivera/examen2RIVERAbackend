package pe.upeu.edu.Examen.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.upeu.edu.Examen.dao.CarreraDao;
import pe.upeu.edu.Examen.entity.Carrera;
import pe.upeu.edu.Examen.service.CarreraService;

@Service
public class CarreraServiceImpl implements CarreraService{
	@Autowired
	private CarreraDao dao;
	
	@Override
	public Carrera create(Carrera ca) {
		// TODO Auto-generated method stub
		return dao.create(ca);
	}

	@Override
	public Carrera update(Carrera ca) {
		// TODO Auto-generated method stub
		return dao.update(ca);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Carrera> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Carrera> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
