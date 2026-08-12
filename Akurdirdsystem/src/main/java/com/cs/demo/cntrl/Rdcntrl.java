package com.cs.demo.cntrl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cs.demo.Entity.Rduser;
import com.cs.demo.Repo.Rdrepo;

@RestController
public class Rdcntrl {
	@Autowired
	private Rdrepo repo;
	
	@GetMapping("/rduser")
	List<Rduser> getrduser(){
		List<Rduser> lst=repo.findAll();
		return lst;
	}
	
	@GetMapping("/getrduser/{rid}")
	Optional<Rduser> getrduser(@PathVariable("rid") long rid){
		Optional<Rduser> lst=repo.findById(rid);
		return lst;
		
		
	}
	
	@PostMapping("/saverduser")
	public Rduser saverduser(@RequestBody Rduser rd) {
		return repo.save(rd);
		
	}
	
	@PutMapping("/updaterduser")
	public Rduser updaterduser(@RequestBody Rduser rd) {
		return repo.save(rd);
	}
	
	@DeleteMapping("/deleterduser/{rid}")
	public String deleterduser(@PathVariable("rid") long rid) {
		 repo.deleteById(rid);
		 return "delete rduser successfully..";
	}
	
	
	
	
}
