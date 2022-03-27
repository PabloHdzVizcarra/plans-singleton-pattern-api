package jvm.pablohdz.planssingletonpatternapi.repository;

import jvm.pablohdz.planssingletonpatternapi.model.PlansEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlansRepository extends MongoRepository<PlansEntity, String> {

}
