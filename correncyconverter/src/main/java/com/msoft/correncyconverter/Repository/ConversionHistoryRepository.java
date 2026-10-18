package com.msoft.correncyconverter.Repository;

import com.msoft.correncyconverter.entity.ConversionHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConversionHistoryRepository extends JpaRepository<ConversionHistory, Long> {

}
