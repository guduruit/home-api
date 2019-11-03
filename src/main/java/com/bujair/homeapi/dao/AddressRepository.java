/**
 * 
 */
package com.bujair.homeapi.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bujair.homeapi.model.Address;

/**
 * @author bujair
 *
 */
@RepositoryRestResource(collectionResourceRel = "address", path = "address")
public interface AddressRepository extends PagingAndSortingRepository<Address, Long>{
	

}
