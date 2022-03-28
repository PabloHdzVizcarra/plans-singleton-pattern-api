package jvm.pablohdz.planssingletonpatternapi.component;

final class CachePlansComponent {
  private static CachePlansComponent cacheComponent;

  public CachePlansComponent() {}

  public static synchronized CachePlansComponent getCacheComponent() {
    if (cacheComponent == null) cacheComponent = new CachePlansComponent();

    return cacheComponent;
  }
}
