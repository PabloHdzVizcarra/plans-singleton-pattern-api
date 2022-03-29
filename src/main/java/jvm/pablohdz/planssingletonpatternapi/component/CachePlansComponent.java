package jvm.pablohdz.planssingletonpatternapi.component;

import java.util.HashMap;
import java.util.List;
import jvm.pablohdz.planssingletonpatternapi.dto.PlansResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;

public final class CachePlansComponent {
  private static final Logger logger = LoggerFactory.getLogger(CachePlansComponent.class);
  private static CachePlansComponent cacheComponent;
  private static boolean isCache;
  private static final HashMap<String, List<PlansResponseDto>> cachePlans = new HashMap<>();

  private CachePlansComponent() {}

  public static synchronized CachePlansComponent getCacheComponent() {
    if (cacheComponent == null) cacheComponent = new CachePlansComponent();

    return cacheComponent;
  }
  
  public static void saveCache(List<PlansResponseDto> dtoList) {
    logger.info("cache saved from company company1");
    cachePlans.put("company1", dtoList);
  }
  
  public static boolean isCache() {
    return isCache;
  }

  public static void setCache(boolean cache) {
    isCache = cache;
  }

  public static @Nullable
  HashMap<String, List<PlansResponseDto>> haveCacheAvailable() {
    if (isCache()) {
      logger.info("get plans for cache");
      return cachePlans;
    }
    return null;
  }
  
  public static List<PlansResponseDto> getCacheById(String id) {
    return cachePlans.get(id);
  }
}
