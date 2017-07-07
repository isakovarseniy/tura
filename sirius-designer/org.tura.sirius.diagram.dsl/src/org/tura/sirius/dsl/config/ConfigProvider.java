package org.tura.sirius.dsl.config;

public abstract interface ConfigProvider
{
  public abstract Object getConfigurator(String paramString);
}
