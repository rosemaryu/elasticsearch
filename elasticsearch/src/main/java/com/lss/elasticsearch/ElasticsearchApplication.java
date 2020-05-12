package com.lss.elasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author Rupert
 */
@Controller
@SpringBootApplication
//没有连接数据库的时候报错  需要加上（@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})）
public class ElasticsearchApplication extends WebMvcConfigurationSupport{

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    /*@Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        //这是配置模板页面的路径 配置文件里面已经配置了 所以这里暂时不需要
        //registry.addResourceHandler("/templates/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX+"/templates/");
        //这里是配置静态资源文件的路径
        registry.addResourceHandler("/static/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX+"/static/");
        super.addResourceHandlers(registry);
    }*/

    public static void main(String[] args) {
        System.setProperty("es.set.netty.runtime.available.processors","false");
        SpringApplication.run(ElasticsearchApplication.class, args);
    }

}
