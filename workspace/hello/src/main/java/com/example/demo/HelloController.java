package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.WeatherForm;
import com.example.demo.model.Weather;
import com.example.demo.service.WeatherService;

import org.springframework.jdbc.core.JdbcTemplate;

@Controller
public class HelloController {
	
  @Autowired
  WeatherService weatherService;
  
  @RequestMapping("/input")
  public String helloInput(Model model) {
	  
	  // 入力フォームで取り扱うオブジェクトを設定
	  model.addAttribute("userRequest", new WeatherForm());
	  
	  return "helloInput";
  }
  
  @RequestMapping("/hello")
  public String hello(@ModelAttribute WeatherForm weatherForm, Model model) {
    
    model.addAttribute("hello", "入力値を受け取りました"); // 表示する文字を設定
    
    // 気象データの取得    
	/*
	 * List<Weather> weatherData =
	 * weatherService.findWetherDataListByName(weatherForm.getName());
	 * model.addAttribute("weatherDataList", weatherData);
	 */
    
    // JDBC
    List<Weather> weatherInfo = weatherService.find(weatherForm.getName());
    model.addAttribute("weatherDataList", weatherInfo);
    
    return "hello";
  }
}