package com.lyx.quartztest;

import org.quartz.*;
import org.quartz.Calendar;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.matchers.GroupMatcher;
import org.quartz.spi.JobFactory;

import java.util.*;

/**
 * Created by JackJudy on 2017/1/2.
 */
public class Main {
    public static void main(String args[]) {
        if (args.length < 1) {
            System.out.println("arg.len = " + args.length);
            System.exit(-1);
        }

        String cronSche = args[0];
        System.out.println("cronSche = " + cronSche);

        SchedulerFactory sf = new StdSchedulerFactory();
        Scheduler sche = null;
        try {
            sche = sf.getScheduler();

            JobDetail jd = JobBuilder.newJob(HelloJob.class).withIdentity("JobName", "JobGroupName").build();

            JobDetail jd_r1 = JobBuilder.newJob(RecordJob.class).usingJobData("a", 1).withIdentity("JobName_1", "JobGroupName").build();
            JobDetail jd_r3 = JobBuilder.newJob(RecordJob.class).usingJobData("a", 3).withIdentity("JobName_3", "JobGroupName").build();

            // 定义调度触发规则

            // SimpleTrigger
            //      Trigger trigger=TriggerBuilder.newTrigger().withIdentity("SimpleTrigger", "SimpleTriggerGroup")
            //                    .withSchedule(SimpleScheduleBuilder.repeatSecondlyForever(3).withRepeatCount(6))
            //                    .startNow().build();

            //  corn表达式  每五秒执行一次
            Trigger trigger = TriggerBuilder.newTrigger().withIdentity("CronTrigger1", "CronTriggerGroup")
                    .withSchedule(CronScheduleBuilder.cronSchedule(cronSche))
                    .startNow().build();
            Trigger trigger_1 = TriggerBuilder.newTrigger().withIdentity("CronTrigger_1", "CronTriggerGroup")
                    .withSchedule(SimpleScheduleBuilder.repeatSecondlyForever())
                    .startNow().build();
            Trigger trigger_3 = TriggerBuilder.newTrigger().withIdentity("CronTrigger_3", "CronTriggerGroup")
                    .withSchedule(SimpleScheduleBuilder.repeatSecondlyForever(3))
                    .startNow().build();

            // 把作业和触发器注册到任务调度中
            // sche.scheduleJob(jd, trigger);
            sche.scheduleJob(jd_r1, trigger_1);
            sche.scheduleJob(jd_r3, trigger_3);

            // 启动调度
            sche.start();

            Thread.sleep(10000);    // 10s

            // 停止调度
            sche.shutdown();

        } catch (SchedulerException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
