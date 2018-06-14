# kotlin-project-template

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
    fun sample() {
        assertEquals(5, 2 + 3)
    }

}
~~~
