package id.co.bankaltimtara.authserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public interface ABaseRepository<T, ID> extends JpaRepository<T, ID>, QuerydslPredicateExecutor<T> {
}
