/**
 * 
 */
package com.bujair.homeapi.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bujair.homeapi.model.CardInfo;

/**
 * @author bujair
 *
 */
@RepositoryRestResource(collectionResourceRel = "cardinfo", path = "cardinfo")
public interface CardRepository extends PagingAndSortingRepository<CardInfo, Long>{

}
