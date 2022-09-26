package com.my.townNews.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.springframework.web.servlet.view.tiles3.TilesConfigurer
import org.springframework.web.servlet.view.tiles3.TilesView
import org.springframework.web.servlet.view.tiles3.TilesViewResolver

@Configuration
class WebConfig : WebMvcConfigurer {

    // TilesConfigure
    @Bean
    fun tilesConfigureer(): TilesConfigurer {
        val tilesConfigure = TilesConfigurer();
        tilesConfigure.setDefinitions(
            *arrayOf("/WEB-INF/tiles/tiles.xml"));
        tilesConfigure.setCheckRefresh(true);
        return tilesConfigure;
    }

    // TilesViewResolver
    @Bean
    fun TilesViewResolver() : TilesViewResolver {
        val tilesViewResolver = TilesViewResolver();

        // Tiles 설정 TilesView 에러 발생 확인하여 보기.....
        // tilesViewResolver.setViewClass(TilesView);
        tilesViewResolver.setOrder(1);
        return tilesViewResolver;
    }

}