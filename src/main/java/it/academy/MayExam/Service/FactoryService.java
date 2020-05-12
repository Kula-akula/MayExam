package it.academy.MayExam.Service;

import it.academy.MayExam.Entity.Factory;

public interface FactoryService {
    Factory getByCodeType(String codeType);
}
