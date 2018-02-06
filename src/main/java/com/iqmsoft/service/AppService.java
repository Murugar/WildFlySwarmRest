package com.iqmsoft.service;

import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import java.util.List;

import static java.util.Arrays.asList;

@Singleton
@Stateless
@ApplicationScoped
public class AppService {
  public List<String> getResult() {
    return asList(
        "test1",
        "test2",
        "test3",
        "test4"
    );
  }
}
