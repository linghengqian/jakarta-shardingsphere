### Be resolved

### For https://github.com/apache/shardingsphere/issues/21225

- Use the following dependencies to locate
    - org.springframework.boot:spring-boot-starter-parent:3.0.0-M5
      - org.springframework.boot:spring-boot-starter-web
      - com.h2database:h2
      - org.projectlombok:lombok
      - org.springframework.boot:spring-boot-starter-test
    - org.mybatis.spring.boot:mybatis-spring-boot-starter:3.0.0-SNAPSHOT
    - org.springdoc:springdoc-openapi-starter-webmvc-ui:2.0.0-M5
    - org.apache.shardingsphere:shardingsphere-jdbc-core-spring-boot-starter:5.2.1-SNAPSHOT

- Test with https://github.com/apache/shardingsphere/commit/589d28da30221087f5c2aea7d5abd5fdba74ee5a
