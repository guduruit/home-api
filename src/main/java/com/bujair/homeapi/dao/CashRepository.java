/**
 * 
 */
package com.bujair.homeapi.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bujair.homeapi.model.CashInfo;

/**
 * @author bujair
 *
 */
@RepositoryRestResource(collectionResourceRel = "cashinfo", path = "cashinfo")
public interface CashRepository extends PagingAndSortingRepository<CashInfo, Long>{

}
