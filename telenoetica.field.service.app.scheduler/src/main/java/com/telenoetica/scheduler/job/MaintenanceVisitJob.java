package com.telenoetica.scheduler.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class MaintenanceVisitJob extends QuartzJobBean {

  @Override
  protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
    

  }

}
