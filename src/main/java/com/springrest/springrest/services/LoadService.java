package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Load;

public interface LoadService {
	public List<Load> getLoads();

	public Load getLoad(long loadId);

	public Load addLoad(Load load);

	public Load updateLoad(Load load);

	//public List<Load> getLoadsByShipperId(String shipperId);

	public void deleteLoad(long long1);

	//public List<Load> getShipperLoad(String shipperId);
	
	

}
