package com.example.externalFC;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Entity.Hotel;

@FeignClient(name="Hotel-service")
public interface HoterService {

  @GetMapping("/hotel/{id}")
  Hotel gethotel(@PathVariable String id);

}

