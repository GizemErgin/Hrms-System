package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService{

	JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public void add(JobTitle T) {
		jobTitleDao.save(T);
		
	}

	@Override
	public void delete(JobTitle T) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(JobTitle T) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<JobTitle> getAll() {
		return jobTitleDao.findAll();
	}

}
