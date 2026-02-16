package com.javasolutions.lowleveldesign.additionalpatterns.mvc;

import com.javasolutions.lowleveldesign.additionalpatterns.mvc.controller.BlogController;
import com.javasolutions.lowleveldesign.additionalpatterns.mvc.view.BlogView;

// Demonstrates MVC pattern in action for Blog application.
public class MVCPatternDemo {

    public static void main(String[] args) {
        System.out.println("\n ###### MVC Pattern Demo ###### \n");

        // Create the view
        BlogView view = new BlogView();

        // Create the controller (connected with the view)
        BlogController controller = new BlogController(view);

        // Add some blog posts
        controller.addBlog("MVC Pattern in Java", "Learn how to structure Java apps using MVC.", "Alice");
        controller.addBlog("Understanding Design Patterns", "Design patterns make your code reusable and clean.", "Bob");
        controller.addBlog("Java Collections Framework", "Learn about different collections and their use cases.", "Charlie");

        // Display all blogs
        controller.showAllBlogs();

        // Show details of a specific blog
        controller.showBlog(0);

        // Update first blog
        controller.updateBlog(0, "MVC Pattern in Java - Updated", "Updated content for the MVC post.");

        // Show updated blog
        controller.showBlog(0);

        // Delete second blog
        controller.deleteBlog(1);

        // Show remaining blogs
        controller.showAllBlogs();
    }
}