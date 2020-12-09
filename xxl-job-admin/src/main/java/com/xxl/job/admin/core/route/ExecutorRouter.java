package com.xxl.job.admin.core.route;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.biz.model.TriggerParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by xuxueli on 17/3/10.
 */
public abstract class ExecutorRouter {
    protected static Logger logger = LoggerFactory.getLogger(ExecutorRouter.class);

    /**
     * route address 根据路由策略，返回相应的执行器地址
     *
     * @param addressList 注册的执行器地址列表
     * @return  ReturnT.content=address 执行器
     */
    public abstract ReturnT<String> route(TriggerParam triggerParam, List<String> addressList);

}
