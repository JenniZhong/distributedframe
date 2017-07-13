package com.xh.frame.gateway.filter;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;

/**
 * 路由拦截器
 * @author xh
 *
 */
@Component
public class RequestFilter extends ZuulFilter{

	/**
	 * 返回FALSE表示 不拦截，可在此做过虑
	 */
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	/**
	 * 此处做日志记录之类
	 */
	@Override
	public Object run() {
	    /*RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        BufferedReader br=null;
        String param = "";
		try {
			 //获得request body里的内容
			br = request.getReader();
			 String str, whileStr = "";
	        while((str = br.readLine()) != null){
	        	whileStr += str;
	        }
	       //替换空格
	        param = whileStr.replaceAll(" ", "");
		} catch (IOException | NullPointerException e) {
			//log.setMessage("获得request body内容时出现异常,message:"+e.getMessage());
			//log.setRequestParam("exception");
			e.printStackTrace();
			//logger.error(e.getMessage());
		}*/
		return null;
	}

	/**
	 * pre：路由之前
		routing：路由之时
		post： 路由之后
		error：发送错误调用
		filterOrder：过滤的顺序
		shouldFilter：这里可以写逻辑判断，是否要过滤，本文true,永远过滤。
		run：过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。
	 */
	
	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}
