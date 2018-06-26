package com.shangde.ehr.service;

import com.shangde.ehr.model.UserProfile;

import java.util.List;

public interface UserProfileService {

    UserProfile findById(int id);

    UserProfile findByType(String type);

    List<UserProfile> findAll();

}