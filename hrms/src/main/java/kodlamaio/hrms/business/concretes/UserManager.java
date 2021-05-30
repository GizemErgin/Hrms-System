package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.entities.abstracts.User;

@Service
public class UserManager implements UserService{

	UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User T) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User T) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User T) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		return userDao.findAll();
	}

}
