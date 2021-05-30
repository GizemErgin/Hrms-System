package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {

	JobSeekerDao jobSeekerDao;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public void add(JobSeeker T) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(JobSeeker T) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(JobSeeker T) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<JobSeeker> getAll() {
		return jobSeekerDao.findAll();
	}

}
