package com.example.demo;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.google.common.collect.Lists;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
//  private PostDao postDao;
  public List<Post> getRecentPosts(int count, int offset) {
//    return postsDao.getRecentPosts(count, offset);
    Post post = new Post();
    post.id = "123";
    post.title = "qwe";

    return Lists.newArrayList(post);
  }
}
