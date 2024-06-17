package com.norcorp.joblisting.repository;

import com.norcorp.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
