package com.example.workflow;

import javax.inject.Named;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

@Named
public class SendEmail implements JavaDelegate {

  @Override
  public void execute(DelegateExecution delegateExecution) throws Exception {}
}
