package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.LoadDao;
import com.springrest.springrest.entities.Load;


@Service
public class LoadServiceImpl implements LoadService{
	
	
	@Autowired
	private LoadDao loadDao;

	//List<Load> list;
	public LoadServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Load(123,"delhi","jaipur","chemicals",100,"a5581067-b2a0-4e5d-9a36-1a2d32ba1454"));
//		list.add(new Load(1125,"delhi","jaipur","chemicals",145,"45d56f88-64e9-47ad-be54-55d2f9362981"));
//		list.add(new Load(145,"mumbai","bhopal","chemicals",200,"a5581067-b2a0-4e5d-9a36-1a2d32ba1454"));
	}
	
	
	
	@Override
	public List<Load> getLoads() {
			return loadDao.findAll();  
	}
	
	
	@SuppressWarnings("deprecation")
	public Load getLoad(long loadId) {
//		Load c = null;
//		for(Load load:list) {
//			if(load.getId() == loadId) {
//				c  = load;
//				break;
//			}
//			
//		}
		return loadDao.findById(loadId);
	}
	
	@Override
	public Load addLoad(Load load) {
		//list.add(load);
		return load;
	}
	
	
	
//	public Load updateLoad(Load load) {
//		list.set(list.indexOf(load);
//		return load;
//	}
	
//	@Override 
//	public List<Load> getShipperLoad(String shipperId){
//		
//	}

	@Override
	public Load updateLoad(Load load) {
//		list.forEach(e -> {
//			if(e.getId() == load.getId()) {
//				e.setLoadingPoint(load.getLoadingPoint());
//				e.setUnloadingPoint(load.getUnloadingPoint());
//				e.setTruckType(load.getTruckType());
//				e.setWeight(load.getWeight());
//				e.setShipperId(load.getShipperId());
//			}
//		});
		loadDao.save(load);
		return load;
	}


//List<Load> ans;
//@Override
//public List<Load> getLoadsByShipperId(String shipperId) {
//	ans = new ArrayList<>();
//	for(int i = 0;i<list.size();i++) {
//		if(list.get(i).getShipperId() == shipperId) {
//			ans.add(list.get(i));
//		}
//	}
//	return ans;
//	
//	 
//	
//}



@Override
public void deleteLoad(long long1) {
	// TODO Auto-generated method stub
//	for(int i =0;i<list.size();i++) {
//		if(list.get(i).getId() == long1) {
//			list.remove(i);
//			break;
//		}
//	}
	Optional<Load> entity = loadDao.findById(long1);
	loadDao.delete(entity);
	
}
	
	
}
	
	
	


