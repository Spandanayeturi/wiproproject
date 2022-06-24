package com.jst.hrms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jst.hrms.Entity.Menu;
import com.jst.hrms.Service.MenuService;

@RestController
@RequestMapping("/menu")
public class MenuController {
	@Autowired
	private MenuService ms;
	@PostMapping
	public Menu registerMenu(@RequestBody Menu menu) {
		return ms.create(menu);
	}
	@GetMapping
	public List<Menu> findAllmenus() {
		return ms.read();
	}
	@GetMapping("/(id)")
	public Menu FindMenuById(@PathVariable("id") Integer id) {
		return ms.read(id);
	}
	@PutMapping
	public Menu updateMenu(@RequestBody Menu menu) {
		return ms.update(menu);
	}
	@DeleteMapping("/(id)")
	public Menu deleteMenu(@PathVariable("id") Integer id) {
		return ms.delete(id);
	}

}
