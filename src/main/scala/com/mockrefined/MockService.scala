package com.mockrefined

import eu.timepit.refined.api.Refined
import eu.timepit.refined.numeric.Positive

trait MockService {
  def normal(i: Int): String
  def refined(i: Int Refined Positive): String
}
