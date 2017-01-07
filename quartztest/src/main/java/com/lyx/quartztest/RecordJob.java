package com.lyx.quartztest;

import org.quartz.*;

/**
 * Created by JackJudy on 2017/1/3.
 */
@DisallowConcurrentExecution
@PersistJobDataAfterExecution
public class RecordJob implements Job {
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        JobDataMap dm = jobExecutionContext.getJobDetail().getJobDataMap();
        int a = dm.getIntValue("a");
        int b = 0;
        try {
            b = dm.getIntValue("b");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(String.format("RecordJob: a = %d   b = %d", a, b));
        dm.put("b", b++);
    }
}
