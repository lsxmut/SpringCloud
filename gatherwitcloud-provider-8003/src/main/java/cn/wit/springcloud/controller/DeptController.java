package cn.wit.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import cn.wit.springcloud.entities.Dept;
import cn.wit.springcloud.service.DeptService;

@RestController
public class DeptController {
	
	@Autowired
	private DeptService service;
	
	@Autowired
	private DiscoveryClient client;
	
	
	@RequestMapping(value = "/dept/add",method = RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {
		
		return service.add(dept);
		
	}
	
	@RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
	public Dept get(@PathVariable Long id) {
		
		return service.get(id);
		
	}

	
	@RequestMapping(value = "/dept/list",method = RequestMethod.GET)
	public List<Dept> list() {
		
		return service.list();
		
	}
}
