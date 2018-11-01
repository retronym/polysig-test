package p1

class PolySigTest {
  def test: Long = {
    import java.lang.invoke._, java.lang.reflect._
    val l = MethodHandles.lookup
    val unsafeClass = Class.forName("sun.misc.Unsafe")
    val m = l.findVirtual(unsafeClass, "objectFieldOffset", MethodType.methodType(classOf[Long], classOf[Field]))
    val uf = unsafeClass.getDeclaredField("theUnsafe")
    uf.setAccessible(true)
    val unsafe = uf.get(null)
    val mu = m.bindTo(unsafe)
    class A { private[this] var x = 0 }
    val f = classOf[A].getDeclaredFields.apply(0)
    mu.invokeExact(f)
  }
}
