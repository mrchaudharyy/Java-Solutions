package com.javasolutions.lowleveldesign.additionalpatterns.mvc.view;

import com.javasolutions.lowleveldesign.additionalpatterns.mvc.model.Blog;

import java.text.SimpleDateFormat;
import java.util.List;

// View class: BlogView
// Responsible for displaying blog post details in the console.
// No business logic — just formatting and printing.
public class BlogView {

    // Display a single blog post
    public void displayBlogDetails(Blog blog) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        System.out.println("===== Blog Post =====");
        System.out.println("Title   : " + blog.getTitle());
        System.out.println("Author  : " + blog.getAuthor());
        System.out.println("Date    : " + sdf.format(blog.getCreatedAt()));
        System.out.println("Content : " + blog.getContent());
    }

    // Display a list of all blog posts
    public void displayAllBlogs(List<Blog> blogs) {
        System.out.println("===== All Blog Posts =====");
        for (Blog blog : blogs) {
            System.out.println("- " + blog.getTitle() + " by " + blog.getAuthor());
        }
    }
}