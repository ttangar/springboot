    /**
 *
 */
package com.tarun.bootlearn.dao.frd_main;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.tarun.bootlearn.model.frd_main.TEntity;

/**
 * @author tarun.k.tangar
 *
 */
@Transactional
public interface EntityDAO extends CrudRepository<TEntity, Integer> {
}
