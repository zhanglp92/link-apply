package com.github.zhanglp92.handler;

import com.github.zhanglp92.aop.annotations.HandlerMonitor;
import com.github.zhanglp92.aop.annotations.HandlerRuntime;
import com.github.zhanglp92.compose.Compose;
import com.github.zhanglp92.context.Context;
import com.github.zhanglp92.core.RuleHandler;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class SampleHandler extends RuleHandler {

    @Override
    @HandlerRuntime(enabled = true)
    @HandlerMonitor
    public void handler(Context context, Compose compose) throws Throwable {
        log.info("-------------- 实际执行了几次 SampleHandler");

        log.info("sample controller...");
        Thread.sleep(2 * 1000);
        log.info("sample controller done");
    }
}
