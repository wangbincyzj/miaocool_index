package net.miaocool.entity;

public enum  IndexConfigEnum {
  HEADER_BANNER("头部背景图","header_banner"),
  SERVICE_BANNER("头部背景图","header_banner"),
  CHAT_BANNER("头部背景图","header_banner");

  private final String name;
  private final String tag;

  IndexConfigEnum(String name, String tag) {
    this.name = name;
    this.tag = tag;
  }

  public String getName() {
    return name;
  }

  public String getTag() {
    return tag;
  }
}
