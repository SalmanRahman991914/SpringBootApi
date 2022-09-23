package com.SpringApi.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringApi.entities.Cource;

@Service
public class CourseServiceImpl implements CourceService {
	
	List<Cource>list;
 public CourseServiceImpl() {
	list=new ArrayList<>();
	list.add(new Cource(102,"java","programming language"));
	list.add(new Cource(103,"python","secure language"));
	
	
}
	
	@Override
	public List<Cource> GetCources() {
	
		return list;
	}

	@Override
	public Cource addCource(Cource cource) {
		list.add(cource);
		return cource;
	}

	@Override
	public Cource updtCource(Cource cource) {
		list.forEach(e->{
		if(e.getId()==cource.getId()) {
			e.setTitle(cource.getTitle());
			e.setDescription(cource.getDescription());
		}
	});
		return null;
	}

}
