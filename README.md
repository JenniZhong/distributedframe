# distributedframe
分布式微服务架构 使用了SpringCloud 
包括高可用注册中心 断路由 Spring Cloud Config远程配置 Zuul路由 Zipkin请求追踪

启动顺序为Discover config db server gateway 其中远程配置和zipkin需要取消注释来启用
