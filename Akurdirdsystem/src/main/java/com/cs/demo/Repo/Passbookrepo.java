package com.cs.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cs.demo.DTO.PCntDTO;
import com.cs.demo.DTO.PassbookDTO;
import com.cs.demo.Entity.Passbook;

public interface Passbookrepo extends JpaRepository<Passbook,Long> {
	
	
	@Query(value = "select name, Passbook.rdamt, Passbook.rddate, lateday, fmt,pid " +
            "from rduser inner join Passbook on rduser.rid = Passbook.rid",
    nativeQuery = true)
	List<PassbookDTO> getpassbookdata();
	
	
	
	@Query(
		    value = "select name, Passbook.rdamt, Passbook.rddate, lateday, fmt,pid " +
		            "from rduser inner join Passbook on rduser.rid = Passbook.rid " +
		            "where Passbook.rid = :rid",
		    nativeQuery = true
		)
		List<PassbookDTO> getpassbookByid(@Param("rid") Long rid);
	
	@Query(
		    value = "select count(*) from Passbook "+
	          "where Passbook.rid=:rid",
		    nativeQuery = true
		)
		List<Object> getpassbookByPid(@Param("rid") Long rid);
	
	@Query(
		    value = "select count(*) from Passbook "+
	          "where Passbook.rid=:rid",
		    nativeQuery = true
		)
		List<PCntDTO> getpassbookByRid(@Param("rid") Long rid);
	
	@Query(
		    value = "select sum(rdamt) from Passbook "+
	          "where Passbook.rid=:rid",
		    nativeQuery = true
		)
		Long getpassbookByAmt(@Param("rid") Long rid);
	
}   