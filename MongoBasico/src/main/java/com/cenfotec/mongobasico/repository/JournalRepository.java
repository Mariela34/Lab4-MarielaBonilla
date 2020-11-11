package com.cenfotec.mongobasico.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.*;
import com.cenfotec.mongobasico.domain.*;

public interface JournalRepository extends MongoRepository<Journal, String>{
	public List<Journal> findByTitleLike(String word);
}
