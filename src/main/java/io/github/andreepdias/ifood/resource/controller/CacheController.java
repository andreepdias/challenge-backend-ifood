package io.github.andreepdias.ifood.resource.controller;


import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.stats.CacheStats;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cache")
public class CacheController {

    private final CacheManager cacheManager;

    public CacheController(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    @GetMapping
    public String getStats(){
        org.springframework.cache.Cache cache = cacheManager.getCache("cities");
        Cache nativeCache = (Cache) cache.getNativeCache();
        CacheStats stats = nativeCache.stats();

        Long hitCount = stats.hitCount();
        Long missCount = stats.missCount();
        Long requestCount = stats.requestCount();
        Long loadCount = stats.loadCount();
        Long evictionCount = stats.evictionCount();

        return "hitCount: " + hitCount + ";\t" +
                "missCount: " + missCount + ";\t" +
                "requestCount: " + requestCount + ";\t" +
                "loadCount: " + loadCount + ";\t" +
                "evictionCount: " + evictionCount + ".";
    }

}
