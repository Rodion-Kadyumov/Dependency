package ru.netology.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.controller.PostController;
import ru.netology.repository.PostRepository;
import ru.netology.service.PostService;

@Configuration
public class JavaConfig {

    @Bean
    public PostController getPostController(PostService service){
        return new PostController(service);
    }

    @Bean
    public PostService getPostService(PostRepository repository){
        return new PostService(repository);
    }

    @Bean
    public PostRepository getPostRepository(){
        return new PostRepository();
    }
}