package com.cenfotec.mongoapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.cenfotec.mongoapi.domain.*;
import java.util.*;

public interface ProfessionalRepository extends MongoRepository<Professional, String> {
	public List< Professional > findByName(String name);
}
