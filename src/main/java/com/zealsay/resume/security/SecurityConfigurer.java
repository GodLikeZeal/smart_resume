//package com.zealsay.resume.security;
//
//import com.zealsay.resume.config.FilterIgnorePropertiesConfig;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.BeanIds;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
///**
// * spring security全局安全入口.
// *
// * @author zhanglei
// * @date 2018/9/26  下午8:36
// */
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class SecurityConfigurer extends WebSecurityConfigurerAdapter {
//
//  @Autowired
//  RedisConnectionFactory redisConnectionFactory;
//  @Autowired
//  FilterIgnorePropertiesConfig filterIgnorePropertiesConfig;
//
//  @Autowired
//  UserDetailsService userDetailsService;
//  @Autowired
//  PasswordEncoder passwordEncoder;
//
//  @Override
//  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//
//    // 加入自定义的安全认证
//    auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
//  }
//
//  @Override
//  protected void configure(HttpSecurity http) throws Exception {
//    ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry registry =
//        http
//            .csrf().disable()// 去掉 CSRF
//            .cors()
//            .and()
//            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED) // 使用 JWT，关闭token
//            .and()
//            .formLogin()
//            .loginPage("/user/user/login")
//            .permitAll()
//            .and()
//            .logout()
//            .logoutUrl("/logout")
//            .and()
//            .authorizeRequests();
//
//    filterIgnorePropertiesConfig
//        .getUrls()
//        .forEach(url -> registry.antMatchers(url).permitAll());
//    registry
//        .anyRequest()
//        .authenticated()
////            .access("@rbacauthorityservice.hasPermission(request,authentication)") // RBAC 动态 url 认证
//        .and()
//        .logout()
////            .logoutSuccessHandler(logoutSuccessHandler)
//        .permitAll()
//        .and()
//        .rememberMe().rememberMeParameter("remember-me")
//        .userDetailsService(userDetailsService).tokenValiditySeconds(300);
//
//  }
//
//  @Bean(name = BeanIds.AUTHENTICATION_MANAGER)
//  @Override
//  public AuthenticationManager authenticationManagerBean() throws Exception {
//    return super.authenticationManagerBean();
//  }
//
//  @Bean
//  PasswordEncoder passwordEncoder() {
//    return new BCryptPasswordEncoder();
//  }
//}
