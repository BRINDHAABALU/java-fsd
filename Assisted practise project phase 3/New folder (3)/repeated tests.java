//repeated tests
//Pom.xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>UsingJUnit</groupId>
	<artifactId>UsingJUnit</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<properties>
		<maven.compiler.source>1.8</maven.compiler.source>
		<maven.compiler.target>1.8</maven.compiler.target>


	</properties>

	<dependencies>
		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-engine</artifactId>
			<version>5.4.2</version>
		</dependency>

		<dependency>
			<groupId>org.junit.platform</groupId>
			<artifactId>junit-platform-launcher</artifactId>
			<version>1.2.0</version>
		</dependency>

	</dependencies>

</project>
  
//Conditional Tests Example
package condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

 
@DisplayName("JUnit 5 Conditional Tests Example")

public class ConditionalTests {

        @Test
        //@EnabledOnOs({OS.WINDOWS})
        public void runOnWindows() {
                System.out.println("This runs on Windows");
        }

        @Test
       // @EnabledOnOs({OS.LINUX})
        public void runOnLinux() {
                System.out.println("This runs on Linux");
        }

        
        @Test
        //@DisabledIf("Math.random() < 0.314159")
        void mightNotBeExecuted() {
                System.out.println("This may or not execute ");
        }
}
