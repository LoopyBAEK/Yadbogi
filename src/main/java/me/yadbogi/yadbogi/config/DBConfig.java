package me.yadbogi.yadbogi.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// 매퍼를 하나씩 등록하는게 아닌 패키지 경로를 지정하여 이하 위치에 있는 인터페이스들은 전부 매퍼로 사용할 수 있다
@MapperScan(basePackages = "me.yadbogi.yadbogi.member.model.dao, me.yadbogi.yadbogi.pill.model.dao, me.yadbogi.yadbogi.search.model.dao")
public class DBConfig {

}
