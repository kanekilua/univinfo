package com.kane.univInfo.service;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * @author:Kane
 * @date:2018/6/8
 * @description:
 **/
public class FirstProcessor implements PageProcessor {
    // 抓取网站的相关配置，包括编码、抓取间隔、重试次数等
    private Site site = Site.me().setRetryTimes(3).setSleepTime(100);
    private static int count =0;


    public void process(Page page) {
        System.out.println(page.getHtml());
//        //判断链接是否符合http://www.cnblogs.com/任意个数字字母-/p/7个数字.html格式
//        if(!page.getUrl().regex("http://www.cnblogs.com/[a-z 0-9 -]+/p/[0-9]{7}.html").match()){
//            //加入满足条件的链接
//            page.addTargetRequests(
//                    page.getHtml().xpath("//*[@id=\"post_list\"]/div/div[@class='post_item_body']/h3/a/@href").all());
//        }else{
//            //获取页面需要的内容
//            System.out.println("抓取的内容："+
//                    page.getHtml().xpath("//*[@id=\"Header1_HeaderTitle\"]/text()").get()
//            );
//            count ++;
//        }
}

    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        long startTime, endTime;
        System.out.println("开始爬取...");
        startTime = System.currentTimeMillis();
        Spider.create(new FirstProcessor()).addUrl("https://gkcx.eol.cn/schoolhtm/specialty/105/10035/specialtyScoreDetail_2017_10011.htm").thread(5).run();
        endTime = System.currentTimeMillis();
        System.out.println("爬取结束，耗时约" + ((endTime - startTime) / 1000) + "秒，抓取了"+count+"条记  录");
    }
}
