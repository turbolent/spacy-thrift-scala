package spacyThrift.client

import com.twitter.finagle.Thrift
import com.twitter.finagle.Thrift.param.Framed
import spacyThrift.SpacyThrift.FinagledClient


class SpacyThriftClient(hostname: String, port: Int) {
  private val serviceFactory = Thrift.client.configured(Framed(false)).newClient(s"$hostname:$port")
  private val client = new FinagledClient(serviceFactory.toService)

  def tag(sentence: String) = client.tag(sentence)
}