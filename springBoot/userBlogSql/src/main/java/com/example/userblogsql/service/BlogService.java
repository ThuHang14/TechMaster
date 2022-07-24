package com.example.userblogsql.service;

import com.example.userblogsql.dto.BlogDto;
import com.example.userblogsql.dto.BlogInfo;
import com.example.userblogsql.entity.Blog;
import com.example.userblogsql.entity.Category;
import com.example.userblogsql.entity.User;
import com.example.userblogsql.repository.BlogRepository;
import com.example.userblogsql.repository.CategoryRepository;
import com.example.userblogsql.repository.CommentRepository;
import com.example.userblogsql.repository.UserRepository;
import com.example.userblogsql.request.CreateBlogRequest;
import com.github.slugify.Slugify;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BlogService {

    @Autowired
    BlogRepository blogRepository;

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private Slugify slugify;


    public List<BlogInfo> getAllBlogInfo() {
        return blogRepository.getAllBlogInfo();
    }

    public List<BlogInfo> getBlogPopular(int limit) {
        return blogRepository.getAllBlogInfo().stream()
                .sorted((a, b) -> b.getCountComment() - a.getCountComment())
                .limit(limit)
                .collect(Collectors.toList());
    }

    public BlogInfo getBlogInfoById(String id) {
        Optional<BlogInfo> blogInfoOptional = blogRepository.getAllBlogInfo()
                .stream()
                .filter(blogInfo -> blogInfo.getId().equals(id))
                .findFirst();

        return blogInfoOptional.orElse(null);
    }

    // Lấy danh sách tất cả blog ở dạng DTO
    public List<BlogDto> getAllBlogDto() {
        List<Blog> blogs = blogRepository.findAll();
        return blogs.stream()
                .map(blog -> modelMapper.map(blog, BlogDto.class))
                .collect(Collectors.toList());
    }

    // Lấy danh sách tất cả blog ở dạng DTO của user
    public List<BlogDto> getAllBlogDtoByUserId(Integer id) {
        List<Blog> blogs = blogRepository.getBlogsByUser_Id(id);
        return blogs.stream()
                .map(blog -> modelMapper.map(blog, BlogDto.class))
                .sorted((a,b) -> b.getCreatedAt().compareTo(a.getCreatedAt()))
                .collect(Collectors.toList());
    }

    //    tao bai viet
    public Blog createBlog(Integer userId, CreateBlogRequest request) {
        //      lay thong tin user
        User user = userRepository.getUserById(userId, User.class);
        //        lay thong tin category
        List<Category> categories = categoryRepository.findByIdIn(request.getCategories());
        //        tao blog
        Blog blog = Blog.builder()
                .title(request.getTitle())
                .slug(slugify.slugify(request.getTitle()))
                .content(request.getContent())
                .description(request.getDescription())
                .thumbnail(request.getThumbnail())
                .status(request.getStatus())
                .categories(categories)
                .user(user)
                .build();

        blogRepository.save(blog);
        return blog;
    }

//    lay chi tiet bai viet
    public BlogDto getBlogById(String id) {
        Blog blog = blogRepository.getBlogById(id);
        return modelMapper.map(blog,BlogDto.class);
    }
//delete
    public void deleteBlog(String id) {
        blogRepository.deleteBlogById(id);
    }
}
