package com.springrest.springrest.services;

//import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.LoadDao;
import com.springrest.springrest.entities.Load;


@Service
public class LoadServiceImpl implements LoadService{
	
	
	@Autowired
	private LoadDao loadDao;

	//List<Load> list;
	
	
	
	
	@Override
	public List<Load> getLoads() {
			return loadDao.findAll();  
	}
	
	
	@Override
	public Load getLoad(long loadId) {
		return loadDao.getReferenceById(loadId);
	}
	
	@Override
	public Load addLoad(Load load) {
		loadDao.save(load);
		return load;
	}

	@Override
	public Load updateLoad(Load load) {
		loadDao.save(load);
		return load;
	}



//@Override
//public List<Load> getLoadsByShipperId(String shipperId) {
//	
//	
//	return loadao.get
//	
//	 
//	
//}



@Override
public void deleteLoad(long long1) {
	Load entity = loadDao.getReferenceById(long1);
	loadDao.delete(entity);
	
}
	
	
}
	
	
	


