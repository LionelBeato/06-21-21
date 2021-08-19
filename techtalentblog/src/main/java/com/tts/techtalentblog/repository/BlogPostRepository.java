package com.tts.techtalentblog.repository;

import com.tts.techtalentblog.model.BlogPost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {
}
