package com.turasolutions.sirius.dsl.config;

public abstract interface ConfigProvider
{
  public abstract Object getConfigurator(String paramString);
}
