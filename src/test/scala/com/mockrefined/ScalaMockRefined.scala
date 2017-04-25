package com.mockrefined

import eu.timepit.refined.api.Refined
import eu.timepit.refined.auto._
import eu.timepit.refined.numeric.Positive
import org.scalamock.scalatest.MockFactory
import org.scalatest.{FlatSpec, Matchers}

class ScalaMockRefined extends FlatSpec with Matchers with MockFactory {
  val mockService = stub[MockService]

  "MockService.normal" should "mock successfully" in {
    (mockService.normal _).when(1).returns("succeed!")
    mockService.normal(1) shouldEqual "succeed!"
  }

  "MockService.refined" should "mock successfully" in {
    (mockService.refined _).when(1: Int Refined Positive).returns("succeed!")
    mockService.refined(1) shouldEqual "succeed!"
  }
}
