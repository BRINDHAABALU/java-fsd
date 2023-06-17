 //demonstrate assertions
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
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.8.2</version>
    <scope>test</scope>
</dependency>

		<dependency>
			<groupId>org.junit.platform</groupId>
			<artifactId>junit-platform-launcher</artifactId>
			<version>1.2.0</version>
		</dependency>

		
	</dependencies>

</project>

//Assertions Example
package assertion;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@DisplayName("JUnit 5 Assertions Example")
class Assertions {
	@Test
	@DisplayName("assert Examples")
	public void assertTests() {
		String str=null;
		String str2="some value";
		
		String[] a1= {"A","B"};
		String[] a2= {"A","B"};
		assertTrue(4>0);
		assertFalse(4<2);
		assertNull(str);
		assertNotNull(str2);
		assertSame(str, str);
		assertNotSame(str, str2);
		assertEquals(4,4);
		assertNotEquals(10,4);	
		assertArrayEquals(a1,a2);
		
		assertThrows(RuntimeException.class,()->{
			throw new RuntimeException();
		});
	}}
