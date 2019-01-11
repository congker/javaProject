package com.example.demo.controller.test.Scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xuwencong on 2018/12/20
 */

/* {秒数} {分钟} {小时} {日期} {月份} {星期} {年份(可为空)}
 *  cron的六个符号分别对应以上时间单位，空格隔开
 *  * 表示所有值；
 *  ? 表示未说明的值，即不关心它为何值；
 *  - 表示一个指定的范围；
 *  , 表示附加一个可能值；
 *   / 符号前表示开始时间，符号后表示每次递增的值；
 */
@Service
public class ScheduledService {

    @Scheduled(cron = "1 * * * * MON-SAT")
//    @Scheduled(cron = "* * * * * sleep 10")
    public void testSchedule(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println("测试定时任务成功，当前时间:"+df.format(new Date()));
    }
}
