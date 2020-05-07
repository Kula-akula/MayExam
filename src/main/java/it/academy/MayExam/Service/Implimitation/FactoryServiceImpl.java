package it.academy.MayExam.Service.Implimitation;

import it.academy.MayExam.Entity.Factory;
import it.academy.MayExam.Repository.FactoryRepo;
import it.academy.MayExam.Service.FactoryService;
import it.academy.MayExam.Singleton.FactoryItem;
import it.academy.MayExam.Singleton.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;

public class FactoryServiceImpl implements FactoryService {
    @Autowired
    private FactoryRepo factoryRepo;

    @Override
    public Factory getByCodeType(String codeType) {
        return factoryRepo.getByCodeType(codeType);
    }
    private Factory factory(String codeType){
        Factory factory=new Factory();
        FactoryItem restaurant=factory.getFactoryItem("R");
        System.out.println(Restaurant.getInstance());
        FactoryItem cinema=factory.getFactoryItem("C");
        return factory;
    }
}
