package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SystemStaffService;
import kodlamaio.hrms.dataAccess.abstracts.SystemStaffDao;
import kodlamaio.hrms.entities.concretes.SystemStaff;

@Service
public class SystemStaffManager implements SystemStaffService{

	SystemStaffDao systemStaffDao;
	
	@Autowired
	public SystemStaffManager(SystemStaffDao systemStaffDao) {
		this.systemStaffDao = systemStaffDao;
	}

	@Override
	public void add(SystemStaff T) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(SystemStaff T) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(SystemStaff T) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SystemStaff> getAll() {
		return systemStaffDao.findAll();
	}

}
