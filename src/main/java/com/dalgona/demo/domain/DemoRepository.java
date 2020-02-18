package com.dalgona.demo.domain;

import com.dalgona.demo.domain.entity.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepository extends JpaRepository<DemoEntity, Long> {

}
