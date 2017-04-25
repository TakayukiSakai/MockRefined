package com.mockrefined

import eu.timepit.refined.api.Refined
import eu.timepit.refined.auto._
import eu.timepit.refined.numeric.Positive
import org.mockito.Mockito._
import org.scalatest.{FlatSpec, Matchers}

trait MockService {
  def normal(i: Int): String
  def refined(i: Int Refined Positive): String
}

class MockRefined extends FlatSpec with Matchers {
  val mockService = mock(classOf[MockService])

  "MockService.normal" should "mock successfully" in {
    when(mockService.normal(1)).thenReturn("succeed!")
    mockService.normal(1) shouldEqual "succeed!"
  }

  "MockService.refined" should "throw AbstractMethodError" in {
    assertThrows[java.lang.AbstractMethodError] {
      when(mockService.refined(1)).thenReturn("succeed!")
    }
  }
}
