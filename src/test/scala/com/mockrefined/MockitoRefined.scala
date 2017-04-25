package com.mockrefined

import eu.timepit.refined.auto._
import org.mockito.Mockito._
import org.scalatest.{FlatSpec, Matchers}

class MockitoRefined extends FlatSpec with Matchers {
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
