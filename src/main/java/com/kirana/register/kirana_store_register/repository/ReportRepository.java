package com.kirana.register.kirana_store_register.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.kirana.register.kirana_store_register.model.Report;

public interface ReportRepository extends MongoRepository<Report, String> {
}