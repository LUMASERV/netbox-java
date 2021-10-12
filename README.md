# netbox-java

NetBox API Client for Java

## Usage

```java
NetBoxClient client = new NetBoxClient("https://netbox.example.com", "mysupersecureapitoken");
client.dcim().getRacks(new DefaultQuery()).forEach(rack -> {
    System.out.println(rack.getName());
});
```

## Maven

```xml
<repository>
    <id>lumaserv</id>
    <url>https://maven.lumaserv.cloud</url>
</repository>
```

```xml
<dependency>
    <groupId>com.lumaserv</groupId>
    <artifactId>netbox-java</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```