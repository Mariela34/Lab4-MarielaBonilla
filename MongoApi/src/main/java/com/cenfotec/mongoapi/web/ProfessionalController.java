package com.cenfotec.mongoapi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.cenfotec.mongoapi.domain.*;
import com.cenfotec.mongoapi.service.*;

@RestController
public class ProfessionalController {
	
	@Autowired
	private ProfessionalService professionalService;
	
	@PostMapping("/professional")
	public ResponseEntity<String> addCollage(@RequestBody Professional professional){
		
		professionalService.saveProfessional(professional);
		return new ResponseEntity<>(HttpStatus.CREATED);
		
	}
}