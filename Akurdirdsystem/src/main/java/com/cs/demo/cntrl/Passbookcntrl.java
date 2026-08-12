package com.cs.demo.cntrl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cs.demo.DTO.PCntDTO;
import com.cs.demo.DTO.PassbookDTO;
import com.cs.demo.Entity.Passbook;
import com.cs.demo.Entity.Rduser;
import com.cs.demo.Repo.Passbookrepo;
import com.cs.demo.Repo.Rdrepo;

@RestController
public class Passbookcntrl {

	@Autowired
	private Passbookrepo prepo;
	
	
	
	
	
	@GetMapping("/passbook")
	List<PassbookDTO> getpassbook(){
		List<PassbookDTO> lst=prepo.getpassbookdata();
		return lst;
	}
	
	
	
	@GetMapping("/getpassbookbyid/{rid}")
	 List<PassbookDTO> getpassbook(@PathVariable("rid") long rid){
		List<PassbookDTO> lst=prepo.getpassbookByid(rid);
		return lst;
	
	}
	
	@GetMapping("/getpassbookcountbyRid/{rid}")
	List<Object> getpassbookcnt(@PathVariable("rid") long rid){
		List<Object> lst=prepo.getpassbookByPid(rid);
		return lst;
	}
	
	@GetMapping("/getpassbookcnt/{rid}")
	List<PCntDTO> GetPassbookCnt(@PathVariable("rid") long rid){
		List<PCntDTO> lst=prepo.getpassbookByRid(rid);
		return lst;
	}
	
	
	@GetMapping("/getPassbookAmt/{rid}")
	Map<String ,Object> GetPassbookAmt(@PathVariable("rid") Long rid){
		Long lst=prepo.getpassbookByAmt(rid);
		Map<String,Object> result =new HashMap<>();
		result.put("total_amt", lst);
		return result;
	}
	
	
	
	@PostMapping("/savepassbook")
	public Passbook savepassbook(@RequestBody Passbook pb) {
		return prepo.save(pb);
		
	}
	
	@PutMapping("/updatepassbook")
	public Passbook updaterduser(@RequestBody Passbook pb) {
		return prepo.save(pb);
	}
	
	@DeleteMapping("/deletepassbook/{pid}")
	public String deletepassbook(@PathVariable("pid") long pid) {
		 prepo.deleteById(pid);
		 return "delete passbook successfully..";
	}
	
	
	
	
	
}
