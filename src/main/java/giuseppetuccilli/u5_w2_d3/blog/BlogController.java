package giuseppetuccilli.u5_w2_d3.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogs")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @GetMapping
    public List<Blog> getBlogs() {
        return blogService.findAll();
    }

    @GetMapping("/{blogId}")
    public Blog getById(@PathVariable int blogId) {
        return blogService.findById(blogId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Blog creatBlog(@RequestBody BlogPayload body) {
        return blogService.saveBlog(body);

    }

    @PutMapping("/{blogId}")
    public Blog editBlog(@PathVariable int blogId, @RequestBody BlogPayload body) {
        return blogService.findAndUpdate(blogId, body);
    }

    @DeleteMapping("/{blogId}")
    public void deleteBlog(@PathVariable int blogId) {
        this.blogService.findAndDelete(blogId);
    }
}
