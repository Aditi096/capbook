package org.flp.capbook.service;

import java.util.List;

import org.flp.capbook.model.Friend_request;



public interface IFriendService {

	Friend_request addFriend(Friend_request friend);

	Friend_request deleteRequest(Integer requestId);

	
	
}
