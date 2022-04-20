package com.codestates.job.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import reactor.core.publisher.Mono
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.http.MediaType


@Controller
class jobController {
@GetMapping("/job")
	@ResponseBody
	fun  job():Mono<ServerResponse>{
		var result={
			var job: String = ""
		}
		
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(Mono.just(result));
	}
}