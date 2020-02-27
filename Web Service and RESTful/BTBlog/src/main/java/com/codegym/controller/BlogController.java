package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
public class BlogController {
    @Autowired
    private BlogService blogService;
// Retrieve all blogs
    @RequestMapping(value="/blogs/", method = RequestMethod.GET)
    public ResponseEntity<List<Blog>>listAllBlogs(){
        List<Blog>blogs= blogService.findAll();
        if(blogs.isEmpty()){
            return new ResponseEntity<List<Blog>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Blog>>(blogs, HttpStatus.OK);
    }

// Retrieve single blog
    @RequestMapping(value = "/blogs/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Blog> getBlog(@PathVariable("id") long id){
        System.out.println("Fetching Blogs with id " + id);
        Blog blog = blogService.findById(id);
        if(blog==null){
            System.out.println("Blog with id " + id + " not found");
            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Blog>(blog, HttpStatus.OK);
    }

    // Create a Blog

    @RequestMapping(value = "/blogs/", method = RequestMethod.POST)
    public ResponseEntity<Void> createBlogs(@RequestBody Blog blog, UriComponentsBuilder ucBuilder){
        System.out.println("Creating Blog" + blog.getName());
        blogService.save(blog);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("blogs/{id}").buildAndExpand(blog.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

//    Update Blog
    @RequestMapping(value = "/blogs/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Blog> updateBlog(@PathVariable("id") long id, @RequestBody Blog blog){
        System.out.println("Updating Blog " + id);
        Blog currentBlog = blogService.findById(id);
        if(currentBlog== null){
            System.out.println("Blog with id " + id + " not found");
            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }
        currentBlog.setName(blog.getName());
        currentBlog.setContent(blog.getContent());
        currentBlog.setImage(blog.getImage());
        blogService.save(currentBlog);
        return new ResponseEntity<Blog>(HttpStatus.OK);
    }

//    Delete Blog
    @RequestMapping(value = "/blogs/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Blog> deleteBlog(@PathVariable("id") long id){
        System.out.println("Fetching & Deleting Blog with id " + id);
        Blog blog = blogService.findById(id);
        if (blog==null){
            System.out.println("Unable to delete. Blog with id " + id + " not found");
            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }
        blogService.remove(id);
        return new ResponseEntity<Blog>(HttpStatus.OK);
    }
    }
