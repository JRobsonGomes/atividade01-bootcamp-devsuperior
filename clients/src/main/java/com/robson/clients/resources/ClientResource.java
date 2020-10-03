package com.robson.clients.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.robson.clients.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Maria","08629587285",2500.00,Instant.now(),2));
		list.add(new Client(2L, "João","08889577285",3500.00,Instant.now(),0));
		return ResponseEntity.ok().body(list);
	}
}
