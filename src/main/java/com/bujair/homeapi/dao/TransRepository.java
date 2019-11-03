/**
 * 
 */
package com.bujair.homeapi.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bujair.homeapi.model.TransactionInfo;

/**
 * @author bujair
 *
 */
@RepositoryRestResource(collectionResourceRel = "transinfo", path = "transinfo")
public interface TransRepository extends PagingAndSortingRepository<TransactionInfo, Long>{

}
