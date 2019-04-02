package com.itcast.Filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: zcs
 * @create: 2019/2/22 17:34
 **/
@Component//加入到spring容器
public class UserLoginZuulFilter extends ZuulFilter {
    //返回字符串代表过滤器的类型
    /*filterType：返回字符串代表过滤器的类型
a)	pre：请求在被路由之前执行
b)	routing：在路由请求时调用
c)	post：在routing和errror过滤器之后调用
d)	error：处理请求时发生错误调用
*/
    @Override
    public String filterType() {
        return "pre";//设置过滤器类型为前置过滤器
    }

    //通过返回的int值来定义过滤器的执行顺序，数字越小优先级越高
    @Override
    public int filterOrder() {
        return 0;//设置执行顺序
    }

    //返回一个Boolean值，判断该过滤器是否需要执行。返回true执行，返回false不执行。
    @Override
    public boolean shouldFilter() {
        return true;//该过滤器需要执行
    }

    //过滤器的具体业务逻辑
    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext=RequestContext.getCurrentContext();
        HttpServletRequest request=requestContext.getRequest();
        String token=request.getParameter("token");
        if (StringUtils.isEmpty(token)){
            requestContext.setSendZuulResponse(false);//过滤该请求,不对其进行路由
            requestContext.setResponseStatusCode(401);//设置响应状态码
            return null;
        }
        return null;
    }
}
