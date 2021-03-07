# kotlin-project-template

**dependency versions:**

- [kotlin 1.4.31](https://github.com/JetBrains/kotlin/releases/tag/v1.4.31)
- [gradle 6.8.3](https://github.com/gradle/gradle/releases/tag/v6.8.3)
- [junit 5.7.1](https://github.com/junit-team/junit5/releases/tag/r5.7.1)

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
