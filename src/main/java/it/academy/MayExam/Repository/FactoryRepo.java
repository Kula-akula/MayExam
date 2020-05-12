package it.academy.MayExam.Repository;

import it.academy.MayExam.Entity.Factory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactoryRepo extends JpaRepository<Factory,Long> {
     Factory getByCodeType(String codeType);


}
