package com.arcusys.learn.liferay.services

import com.liferay.counter.kernel.service.CounterLocalServiceUtil


object CounterLocalServiceHelper {
  def increment: Long = CounterLocalServiceUtil.increment()
}
