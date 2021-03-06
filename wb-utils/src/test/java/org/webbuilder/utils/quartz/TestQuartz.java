package org.webbuilder.utils.quartz;

import org.junit.Test;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.webbuilder.utils.script.engine.DynamicScriptEngine;
import org.webbuilder.utils.script.engine.DynamicScriptEngineFactory;

import java.util.HashMap;

/**
 * Created by 浩 on 2015-11-03 0003.
 */
public class TestQuartz {

    @Test
    public void testQuartz() throws Exception {

        QuartzBuilder.addJob(new QuartzJob("hehe", "g1", "*/1 * * * * ?", new QuartzJob.JobExecute() {
            public <T> T execute(JobExecutionContext arg0) throws JobExecutionException {
                System.out.println("我被定时调度了！！");
                return (T) "aa";
            }
        }));

        Thread.sleep(5000);
        QuartzBuilder.pauseJob("hehe", "g1");//暂停
    }
}
