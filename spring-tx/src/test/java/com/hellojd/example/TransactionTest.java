package com.hellojd.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:zhaoguoyu
 * @date:2018/8/8
 */
public class TransactionTest {
  private final ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
      "org/springframework/transaction/annotation/annotationTransactionNamespaceHandlerTests.xml");

}
