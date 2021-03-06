package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.model.Weather;
import com.example.demo.repository.WeatherRepository;

@Service
@Transactional
public class WeatherService {
  
  @Autowired
  WeatherRepository weatherRepository;
  
  @Autowired
  JdbcTemplate jdbcTemplate;
  
  /**
   * レコードを全件取得する。
   * @return
   */
  public List<Weather> findAllWeatherData(){
    
    return weatherRepository.findAll();
  }
  
  /**
   * 指定した都市のレコードを取得する。
   * @param name
   * @return
   */
  public List<Weather> findWetherDataListByName(String name){
        
    return weatherRepository.findByName(name);
  }
  
  /**
   * 指定した都市のレコードをJDBCで取得する。
   * @param name 地域名
   * @return
   */
  public List<Weather> find(String name) {
	  
	  // SQL分を作成
	  String sql = "select * from weather where name = ?";
	  
	  // queryForObjectメソッドを実行
      // SQLの実行結果は、自動的にUserクラスにマッピングされて取得できる。
      RowMapper<Weather> rowMapper = new BeanPropertyRowMapper<Weather>(Weather.class);
      List<Weather> weatherInfo  = jdbcTemplate.query(sql, rowMapper, name);
    
    return weatherInfo;
  }
}