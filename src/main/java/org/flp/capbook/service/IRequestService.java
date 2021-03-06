package org.flp.capbook.service;

import java.util.List;

import org.flp.capbook.model.Group_Request;



public interface IRequestService {
	List<Group_Request> requestSent(Group_Request request);

	List<Group_Request> findRequest();
	
	List<Group_Request> getRequestIdAndDelete(Integer userId);

}
