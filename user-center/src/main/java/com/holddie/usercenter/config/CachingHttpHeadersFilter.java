package com.holddie.usercenter.config;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CachingHttpHeadersFilter implements Filter {
    public static final int DEFAULT_DAYS_TO_LIVE = 1461;
    public static final long DEFAULT_SECONDS_TO_LIVE;
    private long cacheTimeToLive;

    public CachingHttpHeadersFilter() {
        this.cacheTimeToLive = DEFAULT_SECONDS_TO_LIVE;
    }

    public void init(FilterConfig filterConfig) {
        this.cacheTimeToLive = TimeUnit.DAYS.toMillis((long) DEFAULT_DAYS_TO_LIVE);
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse httpResponse = (HttpServletResponse)response;
        httpResponse.setHeader("Cache-Control", "max-age=" + this.cacheTimeToLive + ", public");
        httpResponse.setHeader("Pragma", "cache");
        httpResponse.setDateHeader("Expires", this.cacheTimeToLive + System.currentTimeMillis());
        chain.doFilter(request, response);
    }

    static {
        DEFAULT_SECONDS_TO_LIVE = TimeUnit.DAYS.toMillis(1461L);
    }
}
