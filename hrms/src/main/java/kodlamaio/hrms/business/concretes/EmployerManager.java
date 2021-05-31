package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public void add(Employer T) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Employer T) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Employer T) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employer> getAll() {
		return employerDao.findAll();
	}

}
