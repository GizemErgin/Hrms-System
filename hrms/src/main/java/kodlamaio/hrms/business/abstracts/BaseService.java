package kodlamaio.hrms.business.abstracts;

import java.util.List;

public interface BaseService<T> {
	void add(T T);
	void delete(T T);
	void update(T T);
	List<T> getAll();
	
}
