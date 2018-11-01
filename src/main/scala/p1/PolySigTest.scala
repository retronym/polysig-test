package p1

class PolySigTest {
  def test: Long = {
    import java.lang.invoke._, java.lang.reflect._, sun.misc.Unsafe
    val l = MethodHandles.lookup
    val m = l.findVirtual(classOf[Unsafe], "objectFieldOffset", MethodType.methodType(classOf[Long], classOf[Field]))
    val uf = classOf[Unsafe].getDeclaredField("theUnsafe")
    uf.setAccessible(true)
    val unsafe = uf.get(null).asInstanceOf[Unsafe]
    val mu = m.bindTo(unsafe)
    class A { private[this] var x = 0 }
    val f = classOf[A].getDeclaredFields.apply(0)
    mu.invokeExact(f)
  }
}
