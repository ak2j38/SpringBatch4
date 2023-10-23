package com.ader.springbatch4

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableBatchProcessing
class SpringBatch4Application

fun main(args: Array<String>) {
  runApplication<SpringBatch4Application>(*args)
}
