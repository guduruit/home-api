/**
 * 
 */
package com.bujair.homeapi.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bujair.homeapi.model.UserInfo;

/**
 * @author bujair
 *
 */
@RepositoryRestResource(collectionResourceRel = "userinfo", path = "userinfo")
public interface UserRepository extends PagingAndSortingRepository<UserInfo, Long>{

}
