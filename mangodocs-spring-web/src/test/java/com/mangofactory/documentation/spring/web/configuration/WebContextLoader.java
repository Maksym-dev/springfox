package com.mangofactory.documentation.spring.web.configuration;

public class WebContextLoader extends GenericWebContextLoader {

  public WebContextLoader() {
    super("src/test", false);
  }

}