package com.jst.hrms.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jst.hrms.Entity.Menu;
import com.jst.hrms.Repository.MenuRepository;

@Service
public class MenuService {
	@Autowired
	private MenuRepository mr;
	
	public Menu create(Menu menu) {
		return mr.save(menu);
	}
	public List<Menu> read() {
		return mr.findAll();
	}
	public Menu read(Integer id) {
		Menu m=null;
		Optional<Menu> x = mr.findById(id);
		if(x.isPresent())
		{
			m=x.get();
		}
		return m;
	}
	public Menu update(Menu menu) {
		Menu m=null;
		Optional<Menu> x = mr.findById(menu.getId());
		if(x.isPresent())
		{			
			m=menu;
			mr.save(menu);
		}
		return m;
	}
	public Menu delete(Integer id) {
		Menu m=null;
		Optional<Menu> x = mr.findById(id);
		if(x.isPresent())
		{			
			m=x.get();
			mr.delete(m);
		}
		return m;
	}
}
