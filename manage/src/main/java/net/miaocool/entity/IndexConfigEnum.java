package net.miaocool.entity;

public enum  IndexConfigEnum {
  HEADER_BANNER("头部背景图","header_banner"),
  SERVICE_BANNER("头部背景图","service_banner"),
  CHAT_BANNER("头部背景图","chat_banner"),
  HIGHLIGHTS("建站亮点", "high_lights", true),
  ;

  private final String name;
  private final String tag;
  private final boolean multiple;

  IndexConfigEnum(String name, String tag, Boolean multiple) {
    this.name = name;
    this.tag = tag;
    this.multiple = multiple;
  }

  IndexConfigEnum(String name, String tag) {
    this(name, tag, false);
  }

  public String getName() {
    return name;
  }

  public String getTag() {
    return tag;
  }

  public boolean isMultiple() {
    return multiple;
  }
}
