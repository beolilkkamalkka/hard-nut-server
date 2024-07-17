package org.thirteen.hardnut.infrastructure.persistence.stuff;

import org.springframework.data.jpa.repository.JpaRepository;
import org.thirteen.hardnut.domain.stuff.domain.Stuff;

public interface StuffRepository extends JpaRepository<Stuff, Long> {
}
