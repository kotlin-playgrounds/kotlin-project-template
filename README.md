# kotlin-project-template

**dependency versions:**

- gradle 6.4.1
- kotlin 1.3.72
- junit 5.6.2

**run gradle build.**

~~~sh
$ ./gradlew build
~~~

**run gradle tests.**

~~~sh
$ ./gradlew test
~~~

**sample main file.**

~~~kotlin
package hello

fun main(vararg args: String) {
    println("hello world!")
}
~~~

**sample test file.**

~~~kotlin
package hello

import kotlin.test.Test
import kotlin.test.assertEquals

class WorldTest {

    @Test
    fun `2 + 3 equals 5`() {
        assertEquals(5, 2 + 3)
    }

}
~~~
